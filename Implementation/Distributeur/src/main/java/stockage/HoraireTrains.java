package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

class HoraireTrains extends GestionBaseDeDonnees
{
	
	/**
     * 
     * @author TheoDaix, AllanDubrulle, VictorVerhoye
     * 
     */
	
    public HoraireTrains()
    {
        super();
    }
   
    /**
     * 
     * Va chercher dans la base de données les itinéraires de trains entre deux gares (depart et arrivee) à partir d'une certaine heure
     * (heure et minute)
     * 
     */
    public ResultSet calculItineraire(String depart, String arrivee, int heure, int minute)
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
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE DEPART = ? and ARRIVEE = ?";
	        		PreparedStatement declar = this.connexion.prepareStatement(requete);
	        		declar.setString(1, departMaj);
	        		declar.setString(2, arriveeMaj);
	        		res = declar.executeQuery();	        		
        		}
        		else
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE DEPART = ? and ARRIVEE = ? and ((Heure >= ? and Minute >= ?) or (Heure > ? and Minute < ?))";
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
    
    /**
     * 
     * Va regarder dans la base de données si un couple de gare (donc un trajet) apparait bien
     * 
     */
    public boolean existenceTrajet(String gare1, String gare2)
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
    
    /**
     * 
     * Va regarder dans la base de données si une gare apparait bien
     * 
     */
    public boolean existenceGare(String gare)
    {
    	String gareMaj = gare.toUpperCase();
    	try
        {
            String requete = "SELECT GARE1 FROM PRIX WHERE (GARE1 = ? or GARE2 = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, gareMaj);
			declar.setString(2, gareMaj);
			ResultSet res = declar.executeQuery();
			return res.next();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * 
     * Va chercher dans la base de données la minute à laquelle un train part d'une certaine gare (depart) et va 
     * vers une certaine autre gare (arrivee)
     * 
     */
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
    
    /**
     * 
     * Va chercher dans la base de données tous les itinéraires de trains à partir d'une certaine gare de départ (depart) 
     * et à partir d'une certaine heure (heure et minute)
     * 
     */
    public ResultSet calculToutesLesGaresArrivee(String depart, int heure, int minute)
    {
    	String departMaj = depart.toUpperCase();
        ResultSet res = null;
    	try
    	{
        	if (existenceGare(depart))
        	{
        		if (heure > 22)
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE DEPART = ? order by heure, minute";
	        		PreparedStatement declar = this.connexion.prepareStatement(requete);
	        		declar.setString(1, departMaj);
	        		res = declar.executeQuery();	        		
        		}
        		else
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE DEPART = ? and ((Heure >= ? and Minute >= ?) or (Heure > ? and Minute < ?)) order by heure, minute";
        			PreparedStatement declar = this.connexion.prepareStatement(requete);
        			declar.setString(1, departMaj);
        			declar.setInt(2, heure);
        			declar.setInt(3, minute);
        			declar.setInt(4, heure);
        			declar.setInt(5, minute);
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
    
    /**
     * 
     * Va chercher dans la base de données tous les itinéraires de trains vers une certaine gare d'arrivée (arrivee)  
     * et au maximum à une certaine heure (heure et minute)
     * 
     */
    public ResultSet calculToutesLesGaresDepart(String arrivee, int heure, int minute)
    {
    	String arriveeMaj = arrivee.toUpperCase();
        ResultSet res = null;
    	try
    	{
        	if (existenceGare(arrivee))
        	{
        		if (heure > 22)
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE arrivee = ? order by heure, minute";
	        		PreparedStatement declar = this.connexion.prepareStatement(requete);
	        		declar.setString(1, arriveeMaj);
	        		res = declar.executeQuery();	        		
        		}
        		else
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE arrivee = ? and ((heurearrivee <= ? and minutearrivee <= ?) or (heurearrivee < ? and minutearrivee > ?)) order by heure, minute";
        			PreparedStatement declar = this.connexion.prepareStatement(requete);
        			declar.setString(1, arriveeMaj);
        			declar.setInt(2, heure);
        			declar.setInt(3, minute);
        			declar.setInt(4, heure);
        			declar.setInt(5, minute);
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
    
    /**
     * 
     * Permet de prendre les 5 premières lignes d'un résultat d'une requête SQL 
     * et de les rassembler dans un tableau afin de l'utiliser dans le reste de l'application
     * 
     */
    public String[] conversionRequeteEnTableau(ResultSet res) throws SQLException
    {
    	String[] tabHor = new String[30];
    	ResultSetMetaData resBis = res.getMetaData();
		int nbrColonnes = resBis.getColumnCount();
    	int compteur = 0;
    	int position = 0;
		while (res.next() && compteur <= 4) 
		{
			for (int i = 1; i <= nbrColonnes; i++) 
			{
				String valeurColonne = res.getString(i);
				tabHor[position] = valeurColonne;
				position += 1;
			}
			compteur+=1;
		}
    	return tabHor;
    }
    
    /**
     * 
     * Permet de prendre les 5 dernières lignes d'un résultat d'une requête SQL 
     * et de les rassembler dans un tableau afin de l'utiliser dans le reste de l'application
     * C'est ici pour le cas particulier où on ne doit pas prendre les heures après une certaine heure 
     * mais les heures avant une certaine heure (typiquement pour les arrivées dans une gare)
     * 
     */
    public String[] conversionRequeteEnTableauArriv(ResultSet res) throws SQLException
    {
    	String[] tabHor = new String[30];
    	ArrayList<String> tab = new ArrayList<String>();
    	ResultSetMetaData resBis = res.getMetaData();
		int nbrColonnes = resBis.getColumnCount();
		while (res.next()) 
		{
			for (int i = 1; i <= nbrColonnes; i++) 
			{
				String valeurColonne = res.getString(i);
				tab.add(valeurColonne);
			}
		}
		int l = tab.size();
		if (l <= 30)
		{
			for (int i = 0; i < l; i++)
				tabHor[i] = tab.get(i);
		}
		else 
		{
			int compteur = 0;
			for(int i = l-30; i < l; i++)
			{
				tabHor[compteur] = tab.get(i);
				compteur++;
			}
		}
    	return tabHor;
	}
}