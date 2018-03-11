package interfaceGraphique;

import coeur.Commande;

public interface CoeurAGraphique 
{
	public void afficherAccueil();
	public void afficherMenu();
	public void afficherFin();
	
	public void afficherChoixBillet();
	public void afficherChoixAchatAbo();
	public void afficherChoixRenouvAbo();
	public void afficherChoixPass();
	public void afficherChoixPassIllimite();
	public void afficherChoixPass10Trajets();
	public void afficherChoixPass10Trajets2Gares();
	public void afficherChoixHoraire();
	public void afficherChoixItineraire();
	public void afficherChoixDepart();
	public void afficherChoixArrivee();
	
	public void afficherRecapCommande(Commande commande);
	public void afficherRecapRenouvAbo(); // possible a eliminer 
	public void afficherRecapRenouvAboScanne();

	
	public void afficherResultatsHoraires();
	
	public void afficherNumAbo();
	public void afficherChoixTaperCode();
	
	public void afficherPaiement();
	public void afficherChoixParLiquide();
	public void afficherChoixParCarte();
	public void afficherInsertionCarte();
	public void afficherAttentePIN();
	public void afficherCodePINIncor();
	public void afficherDemandeRecu();
	public void insererMonnaie(double i);
	public void afficherRendreMonnaie();
	
	public void afficherImpression();
	public void afficherViderBacRecep();
}