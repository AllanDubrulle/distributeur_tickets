package testStockage;
import static org.junit.Assert.*;
import java.sql.SQLException;
import org.junit.Test;
import stockage.CoeurAStockageImpl;

public class TestBDD 
{
	private static CoeurAStockageImpl instance = (CoeurAStockageImpl) CoeurAStockageImpl.getInstance();
	private double delta = 0.000000000001;
	
	@Test
	public void testExistenceCarte()
	{
		assertTrue(instance.existenceCarte("67030615781202136"));
		assertFalse(instance.existenceCarte("67030615781422136"));
	}
	
	@Test
	public void testExistenceTrajet()
	{
		assertTrue(instance.existenceTrajet("ToUrNaI", "MoNs"));
		assertFalse(instance.existenceTrajet("maubeuge", "mons"));
		assertFalse(instance.existenceTrajet("charleroi", "oostende"));
	}
	
	@Test
	public void testExistenceGare()
	{
		assertTrue(instance.existenceGare("ToUrNaI"));
		assertFalse(instance.existenceGare("maubeuge"));
		assertFalse(instance.existenceGare("charleroi"));
	}
	
	@Test
	public void testExistenceAbo()
	{
		assertTrue(instance.existenceAbo("1"));
		assertFalse(instance.existenceAbo("251"));
		assertFalse(instance.existenceAbo("15"));
	}
	
	@Test 
	public void testRechercherHoraireDepart()
	{
		String[] horaire = new String[30];
		try 
		{
			horaire = instance.rechercherHoraireDepart("tournai", 5, 30);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		assertEquals(horaire[0], "TOURNAI");
		assertEquals(horaire[1], "MONS");
		assertEquals(horaire[2], "5");
		assertEquals(horaire[3], "44");	
		assertEquals(horaire[4], "6");
		assertEquals(horaire[5], "14");
	}
	
	@Test
	public void testRechercherHoraireArrivee()
	{
		String[] horaire = new String[30];
		try 
		{
			horaire = instance.rechercherHoraireArrivee("tournai", 15, 30);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		assertEquals(horaire[24], "ANVERS");
		assertEquals(horaire[25], "TOURNAI");
		assertEquals(horaire[26], "13");
		assertEquals(horaire[27], "30");
		assertEquals(horaire[28], "15");
		assertEquals(horaire[29], "20");	
	}
	
	@Test
	public void testRechercherHoraireItineraire()
	{
		String[] horaire = new String[30];
		try 
		{
			horaire = instance.rechercherHoraireItineraire("bruXELLES", "AtH", 22, 50);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		assertEquals(horaire[0], "BRUXELLES");
		assertEquals(horaire[1], "ATH");
		assertEquals(horaire[2], "4");
		assertEquals(horaire[3], "47");
		assertEquals(horaire[4], "5");
		assertEquals(horaire[5], "32");
	}
	
	@Test
	public void testRechercherPrix()
	{
		assertEquals(instance.rechercherPrix(coeur.Commande.BILLET, "tournai", "mons"), 7.70, delta);
		assertEquals(instance.rechercherPrix(coeur.Commande.PASS10TRAJETS2GARES, "tournai", "mons"), 61.6, delta);
		assertEquals(instance.rechercherPrix(coeur.Commande.ACHATABO, "tournai", "mons"), 51, delta);
		assertEquals(instance.rechercherPrix(stockage.imprimable.TypePass.PASS10TRAJETS), 77, delta);
		assertEquals(instance.rechercherPrix(stockage.imprimable.TypePass.PASSILLIMITE), 18, delta);
	}	
}
