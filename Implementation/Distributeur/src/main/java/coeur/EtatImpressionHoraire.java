package coeur;

import stockage.ComposantHorsService;
import stockage.PlusDePapier;

class EtatImpressionHoraire extends ControleurEtat
{
	private static EtatImpressionHoraire instance;
	
	public static EtatImpressionHoraire getInstance() 
	{
		if (instance == null)
				instance = new EtatImpressionHoraire();
		return (EtatImpressionHoraire) instance;
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
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur();
			Controleur.getInstance().modifEtat(EtatMenu.getInstance());
		} 
		catch (ComposantHorsService e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur(); 
			Controleur.getInstance().modifEtat(EtatMenu.getInstance());
		}	
	}
	public void apres5sec()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
	
	public void choixOk()
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().getHoraire();	
		Controleur.getInstance().getCoeurAGraphique().afficherImpressionHoraire(tab);
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
}
