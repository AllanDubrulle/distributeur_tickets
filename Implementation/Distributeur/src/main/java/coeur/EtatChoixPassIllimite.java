package coeur;

public class EtatChoixPassIllimite extends EtatChoixTitre 
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
}
