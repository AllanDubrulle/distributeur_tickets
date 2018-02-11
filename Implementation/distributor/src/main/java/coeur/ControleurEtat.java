package coeur;

abstract class ControleurEtat {
	protected static ControleurEtat instance;
	protected static Controleur controleur;
	protected ControleurEtat() {
	}
	public void entree() {};
	public void annule() {};
}
