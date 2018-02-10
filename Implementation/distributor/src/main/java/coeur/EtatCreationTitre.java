package coeur;

public class EtatCreationTitre extends EtatAnnulable {
	public void confirme() {
		controleur.modifEtat(EtatPaiement.getInstance());
		EtatPaiement.entree();
	}
}
