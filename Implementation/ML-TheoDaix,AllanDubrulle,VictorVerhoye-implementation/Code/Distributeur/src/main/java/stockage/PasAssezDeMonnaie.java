package stockage;

/**
 * Classe PasAssezDeMonnaie (exception generee s'il n'y a plus assez de monnaie)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class PasAssezDeMonnaie extends Exception 
{
	public PasAssezDeMonnaie(String msg) 
	{
		super(msg);
	}
}