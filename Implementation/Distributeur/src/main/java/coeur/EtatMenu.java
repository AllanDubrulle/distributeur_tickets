package coeur;

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
		Controleur.getInstance().getCoeurAGraphique().afficherAccueil();
	}


}