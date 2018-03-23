package coeur;

import stockage.imprimable.Pass;

/**
 * Classe EtatChoixPassIllimite
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixPassIllimite extends EtatChoixTitre 
{
	private static EtatChoixPassIllimite instance;
	public static EtatChoixPassIllimite getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixPassIllimite();
		return (EtatChoixPassIllimite) instance;
	}
	
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.PASSILLIMITE);
		super.entree();
	}
	
	public void valider()
	{
		Controleur.getInstance().calculerPrixIllimite((Pass) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
}
