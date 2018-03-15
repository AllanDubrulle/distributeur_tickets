package stockage;

import java.util.HashMap;

class Rendu 
{	
	private HashMap<Pieces,Integer> pieces;
	private HashMap<BilletMonnaie,Integer> billets;
	
	public Rendu (HashMap<Pieces,Integer> pieces, HashMap<BilletMonnaie,Integer> billets)
	{
		this.pieces = pieces;
		this.billets = billets;
	}

	public HashMap<Pieces,Integer> getPieces() 
	{
		return pieces;
	}

	public HashMap<BilletMonnaie,Integer> getBillets() 
	{
		return billets;
	}
}