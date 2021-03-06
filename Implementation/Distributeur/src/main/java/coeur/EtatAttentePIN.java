package coeur;

import stockage.Composant;

/**
 * Classe EtatAttentePIN
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatAttentePIN extends ControleurEtat
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
		if(Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.LECTEURCARTE))
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
		else
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur();
	}
	
	/**
	 * 	Permet de d'afficher la fenetre de code PIN incorrect et de controler si
	 * 	l'utilisateur n'as deja pas entre trois fois un mauvais code PIN. Si c'est
	 *  le cas, il est redirige vers le choix de paiement et sa carte est ejectee
	 */
	
	private void infosIncorrectes()
	{
		Controleur.getInstance().getCoeurAStockage().mauvaisPin();
		
		if(Controleur.getInstance().getCoeurAStockage().tropDErreur())
		{
			Controleur.getInstance().getCoeurAGraphique().afficherTropDeTentatives();
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().afficherCodePINIncor();
		}
	}
	
	/**
	 * 	Permet d'afficher la fenetre de solde insuffisant et de rediriger l'utilisateur
	 * 	vers le choix de paiement
	 */
	
	private void soldeInsuffisant()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherSoldeInsuffisant();
	}
	
	/**
	 * 	Permet d'afficher la fenetre de validation de paiement, de lancer l'actualisation
	 * 	du solde de la carte et d'ensuite afficher l'ejection de la carte
	 */
	private void infosCorrectes()
	{
		Controleur.getInstance().getCoeurAStockage().actualiserSolde();
		Controleur.getInstance().modifEtat(EtatAttenteRepriseCarte.getInstance());
	}
	
	public void choixInsererRetirerCarte()
	{
		Controleur.getInstance().getCoeurAStockage().carteEnlevee();
		Controleur.getInstance().getCoeurAGraphique().afficherRetraitCarte();
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}