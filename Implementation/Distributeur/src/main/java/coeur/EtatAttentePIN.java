package coeur;

class EtatAttentePIN extends EtatAnnulable 
{	
	private String carteBancaire;
	
	public void setCarteBancaire(String carteBancaire) 
	{
		this.carteBancaire = carteBancaire;
	}
	
	public static EtatAttentePIN getInstance() 
	{
		if (instance == null)
				instance = new EtatAttentePIN();
		return (EtatAttentePIN) instance;
	}

	public void entree() 
	{
		controleur.getCoeurAGraphique().afficherAttentePIN();
	}
	
	public void validePIN(int codePIN) 
	{
		((EtatValidationPaiement) EtatValidationPaiement.getInstance()).setParametres(codePIN, carteBancaire);
		controleur.modifEtat(EtatValidationPaiement.getInstance());
	}
}