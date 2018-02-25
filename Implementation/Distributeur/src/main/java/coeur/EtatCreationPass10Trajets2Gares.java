package coeur;

public class EtatCreationPass10Trajets2Gares extends EtatCreationTitre 
{
	private static EtatCreationPass10Trajets2Gares instance;
	public static EtatCreationPass10Trajets2Gares getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatCreationPass10Trajets2Gares();
		}
		return (EtatCreationPass10Trajets2Gares) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapPass10Trajets2Gares();
	}
}
