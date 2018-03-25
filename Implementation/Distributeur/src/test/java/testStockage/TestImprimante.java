package testStockage;

import static org.junit.Assert.*;
import org.junit.Test;
import stockage.CoeurAStockageImpl;
import stockage.ComposantHorsService;
import stockage.Imprimante;
import stockage.PlusDePapier;

public class TestImprimante 
{
	private static Imprimante imprimante = new Imprimante(CoeurAStockageImpl.getInstance());
	private static double delta = 0.000000001;
	
	@Test
	public void testImprimer()
	{
		imprimante.setNbrImpressions(50);
		assertEquals(imprimante.getNbrImpressions(), 50, delta);
		try 
		{
			imprimante.imprimer(50);
		} 
		catch (ComposantHorsService e) 
		{
			e.printStackTrace();
		} 
		catch (PlusDePapier e) 
		{
			e.printStackTrace();
		}
		assertEquals(imprimante.getNbrImpressions(), 1, delta);
	}
}
