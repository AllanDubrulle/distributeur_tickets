package stockage;

/**
 * Classe PlusDePapier (exception g�n�r�e s'il n'y a plus de papier)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class PlusDePapier extends Exception
{
	public PlusDePapier(String msg)
	{
		super(msg);
	}
}
