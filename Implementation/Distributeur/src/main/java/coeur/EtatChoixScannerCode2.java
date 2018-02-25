package coeur;

public class EtatChoixScannerCode2 extends EtatAnnulable 
{
	private static EtatChoixScannerCode2 instance;
	
	public static EtatChoixScannerCode2 getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixScannerCode2();
		return (EtatChoixScannerCode2) instance;
	}
	
	public void valideRenouvAboScanne() 
	{
		Controleur.getInstance().modifEtat(EtatModificationAboScanne.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRenouvScanne();
	}
}
