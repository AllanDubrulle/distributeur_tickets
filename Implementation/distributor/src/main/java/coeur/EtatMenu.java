package coeur;

class EtatMenu extends ControleurEtat {
	public static EtatMenu getInstance() {
		if (instance == null)
			instance = new EtatMenu();
		return (EtatMenu) instance;
	}
	public void choixBillet(Controleur controleur) {
		controleur.modifEtat(EtatChoixBillet.getInstance());
	}
}
