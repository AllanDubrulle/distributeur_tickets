package coeur;

class EtatParCarte extends ControleurEtat {

	public static ControleurEtat getInstance() {
		if (instance == null)
			instance = new EtatParCarte();
		return (EtatParCarte) instance;
	}

}
