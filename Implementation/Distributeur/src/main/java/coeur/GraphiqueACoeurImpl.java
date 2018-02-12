package coeur;

import interfaceGraphique.*;

public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{
	private Controleur controleur;
	private CoeurAGraphiqueImpl coeurAGraph = new CoeurAGraphiqueImpl();
	public void choixBillet() 
	{
		controleur.modifEtat(EtatChoixBillet.getInstance());
	}
	public void choixValidConfig() {
		coeurAGraph.afficherSimulation();
		//à implémenter par Victor;
	}
}
