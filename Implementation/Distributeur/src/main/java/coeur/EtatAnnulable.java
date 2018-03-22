package coeur;

/**
 * Classe EtatAnnulable (parent de tout les états dont nous pouvons revenir en arrière)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */

abstract class EtatAnnulable extends ControleurEtat 
{	
	
	public void retour() 
	{
		Controleur.getInstance().modifEtat(Controleur.getInstance().getEtatsPrecedents().pop());
	}
	public void retourTitre()
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