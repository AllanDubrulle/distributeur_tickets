package coeur;

abstract class EtatAnnulable extends ControleurEtat 
{	
	
	public void retour() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixCommande(Controleur.getInstance().getCommande());
	}
	
	public void annule() 
	{
		Controleur.getInstance().modifEtat(EtatMenu.getInstance());
	}
	
	public void retourMenuPrincipal()
	{
		Controleur.getInstance().modifEtat(EtatAccueil.getInstance());
	}
}