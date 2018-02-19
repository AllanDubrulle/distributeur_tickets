package coeur;

abstract class ControleurEtat 
{	
	protected ControleurEtat() {}
	public void entree() {}
	public void annule() {}
	public void choixBillet() {}
	public void choixRenouvAbo() {}
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
	public void confirmeBillet() {}
	public void confirmeAchatAbo() {}
	public void confirmeModificationAbo() {}
	public void confirmePassIllimite() {}
	public void confirmePass10Trajets() {}
	public void confirmePass10Trajets2Gares() {}
	public void choixParCarte() {}
	public void choixCarte() {}
	public void choixEnLiquide() {}
	public void retourMenuPrincipal() {}
	
	public String toString() {
		return this.getClass().getName();
	}
}