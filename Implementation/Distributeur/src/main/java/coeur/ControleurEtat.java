package coeur;

abstract class ControleurEtat 
{	
	protected ControleurEtat() {}
	public void entree() {}
	public void annule() {}
	public void choixBillet() {}
	public void valideConfig() {}
	public void demarreSimulation() {}
	public void valideBillet() {}
	public void confirmeBillet() {}
	public void choixParCarte() {}
	public void choixEnLiquide() {}
	public void retourMenuPrincipal() {}
	
	public String toString() {
		return this.getClass().getName();
	}
}