package stockage;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class HoraireTrains extends GestionBaseDeDonnees
{
    public HoraireTrains()
    {
        super();
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
    
    public static void afficherHeures(ResultSet res) throws SQLException //affiche au maximum les 5 prochaines heures d'un trajet
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
}