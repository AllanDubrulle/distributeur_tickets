package coeur;

class EtatFin extends EtatAnnulable 
{	
	private static EtatFin instance;
	
	public static EtatFin getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatFin();
		}
		return (EtatFin) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherFin();
	}
	public void retourMenuPrincipal()
	{
		Controleur.getInstance().modifEtat(EtatAccueil.getInstance());
	}
}