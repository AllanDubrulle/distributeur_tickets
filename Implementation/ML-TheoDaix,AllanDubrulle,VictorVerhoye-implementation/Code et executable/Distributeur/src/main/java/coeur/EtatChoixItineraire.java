package coeur;

import java.sql.SQLException;

import stockage.Composant;

/**
 * Classe EtatChoixItineraire
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixItineraire extends EtatAnnulable 
{
	private static EtatChoixItineraire instance;
	public static EtatChoixItineraire getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixItineraire();
		return (EtatChoixItineraire) instance;
	}
	
	public void valideRechercheItineraire(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().rechercherHoraireItineraire(gareDepart, gareArrivee, heure, minute);
		Controleur.getInstance().getCoeurAGraphique().afficherResultatsHoraires(Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.IMPRIMANTE), tab);
	}
	
	public void choixImpressionHoraire()
	{
		Controleur.getInstance().modifEtat(EtatImpressionHoraire.getInstance());
	}
	
	public void retour()
	{
		entree();
	}
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixItineraire();
	}
}
