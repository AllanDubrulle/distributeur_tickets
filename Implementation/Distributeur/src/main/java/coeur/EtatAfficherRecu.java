package coeur;

class EtatAfficherRecu extends EtatAnnulable 
{	
	private static EtatAfficherRecu instance;
	
	public static EtatAfficherRecu getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatAfficherRecu();
		}
		return (EtatAfficherRecu) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().modifEtat(EtatAfficherBillet.getInstance());
		Controleur.getInstance().getCoeurAGraphique().afficherRecu();
	}
}