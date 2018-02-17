package coeur;

public class EtatMenu extends ControleurEtat 
{	
	private static EtatMenu instance;
	public static EtatMenu getInstance() 
	{
		if (instance ==null)
		{
			System.out.println("blibli");
			instance = new EtatMenu();
		}
		return (EtatMenu) instance;
	}
	
	public void choixBillet() {
		Controleur.getInstance().modifEtat(EtatChoixBillet.getInstance());
	}
	public void entree()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherAccueil();
	}


}