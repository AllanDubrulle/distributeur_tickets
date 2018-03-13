package coeur;

abstract class ControleurEtat 
{	
	protected ControleurEtat() {}

	public void valideConfig() {}
	public void demarreSimulation() {}
	public void retourMenuPrincipal() {}
	
	public void entree() {}
	public void annule() {}
	public void retour() {}
	public void confirme() {}
	
	public void choixBillet() {}
	public void choixAchatAbo() {}
	public void choixRenouvAbo() {}
	public void choixPass() {}
	public void choixPassIllimite() {}
	public void choixPass10Trajets() {}
	public void choixPass10Trajets2Gares() {}
	public void choixHoraire() {}
	public void choixItineraire() {}
	public void choixArrivees() {}
	public void choixDeparts() {}
	
	public void valideBillet() {}
	public void valideAchatAbo() {}
	public void valideRenouvAbo() {}
	public void valideRenouvAboScanne() {}
	public void validePassIllimite() {}
	public void validePass10Trajets() {}
	public void validePass10Trajets2Gares() {}
	public void valideNumAbo() {}
	public void valideNumAboScanne() {}

	public void scanneCode() {}
	public void choixTaperCode() {}
	public void choixAnnulerScanner() {}
	
	public void choixParCarte() {}
	public void choixCarte(String carte) {}
	public void choixInsererCarte() {}
	public void choixEnLiquide() {}
	public void inserer(double i) {}
	public void validePaiement() {}
	public void choixPINOk() {}
	
	public void choixOui() {}
	public void choixNon() {}
	public void choixOk() {}
	
	
	public String toString() 
	{
		return this.getClass().getName();
	}

	public void valider() {}
}