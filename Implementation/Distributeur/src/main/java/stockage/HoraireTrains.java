package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

class HoraireTrains extends GestionBaseDeDonnees
{
    public HoraireTrains()
    {
        super();
    }
   
    public ResultSet calculItineraire(String depart, String arrivee, int heure, int minute) //ATTENTION LES PRINT POSERONT PROBLEME LORS DE L'INSERTION DANS LA FENETRE
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
		System.out.println(l);
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
					System.out.print(valeurColonne);
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
    
    public static void afficherHeuresSpecial(ResultSet res) throws SQLException //affiche au maximum les 5 prochaines heures d'un trajet
    { 
    	if (res != null)
    	{
    		ResultSetMetaData resBis = res.getMetaData();
			int nbrColonnes = resBis.getColumnCount();
			int compteur = 0;
			while (res.next() && compteur <= 4) 
			{
				for (int i = 1; i <= nbrColonnes; i++) {
					if (i == 1)
					{
						String valeurColonne = res.getString(i);
						System.out.print(valeurColonne + " ");
					}
					if (i > 2) 
					{							
						System.out.print(":");
					}
					if (i >= 2)
					{
					String valeurColonne = res.getString(i);
					System.out.print(valeurColonne);
					}
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