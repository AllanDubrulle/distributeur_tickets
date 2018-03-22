package coeur;

import stockage.imprimable.Billet;

class EtatChoixBillet extends EtatChoixTitre
{	
	private static EtatChoixBillet instance;
	public static EtatChoixBillet getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixBillet();
		return (EtatChoixBillet) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.BILLET);
		super.entree();
	}
	public void valider()
	{
		System.out.println((Billet) Controleur.getInstance().getCoeurAStockage().getTitre()==null);
		Controleur.getInstance().calculerPrix((Billet) Controleur.getInstance().getCoeurAStockage().getTitre());
		super.valider();
	}
	
}