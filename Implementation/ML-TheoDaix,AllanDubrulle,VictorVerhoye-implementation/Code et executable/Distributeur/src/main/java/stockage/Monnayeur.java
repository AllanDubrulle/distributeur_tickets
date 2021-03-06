package stockage;

import java.util.HashMap;

/**
 * Classe Carte
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Monnayeur 
{
	private HashMap<Piece, Integer > StockPiece; 
	private HashMap<BilletMonnaie,Integer> StockBillet;
	private Piece[] ordrePieces= {Piece.P200,Piece.P100,Piece.P50,Piece.P20,Piece.P10,Piece.P5,Piece.P2,Piece.P1};  
	private BilletMonnaie[] ordreBillets= {BilletMonnaie.B50,BilletMonnaie.B20,BilletMonnaie.B10,BilletMonnaie.B5};
	private HashMap<Piece, Integer > StockPiecePaiement;
	private HashMap<BilletMonnaie,Integer> StockBilletPaiement;
	
	/**
	 * 	Constructeur de Monnayeur qui initialise le stock de piece et le stock de billets
	 */
	public Monnayeur()
	{
		StockPiecePaiement= new HashMap<Piece, Integer>();
		StockBilletPaiement = new HashMap<BilletMonnaie,Integer>();
		StockPiece = new HashMap<Piece, Integer>();
		for (Piece piece : Piece.values())
		{	
			StockPiece.put(piece, 10);
			StockPiecePaiement.put(piece, 0);
		}
		StockBillet = new HashMap<BilletMonnaie,Integer>();
		for(BilletMonnaie billet : BilletMonnaie.values())
		{
			StockBillet.put(billet, 10);
			StockBilletPaiement.put(billet, 0);
		}
	}
	
	/**
	 * 	Permet de stocker des pieces en plus dans les stocks de pieces
	 * 	@param piece une piece a stocker
	 */
	public void stockerPiece(Piece piece)
	{
		StockPiecePaiement.put(piece,StockPiecePaiement.get(piece)+1);
		StockPiece.put(piece,StockPiece.get(piece)+1);
	}
	
	/**
	 * 	Permet de stocker des billet en plus dans les stocks de billets
	 * 	@param billet un billet a stocker
	 */
	public void stockerBillet(BilletMonnaie billet)
	{
		StockBilletPaiement.put(billet,StockBilletPaiement.get(billet)+1);
		StockBillet.put(billet,StockBillet.get(billet)+1);
	}
	
	/**
	 * 	Permet de rendre un montant avec le moins de pieces et/ou de billet possible
	 * 	@param montant un montant (en cents) a rendre
	 * 	@return	rendu un rendu avec le detail de ce qui a ete donne
	 * 	@throws PasAssezDeMonnaie (s'il n'y a pas assez de monnaie pour rendre)
	 */
	public Rendu calculerRenduArgent(int montant) throws PasAssezDeMonnaie
	{
		HashMap<Piece,Integer> renduPiece = new HashMap<Piece,Integer>();
		HashMap<BilletMonnaie,Integer> renduBillet = new HashMap<BilletMonnaie,Integer>();
		
		for (int i =0;i< ordreBillets.length;i++)
		{
			int stock = StockBillet.get(ordreBillets[i]);
			int division = montant/ordreBillets[i].valeur();
			renduBillet.put(ordreBillets[i], Math.min(division,stock));
			montant-= Math.min(division,stock)*ordreBillets[i].valeur();
		}
		
		for (int j =0; j< ordrePieces.length ;j++)
		{
			int stock = StockPiece.get(ordrePieces[j]);
			int division = montant/ordrePieces[j].valeur();
			renduPiece.put(ordrePieces[j], Math.min(division,stock));
			montant-= Math.min(division,stock)*ordrePieces[j].valeur();
		}
		if (montant!=0)
		{
			throw new PasAssezDeMonnaie("Impossible de rendre la monnaie");
		}
		
		else
		{
			for (BilletMonnaie billet : BilletMonnaie.values())
			{
				StockBillet.put(billet,StockBillet.get(billet)- renduBillet.get(billet));
			}
			for (Piece piece : Piece.values())
			{
				StockPiece.put(piece,StockPiece.get(piece)- renduPiece.get(piece));
			}
			
		}
		viderPaiementEnCours();
		return new Rendu(renduPiece, renduBillet);
	}
	
	/**
	 * 	Permet de rendre la monnaie introduite suite a un probleme technique (imprimante en panne,
	 * 	probleme de monnayeur,...)
	 * 	@return rendu un rendu avec le detail de ce qui a ete rendu
	 */
	public Rendu rendreMontantEncours()
	{
		HashMap<Piece,Integer> renduPiece = new HashMap<Piece,Integer>();
		HashMap<BilletMonnaie,Integer> renduBillet = new HashMap<BilletMonnaie,Integer>();
		for (Piece piece : Piece.values())
		{
			renduPiece.put(piece, StockPiecePaiement.get(piece));
		}
		for (BilletMonnaie billet : BilletMonnaie.values())
		{
			renduBillet.put(billet, StockBilletPaiement.get(billet));
		}
		viderPaiementEnCours();
		return new Rendu(renduPiece, renduBillet);
	}
	
	/**
	 * 	Permet de vider la "memoire" de ce qui a ete insere
	 */
	private void viderPaiementEnCours()
	{
		for (Piece piece : Piece.values())
		{
			 StockPiecePaiement.put(piece, 0);
		}
		for (BilletMonnaie billet : BilletMonnaie.values())
		{

			StockBilletPaiement.put(billet, 0);
		}
	}

	/**
	 * 	Permet de vider la caisse (si l'utilisateur declanche la panne "Vider caisse" par
	 * 	exemple)
	 */
	public void vider()
	{
		for (Piece piece : Piece.values())
		{
			 StockPiece.put(piece, 0);
		}
		for (BilletMonnaie billet : BilletMonnaie.values())
		{

			StockBillet.put(billet, 0);
		}
	}

	/**
	 * 	Pemet de recherger la caisse (si l'utilisateur declanche "Recharger caisse" dans le
	 * 	menu panne)
	 */
	public void rechargerCaisse()
	{
		for (Piece piece : Piece.values())
		{	
			StockPiece.put(piece, 10);
		}
		for(BilletMonnaie billet : BilletMonnaie.values())
		{
			StockBillet.put(billet, 10);
		}
	}
	
	/**
	 * 	Permet de recuperer le detail des pieces de ce qui ont deja ete introduites
	 * 	@return stockPiece le stock de pieces introduites
	 */
	public HashMap<Piece,Integer> getStockPiece()
	{
		return StockPiece;
	}
	
	/**
	 * 	Permet de recuperer le detail des billets de ce qui ont deja ete introduits
	 * 	@return stockBillet le stock de billets introduits
	 */
	public HashMap<BilletMonnaie, Integer> getStockBillet()
	{
		return StockBillet;
	}
}