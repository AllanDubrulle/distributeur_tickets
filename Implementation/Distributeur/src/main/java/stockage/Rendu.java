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
	 * 	Contructeur de Rendu qui met à jour les quantités de pièces et de billet à rendre
	 * 	@param pieces une quantité de pièces
	 * 	@param billets une quantité de billets
	 */
	public Rendu (HashMap<Pieces,Integer> pieces, HashMap<BilletMonnaie,Integer> billets)
	{
		this.pieces = pieces;
		this.billets = billets;
	}

	/**
	 * 	Permet d'obtenir la quantité de pièces à rendre
	 * 	@return pieces une quantité de pièces
	 */
	public HashMap<Pieces,Integer> getPieces() 
	{
		return pieces;
	}

	/**
	 * 	Permet d'obtenir la quantité de billets à rendre
	 * 	@return billets une quantité de billets
	 */
	public HashMap<BilletMonnaie,Integer> getBillets() 
	{
		return billets;
	}
}