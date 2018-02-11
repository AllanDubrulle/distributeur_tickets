package coeur;

class EtatPaiement extends EtatAnnulable {
	public static EtatPaiement getInstance() {
		if (instance == null)
			instance = new EtatPaiement();
		return (EtatPaiement) instance;
	}
	public void choixParCarte() {
		controleur.modifEtat(EtatParCarte.getInstance());
	}
	public void entree() {
		controleur.getCoeurAGraphique().afficherPaiement();
	}
}
