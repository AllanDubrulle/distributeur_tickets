package coeur;

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
	
	/*public void valider()
	{
		
	}*/
}