package coeur;

import java.sql.SQLException;

public class EtatChoixItineraire extends EtatAnnulable 
{
	private static EtatChoixItineraire instance;
	public static EtatChoixItineraire getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixItineraire();
		return (EtatChoixItineraire) instance;
	}
	
	public void valideRecherche(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().rechercherHoraireItineraire(gareDepart, gareArrivee, heure, minute);
		Controleur.getInstance().getCoeurAGraphique().afficherResultatsHoraires(tab);
	}
	public void retourRecherche()
	{
		entree();
	}
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixItineraire();
	}
}
