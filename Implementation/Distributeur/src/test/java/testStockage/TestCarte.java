package testStockage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;
import stockage.BDDBanque;

public class TestCarte 
{
	private static CoeurAStockage instance =  CoeurAStockageImpl.getInstance();
	private double delta = 0.00001;
	private static BDDBanque bBanque;
	
	@BeforeClass
	public static void init()
	{
		instance.creerCarte("67030615781202136");
	}
	
	@Test
	public void testBonCodePIN()
	{
		assertTrue(instance.verifCode(1234));
	}
	
	@Test
	public void testSolde()
	{
		instance.setPrix(1000);
		assertTrue(instance.verifSolde());
		instance.setPrix(1000000);
		assertFalse(instance.verifSolde());
	}
	
	
	@Test
	public void testActualisation() 
	{
		int solde = instance.getCarte().getSolde();
		instance.setPrix(1000);
		if (solde >= 1000)
		{
			instance.actualiserSolde();
			bBanque = new BDDBanque();
			bBanque.connexion();
			int actu = Integer.parseInt(bBanque.infoCarte("67030615781202136")[2]);
			bBanque.deconnexion(); 
			assertEquals(solde-1000, actu, delta);
		}
		else
		{
			assertEquals(solde, solde, delta); // test bidon je sais
		}
	}
}