package coeur;

public class EtatCreationPassIllimite extends EtatCreationTitre 
{
	private static EtatCreationPassIllimite instance;
	public static EtatCreationPassIllimite getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatCreationPassIllimite();
		}
		return (EtatCreationPassIllimite) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapPassIllimite();
	}
	public void confirme()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}
