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
		Controleur.getInstance().getCoeurAGraphique().afficherRendu();
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
}