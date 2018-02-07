package coeur;

class EtatPaiement extends ControleurEtat {
	public static EtatPaiement getInstance() {
		if (instance == null)
			instance = new EtatPaiement();
		return (EtatPaiement) instance;
	}
	public void choixParCarte(Controleur controleur) {
		controleur.modifEtat(EtatParCarte.getInstance());
	}
}
