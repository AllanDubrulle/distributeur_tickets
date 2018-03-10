package coeur;

class EtatAfficherBillet extends EtatAnnulable 
{	
	private static EtatAfficherBillet instance;
	
	public static EtatAfficherBillet getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatAfficherBillet();
		}
		return (EtatAfficherBillet) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherBillet();
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
}