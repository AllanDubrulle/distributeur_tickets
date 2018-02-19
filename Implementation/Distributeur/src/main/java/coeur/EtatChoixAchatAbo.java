package coeur;

public class EtatChoixAchatAbo extends EtatAnnulable
{
	private static EtatChoixAchatAbo instance;
	public static EtatChoixAchatAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixAchatAbo();
		return (EtatChoixAchatAbo) instance;
	}
	
	public void valideAchatAbo() 
	{
		Controleur.getInstance().modifEtat(EtatCreationAbo.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixAchatAbo();
	}
}
