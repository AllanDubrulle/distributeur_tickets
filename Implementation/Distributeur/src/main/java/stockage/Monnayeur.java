package stockage;

import java.util.HashMap;

class Monnayeur 
{
	private HashMap<Pieces, Integer > StockPiece; 
	private HashMap<BilletMonnaie,Integer> StockBillet;
	private Pieces[] ordrePieces= {Pieces.P200,Pieces.P100,Pieces.P50,Pieces.P20,Pieces.P10,Pieces.P5,Pieces.P2,Pieces.P1};;  
	private BilletMonnaie[] ordreBillets= {BilletMonnaie.B50,BilletMonnaie.B20,BilletMonnaie.B10,BilletMonnaie.B5};
	private boolean enMarche=true; // a changer
	
	private boolean estEnMarche()
	{
		return enMarche;
	}
	public Monnayeur()
	{
		StockPiece = new HashMap<Pieces, Integer>();
		for (Pieces piece : Pieces.values())
		{
			StockPiece.put(piece,10);
		}
		StockBillet = new HashMap<BilletMonnaie,Integer>();
		for(BilletMonnaie billet : BilletMonnaie.values())
		{
			StockBillet.put(billet, 10);
		}
	}
	
	public void stockerPieces (Pieces piece)
	{
		StockPiece.put(piece,StockPiece.get(piece)+1);
	}
	public void stockerBillets (BilletMonnaie billet)
	{
		StockBillet.put(billet,StockBillet.get(billet)+1);
	}
	
	public Rendu retournerArgent(int montant) throws PasAssezDeMonnaie,ComposantHorsService
	{
		if (!estEnMarche())
		{
			throw new ComposantHorsService("Monnayeur hors service");
		}
		HashMap<Pieces,Integer> renduPiece = new HashMap<Pieces,Integer>();
		HashMap<BilletMonnaie,Integer> renduBillet = new HashMap<BilletMonnaie,Integer>();
		for (int i =0;i< ordreBillets.length ;i++)
		{
			int nbr = 0;
			while(montant%ordreBillets[i].valeur()==0 && StockBillet.get(ordreBillets[i])!=0) //condition du modulo : correcte ?
			{
				nbr++;
				montant-=ordreBillets[i].valeur();
			}
			renduBillet.put(ordreBillets[i], nbr);
		}
		for (int i =0;i< ordrePieces.length ;i++)
		{
			int nbr = 0;
			while(montant%ordrePieces[i].valeur()==0 && StockPiece.get(ordrePieces[i])!=0) //condition du modulo : correcte ?
			{
				nbr++;
				montant-=ordrePieces[i].valeur();
			}
			renduPiece.put(ordrePieces[i], nbr);
		}
		
		if (montant!=0)
		{
			throw new PasAssezDeMonnaie("Impossible de rendre la monnaie");
		}
		
		else
		{
			for (int i =0;i< ordreBillets.length ;i++)
			{
				StockBillet.put(ordreBillets[i],StockBillet.get(ordreBillets[i])- renduBillet.get(ordreBillets[i]));
			}
			for (int i =0;i< ordrePieces.length ;i++)
			{
				StockPiece.put(ordrePieces[i],StockPiece.get(ordrePieces[i])- renduPiece.get(ordrePieces[i]));
			}
			
		}
		return new Rendu(renduPiece, renduBillet);
	}
}