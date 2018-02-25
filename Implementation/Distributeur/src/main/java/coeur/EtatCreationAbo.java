package coeur;

public class EtatCreationAbo extends EtatCreationTitre 
{
	private static EtatCreationAbo instance;
	public static EtatCreationAbo getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatCreationAbo();
		}
		return (EtatCreationAbo) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapAchatAbo();
	}
}
