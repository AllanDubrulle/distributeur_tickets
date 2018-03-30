package stockage;

import java.util.HashMap;

/**
 * Classe Rendu
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Rendu 
{	
	private HashMap<Piece,Integer> pieces;
	private HashMap<BilletMonnaie,Integer> billets;
	
	/**
	 * 	Contructeur de Rendu qui met a jour les quantites de pieces et de billet a rendre
	 * 	@param pieces une quantite de pieces
	 * 	@param billets une quantite de billets
	 */
	public Rendu (HashMap<Piece,Integer> pieces, HashMap<BilletMonnaie,Integer> billets)
	{
		this.pieces = pieces;
		this.billets = billets;
	}

	/**
	 * 	Permet d'obtenir la quantite de pieces a rendre
	 * 	@return pieces une quantite de pieces
	 */
	public HashMap<Piece,Integer> getPieces() 
	{
		return pieces;
	}

	/**
	 * 	Permet d'obtenir la quantite de billets a rendre
	 * 	@return billets une quantite de billets
	 */
	public HashMap<BilletMonnaie,Integer> getBillets() 
	{
		return billets;
	}
}