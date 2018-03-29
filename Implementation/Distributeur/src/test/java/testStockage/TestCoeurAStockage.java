package testStockage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;
import stockage.Composant;
import stockage.ComposantHorsService;
import stockage.ErreurDEncodage;
import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TypeTitre;

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
	
	/*@Test
	public void CreerCarte()
	{
		instance.creerCarte(idCarte);
		assertNotNull(instance.getCarte());
		instance.carteEnlevee();
		assertNull(instance.getCarte());
	}
	public void TestCreerAbonnement() throws ErreurDEncodage
	{
//int validite, String gareDepart, String gareArrivee, int classe, String reduction, String type, String nom, String registreNational
		instance.creerAbonnement(validite, "mons", "ath", 1, "Aucune", "Standard" , "allan", registreNational);
	}
	*/
	
	@Test
	public void TestConversionType() throws ErreurDEncodage
	{
		assertEquals(TypeTitre.STANDARD,instance.conversionType("Standard"));
	}
	
	@Test
	public void TestConversionClasse() throws ErreurDEncodage
	{
		assertEquals(Classe.C1,instance.conversionClasse(1));
	}
	
	@Test
	public void testConversionReduction() throws ErreurDEncodage
	{
		assertEquals(Reduction.AUCUNE,instance.conversionReduction("Aucune"));
	}
	
	@Test
	public void TestExistenceTrajet()
	{
		assertTrue(instance.existenceTrajet("mons", "ath"));
		assertFalse(instance.existenceTrajet("mons", ""));
	}
	
	@Test
	public void TestExistenceGare()
	{
		assertTrue(instance.existenceGare("ath"));
		assertFalse(instance.existenceGare(""));
	}
	
	@Test (expected=ComposantHorsService.class)
	public void testInsertionMonnaie() throws ComposantHorsService
	{
		instance.actualiserPanne(Composant.FENTEBILLET);
		instance.ajoutMonnaie(5);
	}
	
}
