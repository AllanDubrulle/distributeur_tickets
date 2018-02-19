package coeur;

public class EtatChoixRenouvAbo extends EtatAnnulable 
{
	private static EtatChoixRenouvAbo instance;
	public static EtatChoixRenouvAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixRenouvAbo();
		return (EtatChoixRenouvAbo) instance;
	}
	
	public void valideRenouvAbo() 
	{
		Controleur.getInstance().modifEtat(EtatModificationAbo.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixRenouvAbo();
	}
}
