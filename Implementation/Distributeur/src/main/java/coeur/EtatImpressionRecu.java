package coeur;

import javafx.animation.PauseTransition;
import javafx.util.Duration;
import stockage.ComposantHorsService;
import stockage.PlusDePapier;

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
		try
		{
			Controleur.getInstance().getCoeurAStockage().impression();
			Controleur.getInstance().getCoeurAGraphique().afficherImpression();
			PauseTransition delais = new PauseTransition(Duration.seconds(5));
			delais.setOnFinished( event -> apres5sec());
			delais.play();
		}
		catch(PlusDePapier e)
		{
			System.out.println("bli");
			// a faire 
		} 
		catch (ComposantHorsService e)
		{
			System.out.println("bli2");
			// a faire 
		}	
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
