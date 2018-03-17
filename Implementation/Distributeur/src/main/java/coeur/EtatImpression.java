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
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
	public void choixOk()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecu();
		Controleur.getInstance().getCoeurAGraphique().afficherTitre(Controleur.getInstance().getCommande(),Controleur.getInstance().getCoeurAStockage().getTitre() ,0); //prix : 0 = valeur par défaut pour test!
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
	
}