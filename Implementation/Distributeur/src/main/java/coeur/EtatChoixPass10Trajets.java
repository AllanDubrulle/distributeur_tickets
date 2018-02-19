package coeur;

public class EtatChoixPass10Trajets extends EtatAnnulable 
{
	private static EtatChoixPass10Trajets instance;
	public static EtatChoixPass10Trajets getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPass10Trajets();
		return (EtatChoixPass10Trajets) instance;
	}
	
	public void validePass10Trajets() 
	{
		Controleur.getInstance().modifEtat(EtatCreationPass10Trajets.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixPass10Trajets();
	}
}
