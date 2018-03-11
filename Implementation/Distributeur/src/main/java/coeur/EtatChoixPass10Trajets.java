package coeur;

public class EtatChoixPass10Trajets extends EtatChoixTitre 
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
}
