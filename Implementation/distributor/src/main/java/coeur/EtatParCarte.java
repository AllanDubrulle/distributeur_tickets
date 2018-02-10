package coeur;

class EtatParCarte extends EtatAnnulable {
	public static EtatParCarte getInstance() {
		if (instance == null)
			instance = new EtatParCarte();
		return (EtatParCarte) instance;
	}
	public void choixCarte(String carteBancaire) {
		EtatAttentePIN.getInstance().setCarteBancaire(carteBancaire);
		controleur.modifEtat(EtatAttentePIN.getInstance());
		EtatAttentePIN.entree();
	}

	public static void entree() {
		controleur.getCoeurAGraphique().afficherParCarte();
	}
	

}
