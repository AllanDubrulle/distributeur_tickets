package coeur;

public class EtatChoixNumAbo extends EtatAnnulable 
{
	private static EtatChoixNumAbo instance;
	public static EtatChoixNumAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixNumAbo();
		return (EtatChoixNumAbo) instance;
	}
	
	public void valideNumAbo() 
	{
		Controleur.getInstance().modifEtat(EtatModificationAbo.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherNumAbo();
	}
}
