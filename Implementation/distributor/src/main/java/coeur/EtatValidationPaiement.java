package coeur;

class EtatValidationPaiement extends EtatAnnulable {
	private int codePIN;
	public void setCodePIN(int codePIN) {
		this.codePIN = codePIN;
	}
	public static void entree() {
		controleur.getCoeurAGraphique().afficherValidationPaiement();
	}
}
