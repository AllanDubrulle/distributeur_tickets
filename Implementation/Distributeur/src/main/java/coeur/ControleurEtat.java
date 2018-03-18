package coeur;

import java.sql.SQLException;

import stockage.Composant;

abstract class ControleurEtat 
{	
	protected ControleurEtat() {}

	public void valideConfig() {}
	public void demarreSimulation() {}
	public void retourMenuPrincipal() {}
	
	public void entree() {}
	public void annule() {}
	public void retourTitre() {}
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
	
	public void valideRecherche(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException {}
	public void valideRechercheGA(String gareDepart, int heure, int minute) throws SQLException {}
	public void valideRechercheGD(String gareDepart, int heure, int minute) throws SQLException {}
	public void valideRenouvAbo() {}
	public void valideRenouvAboScanne() {}
	public void valideNumAbo() {}
	public void valideNumAboScanne() {}

	public void scanneCode() {}
	public void choixTaperCode() {}
	public void choixAnnulerScanner() {}
	
	public void choixParCarte() {}
	public void choixCarte(String carte) {}
	public void choixInsererCarte() {}
	public void choixEnLiquide() {}
	public void inserer(int i) {}
	public void choixPINOk() {}
	
	public void choixOui() {}
	public void choixNon() {}
	public void choixOk() {}
	public void tombeEnPanne(Composant composant)
	{
		Controleur.getInstance().getCoeurAStockage().tombeEnPanne(composant);
		Controleur.getInstance().getCoeurAGraphique().actualiserComposant(composant);
	}
	
	
	public String toString() 
	{
		return this.getClass().getName();
	}

	public void valider() {}

}