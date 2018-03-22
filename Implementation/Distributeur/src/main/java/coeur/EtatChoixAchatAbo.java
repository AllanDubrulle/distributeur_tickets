package coeur;

/**
 * Classe EtatChoixAchatAbo
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class EtatChoixAchatAbo extends EtatChoixTitre
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
}
