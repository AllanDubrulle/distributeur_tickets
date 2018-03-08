package stockage;

import java.util.HashMap;

class Monnayeur extends interfaceGraphique.ComposantVisible
{
	private HashMap<Pieces, Integer > StockPiece; 
	private HashMap<Billet,Integer> StockBillet;
	private Pieces[] ordrePieces= {Pieces.P200,Pieces.P100,Pieces.P50,Pieces.P20,Pieces.P10,Pieces.P5,Pieces.P2,Pieces.P1};;  
	private Billet[] ordreBillets= {Billet.B50,Billet.B20,Billet.B10,Billet.B5};
	
	public Monnayeur(boolean enMarche)
	{
		super(enMarche);
	}

	public Rendu retournerArgent(int montant) throws PasAssezDeMonnaie,ComposantHorsService
	{
		if (!estEnMarche())
		{
			throw new ComposantHorsService("Monnayeur hors service");
		}
		HashMap<Pieces,Integer> renduPiece = new HashMap<Pieces,Integer>();
		HashMap<Billet,Integer> renduBillet = new HashMap<Billet,Integer>();
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