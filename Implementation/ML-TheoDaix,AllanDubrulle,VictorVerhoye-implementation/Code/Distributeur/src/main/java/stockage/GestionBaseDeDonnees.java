package stockage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe Gestion base de donnees (classe parent des classes BDDTitre, BDDBanque etc)
 * HoraireTrains)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class GestionBaseDeDonnees 
{
	protected Connection connexion;
	protected Statement requete;
	    
	/**
	 * Constructeur de GestionBaseDeDonnees
	 */
	public GestionBaseDeDonnees()
	{
	    try
	    {
	        Class.forName("org.sqlite.JDBC");
	    }
	    catch (ClassNotFoundException e1)
	    {
	        System.err.println(e1.getMessage());
	    }
	    this.connexion = null;
	}
	   
	/**
	 * 	Permet a une instance de GestionBaseDeDonnees de se connecter a la base de donnees
	 *	@return connexion vrai si la connexion a pu etre etablie, faux sinon
	 */
	public boolean connexion()
	{
	    try
	    {
	        connexion = DriverManager.getConnection("jdbc:sqlite::resource:src/main/resources/BDDDistributeur.db");
	        requete = connexion.createStatement();
	        return true;
	    }
	    catch(SQLException e)
	    {
	        e.printStackTrace();
	        return false;
	    }
	}    

	/**
	 * 	Permet a une instance de GestionBaseDeDonnees de se deconnecter de la base de donnees
	 * 	@return deconnexion vrai si la deconnexion a pu etre etablie, faux sinon
	 */
	public boolean deconnexion()
	{
	    try
	    {
	        if(connexion != null)
	            connexion.close();
	        return true;
	    }
	    catch(SQLException e)
	    {
	        e.printStackTrace();
	        return false;
	    }
	}
}

