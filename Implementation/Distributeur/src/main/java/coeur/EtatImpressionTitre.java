package coeur;

import stockage.ComposantHorsService;
import stockage.PlusDePapier;

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
		try
		{
			Controleur.getInstance().getCoeurAStockage().impression();
			Controleur.getInstance().getCoeurAGraphique().afficherImpression();
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
		Controleur.getInstance().getCoeurAGraphique().afficherTitre(Controleur.getInstance().getCommande(),Controleur.getInstance().getCoeurAStockage().getTitre() 
				,Controleur.getInstance().getCoeurAStockage().prixAffichable()); 
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
	
}