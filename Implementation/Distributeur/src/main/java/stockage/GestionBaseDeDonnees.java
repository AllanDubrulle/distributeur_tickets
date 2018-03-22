package stockage;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class GestionBaseDeDonnees {

	    protected String chemin;
	    protected Connection connexion;
	    protected Statement requete;
	    
	    /**
	     * 
	     * @author TheoDaix, AllanDubrulle, VictorVerhoye
	     * 
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
	        String separation = File.separator;
	        this.chemin = "src"+ separation + "main" + separation + "resources" + separation + "BDDDistributeur.db";
	        this.connexion = null;
	    }
	    
	    /**
	     * 
	     * Permet à une instance de GestionBaseDeDonnees de se connecter à la base de données
	     * 
	     */
	    public boolean connexion()
	    {
	        try
	        {
	            connexion = DriverManager.getConnection("jdbc:sqlite:"+ this.chemin);
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
	     * 
	     * Permet à une instance de GestionBaseDeDonnees de se déconnecter de la base de données
	     * 
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

