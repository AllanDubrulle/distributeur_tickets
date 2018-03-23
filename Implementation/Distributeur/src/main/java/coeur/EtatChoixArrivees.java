package coeur;

/**
 * Classe EtatChoixArrivee
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
import java.sql.SQLException;

class EtatChoixArrivees extends EtatAnnulable 
{
	private static EtatChoixArrivees instance;
	public static EtatChoixArrivees getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixArrivees();
		return (EtatChoixArrivees) instance;
	}
	
	public void valideRechercheGA(String gareDepart, int heure, int minute) throws SQLException
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().rechercherHoraireArrivee(gareDepart, heure, minute);
		Controleur.getInstance().getCoeurAGraphique().afficherResultatsHoraires(tab);
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
		Controleur.getInstance().getCoeurAGraphique().afficherChoixArrivee();
	}
}
