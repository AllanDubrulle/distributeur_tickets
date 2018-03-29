package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import stockage.imprimable.TypePass;

/**
 * Classe BBDTitre (gestion de base de donnees pour toutes les donnees des titres de transport)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */

class BDDTitre extends GestionBaseDeDonnees 
{
	/**
	 * Constructeur de BDDTitre
	 */
	public BDDTitre()
    {
        super();
    }
	
	/**
     * 	Va chercher dans la base de donnees le prix d'un billet pour un trajet entre deux 
     * 	gares
     * 	@param gare1 une gare
     * 	@param gare2 une autre gare
     * 	@return prix le prix du billet
     */
	public double calculerPrixBillet(String gare1, String gare2) 
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
	
	/**
     * 	Va chercher dans la base de donnees le prix d'un mois d'abonnement pour un trajet 
     * 	entre deux gares
     * 	@param source une gare source
     * 	@param destination une gare destination
     * 	@return prix le prix d'un mois de l'abonnement
     */
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
	
	/**
     * 	Va chercher dans la base de donnees le prix pour un jour d'un pass illimite ou 
     * 	le prix d'un pass 10 trajets
     * 	@param typePass un type de pass (TypePass)
     * 	@return prix le prix d'un pass
     */
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
	
	/**
     * 	Va chercher dans la base de donnees le numero qui suit le dernier abonnement stocke 
     * 	dans la base de donnees
     * 	Sert typiquement lors de la creation d'un nouvel abonnement afin de savoir quel sera
     * 	son numero
     * 	@return num le numero de l'abonnement suivant le denier enregistre dans la base de 
     * 	donnees
     */
	public int numeroAbonnementSuivant()
	{
		try
        {
            String requete = "SELECT numeroabo FROM abosexistants order by numeroabo desc";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
			ResultSet res = declar.executeQuery();
			int compteur = 0;
			while (res.next())
			{
				compteur++;
			}
        	return compteur;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
	}
	
	/**
	 * 	Permet l'ajout dans la base de donnees d'un nouvel abonnement
	 * 	@param num le numero de l'abonnement
	 * 	@param nom le nom auquel sera enregistre l'abonnement
	 * 	@param reg le numero de registre national du client
	 * 	@param source la gare source de l'abonnement
	 * 	@param destination la gare de destination de l'abonnement
	 * 	@param annee l'annee de la date d'expiration
	 * 	@param mois le mois de la date d'expiration
	 * 	@param jour le jour de la date d'expiration
	 * 	@param type le type de l'abonnement
	 * 	@param reduction la reduction
	 * 	@param classe la classe
	 */
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
	
	/**
     * 	Va modifier dans la base de donnees la date d'expiration d'un certain abonnement 
     * 	en fonction de la validite passee en parametres
     * 	@param numeroAbo le numero de l'abonnement dont on doit modifier la date d'expiration
     * 	@param validite le nombre de mois a ajouter a la date de validite de l'abonnement
     */
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
	
	/**
     * 	Va chercher dans la base de donnees les informations d'un certain abonnement 
     * 	et les retourne sous forme de tableau 
     * 	@param numeroAbo le numero de l'abonnement dont on veut les donnees
     *	@return tab un tableau contenant dans l'ordre les informations suivantes :
     *	Nom, Registre national, Source, Destination, Annee, Mois, Jour, Type, Reduction,
     *	Classe
     */
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
	        	return res;
			}
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return res;
	}
	
	/**
     * 	Verifie l'existence d'un abonnement dans la base de donnees
     * 	@param numeroAbo le numero d'abonnement
     * 	@return existance qui est vrai si l'abonnement est dans la base de donnee, faux sinon 
     */
	public boolean existenceAbonnement(String numeroAbo)
	{
		try
        {
			String requete = "SELECT nom FROM abosexistants WHERE (numeroAbo = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numeroAbo);
			ResultSet resSQL = declar.executeQuery();
			return resSQL.next();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
	}
	
	/**
     * 	Va chercher l'ensemble des abonnements presents dans la base de donnees
     * 	@return liste une liste contenant tout les numeros d'abonnement existant dans la 
     * 	base de donnees
     */
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

	public double calculerPrixPass(TypePass typePass)
	{
		switch (typePass)
		{
		case PASS10TRAJETS:
			calculerPrixPass("10TRAJETS");
			break;
		case PASSILLIMITE:
			calculerPrixPass("SansRestriction");
			break;
		default:
			break;
		
		}
		return 0;
	}
}
