package coeur;

public class EtatChoixBillet extends EtatAnnulable {
	
	public static EtatChoixBillet getInstance() {
		if (instance == null)
				instance = new EtatChoixBillet();
		return (EtatChoixBillet) instance;
	}
	
	public void valideBillet() {
		controleur.modifEtat(EtatCreationBillet.getInstance());
	}
	
	public void entree() {
		controleur.getCoeurAGraphique().afficherChoixBillet();
	}
}