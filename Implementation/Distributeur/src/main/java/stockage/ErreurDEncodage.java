package stockage;

/**
 * Classe ErreurDEncodage (exception g�n�r�e s'il y a des erreurs lors des validation des titres)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class ErreurDEncodage extends Exception
{
	public ErreurDEncodage(String msg) 
	{
		super(msg);
	}
}
