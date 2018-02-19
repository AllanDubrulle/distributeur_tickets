package coeur;

public class EtatModificationAbo extends EtatCreationTitre 
{
	private static EtatModificationAbo instance;
	public static EtatModificationAbo getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatModificationAbo();
		}
		return (EtatModificationAbo) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapRenouvAbo();
	}
	public void confirmeRenouvAbo()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}
