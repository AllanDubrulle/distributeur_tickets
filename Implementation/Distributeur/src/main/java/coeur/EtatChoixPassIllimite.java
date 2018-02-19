package coeur;

public class EtatChoixPassIllimite extends EtatAnnulable 
{
	private static EtatChoixPassIllimite instance;
	public static EtatChoixPassIllimite getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPassIllimite();
		return (EtatChoixPassIllimite) instance;
	}
	
	public void validePassIllimite() 
	{
		Controleur.getInstance().modifEtat(EtatCreationPassIllimite.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixBillet();
	}
}
