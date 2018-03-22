package coeur;

/**
 * Classe EtatAttentePIN
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
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
	
	/**
	 * 	Permet de d'afficher la fenêtre de code PIN incorrect et de controler si
	 * 	l'utilisateur n'as déjà pas entré trois fois un mauvais code PIN. Si c'est
	 *  le cas, il est redirigé vers le choix de paiement et sa carte est ejectée
	 */
	private void infosIncorrectes()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherCodePINIncor();
		Controleur.getInstance().getCoeurAStockage().mauvaisPing();
		if(Controleur.getInstance().getCoeurAStockage().tropDErreur())
		{
			Controleur.getInstance().getCoeurAGraphique().afficherTropDeTentatives();
			Controleur.getInstance().getCoeurAGraphique().afficherEjectionCarte();
			Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
		}
	}
	
	/**
	 * 	Permet d'afficher la fenêtre de solde insuffisant et de rediriger l'utilisateur
	 * 	vers le choix de paiement
	 */
	private void soldeInsuffisant()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherSoldeInsuffisant();
		Controleur.getInstance().getCoeurAGraphique().afficherEjectionCarte();
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	
	/**
	 * 	Permet d'afficher la fenêtre de validation de paiement, de lancer l'actualisation
	 * 	du solde de la carte et d'ensuite afficher l'éjection de la carte
	 */
	private void infosCorrectes()
	{
		Controleur.getInstance().getCoeurAStockage().actualiserSolde();
		Controleur.getInstance().getCoeurAGraphique().afficherValidationPaiement();
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