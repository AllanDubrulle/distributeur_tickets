package coeur;

abstract class EtatAnnulable extends ControleurEtat 
{	
	
	public void annule() 
	{
		Controleur.getInstance().modifEtat(Controleur.getInstance().getEtatsPrecedents().pop());
	}
	public void retourMenuPrincipal()
	{
		Controleur.getInstance().modifEtat(EtatMenu.getInstance());
	}
}