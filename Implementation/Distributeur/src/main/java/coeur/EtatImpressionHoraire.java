package coeur;

import stockage.Composant;
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
			Controleur.getInstance().getCoeurAStockage().actualiserPanne(Composant.IMPRIMANTE); 
			Controleur.getInstance().getCoeurAGraphique().afficherPanne(e.getMessage());
		} 
		catch (ComposantHorsService e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherPanne(e.getMessage()); 
		}	
	}
	public void apres5sec()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
																						
	public void apres5secOk()
	{
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
	
	public void choixOk()
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().getHoraire();	
		Controleur.getInstance().getCoeurAGraphique().afficherImpressionHoraire(tab);
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
}
