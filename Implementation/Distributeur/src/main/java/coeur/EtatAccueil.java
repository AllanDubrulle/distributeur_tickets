package coeur;

/**
 * Classe EtatAcceuil
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatAccueil extends ControleurEtat
{
	private static EtatAccueil instance;
	public static EtatAccueil getInstance() 
	{
		if (instance == null)
		{
			instance = new EtatAccueil();
		}
		return (EtatAccueil) instance;
	}
	
	public void entree()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherAccueil();
	}
	
	public void demarreSimulation()
	{
		Controleur.getInstance().modifEtat(EtatMenu.getInstance());
	}
}
