package stockage;

/**
 * Classe ComposantHorsService (exception generee si un composant est en panne)
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