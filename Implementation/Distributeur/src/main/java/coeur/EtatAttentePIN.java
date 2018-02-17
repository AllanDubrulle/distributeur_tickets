package coeur;

class EtatAttentePIN extends EtatAnnulable 
{	
	private static EtatAttentePIN instance;
	private String carteBancaire;
	
	public static EtatAttentePIN getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatAttentePIN();
		}
		return (EtatAttentePIN) instance;
	}
	
	public void setCarteBancaire(String carteBancaire) 
	{
		this.carteBancaire = carteBancaire;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherAttentePIN();
	}
	
	public void validePIN(int codePIN) 
	{
		((EtatValidationPaiement) EtatValidationPaiement.getInstance()).setParametres(codePIN, carteBancaire);
		Controleur.getInstance().modifEtat(EtatValidationPaiement.getInstance());
	}
}