package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class EtatImpressionTitre extends EtatAnnulable 
{	
	private static EtatImpressionTitre instance;
	
	public static EtatImpressionTitre getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatImpressionTitre();
		}
		return (EtatImpressionTitre) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherImpression();
		PauseTransition delais = new PauseTransition(Duration.seconds(5));
		delais.setOnFinished( event -> apres5sec());
		delais.play();
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
	public void choixOk()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherTitre(Controleur.getInstance().getCommande(),Controleur.getInstance().getCoeurAStockage().getTitre() 
				,Controleur.getInstance().getCoeurAStockage().getPrix()); 
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
	
}