package coeur;

abstract class ControleurEtat 
{	
	protected ControleurEtat() {}
	public void entree() {}
	public void annule() {}
	public void retour() {}
	public void choixBillet() {}
	public void choixRenouvAbo() {}
	public void scanneCode() {}
	public void choixAchatAbo() {}
	public void valideConfig() {}
	public void demarreSimulation() {}
	public void valideBillet() {}
	public void valideAchatAbo() {}
	public void valideRenouvAbo() {}
	public void validePassIllimite() {}
	public void validePass10Trajets() {}
	public void validePass10Trajets2Gares() {}
	public void valideNumAbo() {}
	public void choixTaperCode() {}
	public void choixAnnulerScanner() {}
	public void confirme() {}
	public void choixParCarte() {}
	public void choixCarte() {}
	public void choixAnnulerParCarte() {}
	public void choixEnLiquide() {}
	public void retourMenuPrincipal() {}
	
	public String toString() {
		return this.getClass().getName();
	}
}