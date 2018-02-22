package coeur;

public class EtatChoixItineraire extends EtatAnnulable 
{
	private static EtatChoixItineraire instance;
	public static EtatChoixItineraire getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixItineraire();
		return (EtatChoixItineraire) instance;
	}
	
	public void valideRecherche() 
	{
		
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixItineraire();
	}
}
