package coeur;

class EtatRendreMonnaie extends EtatAnnulable 
{	
	private static EtatRendreMonnaie instance;
	
	public static EtatRendreMonnaie getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatRendreMonnaie();
		}
		return (EtatRendreMonnaie) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRendreMonnaie();
	}
	public void choixOk()
	{
		Controleur.getInstance().modifEtat(EtatImpression.getInstance());
		Controleur.getInstance().getCoeurAGraphique().getStage3().close();
	}
}