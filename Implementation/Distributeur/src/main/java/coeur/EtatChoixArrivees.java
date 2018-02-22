package coeur;

public class EtatChoixArrivees extends EtatAnnulable 
{
	private static EtatChoixArrivees instance;
	public static EtatChoixArrivees getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixArrivees();
		return (EtatChoixArrivees) instance;
	}
	
	public void valideRecherche() 
	{
		
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixArrivee();
	}
}
