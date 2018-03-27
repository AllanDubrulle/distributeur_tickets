package coeur;

import stockage.Composant;

/**
 * Classe EtatMenu
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class EtatMenu extends ControleurEtat 
{	
	private static EtatMenu instance;
	public static EtatMenu getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatMenu();
		}
		return (EtatMenu) instance;
	}
	
	public void choixBillet() 
	{
		Controleur.getInstance().modifEtat(EtatChoixBillet.getInstance());
	}

	public void choixRenouvAbo() 
	{
		Controleur.getInstance().modifEtat(EtatChoixRenouvAbo.getInstance());
	}
	
	public void choixAchatAbo() 
	{
		Controleur.getInstance().modifEtat(EtatChoixAchatAbo.getInstance());
	}
	
	public void choixPass()
	{
		Controleur.getInstance().modifEtat(EtatChoixPass.getInstance());
	}
	
	public void choixHoraire() 
	{
		Controleur.getInstance().modifEtat(EtatChoixHoraire.getInstance());
	}
	
	public void entree()
	{
		boolean moyenDePayer = (Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEBILLET) || Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEPIECE) || Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.LECTEURCARTE));
		Controleur.getInstance().getCoeurAGraphique().afficherMenu(Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.IMPRIMANTE), moyenDePayer);
		Controleur.getInstance().getEtatsPrecedents().clear();
		Controleur.getInstance().reinitialisationCommande();
	}


}