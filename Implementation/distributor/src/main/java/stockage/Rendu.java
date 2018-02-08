package stockage;

import java.util.HashMap;

class Rendu {
	private HashMap<Pieces,Integer> pieces;
	private HashMap<Billet,Integer> billets;
	
	public Rendu (HashMap<Pieces,Integer> pieces, HashMap<Billet,Integer> billets){
		this.pieces = pieces;
		this.billets = billets;
	}

	public HashMap<Pieces,Integer> getPieces() {
		return pieces;
	}

	public HashMap<Billet,Integer> getBillets() {
		return billets;
	}


}
