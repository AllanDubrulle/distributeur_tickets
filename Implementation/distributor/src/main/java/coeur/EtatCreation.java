package coeur;

public class EtatCreation extends ControleurEtat {
	public static EtatCreation getInstance() {
		if (instance == null)
			instance = new EtatCreation();
		return (EtatCreation) instance;
	}
	public void confirme(Controleur controleur) {
		controleur.modifEtat(EtatPaiement.getInstance());
	}
}
