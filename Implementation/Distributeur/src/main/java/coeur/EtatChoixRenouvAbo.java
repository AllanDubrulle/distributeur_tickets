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
	
	public void valideRenouvAbo() 
	{
		Controleur.getInstance().modifEtat(EtatModificationAbo.getInstance());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixRenouvAbo();
	}
	
	public void scanneCode() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherNumAbo();
	}
	
	public void choixAnnulerScanner() 
	{
		Controleur.getInstance().getCoeurAGraphique().getStage().close();
	}
	
	public void choixTaperCode() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixTaperCode();
	}
}
