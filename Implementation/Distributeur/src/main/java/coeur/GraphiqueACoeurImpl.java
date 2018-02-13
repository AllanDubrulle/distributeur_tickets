package coeur;

import interfaceGraphique.*;

public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{
	private Controleur controleur;
	private static CoeurAGraphiqueImpl coeurAGraph = new CoeurAGraphiqueImpl();
	public void choixBillet() 
	{
		//controleur.modifEtat(EtatChoixBillet.getInstance());
		coeurAGraph.afficherChoixBillet();
	}
	public void choixValidConfig() {
		coeurAGraph.afficherSimulation();
		//à implémenter par Victor;
	}
	public static void choixDemarrerSimul() {
		coeurAGraph.afficherAcceuil();
		//à implementer par Victor aussi;
	}
}
