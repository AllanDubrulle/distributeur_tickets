package coeur;

import stockage.PasAssezDeMonnaie;

class EtatPaiementLiquide extends EtatAnnulable
{
	private static EtatPaiementLiquide instance;
	public double introduit;
	private final double epsilon = 0.01;
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
		if(rendu<=epsilon)
		{
			try
			{
				Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage().getPrix(),
						introduit,Math.abs(rendu),
						Controleur.getInstance().getCoeurAStockage().rendreMonnaie(Math.abs(rendu)));
				Controleur.getInstance().modifEtat(EtatImpression.getInstance());
			}
			
			catch(PasAssezDeMonnaie e)
			{
				Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage().getPrix(),Controleur.getInstance().getCoeurAStockage().getPrix(),Controleur.getInstance().getCoeurAStockage().getPrix(),Controleur.getInstance().getCoeurAStockage().rendreIntroduit());
				//ajouter un message a l'utilisateur  
				Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
			}
			

		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().actualiserMontant(rendu, introduit);
		}
	}
}
