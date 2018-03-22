package stockage;

import java.util.HashMap;

/**
 * Classe Rendu
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Rendu 
{	
	private HashMap<Pieces,Integer> pieces;
	private HashMap<BilletMonnaie,Integer> billets;
	
	/**
	 * 	Contructeur de Rendu qui met � jour les quantit�s de pi�ces et de billet � rendre
	 * 	@param pieces une quantit� de pi�ces
	 * 	@param billets une quantit� de billets
	 */
	public Rendu (HashMap<Pieces,Integer> pieces, HashMap<BilletMonnaie,Integer> billets)
	{
		this.pieces = pieces;
		this.billets = billets;
	}

	/**
	 * 	Permet d'obtenir la quantit� de pi�ces � rendre
	 * 	@return pieces une quantit� de pi�ces
	 */
	public HashMap<Pieces,Integer> getPieces() 
	{
		return pieces;
	}

	/**
	 * 	Permet d'obtenir la quantit� de billets � rendre
	 * 	@return billets une quantit� de billets
	 */
	public HashMap<BilletMonnaie,Integer> getBillets() 
	{
		return billets;
	}
}