package coeur;

class EtatViderBac extends EtatAnnulable 
{	
	private static EtatViderBac instance;
	
	public static EtatViderBac getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatViderBac();
		}
		return (EtatViderBac) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
	public void choixOk()
	{
		Controleur.getInstance().modifEtat(EtatAfficherRecu.getInstance());
	}
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatAfficherRecu.getInstance());
	}
}