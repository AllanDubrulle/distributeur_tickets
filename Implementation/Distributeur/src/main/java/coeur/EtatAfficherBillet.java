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
	}
	public void choixOk()
	{
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
		Controleur.getInstance().getCoeurAGraphique().getStage4().close(); // a enlever si possible
	}
}