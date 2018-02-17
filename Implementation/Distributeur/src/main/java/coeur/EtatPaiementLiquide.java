package coeur;

class EtatPaiementLiquide extends EtatAnnulable
{
	private static EtatPaiementLiquide instance;
	public static EtatPaiementLiquide getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatPaiementLiquide();
		}
		return (EtatPaiementLiquide) instance;
	}
	public void entree()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParLiquide();
	}
}
