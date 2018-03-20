package coeur;

public class EtatPaiement extends EtatAnnulable 
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
		double montant = Controleur.getInstance().getCoeurAStockage().prixAffichable();
		Controleur.getInstance().getCoeurAGraphique().setMontant(montant);
		Controleur.getInstance().modifEtat(EtatParCarte.getInstance());
	}
	public void choixEnLiquide() 
	{
		Controleur.getInstance().modifEtat(EtatPaiementLiquide.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherPaiement();
	}
}