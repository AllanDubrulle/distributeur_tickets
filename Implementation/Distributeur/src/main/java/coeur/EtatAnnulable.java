package coeur;

import stockage.Composant;

/**
 * Classe EtatAnnulable (parent de tout les etats dont nous pouvons revenir en arriere)
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
		Controleur.getInstance().getCoeurAGraphique().afficherChoixCommande(Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.SCANNEUR), Controleur.getInstance().getCommande());
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