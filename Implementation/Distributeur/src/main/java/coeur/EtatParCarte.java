package coeur;

class EtatParCarte extends EtatAnnulable 
{	
	private static EtatParCarte instance;
	public static EtatParCarte getInstance() 
	{
		if (instance == null)
			instance = new EtatParCarte();
		return (EtatParCarte) instance;
	}
	
	public void choixCarte(String carteBancaire) 
	{
		EtatAttentePIN.getInstance().setCarteBancaire(carteBancaire);
		Controleur.getInstance().modifEtat(EtatAttentePIN.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParCarte();
	}
	public void choixAnnulerParCarte() 
	{
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
}