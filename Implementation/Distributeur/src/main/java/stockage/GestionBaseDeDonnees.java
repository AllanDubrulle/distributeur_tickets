package stockage;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class GestionBaseDeDonnees {

	    protected String chemin;
	    protected Connection connexion;
	    protected Statement requete;

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
	        String sep = File.separator;
	        this.chemin = "src"+ sep + "main" + sep + "resources" + sep + "BDDDistributeur.db";
	        this.connexion = null;
	    }

	    public boolean connexion()
	    {
	        try
	        {
	            connexion = DriverManager.getConnection("jdbc:sqlite:"+ this.chemin);
	            requete = connexion.createStatement();
	            requete.setQueryTimeout(30); //pour que le temps de la requete n'excede pas 30 secondes
	            return true;
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	            return false;
	        }
	    }
	     
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
	    
	    public static void afficherResultat(ResultSet res) throws SQLException { //affiche les resultats d'une requete
			if (res != null)
			{	ResultSetMetaData res2 = res.getMetaData();
				int nbrColonnes = res2.getColumnCount();
				while (res.next()) {
					for (int i = 1; i <= nbrColonnes; i++) {
						if (i > 1) System.out.print(",  ");
						String valeurColonne = res.getString(i);
						System.out.print(valeurColonne /*+ " " + res2.getColumnName(i)*/);
					}
					System.out.println("");
				}
			}
			else
			{
				System.out.println("Cette requete ne retourne aucun resultat !");
			}
	    }   
	    
	    public ResultSet resultatRequete(String requete)
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
	    
	    public void mettreAJour(String requete)
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

