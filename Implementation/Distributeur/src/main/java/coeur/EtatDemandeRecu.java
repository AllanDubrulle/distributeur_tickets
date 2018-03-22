package coeur;

/**
 * Classe EtatDemandeRecu
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatDemandeRecu extends EtatAnnulable 
{	
	private static EtatDemandeRecu instance;
	
	public static EtatDemandeRecu getInstance() 
	{
		if (instance == null)
			instance = new EtatDemandeRecu();
		return (EtatDemandeRecu) instance;
	}
	

	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherDemandeRecu();
	}
	public void choixOui()
	{
		Controleur.getInstance().modifEtat(EtatImpressionRecu.getInstance());
	}
	public void choixNon()
	{
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
}