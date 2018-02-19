package coeur;

public class EtatChoixPass10Trajets2Gares extends EtatAnnulable 
{
	private static EtatChoixPass10Trajets2Gares instance;
	public static EtatChoixPass10Trajets2Gares getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPass10Trajets2Gares();
		return (EtatChoixPass10Trajets2Gares) instance;
	}
	
	public void validePass10Trajets2Gares() 
	{
		Controleur.getInstance().modifEtat(EtatCreationPass10Trajets2Gares.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixPass10Trajets2Gares();
	}
}
