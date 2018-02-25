package coeur;

class EtatPaiementLiquideOk extends EtatAnnulable 
{	
	private static EtatPaiementLiquideOk instance;
	
	public static EtatPaiementLiquideOk getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatPaiementLiquideOk();
		}
		return (EtatPaiementLiquideOk) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().modifEtat(EtatRendreMonnaie.getInstance());
	}
}