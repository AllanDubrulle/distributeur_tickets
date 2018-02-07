package coeur;

public class EtatCreationCarte extends ControleurEtat {
	public static EtatChoixBillet getInstance() {
		if (instance == null)
				instance = new EtatChoixBillet();
		return (EtatChoixBillet) instance;
	}
	
}
