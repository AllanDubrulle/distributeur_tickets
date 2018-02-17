package coeur;

class EtatValidationPaiement extends EtatAnnulable 
{	
	private static EtatValidationPaiement instance;
	private int codePIN;
	private String carteBancaire;
	
	public static EtatValidationPaiement getInstance() 
	{
		if (instance == null)
			instance = new EtatValidationPaiement();
		return (EtatValidationPaiement) instance;
	}
	
	public void setParametres(int codePIN, String carteBancaire) 
	{
		this.codePIN = codePIN;
		this.carteBancaire = carteBancaire;
	}

	public void entree() 
	{
		Controleur.getInstance().getCoeurAStockage().creerCarte(carteBancaire, codePIN);
		Controleur.getInstance().getCoeurAGraphique().afficherValidationPaiement();
	}
}