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
	
	public String getCarteBancaire() 
	{
		return carteBancaire;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherAttentePIN();
		Controleur.getInstance().getCoeurAGraphique().effacerPIN(); // utilité ??
	}
	
	public void validePIN(int codePIN, double montant) 
	{
		Controleur.getInstance().getCoeurAGraphique().setMontant(montant);
		boolean ok = Controleur.getInstance().getCoeurAStockage().getCarte().verifPaiement(codePIN, montant);
		System.out.println(ok);
		if (!ok)
		{
			infosIncorrectes();
		}
		else
		{
			infosCorrectes();
		}
	}
	public void infosIncorrectes()
	{
		Controleur.getInstance().modifEtat(EtatPINIncorrect.getInstance());
	}
	public void infosCorrectes()
	{
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
}