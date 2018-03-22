package coeur;

class EtatParCarte extends EtatAnnulable 
{	
	private static EtatParCarte instance;
	public static EtatParCarte getInstance() 
	{
		if (instance == null)
			instance = new EtatParCarte();
		return (EtatParCarte) instance;
	}
	
	public void valider() 
	{
		if(Controleur.getInstance().getCoeurAStockage().getPrix()<=500 && Controleur.getInstance().getCoeurAStockage().verifSolde()) // paiement en dessous de 5€
		{
			Controleur.getInstance().getCoeurAStockage().actualiserSolde();
			Controleur.getInstance().getCoeurAGraphique().afficherValidationPaiement();
			Controleur.getInstance().getCoeurAGraphique().afficherEjectionCarte();
			Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
		}
		else
		{
			Controleur.getInstance().modifEtat(EtatAttentePIN.getInstance());
		}
		
	}
	
	public void entree() 
	{
		Controleur.getInstance().setModePaiement(this);
		Controleur.getInstance().getCoeurAGraphique().afficherInsertionCarte();
	}
	
	public void choixInsererRetirerCarte()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParCarte();
	}
}