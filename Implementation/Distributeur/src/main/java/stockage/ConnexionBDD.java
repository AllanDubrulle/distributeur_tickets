package stockage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionBDD {

	    private String      chemin;
	    public  Connection  connexion;
	    private Statement   requete;

	    public ConnexionBDD()
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

	    public boolean connect ()
	    {
	        try
	        {
	            connexion = DriverManager.getConnection("jdbc:sqlite:"+this.chemin);
	            requete = connexion.createStatement();
	            requete.executeUpdate("PRAGMA synchronous = OFF;");
	            requete.setQueryTimeout(30);
	            return true;
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	            return false;
	        }
	    }
	     
	    public boolean disconnect ()
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
	     
	    public ResultSet getResultOf(String requete)
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
	    public ResultSet prixTrajet(String gare1, String gare2)
	    {
	        try
	        {
	            String requete = "SELECT Prix FROM PRIX WHERE (GARE1 = ? and GARE2 = ?) or (GARE2 = ? and GARE1 = ?)";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, gare1);
				declar.setString(2, gare2);
				declar.setString(3, gare2);
				declar.setString(4, gare1);
				ResultSet res = declar.executeQuery();
	        	return res;
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	         
	        return null;
	    }
	    /*public ResultSet heureTrajet(String depart, String arrivee, String heure) A FINIR (PROBLEME AVEC HEURE)
	    {
	        try
	        {
	            String heure1 = HEURE.substring(0,2);
	        	String requete = "SELECT Heure FROM Horaire WHERE (DEPART = ? and ARRIVEE = ?) and (HEURE.substring(0,2)>= ?.substring(0,2) and HEURE.substring(2, HEURE.length())>= ?.substring(2,?.length())";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, depart);
				declar.setString(2, arrivee);
				declar.setString(3, heure);
				declar.setString(4, heure);
				ResultSet res = declar.executeQuery();
	        	return res;
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	         
	        return null;
	    }
	    */
	    //Alternative sans heure en paramètre
	    public ResultSet heureTrajet(String depart, String arrivee)
	    {
	        try
	        {
	        	String requete = "SELECT Heure FROM Horaire WHERE (DEPART = ? and ARRIVEE = ?)";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, depart);
				declar.setString(2, arrivee);
				ResultSet res = declar.executeQuery();
	        	return res;
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	         
	        return null;
	    }
	    
	 

	    public void updateValue(String requete)
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
	    public static void afficherResultat(ResultSet res) throws SQLException {
			ResultSetMetaData res2 = res.getMetaData();
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
	}

