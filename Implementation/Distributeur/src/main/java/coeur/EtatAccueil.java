package coeur;

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
	
	public void demarreSimulation()
	{
		Controleur.getInstance().modifEtat(EtatMenu.getInstance());
	}
}
