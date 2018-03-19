package coeur;

public class EtatModificationAbo extends EtatCreationTitre 
{
	private static EtatModificationAbo instance;
	public static EtatModificationAbo getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatModificationAbo();
		}
		return (EtatModificationAbo) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapCommande(Controleur.getInstance().getCommande(),
				Controleur.getInstance().getCoeurAStockage().getTitre(),
				Controleur.getInstance().getCoeurAStockage().prixAffichable(),
				Controleur.getInstance().getCoeurAStockage().getNbrTitre());
	}
}
