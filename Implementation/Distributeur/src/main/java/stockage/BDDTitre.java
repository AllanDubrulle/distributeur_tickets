package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class BDDTitre extends GestionBaseDeDonnees 
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
	
	public double calculerPrixPass(String typePass)
	{
		try
        {
            String requete = "SELECT Prix FROM PRIXPASSSPECIAUX WHERE (pass = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, typePass);
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
	
	public void ajouterAbonnement(int num, String nom, String reg, String source, String destination, String annee, String mois, String jour, String type, String reduction, String classe)
	{
		try
        {
			String nomMaj = nom.toUpperCase();
			String sourceMaj = source.toUpperCase();
			String destinationMaj = destination.toUpperCase();
			String numeroAboStr = String.valueOf(num);
			String requete = "insert into abosexistants values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numeroAboStr);
			declar.setString(2, nomMaj);
			declar.setString(3, reg);
			declar.setString(4, sourceMaj);
			declar.setString(5, destinationMaj);
			declar.setString(6, annee);
			declar.setString(7, mois);
			declar.setString(8, jour);
			declar.setString(9, type);
			declar.setString(10, reduction);
			declar.setString(11, classe);
			declar.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
	}
	public void actualiserDateAbo(String numeroAbo, int validite)
	{
		try
        {
			LocalDate date = LocalDate.now();
			LocalDate dateExp = date.plusMonths(validite);
			String annee = String.valueOf(dateExp.getYear());
			String mois = String.valueOf(dateExp.getMonthValue());
			String jour = String.valueOf(dateExp.getDayOfMonth());
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
	
	public String[] infoAbonnement(String numeroAbo)
	{
        String[] res = new String[10]; 
		try
        {
			if (existenceAbonnement(numeroAbo))
			{
				String requete = "SELECT nom, regnat, source, destination, annee, mois, jour, type, reduction, classe FROM abosexistants WHERE (numeroabo = ?)";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, numeroAbo);
				ResultSet resSQL = declar.executeQuery();
				ResultSetMetaData resBis = resSQL.getMetaData();
				int nbrColonnes = resBis.getColumnCount();
				int position = 0;
				resSQL.next();
				for (int i = 1; i <= nbrColonnes; i++) 
				{
					String valeurColonne = resSQL.getString(i);
					res[position] = valeurColonne;
					position += 1;
				}			
	        	return res; //retourne les infos dans ordre : nom, registre, source, destination, annee, mois, jour
			}
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return res;
	}
	
	public boolean existenceAbonnement(String numeroabo)
	{
		try
        {
			String requete = "SELECT nom FROM abosexistants WHERE (numeroabo = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numeroabo);
			ResultSet resSQL = declar.executeQuery();
			return resSQL.next();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
	}
	
	public ArrayList<String> listeDesAbonnements()
	{
		ArrayList<String> res = new ArrayList<String>();
		try
        {
			String requete = "SELECT distinct numeroabo FROM abosexistants";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
			ResultSet resSQL = declar.executeQuery();
			while (resSQL.next())
			{
				res.add(resSQL.getString(1));
			}
			return res;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return res;
	}
}
