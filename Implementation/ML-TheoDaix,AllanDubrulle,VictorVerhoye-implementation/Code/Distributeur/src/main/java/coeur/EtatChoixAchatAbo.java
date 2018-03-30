package coeur;

import stockage.imprimable.Abonnement;

/**
 * Classe EtatChoixAchatAbo
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatChoixAchatAbo extends EtatChoixTitre
{
	private static EtatChoixAchatAbo instance;
	public static EtatChoixAchatAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixAchatAbo();
		return (EtatChoixAchatAbo) instance;
	}
	
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.ACHATABO);
		super.entree();
	}
	public void valider()
	{
		Controleur.getInstance().calculerPrix((Abonnement) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
}
