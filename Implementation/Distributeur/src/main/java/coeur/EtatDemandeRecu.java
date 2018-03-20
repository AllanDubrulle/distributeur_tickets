package coeur;

public class EtatDemandeRecu extends EtatAnnulable 
{	
	private static EtatDemandeRecu instance;
	private int codePIN;
	private String carteBancaire;
	
	public static EtatDemandeRecu getInstance() 
	{
		if (instance == null)
			instance = new EtatDemandeRecu();
		return (EtatDemandeRecu) instance;
	}
	
	public void setParametres(int codePIN, String carteBancaire) 
	{
		this.codePIN = codePIN;
		this.carteBancaire = carteBancaire;
	}

	public void entree() 
	{
		Controleur.getInstance().getCoeurAStockage().creerCarte(carteBancaire);
		Controleur.getInstance().getCoeurAGraphique().effacerPIN();
		Controleur.getInstance().getCoeurAGraphique().afficherDemandeRecu();
	}
	public void choixOui()
	{
		Controleur.getInstance().modifEtat(EtatImpressionRecu.getInstance());
	}
	public void choixNon()
	{
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
}