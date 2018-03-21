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
		boolean ok = Controleur.getInstance().getCoeurAStockage().verifPaiement(codePIN);
		
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
		Controleur.getInstance().getCoeurAGraphique().afficherCodePINIncor();
		Controleur.getInstance().getCoeurAGraphique().effacerPIN();
		Controleur.getInstance().getCoeurAStockage().mauvaisPing();
		if(Controleur.getInstance().getCoeurAStockage().tropDErreur())
		{
			Controleur.getInstance().getCoeurAGraphique().afficherTropDeTentatives();
			Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
		}
	}
	public void infosCorrectes()
	{
		Controleur.getInstance().getCoeurAStockage().actualiserSolde();
		Controleur.getInstance().getCoeurAGraphique().afficherEjectionCarte();
		Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
	}
	
	public void choixInsererRetirerCarte()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRetraitCarte();
	}
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}