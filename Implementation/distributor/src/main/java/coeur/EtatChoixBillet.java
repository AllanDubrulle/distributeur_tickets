package coeur;

class EtatChoixBillet extends ControleurEtat {
	public static EtatChoixBillet getInstance() {
		if (instance == null)
				instance = new EtatChoixBillet();
		return (EtatChoixBillet) instance;
	}
	public void valideBillet(Controleur controleur) {
		controleur.modifEtat(EtatCreationBillet.getInstance());
	}
}
