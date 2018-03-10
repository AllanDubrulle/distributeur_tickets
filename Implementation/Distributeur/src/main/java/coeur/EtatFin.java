package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

class EtatFin extends EtatAnnulable 
{	
	private static EtatFin instance;
	
	public static EtatFin getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatFin();
		}
		return (EtatFin) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherFin();
		PauseTransition delay = new PauseTransition(Duration.seconds(15));
		delay.setOnFinished( event -> apres15sec());
		delay.play();
	}
	public void retourMenuPrincipal()
	{
		Controleur.getInstance().modifEtat(EtatAccueil.getInstance());
	}

	public void apres15sec()
	{
		Controleur.getInstance().modifEtat(EtatAccueil.getInstance());
	}
}