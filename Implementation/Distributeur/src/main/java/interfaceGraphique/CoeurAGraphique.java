package interfaceGraphique;

import coeur.Commande;
import stockage.imprimable.TitreDeTransport;

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
	
	public void afficherRecapCommande(Commande commande,TitreDeTransport titre,double prix,int nbrTitre);
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
	public void effacerPIN();
	public void afficherChoixCommande(Commande commande);
	public void afficherRenouvScanne();
	public void afficherRecu();
	public void afficherRendu();
	public void afficherTitre(Commande commande, TitreDeTransport titre, double prix);
}