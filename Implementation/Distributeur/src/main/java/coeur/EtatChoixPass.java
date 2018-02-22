package coeur;

class EtatChoixPass extends EtatAnnulable 
{	
	private static EtatChoixPass instance;
	public static EtatChoixPass getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPass();
		return (EtatChoixPass) instance;
	}
	
	public void choixPassIllimite() 
	{
		Controleur.getInstance().modifEtat(EtatChoixPassIllimite.getInstance());
	}
	
	public void choixPass10Trajets() 
	{
		Controleur.getInstance().modifEtat(EtatChoixPass10Trajets.getInstance());
	}
	
	public void choixPass10Trajets2Gares() 
	{
		Controleur.getInstance().modifEtat(EtatChoixPass10Trajets2Gares.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixPass();
	}
}