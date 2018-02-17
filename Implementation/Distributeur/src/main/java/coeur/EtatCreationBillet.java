package coeur;

class EtatCreationBillet extends EtatCreationTitre
{	
	private static EtatCreationBillet instance;
	public static EtatCreationBillet getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatCreationBillet();
		}
		return (EtatCreationBillet) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapBillet();
	}
	public void confirmeBillet()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}