package coeur;

public class EtatChoixPass10Trajets2Gares extends EtatChoixTitre 
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
}
