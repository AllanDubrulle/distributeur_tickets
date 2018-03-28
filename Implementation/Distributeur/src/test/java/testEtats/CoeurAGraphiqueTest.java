package testEtats;

import coeur.Commande;
import interfaceGraphique.CoeurAGraphique;
import stockage.Rendu;
import stockage.imprimable.TitreDeTransport;

public class CoeurAGraphiqueTest implements CoeurAGraphique 
{

	public void afficherAccueil() {}

	public void afficherMenu(boolean imprimante, boolean fentesEtLecteur) {}

	public void afficherFin() {}

	public void afficherChoixPass() {}

	public void afficherChoixHoraire() {}
	
	public void afficherChoixItineraire() {}
	
	public void afficherChoixDepart() {}
	
	public void afficherChoixArrivee() {}
	
	public void afficherRecapCommande(Commande commande, TitreDeTransport titre, double prix, int nbrTitre) {}

	public void afficherResultatsHoraires(boolean imprimante, String[] tab) {}
	
	public void afficherImpressionHoraire(String[] tab) {}
	
	public void afficherNumAbo() {}
	
	public void afficherPaiement(boolean fentes, boolean lecteur) {}
	
	public void afficherChoixParLiquide(double prix) {}
	
	public void afficherChoixParCarte() {}
	
	public void afficherInsertionCarte() {}
	
	public void afficherRetraitCarte() {}
	
	public void afficherAttentePIN() {}
	
	public void afficherCodePINIncor() {}
	
	public void afficherSoldeInsuffisant() {}
	
	public void afficherTropDeTentatives() {}
	
	public void afficherValidationPaiement() {}
	
	public void afficherDemandeRecu() {}
	
	public void afficherRendreMonnaieInseree() {}
	
	public void afficherMessageDErreur() {}
	
	public void afficherImpression() {}
	
	public void afficherViderBacRecep() {}
	
	public void afficherChoixCommande(boolean scanneur, Commande commande) {}
	
	public void afficherRecu(double prix, double introduit, double rendu, String modePaiement) {}
	
	public void afficherRendu(Rendu monnaieRendu) {}
	
	public void afficherTitre(Commande commande, TitreDeTransport titre, double prix) {}
	
	public void carteNonBloquee() {}
	
	public void carteBloquee() {}
	
	public void afficherPanne(String message) {}
	
	public void imprimanteEnPanne() {}
	
	public void actualiserMontant(double restant, double introduit) {}

	public void imprimantePasEnPanne() {}
	
	public void scanneurEnPanne() {}
	
	public void scanneurPasEnPanne() {}
	
	public void lecteurEnPanne() {}
	
	public void lecteurPasEnPanne() {}
	
	public void fenteBilletEnPanne() {}
	
	public void fenteBilletPasEnPanne() {}
	
	public void fentePieceEnPanne() {}
	
	public void fentePiecePasEnPanne() {}
}