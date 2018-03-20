package coeur;

class EtatPINIncorrect extends EtatAnnulable 
{	
	private static EtatPINIncorrect instance;
	
	public static EtatPINIncorrect getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatPINIncorrect();
		}
		return (EtatPINIncorrect) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherCodePINIncor();
		Controleur.getInstance().getCoeurAGraphique().effacerPIN();
	}
	
	public void validePIN(int codePIN, double montant) 
	{
		boolean ok = Controleur.getInstance().getCoeurAStockage().getCarte().verifPaiement(codePIN, montant);
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