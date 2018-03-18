package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

class BDDTitre extends GestionBaseDeDonnees 
{
	public BDDTitre()
    {
        super();
    }
	
	public double calculerPrixBillet(String gare1, String gare2) //operationnel
    {
        String gare1Maj = gare1.toUpperCase();
        String gare2Maj = gare2.toUpperCase();
    	try
        {
            String requete = "SELECT Prix FROM PRIX WHERE (GARE1 = ? and GARE2 = ?) or (GARE2 = ? and GARE1 = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, gare1Maj);
			declar.setString(2, gare2Maj);
			declar.setString(3, gare1Maj);
			declar.setString(4, gare2Maj);
			ResultSet res = declar.executeQuery();
			double prix = res.getDouble(1);
        	return prix;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
	public double calculerPrixAbo(String source, String destination) 
    {
        String sourceMaj = source.toUpperCase();
        String destinationMaj = destination.toUpperCase();
    	try
        {
            String requete = "SELECT Prix FROM PRIXABO WHERE (SOURCE = ? and DESTINATION = ?) or (DESTINATION = ? and SOURCE = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, sourceMaj);
			declar.setString(2, destinationMaj);
			declar.setString(3, sourceMaj);
			declar.setString(4, destinationMaj);
			ResultSet res = declar.executeQuery();
			double prix = res.getDouble(1);
        	return prix;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
	
	public int numeroAbonnementSuivant()
	{
		try
        {
            String requete = "SELECT numeroabo FROM abosexistants order by numeroabo desc";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
			ResultSet res = declar.executeQuery();
			int dernierAbo = res.getInt(1);
        	return dernierAbo + 1;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
	}
	
	public void ajouterAbonnement(String nom, String reg, String source, String destination, String annee, String mois, String jour)
	{
		try
        {
			String nomMaj = nom.toUpperCase();
			String sourceMaj = source.toUpperCase();
			String destinationMaj = destination.toUpperCase();
			int numeroAbo = numeroAbonnementSuivant();
			String numeroAboStr = String.valueOf(numeroAbo);
			String requete = "insert into abosexistants values (?, ?, ?, ?, ?, ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, nomMaj);
			declar.setString(2, reg);
			declar.setString(3, sourceMaj);
			declar.setString(4, destinationMaj);
			declar.setString(5, annee+mois+jour);
			declar.setString(6, numeroAboStr);
			declar.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
	}
	public void actualiserDate(String numeroAbo, int validite)
	{
		try
        {
			LocalDate date = LocalDate.now();
			date.plusMonths(validite);
			String annee = String.valueOf(date.getYear());
			String mois = String.valueOf(date.getMonthValue());
			String jour = String.valueOf(date.getDayOfMonth());
			String requete = "update abosexistants set annee = ?, mois = ?, jour = ? where numeroabo = ?";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, annee);
			declar.setString(2, mois);
			declar.setString(3, jour);
			declar.setString(4, numeroAbo);
			declar.executeUpdate();
			
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
	}
}
