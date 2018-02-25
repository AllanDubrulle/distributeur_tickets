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
		Controleur.getInstance().modifEtat(EtatAttenteInsertionCarte.getInstance());
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
	public void choixCarte() 
	{
		Controleur.getInstance().modifEtat(EtatAttenteInsertionCarte.getInstance());
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
	//cette dernière méthode est pour les tests, à modifier évidemment !
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParCarte();
	}
	public void choixAnnulerParCarte() 
	{
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
}