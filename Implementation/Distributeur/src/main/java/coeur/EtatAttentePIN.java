package coeur;

class EtatAttentePIN extends EtatAnnulable 
{	
	private static EtatAttentePIN instance;
	
	public static EtatAttentePIN getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatAttentePIN();
		}
		return (EtatAttentePIN) instance;
	}
	
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherAttentePIN();
		Controleur.getInstance().getCoeurAGraphique().effacerPIN(); // utilité ?? c'est graphique a enlever
	}
	
	public void validePIN(int codePIN) 
	{
		boolean code = Controleur.getInstance().getCoeurAStockage().verifCode(codePIN);
		boolean solde = Controleur.getInstance().getCoeurAStockage().verifSolde();
		
		if (!code)
		{
			infosIncorrectes();
		}
		else if (!solde)
		{
			soldeInsuffisant();
		}
		else
		{
			infosCorrectes();
		}
	}
	public void infosIncorrectes()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherCodePINIncor();
		Controleur.getInstance().getCoeurAGraphique().effacerPIN();
		Controleur.getInstance().getCoeurAStockage().mauvaisPing();
		if(Controleur.getInstance().getCoeurAStockage().tropDErreur())
		{
			Controleur.getInstance().getCoeurAGraphique().afficherTropDeTentatives();
			ejecteCarte();
			Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
		}
	}
	public void soldeInsuffisant()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherSoldeInsuffisant();
		ejecteCarte();
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	public void infosCorrectes()
	{
		Controleur.getInstance().getCoeurAStockage().actualiserSolde();
		Controleur.getInstance().getCoeurAGraphique().afficherValidationPaiement();
		ejecteCarte();
	}
	public void ejecteCarte()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherEjectionCarte();
	}
	public void choixInsererRetirerCarte()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRetraitCarte();
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	public void apres5secOk()
	{
		Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
	}
}