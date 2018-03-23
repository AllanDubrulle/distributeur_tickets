package coeur;

import stockage.imprimable.Pass;

/**
 * Classe EtatChoixPass10Trajets2Gares
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixPass10Trajets2Gares extends EtatChoixTitre 
{
	private static EtatChoixPass10Trajets2Gares instance;
	public static EtatChoixPass10Trajets2Gares getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPass10Trajets2Gares();
		return (EtatChoixPass10Trajets2Gares) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.PASS10TRAJETS2GARES);
		super.entree();
	}
	public void valider()
	{
		Controleur.getInstance().calculerPrixPass10Trajets2Gares((Pass) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
}
