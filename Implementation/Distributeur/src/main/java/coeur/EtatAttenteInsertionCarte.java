package coeur;

class EtatAttenteInsertionCarte extends EtatAnnulable 
{	
	private static EtatAttenteInsertionCarte instance;
	public static EtatAttenteInsertionCarte getInstance() 
	{
		if (instance == null)
			instance = new EtatAttenteInsertionCarte();
		return (EtatAttenteInsertionCarte) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherInsertionCarte();
	}
	public void choixInsererCarte()
	{
		Controleur.getInstance().modifEtat(EtatAttentePIN.getInstance());
	}
}