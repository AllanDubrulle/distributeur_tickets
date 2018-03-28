package coeur;

/**
 * Classe EtatAttentePIN
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatAttenteRepriseCarte extends EtatAnnulable 
{	
	private static EtatAttenteRepriseCarte instance;
	
	public static EtatAttenteRepriseCarte getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatAttenteRepriseCarte();
		}
		return (EtatAttenteRepriseCarte) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherValidationPaiement();
	}
	
	public void choixInsererRetirerCarte()
	{
		Controleur.getInstance().getCoeurAStockage().carteEnlevee();
		Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
	}
}