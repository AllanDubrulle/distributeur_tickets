package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;
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
				Controleur.getInstance().getCoeurAGraphique().afficherRendreMonnaieInseree();
				PauseTransition delais = new PauseTransition(Duration.seconds(5));
				delais.setOnFinished( event -> apres5sec());
				delais.play();
			}
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().actualiserMontant(
					Controleur.getInstance().getCoeurAStockage().getRendu(),
					Controleur.getInstance().getCoeurAStockage().getIntroduit());
		}
	}
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}
