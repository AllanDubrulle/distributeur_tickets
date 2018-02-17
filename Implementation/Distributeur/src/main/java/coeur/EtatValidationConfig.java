package coeur;

class EtatValidationConfig extends ControleurEtat 
{

	public static ControleurEtat getInstance() {
		if (instance == null)
			instance = new EtatChoixBillet();
		return (EtatValidationConfig) instance;
	}
	public void demarreSimulation()
	{
		controleur.modifEtat(EtatMenu.getInstance());
	}
}
