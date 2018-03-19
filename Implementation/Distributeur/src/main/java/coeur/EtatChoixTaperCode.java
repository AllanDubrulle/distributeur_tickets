package coeur;

public class EtatChoixTaperCode extends EtatChoixTitre 
{
	private static EtatChoixTaperCode instance;
	
	public static EtatChoixTaperCode getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixTaperCode();
		return (EtatChoixTaperCode) instance;
	}
	
	public void valideRenouvAbo() 
	{
		super.valider();
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixTaperCode();
	}
}
