package coeur;

public class EtatChoixDeparts extends EtatAnnulable 
{
	private static EtatChoixDeparts instance;
	public static EtatChoixDeparts getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixDeparts();
		return (EtatChoixDeparts) instance;
	}
	
	public void valideRecherche() 
	{
		
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixDepart();
	}
}
