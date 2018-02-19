package coeur;

public class EtatCreationPass10Trajets extends EtatCreationTitre 
{
	private static EtatCreationPass10Trajets instance;
	public static EtatCreationPass10Trajets getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatCreationPass10Trajets();
		}
		return (EtatCreationPass10Trajets) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapPass10Trajets();
	}
	public void confirme()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}
