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
	     
	    public double prixTrajet(String gare1, String gare2) //operationnel
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
	    
	    public ResultSet heureTrajet(String depart, String arrivee, int heure, int minute) //operationnel, retourne null si le trajet n'existe pas
	    {
	        String departMaj = depart.toUpperCase();
	        String arriveeMaj = arrivee.toUpperCase();
	        ResultSet res = null;
	    	try
	    	{
	        	if (existenceTrajet(depart, arrivee))
	        	{
	        		if ((minuteTrajet(depart, arrivee) < minute && heure >= 22) || (heure > 22))
	        		{
	        			System.out.println("Il n'y a plus de trajet à partir de cette heure-là ! Voici les trajets possibles demain matin : \n");
	        			String requete = "SELECT Heure, minute FROM Horaire WHERE DEPART = ? and ARRIVEE = ?";
		        		PreparedStatement declar = this.connexion.prepareStatement(requete);
		        		declar.setString(1, departMaj);
		        		declar.setString(2, arriveeMaj);
		        		res = declar.executeQuery();	        		
	        		}
	        		else
	        		{
	        			System.out.println("Voici les prochains trajets possibles : \n");
	        			String requete = "SELECT Heure, minute FROM Horaire WHERE DEPART = ? and ARRIVEE = ? and ((Heure >= ? and Minute >= ?) or (Heure > ? and Minute < ?))";
	        			PreparedStatement declar = this.connexion.prepareStatement(requete);
	        			declar.setString(1, departMaj);
	        			declar.setString(2, arriveeMaj);
	        			declar.setInt(3, heure);
	        			declar.setInt(4, minute);
	        			declar.setInt(5, heure);
	        			declar.setInt(6, minute);
	        			res = declar.executeQuery();
	        		}
	        	}
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return res;
	    }
	    
	    public int minuteTrajet(String depart, String arrivee)
	    {
	    	String departMaj = depart.toUpperCase();
	        String arriveeMaj = arrivee.toUpperCase();
	    	try
	        {
	            String requete = "SELECT distinct minute FROM horaire WHERE (DEPART = ? and ARRIVEE = ?)";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, departMaj);
				declar.setString(2, arriveeMaj);
				ResultSet res = declar.executeQuery();
				int min = res.getInt(1);
	        	return min;
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return -1;
	    }
	    
	    
	    public boolean existenceTrajet(String gare1, String gare2) //operationnel
	    {
	    	String gare1Maj = gare1.toUpperCase();
	        String gare2Maj = gare2.toUpperCase();
	    	try
	        {
	            String requete = "SELECT GARE1 FROM PRIX WHERE (GARE1 = ? and GARE2 = ?) or (GARE2 = ? and GARE1 = ?)";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, gare1Maj);
				declar.setString(2, gare2Maj);
				declar.setString(3, gare1Maj);
				declar.setString(4, gare2Maj);
				ResultSet res = declar.executeQuery();
				return res.next();
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	        return false;
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
	    
	    public static void afficherHeures(ResultSet res) throws SQLException //affiche les 5 prochaines heures d'un trajet
	    { 
	    	if (res != null)
	    	{
	    		ResultSetMetaData resBis = res.getMetaData();
				int nbrColonnes = resBis.getColumnCount();
				int compteur = 0;
				while (res.next() && compteur <= 4) 
				{
					for (int i = 1; i <= nbrColonnes; i++) {
						if (i > 1) 
						{							
							System.out.print(":");
						}
						String valeurColonne = res.getString(i);
						System.out.print(valeurColonne /*+ " " + res0.getColumnName(i)*/);
					}
					System.out.println("");
					compteur+=1;
				}
	    	}
	    	else
	    	{
	    		System.out.println("Ce trajet n'existe pas !");
	    	}
	    	
		}
	    
	    public void heureTrajetAffichage(String depart, String arrivee, int heure, int minute)
	    {
	    	String departMaj = depart.toUpperCase();
	        String arriveeMaj = arrivee.toUpperCase();
	        ResultSet res1 = null;
	        ResultSet res2 = null;
	        int compteur1 = 0;
	        int compteur2 = 0;
	        
	    	try
	    	{
	        	if (existenceTrajet(depart, arrivee))
	        	{
	        		if ((minuteTrajet(depart, arrivee) < minute && heure >= 22) || (heure > 22))
	        		{
	        			System.out.println("Il n'y a plus de trajet à partir de cette heure-là ! Voici les trajets possibles le lendemain matin : \n");
	        			String requete = "SELECT Heure, minute FROM Horaire WHERE DEPART = ? and ARRIVEE = ?";
		        		PreparedStatement declar = this.connexion.prepareStatement(requete);
		        		declar.setString(1, departMaj);
		        		declar.setString(2, arriveeMaj);
		        		res1 = declar.executeQuery();	  
		        		ResultSetMetaData res1Bis = res1.getMetaData();
						int nbrColonnes = res1Bis.getColumnCount();
						compteur1 = 1;
						while (res1.next() && compteur1 <= 5) 
						{
							for (int i = 1; i <= nbrColonnes; i++) 
							{
								if (i > 1) 
								{
									System.out.print(":");
								}
								String valeurColonne = res1.getString(i);
								System.out.print(valeurColonne /*+ " " + res0.getColumnName(i)*/);
							}
							System.out.println("");
							compteur1 += 1;
						}
	        		}
	        		else
	        		{
	        			System.out.println("Voici les prochains trajets possibles : \n");
	        			String requete = "SELECT Heure, minute FROM Horaire WHERE DEPART = ? and ARRIVEE = ? and ((Heure >= ? and Minute >= ?) or (Heure > ? and Minute < ?))";
	        			PreparedStatement declar = this.connexion.prepareStatement(requete);
	        			declar.setString(1, departMaj);
	        			declar.setString(2, arriveeMaj);
	        			declar.setInt(3, heure);
	        			declar.setInt(4, minute);
	        			declar.setInt(5, heure);
	        			declar.setInt(6, minute);
	        			res1 = declar.executeQuery();
	        			ResultSetMetaData res1Bis = res1.getMetaData();
	    				int nbrColonnes = res1Bis.getColumnCount();
	    				compteur1 = 1;
	    				while (res1.next() && compteur1 <= 5) 
	    				{
	    					for (int i = 1; i <= nbrColonnes; i++) 
	    					{
	    						if (i > 1) 
	    						{
	    							System.out.print(":");
	    						}
	    						String valeurColonne = res1.getString(i);
	    						System.out.print(valeurColonne /*+ " " + res0.getColumnName(i)*/);
	    					}
	    					System.out.println("");
	    					compteur1 += 1;
	    				}
	        			if (compteur1 < 5)
	        			{
	        				String requete2 = "SELECT Heure, minute FROM Horaire WHERE DEPART = ? and ARRIVEE = ? and HEURE <= ?";
	        				PreparedStatement declar2 = this.connexion.prepareStatement(requete2);
	        				declar2.setString(1, departMaj);
	        				declar2.setString(2, arriveeMaj);
	        				declar2.setInt(3,  8-compteur1);
	        				res2 = declar.executeQuery();
	        				ResultSetMetaData res2Bis = res2.getMetaData();
	        				nbrColonnes = res2Bis.getColumnCount();
	        				compteur2 = 0;
	        				while (res2.next() && compteur2 <= 4) 
	        				{
	        					for (int i = 1; i <= nbrColonnes; i++) 
	        					{
	        						if (i > 1) 
	        						{
	        							System.out.print(":");
	        						}
	        						String valeurColonne = res2.getString(i);
	        						System.out.print(valeurColonne /*+ " " + res2Bis.getColumnName(i)*/);
	        					}
	        					System.out.println("");
	        					compteur2 += 1;
	        				}
	        			}
	        		}
	        	}		
	        	else
	        	{
	        		System.out.println("Ce trajet n'existe pas !");
	        	}
	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
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

