package coeur;

public class EtatModificationAboScanne extends EtatCreationTitre 
{
	private static EtatModificationAboScanne instance;
	public static EtatModificationAboScanne getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatModificationAboScanne();
		}
		return (EtatModificationAboScanne) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapRenouvAboScanne();
	}
	public void confirme()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}
