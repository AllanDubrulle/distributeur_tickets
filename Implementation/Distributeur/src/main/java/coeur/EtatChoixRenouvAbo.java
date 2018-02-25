package coeur;

public class EtatChoixRenouvAbo extends EtatAnnulable 
{
	private static EtatChoixRenouvAbo instance;
	
	public static EtatChoixRenouvAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixRenouvAbo();
		return (EtatChoixRenouvAbo) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixRenouvAbo();
	}
	
	public void scanneCode() 
	{
		Controleur.getInstance().modifEtat(EtatChoixScannerCode.getInstance());
	}
	
	public void choixTaperCode() 
	{
		Controleur.getInstance().modifEtat(EtatChoixTaperCode.getInstance());
	}
}
