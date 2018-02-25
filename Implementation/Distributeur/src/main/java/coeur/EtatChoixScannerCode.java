package coeur;

public class EtatChoixScannerCode extends EtatAnnulable 
{
	private static EtatChoixScannerCode instance;
	
	public static EtatChoixScannerCode getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixScannerCode();
		return (EtatChoixScannerCode) instance;
	}
	
	public void valideNumAbo() 
	{
		Controleur.getInstance().modifEtat(EtatChoixScannerCode2.getInstance());
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherNumAbo();
	}
	
	public void choixAnnulerScanner() 
	{
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
}
