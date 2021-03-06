package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe HoraireTrains
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class HoraireTrains extends GestionBaseDeDonnees
{
	
    public HoraireTrains()
    {
        super();
    }
   
    /**
     * 	Va chercher dans la base de donnees les itineraires de trains entre deux 
     * 	gares a partir d'une certaine heure
     * 	@param depart une gare de depart
     * 	@param arrivee une gare d'arrivee
     * 	@param heure l'heure de l'heure de depart
     *	@param minute les minutes de l'heure depart
     *	@return res un resultat de type SQL contenant les horaires de l'itineraire choisi
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
        		if ((minuteTrajet(depart, arrivee) < minute && heure == 22) || (heure > 22))
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
     * 	Va regarder dans la base de donnees si un couple de gares apparait bien
     *	@param gare1 une gare
     *	@param gare2 une autre gare
     *	@return res vrai si il existe un trajet entre les deux gares, faux sinon
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
     * 	Va regarder dans la base de donnees si une gare apparait bien
     * 	@param gare une gare
     *	@return res vrai si la gare existe, faux sinon
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
     * 	Va chercher dans la base de donnees la minute a laquelle un train part d'une certaine 
     * 	gare et va vers une certaine autre gare
     * 	@param depart une gare de depart
     * 	@param arrivee une gare d'arrivee
     * 	@return min le nombre de minutes entre les deux gares, si le trajet existe, une erreur
     * 	est generee dans le cas contraire
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
    
    public int minuteDepart(String depart)
    {
    	String departMaj = depart.toUpperCase();
    	try
        {
            String requete = "SELECT distinct minute FROM horaire WHERE (DEPART = ?) order by minute desc";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, departMaj);
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
    
    public int[] premiereHeureArrivee(String arrivee)
    {
        String arriveeMaj = arrivee.toUpperCase();
        int[] heure = new int[2];
    	try
        {
            String requete = "SELECT distinct heureArrivee, minuteArrivee FROM horaire WHERE (ARRIVEE = ? and heureArrivee <> 0) order by heureArrivee, minuteArrivee";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
			declar.setString(1, arriveeMaj);
			ResultSet res = declar.executeQuery();
			heure[0] = res.getInt(1);
			heure[1] = res.getInt(2);
        	return heure;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return heure;
    }
    
    /**
     * 	Va chercher dans la base de donnees tous les itineraires de trains a partir d'une 
     * 	certaine gare de depart et a partir d'une certaine heure
     * 	@param depart une gare de depart
     * 	@param heure l'heure de l'heure de depart minimale
     * 	@param minute les minutes de l'heure de depart minimale
     * 	@return result un resultat de type SQL qui contient toutes les arrivees au depart 
     * 	d'une certaine gare a partir d'une certaine heure
     */
    public ResultSet calculToutesLesGaresArrivee(String depart, int heure, int minute)
    {
    	String departMaj = depart.toUpperCase();
        ResultSet res = null;
    	try
    	{
        	if (existenceGare(depart))
        	{
        		if ((minuteDepart(depart) < minute && heure == 22) ||(heure > 22))
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
     * 	Va chercher dans la base de donnees tous les itineraires de trains ayant pour gare 
     * 	d'arrivee une certaine gare et ce avant une certaine heure
     * 	@param arrivee une gare d'arrivee
     * 	@param heure l'heure de l'heure d'arrivee maximale
     * 	@param minute les minutes de l'heure d'arrivee maximale
     * 	@return result un resultat de type SQL qui contient toutes les arrivees au depart 
     * 	d'une certaine gare a partir d'une certaine heure
     */
    public ResultSet calculToutesLesGaresDepart(String arrivee, int heure, int minute)
    {
    	String arriveeMaj = arrivee.toUpperCase();
        ResultSet res = null;
        int[] heurePremiereArrivee = premiereHeureArrivee(arrivee);
    	try
    	{
        	if (existenceGare(arrivee))
        	{
        		if ((heure < heurePremiereArrivee[0]) || (heure == heurePremiereArrivee[0] && minute < heurePremiereArrivee[1]))
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE arrivee = ? order by heurearrivee, minutearrivee";
	        		PreparedStatement declar = this.connexion.prepareStatement(requete);
	        		declar.setString(1, arriveeMaj);
	        		res = declar.executeQuery();	        		
        		}
        		else
        		{
        			String requete = "SELECT depart, arrivee, Heure, minute, heurearrivee, minutearrivee FROM Horaire WHERE arrivee = ? and ((heurearrivee <= ? and minutearrivee <= ? and heurearrivee > 0) or (heurearrivee < ? and minutearrivee > ?  and heurearrivee > 0)) order by heurearrivee, minutearrivee";
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
     * 	Permet de prendre les 5 premieres lignes d'un resultat d'une requete SQL et de 
     * 	les rassembler dans un tableau afin de l'utiliser dans le reste de l'application
     * 	@param res un resultat d'une requete SQL
     * 	@return tab un tableau contenant les 5 premieres lignes d'un resultat de type SQL
     * 	@throws SQLException (peut generer une exception SQL)
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
     * 	Permet de prendre les 5 dernieres lignes d'un resultat d'une requete SQL et de les 
     * 	rassembler dans un tableau afin de l'utiliser dans le reste de l'application. C'est 
     * 	ici pour le cas particulier ou on ne doit pas prendre les heures apres une certaine 
     * 	heure mais les heures avant une certaine heure (typiquement pour les arrivees dans 
     * 	une gare)
     * 	@param res un resultat d'une requete de type SQL
     * 	@return un tableau contenant les 5 dernieres lignes d'un resultat de type SQL
     * 	@throws SQLException (peut generer une exception SQL)
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
			if (Integer.parseInt(tab.get(4)) == 0)
			{
				int compteur = 0;
				for (int i = l-24; i < l; i++)
				{
					tabHor[compteur] = tab.get(i);
					compteur++;
				}
				for (int j = 0; j <6; j++)
				{
					tabHor[compteur] = tab.get(j);
					compteur++;
				}
			}
			else 
			{
				int compteur = 0;
				for (int i = l-30; i < l; i++)
				{
					tabHor[compteur] = tab.get(i);
					compteur++;
				}
			}
		}
    	return tabHor;
	}
}