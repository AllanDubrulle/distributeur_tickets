package interfaceGraphique;

import coeur.Commande;
import stockage.Rendu;
import stockage.imprimable.TitreDeTransport;

public interface CoeurAGraphique 
{
	public void afficherAccueil();
	public void afficherMenu();
	public void afficherFin();
	
	public void afficherChoixPass();
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
	public void afficherChoixParLiquide(double prix);
	public void afficherChoixParCarte();
	public void afficherInsertionCarte();
	public void afficherAttentePIN();
	public void afficherCodePINIncor();
	public void afficherDemandeRecu();
	public void actualiserMontant(double restant , double introduit);
	public void afficherRendreMonnaie();
	
	public void afficherImpression();
	public void afficherViderBacRecep();
	public void effacerPIN();
	public void afficherChoixCommande(Commande commande);
	public void afficherRenouvScanne();
	public void afficherRecu(double prix , double introduit , double rendu);
	public void afficherRendu(Rendu monnaieRendu);
	public void afficherTitre(Commande commande, TitreDeTransport titre, double prix);
	
}