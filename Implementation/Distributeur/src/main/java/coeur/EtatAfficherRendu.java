package coeur;

class EtatAfficherRendu extends EtatAnnulable 
{	
	private static EtatAfficherRendu instance;
	
	public static EtatAfficherRendu getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatAfficherRendu();
		}
		return (EtatAfficherRendu) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRendu();
	}
	public void choixOk()
	{
		Controleur.getInstance().modifEtat(EtatValidationPaiement.getInstance());
		Controleur.getInstance().getCoeurAGraphique().getStage6().close();
	}
}