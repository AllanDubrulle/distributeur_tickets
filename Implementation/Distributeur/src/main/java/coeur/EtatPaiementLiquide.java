package coeur;

class EtatPaiementLiquide extends EtatAnnulable
{
	private static EtatPaiementLiquide instance;
	public double introduit;
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
		reinitialisation();
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParLiquide(Controleur.getInstance().getCoeurAStockage().getPrix());
	}
	private void reinitialisation() //a réfléchir si on stocke dans stockage ou pas 
	{
		introduit=0.0;
	}
	public void inserer(int i)
	{
		Controleur.getInstance().getCoeurAStockage().ajoutMonnaie(i);
		introduit+=((double) i)/100;
		double rendu = Controleur.getInstance().getCoeurAStockage().getPrix()-introduit;
		if(rendu<=0.0)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherRendu();
			Controleur.getInstance().modifEtat(EtatImpression.getInstance());
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().actualiserMontant(rendu, introduit);
		}
	}
}
