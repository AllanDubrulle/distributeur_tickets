package coeur;

import stockage.Composant;

/**
 * Classe EtatPaiement
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatPaiement extends EtatAnnulable 
{	
	private static EtatPaiement instance;
	public static EtatPaiement getInstance() 
	{
		if (instance == null)
			instance = new EtatPaiement();
		return (EtatPaiement) instance;
	}
	
	public void choixParCarte() 
	{
		Controleur.getInstance().modifEtat(EtatParCarte.getInstance());
	}
	public void choixEnLiquide() 
	{
		if(Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.LECTEURCARTE))
		{
			Controleur.getInstance().modifEtat(EtatPaiementLiquide.getInstance());
		}
		
	}
	
	public void entree() 
	{
		boolean fentes = Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEBILLET) && Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEPIECE);
		boolean lecteur = Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.LECTEURCARTE);
		Controleur.getInstance().setModePaiement(null);
		Controleur.getInstance().getCoeurAGraphique().afficherPaiement(fentes, lecteur);
	}
}