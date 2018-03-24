import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import coeur.*;
import java.util.concurrent.*;
import javax.swing.SwingUtilities;
import javafx.embed.swing.JFXPanel;


public class TestEtats 
{
	private static Controleur controleur = Controleur.getInstance();
	private static GraphiqueACoeurImpl instance = GraphiqueACoeurImpl.getInstance();
	
	@BeforeClass
    public static void initToolkit() throws InterruptedException
    {
		/*
		final CountDownLatch latch = new CountDownLatch(1);
        SwingUtilities.invokeLater(() -> {
        	new JFXPanel();
        	latch.countDown();
        });
        if (!latch.await(5L, TimeUnit.SECONDS)) 
        	throw new ExceptionInInitializerError();*/
    }

	@Test
	public void testEtatMenu() 
	{
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
