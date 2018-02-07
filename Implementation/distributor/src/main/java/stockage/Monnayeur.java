package stockage;

import java.util.Map;

class Monnayeur {
	private Map<Pieces.Piece, Integer > StockPiece; 
	private Map<Billet,Integer> StockBillet;
	private int[] ordre = {200,100,50,20,10,5,2,1};
	
	
	public Rendu retournerArgent(int montant)throws PasAssezDeMonnaie{
		/*Map<Piece,Integer> renduPiece = new Map<Piece,Integer>();
		Map<Billet,Integer>renduBillet = new Map;*/
		for (int i =0;i< ordre.length ;i++) {
			while(montant%ordre[i]!=0)
			{
				
			}
		}
		return null;
	}
}
