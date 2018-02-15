package stockage;

import java.util.HashMap;

public class Monnayeur extends interfaceGraphique.ComposantVisible {
	
	public Monnayeur(boolean enMarche) {
		super(enMarche);
	}

	private HashMap<Pieces, Integer > StockPiece; 
	private HashMap<Billet,Integer> StockBillet;
	private Pieces[] ordrePieces= {Pieces.P200,Pieces.P100,Pieces.P50,Pieces.P20,Pieces.P10,Pieces.P5,Pieces.P2,Pieces.P1};;  
	private Billet[] ordreBillet= {Billet.B50,Billet.B20,Billet.B10,Billet.B5};
	
	public Rendu retournerArgent(int montant) throws PasAssezDeMonnaie,ComposantHorsService {
		if (!estEnMarche()) {
			throw new ComposantHorsService("Monnayeur hors service");
		}
		HashMap<Pieces,Integer> renduPiece = new HashMap<Pieces,Integer>();
		HashMap<Billet,Integer> renduBillet = new HashMap<Billet,Integer>();
		for (int i =0;i< ordreBillet.length ;i++) {
			int nbr = 0;
			while(montant%ordreBillet[i].valeur()==0) {
					if (StockBillet.get(ordreBillet[i])!=0) {
						nbr++;
						montant-=ordreBillet[i].valeur();
					}
			}
			renduBillet.put(ordreBillet[i], nbr);
			StockBillet.put(ordreBillet[i], StockBillet.get(ordreBillet[i])-nbr);
		}
		for (int i =0;i< ordrePieces.length ;i++) {
			int nbr = 0;
			while(montant%ordrePieces[i].valeur()==0) {
				if (StockPiece.get(ordrePieces[i])!=0) {
					nbr++;
					montant-=ordrePieces[i].valeur();
				}
			}
			renduPiece.put(ordrePieces[i], nbr);
			StockPiece.put(ordrePieces[i], StockPiece.get(ordrePieces[i])-nbr);
		}
		if (montant!=0) {
			throw new PasAssezDeMonnaie("Impossible de rendre la monnaie");
		}
		return new Rendu(renduPiece, renduBillet);
	}
}