package coeur;

public class EtatParCarte extends EtatAnnulable {
	
	public static EtatParCarte getInstance() {
		if (instance == null)
			instance = new EtatParCarte();
		return (EtatParCarte) instance;
	}
	
	public void choixCarte(String carteBancaire) {
		EtatAttentePIN.getInstance().setCarteBancaire(carteBancaire);
		controleur.modifEtat(EtatAttentePIN.getInstance());
	}
	
	public void entree() {
		controleur.getCoeurAGraphique().afficherChoixParCarte();
	}
}