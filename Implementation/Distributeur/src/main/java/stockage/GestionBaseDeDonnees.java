package stockage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe Gestion base de donnees (classe parent des classes BDDTitre, BDDBanque etc)
 * HoraireTrains)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class GestionBaseDeDonnees {

	    protected String chemin;
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
	        this.chemin = "src/main/resources/BDDDistributeur.db";
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
	            connexion = DriverManager.getConnection("jdbc:sqlite::resource:"+ this.chemin);
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
	    
	    /**
	     * 	Permet d'afficher les resultats d'une requete
	     * 	@param res un resultat d'une requete de type SQL
	     * 	@throws SQLException (peut etre declanchee si il y a une erreur dans le resultat)
	     */
	    public static void afficherResultat(ResultSet res) throws SQLException { //A SUPPRIMER
			if (res != null)
			{	ResultSetMetaData res2 = res.getMetaData();
				int nbrColonnes = res2.getColumnCount();
				while (res.next()) {
					for (int i = 1; i <= nbrColonnes; i++) {
						if (i > 1) System.out.print(",  ");
						String valeurColonne = res.getString(i);
						System.out.print(valeurColonne + " " + res2.getColumnName(i));
					}
					System.out.println("");
				}
			}
			else
			{
				System.out.println("Cette requete ne retourne aucun resultat !");
			}
	    }   
	    
	    /**
	     * 	Permet de retourner un resultat a partir d'une requete de type SQL
	     * 	@param requete une requete de type SQL
	     */
	    public ResultSet resultatRequete(String requete) //A SUPPRIMER
	    {
	        try
	        {
	            return this.requete.executeQuery(requete);
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	         
	        return null;
	    }
	    
	    /**
	     * 	Permet de mettre a jour une donnee a partir d'une requete de type SQL
	     * 	@param requete une requete de type SQL
	     */
	    public void mettreAJour(String requete) //A SUPPRIMER
	    {
	        try
	        {
	            this.requete.executeUpdate(requete);
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	    }
	    
	}

