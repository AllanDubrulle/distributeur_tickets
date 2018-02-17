package coeur;

class EtatChoixBillet extends EtatAnnulable 
{	
	private static EtatChoixBillet instance;
	public static EtatChoixBillet getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixBillet();
		return (EtatChoixBillet) instance;
	}
	
	public void valideBillet() 
	{
		Controleur.getInstance().modifEtat(EtatCreationBillet.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixBillet();
	}
}