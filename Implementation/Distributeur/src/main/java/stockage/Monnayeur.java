package stockage;

import java.util.HashMap;

class Monnayeur 
{
	private HashMap<Pieces, Integer > StockPiece; 
	private HashMap<BilletMonnaie,Integer> StockBillet;
	private Pieces[] ordrePieces= {Pieces.P200,Pieces.P100,Pieces.P50,Pieces.P20,Pieces.P10,Pieces.P5,Pieces.P2,Pieces.P1};  
	private BilletMonnaie[] ordreBillets= {BilletMonnaie.B50,BilletMonnaie.B20,BilletMonnaie.B10,BilletMonnaie.B5};
	private HashMap<Pieces, Integer > StockPiecePaiement;
	private HashMap<BilletMonnaie,Integer> StockBilletPaiement;
	
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
	
	public void stockerPieces (Pieces piece)
	{
		StockPiecePaiement.put(piece,StockPiecePaiement.get(piece)+1);
		StockPiece.put(piece,StockPiece.get(piece)+1);
	}
	public void stockerBillets (BilletMonnaie billet)
	{
		StockBilletPaiement.put(billet,StockBilletPaiement.get(billet)+1);
		StockBillet.put(billet,StockBillet.get(billet)+1);
	}
	
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
		ViderPaiementEnCours();
		return new Rendu(renduPiece, renduBillet);
	}

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
		ViderPaiementEnCours();
		return new Rendu(renduPiece, renduBillet);
	}

	private void ViderPaiementEnCours()
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