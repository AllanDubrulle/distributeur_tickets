package coeur;

class EtatParCarte extends EtatAnnulable 
{	
	private static EtatParCarte instance;
	public static EtatParCarte getInstance() 
	{
		if (instance == null)
			instance = new EtatParCarte();
		return (EtatParCarte) instance;
	}
	
	public void valider() 
	{
		Controleur.getInstance().modifEtat(EtatAttentePIN.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().setModePaiement(this);
		Controleur.getInstance().getCoeurAGraphique().afficherInsertionCarte();
	}
	
	public void choixInsererCarte()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParCarte();
	}
}