package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class EtatImpressionRecu extends ControleurEtat
{
	private static  EtatImpressionRecu instance;
	
	public static  EtatImpressionRecu getInstance() 
	{
		if (instance == null)
			instance = new  EtatImpressionRecu();
		return ( EtatImpressionRecu) instance;
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
		Controleur.getInstance().getCoeurAGraphique().afficherRecu(Controleur.getInstance().getCoeurAStockage().getPrix(),
				Controleur.getInstance().getCoeurAStockage().getIntroduit(),
				Controleur.getInstance().getCoeurAStockage().getRendu()); 
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
	

}
