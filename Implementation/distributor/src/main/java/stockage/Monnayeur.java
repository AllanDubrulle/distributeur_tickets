package stockage;

import java.util.HashMap;

class Monnayeur {
	private HashMap<Pieces, Integer > StockPiece; 
	private HashMap<Billet,Integer> StockBillet;
	private Pieces[] ordrePieces= {Pieces.P100,Pieces.P50,Pieces.P20,Pieces.P10,Pieces.P5,Pieces.P2,Pieces.P1};;  
	
	
	public Rendu retournerArgent(int montant)throws PasAssezDeMonnaie{
		HashMap<Pieces,Integer> renduPiece = new HashMap<Pieces,Integer>();
		HashMap<Billet,Integer> renduBillet = new HashMap<Billet,Integer>();
		for (int i =0;i< ordrePieces.length ;i++) {
			while(montant%ordrePieces[i].valeur()!=0)
			{
					
			}
		}
		return null;
	}
}
