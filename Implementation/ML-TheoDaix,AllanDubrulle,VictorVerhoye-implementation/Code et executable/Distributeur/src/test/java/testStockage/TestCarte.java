package testStockage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;

public class TestCarte 
{
	private static CoeurAStockage instance =  CoeurAStockageImpl.getInstance();
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
}