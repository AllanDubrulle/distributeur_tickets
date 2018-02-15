package coeur;

public class EtatValidationPaiement extends EtatAnnulable {
	
	private int codePIN;
	private String carteBancaire;
	
	public void setParametres(int codePIN, String carteBancaire) {
		this.codePIN = codePIN;
		this.carteBancaire = carteBancaire;
	}
	
	public void entree() {
		controleur.getCoeurAStockage().creerCarte(carteBancaire, codePIN);
		controleur.getCoeurAGraphique().afficherValidationPaiement();
	}
}