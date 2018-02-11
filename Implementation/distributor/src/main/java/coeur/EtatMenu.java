package coeur;

class EtatMenu extends ControleurEtat {
	public static EtatMenu getInstance() {
		if (instance == null)
			instance = new EtatMenu();
		return (EtatMenu) instance;
	}
	public void choixBillet() {
		controleur.modifEtat(EtatChoixBillet.getInstance());
	}
}
