package coeur;

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
		Controleur.getInstance().getCoeurAGraphique().afficherNumAbo();
	}
	
	public void valider()
	{
		Controleur.getInstance().calculerPrix((Abonnement) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
}
