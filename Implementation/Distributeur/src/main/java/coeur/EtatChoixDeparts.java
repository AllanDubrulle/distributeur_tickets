package coeur;

import java.sql.SQLException;

/**
 * Classe EtatChoixDepart
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixDeparts extends EtatAnnulable 
{
	private static EtatChoixDeparts instance;
	public static EtatChoixDeparts getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixDeparts();
		return (EtatChoixDeparts) instance;
	}
	
	public void choixImpressionHoraire()
	{
		Controleur.getInstance().modifEtat(EtatImpressionHoraire.getInstance());
	}
	
	public void valideRechercheGD(String gareArrivee, int heure, int minute) throws SQLException
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().rechercherHoraireDepart(gareArrivee, heure, minute);
		Controleur.getInstance().getCoeurAGraphique().afficherResultatsHoraires(tab);
	}
	
	public void retour()
	{
		entree();
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixDepart();
	}
}
