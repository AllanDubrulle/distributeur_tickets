package coeur;

import stockage.PasAssezDeMonnaie;

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
		Controleur.getInstance().getCoeurAStockage().reinitialisation();
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParLiquide(Controleur.getInstance().getCoeurAStockage().getPrix());
	}
	public void inserer(int i)
	{
		Controleur.getInstance().getCoeurAStockage().ajoutMonnaie(i);
		if(Controleur.getInstance().getCoeurAStockage().getPrix()<=Controleur.getInstance().getCoeurAStockage().getIntroduit())
		{
			try
			{
				double rendu = Controleur.getInstance().getCoeurAStockage().getRendu();
				Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage()
						.rendreMonnaie(rendu));
				Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
			}
			
			catch(PasAssezDeMonnaie e)
			{
				Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage().rendreIntroduit());
				//ajouter un message a l'utilisateur  
				Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
			}
			

		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().actualiserMontant(
					Controleur.getInstance().getCoeurAStockage().getRendu(),
					Controleur.getInstance().getCoeurAStockage().getIntroduit());
		}
	}
}
