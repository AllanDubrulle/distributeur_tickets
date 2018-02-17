package coeur;

class EtatAnnulable extends ControleurEtat 
{	
	public static EtatAnnulable getInstance() 
	{
		if (instance == null)
			instance = new EtatAnnulable();
		return (EtatAnnulable) instance;
	}
	
	public void annule() 
	{
		controleur.modifEtat(controleur.getEtatsPrecedents().pop());
	}
}