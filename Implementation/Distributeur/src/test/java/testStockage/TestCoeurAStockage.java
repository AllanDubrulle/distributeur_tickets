package testStockage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;

public class TestCoeurAStockage
{
	private static CoeurAStockage instance =  CoeurAStockageImpl.getInstance();
	private static String idCarte = "67030615781202136";
	
	@Test
	public void testExistenceCarte()
	{
		assertFalse(instance.existenceCarte("0"));
		assertTrue(instance.existenceCarte(idCarte));
	}
	
	@Test
	public void CreerCarte()
	{
		instance.creerCarte(idCarte);
		assertNotNull(instance.getCarte());
		instance.carteEnlevee();
		assertNull(instance.getCarte());
	}
	
	
}
