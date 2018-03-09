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
	public void inserer(double i)
	{
		Controleur.getInstance().getCoeurAGraphique().insererMonnaie(i);
	}
	public void validePaiement()
	{
		Controleur.getInstance().modifEtat(EtatRendreMonnaie.getInstance());
	}
}
