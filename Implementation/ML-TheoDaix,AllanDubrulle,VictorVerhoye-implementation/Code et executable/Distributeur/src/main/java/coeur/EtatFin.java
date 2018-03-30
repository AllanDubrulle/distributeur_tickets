package coeur;

/**
 * Classe EtatFin
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class EtatFin extends EtatAnnulable 
{	
	private static EtatFin instance;
	
	public static EtatFin getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatFin();
		}
		return (EtatFin) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherFin();
	}
	public void retourMenuPrincipal()
	{
		Controleur.getInstance().modifEtat(EtatAccueil.getInstance());
	}

	public void apres15sec()
	{
		Controleur.getInstance().modifEtat(EtatAccueil.getInstance());
	}
}