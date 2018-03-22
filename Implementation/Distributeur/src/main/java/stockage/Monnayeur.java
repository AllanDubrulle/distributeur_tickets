package stockage;

import java.util.HashMap;

/**
 * Classe Carte
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class Monnayeur 
{
	private HashMap<Pieces, Integer > StockPiece; 
	private HashMap<BilletMonnaie,Integer> StockBillet;
	private Pieces[] ordrePieces= {Pieces.P200,Pieces.P100,Pieces.P50,Pieces.P20,Pieces.P10,Pieces.P5,Pieces.P2,Pieces.P1};  
	private BilletMonnaie[] ordreBillets= {BilletMonnaie.B50,BilletMonnaie.B20,BilletMonnaie.B10,BilletMonnaie.B5};
	private HashMap<Pieces, Integer > StockPiecePaiement;
	private HashMap<BilletMonnaie,Integer> StockBilletPaiement;
	
	/**
	 * 	Constructeur de Monnayeur qui initialise le stock de pièce et le stock de billets
	 */
	public Monnayeur()
	{
		StockPiecePaiement= new HashMap<Pieces, Integer>();
		StockBilletPaiement = new HashMap<BilletMonnaie,Integer>();
		StockPiece = new HashMap<Pieces, Integer>();
		for (Pieces piece : Pieces.values())
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
	 * 	Permet de stocker des pièces en plus dans les stocks de pièces
	 * 	@param piece une piece à stocker
	 */
	public void stockerPieces (Pieces piece)
	{
		StockPiecePaiement.put(piece,StockPiecePaiement.get(piece)+1);
		StockPiece.put(piece,StockPiece.get(piece)+1);
	}
	
	/**
	 * 	Permet de stocker des billet en plus dans les stocks de billets
	 * 	@param piece un billet à stocker
	 */
	public void stockerBillets (BilletMonnaie billet)
	{
		StockBilletPaiement.put(billet,StockBilletPaiement.get(billet)+1);
		StockBillet.put(billet,StockBillet.get(billet)+1);
	}
	
	/**
	 * 	Permet de rendre un montant avec le moins de pièces et/ou de billet possible
	 * 	@param montant un montant (en cents) à rendre
	 * 	@return	rendu un rendu avec le détail de ce qui a été donné
	 * 	@throws PasAssezDeMonnaie (s'il n'y a pas assez de monnaie pour rendre)
	 */
	public Rendu retournerArgent(int montant) throws PasAssezDeMonnaie
	{
		HashMap<Pieces,Integer> renduPiece = new HashMap<Pieces,Integer>();
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
			for (Pieces piece : Pieces.values())
			{
				StockPiece.put(piece,StockPiece.get(piece)- renduPiece.get(piece));
			}
			
		}
		viderPaiementEnCours();
		return new Rendu(renduPiece, renduBillet);
	}
	
	/**
	 * 	A voir avec Allan
	 * 	@return rendu un rendu avec le détail de ce qui a été rendu
	 */
	public Rendu rendreMontantEncours()
	{
		HashMap<Pieces,Integer> renduPiece = new HashMap<Pieces,Integer>();
		HashMap<BilletMonnaie,Integer> renduBillet = new HashMap<BilletMonnaie,Integer>();
		for (Pieces piece : Pieces.values())
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
	 * 	A voir avec Allan
	 */
	private void viderPaiementEnCours()
	{
		for (Pieces piece : Pieces.values())
		{
			 StockPiecePaiement.put(piece, 0);
		}
		for (BilletMonnaie billet : BilletMonnaie.values())
		{

			StockBilletPaiement.put(billet, 0);
		}
	}

	/**
	 * 	Permet de vider la caisse (si l'utilisateur déclanche la panne "Vider caisse" par
	 * 	exemple)
	 */
	public void vider()
	{
		for (Pieces piece : Pieces.values())
		{
			 StockPiece.put(piece, 0);
		}
		for (BilletMonnaie billet : BilletMonnaie.values())
		{

			StockBillet.put(billet, 0);
		}
	}
}