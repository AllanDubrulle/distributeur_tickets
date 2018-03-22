package coeur;

class EtatChoixHoraire extends EtatAnnulable 
{	
	private static EtatChoixHoraire instance;
	public static EtatChoixHoraire getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixHoraire();
		return (EtatChoixHoraire) instance;
	}
	
	public void choixItineraire() 
	{
		Controleur.getInstance().modifEtat(EtatChoixItineraire.getInstance());
	}
	
	public void choixDeparts() 
	{
		Controleur.getInstance().modifEtat(EtatChoixDeparts.getInstance());
	}
	
	public void choixArrivees() 
	{
		Controleur.getInstance().modifEtat(EtatChoixArrivees.getInstance());
	}
	public void retour()
	{
		entree();
	}
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixHoraire();
	}
}