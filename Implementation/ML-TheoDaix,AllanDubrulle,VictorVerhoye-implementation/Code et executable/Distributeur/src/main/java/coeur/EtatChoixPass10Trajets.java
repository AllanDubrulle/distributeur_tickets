package coeur;

import stockage.imprimable.Pass;

/**
 * Classe EtatChoixPass10Trajets
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixPass10Trajets extends EtatChoixTitre 
{
	private static EtatChoixPass10Trajets instance;
	public static EtatChoixPass10Trajets getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPass10Trajets();
		return (EtatChoixPass10Trajets) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.PASS10TRAJETS);
		super.entree();
	}
	public void valider()
	{
		Controleur.getInstance().calculerPrixPass10trajet((Pass) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
}
