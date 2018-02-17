package coeur;

class EtatConfiguration extends ControleurEtat 
{
	public static EtatConfiguration getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixBillet();
		return (EtatConfiguration) instance;
	}

	public void valideConfig() 
	{
		controleur.modifEtat(EtatValidationConfig.getInstance());
	}
}
