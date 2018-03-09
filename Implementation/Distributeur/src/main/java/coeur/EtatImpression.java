package coeur;

class EtatImpression extends EtatAnnulable 
{	
	private static EtatImpression instance;
	
	public static EtatImpression getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatImpression();
		}
		return (EtatImpression) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherImpression();
		Controleur.getInstance().modifEtat(EtatViderBac.getInstance());
	}
	
	public void après5sec()
	{
		
	}
}