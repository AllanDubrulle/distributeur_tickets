package testEtats;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import coeur.*;
import interfaceGraphique.CoeurAGraphique;

import java.util.concurrent.*;
import javax.swing.SwingUtilities;
import javafx.embed.swing.JFXPanel;
import stockage.Rendu;
import stockage.imprimable.TitreDeTransport;


public class TestEtats 
{
	private static Controleur controleur = Controleur.getInstance();
	private static GraphiqueACoeur instance = GraphiqueACoeurImpl.getInstance();
	
	@BeforeClass
    public static void initToolkit() throws InterruptedException
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
