package stockage;

/**
 * Classe ComposantHorsService (exception g�n�r�e si un composant est en panne)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class ComposantHorsService extends Exception 
{
	public ComposantHorsService(String msg) 
	{
		super(msg);
	}
}