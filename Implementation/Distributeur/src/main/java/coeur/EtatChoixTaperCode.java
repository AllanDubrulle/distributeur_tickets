package coeur;

public class EtatChoixTaperCode extends EtatAnnulable 
{
	private static EtatChoixTaperCode instance;
	
	public static EtatChoixTaperCode getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixTaperCode();
		return (EtatChoixTaperCode) instance;
	}
	
	public void valideRenouvAbo() 
	{
		Controleur.getInstance().modifEtat(EtatModificationAbo.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixTaperCode();
	}
}
