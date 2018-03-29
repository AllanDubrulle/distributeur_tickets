package interfaceGraphique;

import coeur.Commande;
import stockage.Rendu;
import stockage.imprimable.TitreDeTransport;

/**
 * Interface CoeurAGraphique
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public interface CoeurAGraphique 
{
	/**
	 * 	Permet d'afficher l'ecran d'acceuil de la simulation
	 */
	public void afficherAccueil();
	
	/**
	 * 	Permet d'afficher le menu principal du distributeur (grise les boutons
	 * 	si l'impimante est en panne et/ou les fentes et le lecteur sont en panne)
	 * 	@param imprimante un booleen vrai si l'imprimante est operationnelle, faux si elle est en panne
	 * 	@param fentesEtLecteur un booleen vrai si une fente ou/et le lecteur est/sont operationnel(s), faux
	 * 	s'ils sont tous en panne
	 */
	public void afficherMenu(boolean imprimante, boolean fentesEtLecteur);
	
	/**
	 * 	Permet d'afficher l'ecran de fin du distributeur
	 */
	public void afficherFin();

	/**
	 * 	Permet d'afficher la fenetre d'achat/renouvellement d'un titre de transport (avec l'etat
	 * 	de panne du scanneur ainsi que le type de formulaire de commande a afficher)
	 * 	@param scanneur un booleen vrai si le scanneur est operationneln, faux sinon
	 * 	@param commande le type de commande souhaite
	 */
	public void afficherChoixCommande(boolean scanneur, Commande commande);
	
	/**
	 * 	Permet d'afficher le menu des pass (menu pour choisir le type de pass a acheter)
	 */
	public void afficherChoixPass();
	
	/**
	 * 	Permet d'afficher le recapitulatif de commande d'un achar
	 * 	@param commande la commande effectuee
	 * 	@param titre le titre de transport contenant toutes les informations rentrees
	 * 	@param prix le prix de la commande
	 * 	@param nbrTitre le nombre de produit achete
	 */
	public void afficherRecapCommande(Commande commande,TitreDeTransport titre,double prix,int nbrTitre);
	
	/**
	 * 	Permet d'afficher le menu des horaires (menu pour choisir le type de recherche a effectuer)
	 */
	public void afficherChoixHoraire();
	
	/**
	 * 	Permet d'afficher la fenetre pour rechercher l'horaire d'un itineraire
	 */
	public void afficherChoixItineraire();
	
	/**
	 * 	Permet d'afficher la fenetre pour rechercher l'horaire des departs a partir d'une gare
	 */
	public void afficherChoixDepart();
	
	/**
	 * 	Permet d'afficher la fenetre pour rechercher l'horaire des arrivees dans gare
	 */
	public void afficherChoixArrivee();
	
	/**
	 * 	Permet d'afficher les resultats d'une recherche d'horaire (avec possibilite ou non de l'imprimer
	 * 	en fonction de l'etat panne de l'imprimante)
	 * 	@param imprimante un booleen vrai si l'imprimante est operationnelle, faux sinon
	 * 	@param tab le tableau contenant l'horaire a afficher
	 */
	public void afficherResultatsHoraires(boolean imprimante, String[] tab);
	
	/**
	 * 	Permet d'afficher l'horaire que l'on a imprime
	 * 	@param tab
	 */
	public void afficherImpressionHoraire(String[] tab);
	
	/**
	 * 	Permet d'afficher la fenetre ou l'on choisit le numero d'abonnement a renouveler
	 */
	public void afficherNumAbo();
	
	/**
	 * 	Permet d'afficher la fenetre de choix de paiement (bouton grise(s) selon les pannes choisies)
	 * 	@param fentes un booleen qui est vrai si la/les fentes(s) presente(s) sont operationnelle(s), faux sinon
	 * 	@param lecteur un booleen qui est vrai si le lecteur de carte est operationnel, faux sinon
	 */
	public void afficherPaiement(boolean fentes, boolean lecteur);
	
	/**
	 * 	Permet d'afficher la fenetre de paiement par liquide
	 * 	@param prix le prix a payer
	 */
	public void afficherChoixParLiquide(double prix);
	
	/**
	 * 	Permet d'afficher la fenetre ou l'on rentre le numero de carte pour effectuer le paiement
	 */
	public void afficherChoixParCarte();
	
	/**
	 * 	Permet d'afficher la fenetre pour inserer la carte dans le lecteur
	 */
	public void afficherInsertionCarte();
	
	/**
	 * 	Peremet d'afficher que l'on a enleve la carte
	 */
	public void afficherRetraitCarte();
	
	/**
	 * 	Permet d'afficher la fenetre pour rentrer le code PIN
	 */
	public void afficherAttentePIN();
	
	/**
	 * 	Permet d'afficher la fenetre qui dit que le code PIN saisi est incorrect
	 */
	public void afficherCodePINIncor();
	
	/**
	 * 	Permet d'afficher la fenetre qui dit que le solde de la carte est insuffisant
	 */
	public void afficherSoldeInsuffisant();
	
	/**
	 * 	Permet d'afficher que le code PIN est pour la 3e fois consecutive mauvais et
	 * 	rendre la carte dans ce cas
	 */
	public void afficherTropDeTentatives();
	
	/**
	 * 	Permet d'afficher la fenetre de validation de paiement apres un paiement par carte
	 */
	public void afficherValidationPaiement();
	
	/**
	 * 	Permet d'afficher la fenetre de demande d'un recu ou non
	 */
	public void afficherDemandeRecu();
	
	/**
	 * 	Permet d'actualiser le montant lors d'un paiement liquide
	 * 	@param restant le montant restant a payer
	 * 	@param introduit le montant deja introduit
	 */
	public void actualiserMontant(double restant , double introduit);
	
	/**
	 * 	Permet d'afficher un message disant que la monnaie introduite sera rendue (panne 
	 * 	d'imprimante ou du monnayeur)
	 */
	public void afficherRendreMonnaieInseree();
	
	/**
	 * 	Permet d'afficher un message d'erreur (signaler l'erreur et de prendre contact avec un
	 * 	technicien pour un remboursement)
	 */
	public void afficherMessageDErreur();
	
	/**
	 * 	Permet d'afficher la fenetre impression
	 */
	public void afficherImpression();
	
	/**
	 * 	Permet d'afficher la fenetre demandant de vider le bac de reception
	 */
	public void afficherViderBacRecep();
	
	/**
	 * 	Permet d'afficher le recu
	 * 	@param prix le prix paye
	 * 	@param introduit le montant introduit 
	 * 	@param rendu le montant rendu (s'il s'agit d'un paiement liquide)
	 * 	@param modePaiement le mode de paiement
	 */
	public void afficherRecu(double prix , double introduit , double rendu, String modePaiement);
	
	/**
	 * 	Permet d'afficher le detail de monnaie rendue
	 * 	@param monnaieRendu un rendu contenant tout le detail de ce qui sera rendu
	 */
	public void afficherRendu(Rendu monnaieRendu);
	
	/**
	 * 	Permet d'afficher le titre achete
	 *	@param commande le type de commande
	 * 	@param titre le titre de transport achete
	 * 	@param prix le prix de l'achat
	 */
	public void afficherTitre(Commande commande, TitreDeTransport titre, double prix);
	
	/**
	 * 	Permet d'afficher un message de panne d'un composant
	 * 	@param message le message de panne a afficher
	 */
	public void afficherPanne(String message);
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que la carte est bloquee
	 */
	public void carteBloquee();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que la carte n'est pas bloquee
	 */
	public void carteNonBloquee();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que l'imprimante est en panne
	 */
	public void imprimanteEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que l'imprimante n'est pas en panne
	 */
	public void imprimantePasEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que le scanneur est en panne
	 */
	public void scanneurEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que le scanneur n'est pas en panne
	 */
	public void scanneurPasEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que le lecteur est en panne
	 */
	public void lecteurEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que le lecteur n'est pas en panne
	 */
	public void lecteurPasEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que la fente a billet est en panne
	 */
	public void fenteBilletEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que la fente a billet n'est pas en panne
	 */
	public void fenteBilletPasEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que la fente a piece est en panne
	 */
	public void fentePieceEnPanne();
	
	/**
	 * 	Permet au coeur de dire a l'interface graphique que la fente a piece n'est pas en panne
	 */
	public void fentePiecePasEnPanne();
}