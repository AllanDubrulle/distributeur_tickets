package interfaceGraphique;

import coeur.Commande;
import stockage.Composant;
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
	
	public void afficherResultatsHoraires(String[] tab);
	public void afficherImpressionHoraire(String[] tab);
	
	public void afficherNumAbo();
	
	public void afficherPaiement();
	public void afficherChoixParLiquide(double prix);
	public void afficherChoixParCarte();
	public void afficherInsertionCarte();
	public void afficherRetraitCarte();
	public void afficherEjectionCarte();
	public void afficherAttentePIN();
	public void afficherCodePINIncor();
	public void afficherSoldeInsuffisant() ;
	public void afficherTropDeTentatives();
	public void afficherValidationPaiement();
	public void afficherDemandeRecu();
	public void actualiserMontant(double restant , double introduit);
	public void afficherRendreMonnaieInseree();
	public void afficherMessageDErreur();
	
	public void afficherImpression();
	public void afficherViderBacRecep();
	public void afficherChoixCommande(Commande commande);
	public void afficherRecu(double prix , double introduit , double rendu, String modePaiement);
	public void afficherRendu(Rendu monnaieRendu);
	public void afficherTitre(Commande commande, TitreDeTransport titre, double prix);
	public void actualiserComposant(Composant composant);
}