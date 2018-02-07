package coeur;

public class GraphiqueACoeurImpl implements GraphiqueACoeur {
	public void choixBillet(Controleur controleur) {
		controleur.modifEtat(EtatChoixBillet.getInstance());
	}
}
