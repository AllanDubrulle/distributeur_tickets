package testEtats;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import coeur.*;


public class TestEtats 
{
	private static Controleur controleur = Controleur.getInstance();
	private static GraphiqueACoeur instance = GraphiqueACoeurImpl.getInstance();
	
	@BeforeClass
    public static void initialisationControleur()
    {
		controleur.setGraphique(new CoeurAGraphiqueTest());
    }

	@Test
	public void testEtatMenu() 
	{
		controleur.modifEtat(EtatAccueil.getInstance());
		instance.choixDemarrerSimul();
		assertEquals(controleur.getEtatActuel(), EtatMenu.getInstance());
	}
	
	@Test
	public void testChoixBillet()
	{
		controleur.modifEtat(EtatMenu.getInstance());
		instance.choixBillet();
		assertEquals(controleur.getEtatActuel(), EtatChoixBillet.getInstance());
	}
	
	@Test
	public void testChoixValider()
	{
		controleur.modifEtat(EtatDemandeRecu.getInstance());
		instance.choixOui();
		assertEquals(controleur.getEtatActuel(), EtatImpressionRecu.getInstance());
		
	}
}
