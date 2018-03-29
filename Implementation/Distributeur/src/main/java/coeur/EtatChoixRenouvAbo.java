package coeur;

import stockage.Composant;
import stockage.ComposantHorsService;
import stockage.imprimable.Abonnement;

/**
 * Classe EtatChoixRenouvAbo
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixRenouvAbo extends EtatChoixTitre
{
	private static EtatChoixRenouvAbo instance;
	
	public static EtatChoixRenouvAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixRenouvAbo();
		return (EtatChoixRenouvAbo) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.RENOUVELLEMENTABO);
		super.entree();
	}
	
	public void scanneCode() 
	{
		try 
		{
			if(!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.SCANNEUR))
			{
				Controleur.getInstance().getCoeurAGraphique().afficherNumAbo();
			}
			else
			{
				throw new ComposantHorsService("Lecteur de carte hors service");
			}
			
		} 
		catch (ComposantHorsService e) 
		{
			Controleur.getInstance().getCoeurAGraphique().afficherPanne(e.getMessage());
		}
	}
	
	public void valider()
	{
		Controleur.getInstance().calculerPrix((Abonnement) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatMenu.getInstance());
	}
}
