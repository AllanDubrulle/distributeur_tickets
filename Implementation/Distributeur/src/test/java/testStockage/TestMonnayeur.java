package testStockage;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import stockage.BilletMonnaie;
import stockage.Monnayeur;
import stockage.PasAssezDeMonnaie;
import stockage.Piece;
import stockage.Rendu;

public class TestMonnayeur 
{
	private static Monnayeur monnayeur = new Monnayeur();
	private double delta = 0.000000000001;
	
	@Test
	public void testRendreArgent()
	{
		monnayeur.rechargerCaisse();;
		Rendu rendu = null;
		try 
		{
			rendu = monnayeur.retournerArgent(2256); //demande de rendre 22.56 euros
		} 
		catch (PasAssezDeMonnaie e) 
		{
			e.printStackTrace();
		}
		HashMap<Piece,Integer> pieces = rendu.getPieces();
		HashMap<BilletMonnaie,Integer> billets = rendu.getBillets();
		assertEquals(pieces.get(stockage.Piece.P200), 1, delta);
		assertEquals(pieces.get(stockage.Piece.P50), 1, delta);
		assertEquals(pieces.get(stockage.Piece.P5), 1, delta);
		assertEquals(pieces.get(stockage.Piece.P1), 1, delta);
		assertEquals(billets.get(stockage.BilletMonnaie.B20), 1, delta);
	}
	
	@Test
	public void testViderCaisseEtStockage()
	{
		monnayeur.vider();
		monnayeur.stockerPiece(stockage.Piece.P10);
		monnayeur.stockerBillet(stockage.BilletMonnaie.B50);
		assertEquals(monnayeur.getStockPiece().get(stockage.Piece.P10), 1, delta);	
		assertEquals(monnayeur.getStockPiece().get(stockage.Piece.P1), 0 , delta);
		assertEquals(monnayeur.getStockBillet().get(stockage.BilletMonnaie.B50), 1, delta);	
		assertEquals(monnayeur.getStockBillet().get(stockage.BilletMonnaie.B20), 0, delta);	
	}
}
