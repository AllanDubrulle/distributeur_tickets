package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

class EtatImpression extends EtatAnnulable 
{	
	private static EtatImpression instance;
	
	public static EtatImpression getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatImpression();
		}
		return (EtatImpression) instance;
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
		Controleur.getInstance().modifEtat(EtatViderBac.getInstance());
	}
}