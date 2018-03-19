package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;
import stockage.ComposantHorsService;
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
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParLiquide(Controleur.getInstance().getCoeurAStockage().prixAffichable());
	}
	public void inserer(int i)
	{
		try
		{
			Controleur.getInstance().getCoeurAStockage().ajoutMonnaie(i);
	
			if(Controleur.getInstance().getCoeurAStockage().depassementPrix())
			{
				Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage()
						.rendreMonnaie());
				Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
			}
			else
			{
				Controleur.getInstance().getCoeurAGraphique().actualiserMontant(
						Controleur.getInstance().getCoeurAStockage().renduAffichable(),
						Controleur.getInstance().getCoeurAStockage().introduitAffichable());
			}
		}
		
		catch(PasAssezDeMonnaie e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage().rendreIntroduit());
			Controleur.getInstance().getCoeurAGraphique().afficherRendreMonnaieInseree();
			PauseTransition delais = new PauseTransition(Duration.seconds(5));
			delais.setOnFinished( event -> apres5sec());
			delais.play();
		}
		catch (ComposantHorsService e)
		{
			// TODO Auto-generated catch block
			// afficher message
			apres5sec();
		}
	}
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}
