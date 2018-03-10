package coeur;

class EtatPINIncorrect extends EtatAnnulable 
{	
	private static EtatPINIncorrect instance;
	private String carteBancaire;
	
	public static EtatPINIncorrect getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatPINIncorrect();
		}
		return (EtatPINIncorrect) instance;
	}
	
	public void setCarteBancaire(String carteBancaire) 
	{
		this.carteBancaire = carteBancaire;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherCodePINIncor();
		Controleur.getInstance().getCoeurAGraphique().effacerPIN();
	}
	
	public void validePIN(int codePIN) 
	{
		((EtatDemandeRecu) EtatDemandeRecu.getInstance()).setParametres(codePIN, carteBancaire);
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
	public void choixPINOk()
	{
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
}