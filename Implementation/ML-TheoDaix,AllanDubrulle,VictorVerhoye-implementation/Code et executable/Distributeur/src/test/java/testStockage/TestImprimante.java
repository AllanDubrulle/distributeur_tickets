package testStockage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import stockage.CoeurAStockageImpl;
import stockage.Composant;
import stockage.ComposantHorsService;
import stockage.Imprimante;
import stockage.PlusDePapier;

public class TestImprimante 
{
	private static Imprimante imprimante = new Imprimante(CoeurAStockageImpl.getInstance());
	@Test
	public void testImprimer() throws ComposantHorsService, PlusDePapier
	{
		imprimante.setNbrImpressions(50);
		assertEquals(imprimante.getNbrImpressions(), 50);
		imprimante.imprimer();
		assertEquals(imprimante.getNbrImpressions(), 49);
	}
	
	@Test (expected=PlusDePapier.class)
	public void testManqueDePapier() throws ComposantHorsService, PlusDePapier
	{
		imprimante.setNbrImpressions(0);
		imprimante.imprimer();
	}
	
	
	@Test (expected=ComposantHorsService.class)
	public void testHorsService() throws ComposantHorsService, PlusDePapier
	{
		CoeurAStockageImpl.getInstance().actualiserPanne(Composant.IMPRIMANTE);
		imprimante.imprimer();
	}
	
	@After
	public void reinitialisationImprimante()
	{
		if(!CoeurAStockageImpl.getInstance().estEnMarche(Composant.IMPRIMANTE))
		{
			CoeurAStockageImpl.getInstance().actualiserPanne(Composant.IMPRIMANTE);
		}
	}
}
