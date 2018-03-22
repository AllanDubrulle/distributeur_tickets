package coeur;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import stockage.Composant;
import stockage.ErreurDEncodage;
/**
 * Interface GraphiqueACoeur (permet à l'interface graphique de communiquer avec le coeur)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public interface GraphiqueACoeur 
{	
	/**
	 * 	Communique le choix de démarrer la simulation
	 */
	public void choixDemarrerSimul();
	
	/**
	 * 	Communique le fait que l'action en cours a été annulée
	 */
	public void choixAnnuler();
	
	/**
	 * 	Communique le fait que l'on revient faire des modifications sur un titre
	 * 	précédemment validé (passer de récapitulatif vers la page qui précède)
	 */
	public void choixRetourTitre();
	
	/**
	 * 	Communique le fait qu'un choix retour est effectué (revenir à la fenêtre qui 
	 * 	précède)
	 */
	public void choixRetour();
	
	/**
	 * 	Communique le fait que l'utilisateur a vu le message affiché et va afficher
	 * 	la suite (par exemple, afficher les titre une fois qu'ils ont étés imprimés)
	 */
	public void choixOk();
	
	/**
	 * 	Communique le fait que le reçu a été demandé
	 */
	public void choixOui();
	
	/**
	 * 	Communique le fait que le reçu n'a pas été demandé
	 */
	public void choixNon();
	
	/**
	 * 	Communique le fait qu'il faille revenir à l'écran principal
	 */
	public void choixRetourEcranPrinc();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de billet
	 */
	public void choixBillet();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de renouvellement d'un 
	 * 	abonnement
	 */
	public void choixRenouvAbo();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre d'achat d'un nouvel
	 * 	abonnement
	 */
	public void choixAchatAbo();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de menu des pass
	 */
	public void choixPass();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de pass illimité
	 */
	public void choixPassIllimite();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de pass dix trajets
	 */
	public void choixPass10Trajets();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de pass dix trajets entre
	 * 	deux gares
	 */
	public void choixPass10Tajets2Gares();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de menu des horaires
	 */
	public void choixHoraire();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de recherche des gares d'arrivée
	 * 	ainsi que leur heure de départ 
	 */
	public void choixHoraireArrivee();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de recherche des gares de départ
	 * 	ainsi que leur heure d'arrivée
	 */
	public void choixHoraireDepart();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenêtre de rechercher des horaires d'un
	 * 	itinéraire bien précis
	 */
	public void choixHoraireItineraire();
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des gares d'arrivée démarrant
	 * 	après heure:minute
	 * 	@param gareDepart une gare de départ
	 * 	@param heure heure de l'heure minimale à afficher
	 * 	@param minute minute de l'heure minimale à afficher
	 * 	@throws SQLException (peut générer une exception lors de l'envoi de la requête)
	 */
	public void choixRechercheGD(String gareDepart, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des gares de départ arrivant 
	 * 	avant heure:minute
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param heure heure de l'heure maximale à afficher
	 * 	@param minute minute de l'heure maximale à afficher
	 * 	@throws SQLException (peut générer une exception lors de l'envoi de la requête)
	 */
	public void choixRechercheGA(String gareArrivee, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des itinéraire entre une gare
	 *	de départ et une gare d'arrivée démarrant après heure:minute
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param heure heure de l'heure minimale à afficher
	 * 	@param minute minute de l'heure minimale à afficher
	 * 	@throws SQLException (peut générer une exception lors de l'envoi de la requête)
	 */
	public void choixRechercheGDEtGA(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait que l'utilisateur valide un choix
	 */
	public void choixValider();
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite scanner le code barre de son abonnement
	 */
	public void choixScannerCode();
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite annuler le scan du code barre de son
	 * 	abonnement
	 */
	public void choixAnnulerScanner();
	
	/**
	 * 	Communique le fait que l'utilisateur valide le numéro de l'abonnement une fois scanné
	 */
	public void choixValiderNumAbo();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 5 euros dans la machine
	 */
	public void choix5eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 10 euros dans la machine
	 */
	public void choix10eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 20 euros dans la machine
	 */
	public void choix20eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 50 euros dans la machine
	 */
	public void choix50eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 1 cent dans la machine
	 */
	public void choix1ct();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 2 cents dans la machine
	 */
	public void choix2cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 5 cents dans la machine
	 */
	public void choix5cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 10 cents dans la machine
	 */
	public void choix10cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 20 cents dans la machine
	 */
	public void choix20cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 50 cents dans la machine
	 */
	public void choix50cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 1 euro dans la machine
	 */
	public void choix1eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentré 2 euros dans la machine
	 */
	public void choix2eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a appuyé sur le bouton "Ok" du lecteur de carte
	 * 	@param PIN le code PIN entré par l'utilisateur
	 */
	public void choixLecteurOK(int PIN);
	
	/**
	 * 	Communique le fait que l'utilisateur a appuyé sur le bouton "Insérer/Retirer carte"
	 * 	du lecteur de carte
	 */
	public void choixLecteurInsererRetirer();
	
	/**
	 * 	Communique le numéro de carte bancaire introduit lors du choix de la carte
	 *  @param numero un numéro de carte
	 *  @throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoCarte(String numero) throws ErreurDEncodage;
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite effectuer le paiement de sa commande
	 */
	public void choixPaiement();
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite payer par carte
	 */
	public void choixPaiementParCarte();
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite payer en liquide
	 */
	public void choixPaiementLiquide();
	
	/**
	 * 	Communique les informations rentrées lors de l'achat d'un billet
	 * 	@param dateValidite le jour du départ
	 * 	@param nbrBillet le nombre de billet(s)
	 *  @param gareDepart une gare de départ
	 *  @param gareArrivee une gare d'arrivée
	 *  @param classe une classe (1 pour 1e classe et 2 pour 2e classe)
	 *  @param type un type de billet
	 *  @param reduction une réduction
	 *  @param allerRetour un booléen qui indique s'il s'agit d'un aller simple (si vrai)
	 *  ou d'un aller-retour (si faux)
	 *  @throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart, 
			String gareArrivee, String type, String reduction, boolean allerRetour) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrées lors de l'achat d'un nouvel abonnement
	 * 	@param validite la période de validité (1, 3, 6 ou 12 mois)
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param classe une classe (1 pour 1e classe et 2 pour 2e classe)
	 * 	@param reduction une réduction
	 * 	@param type un type
	 * 	@param nom le nom auquel sera enregistré l'abonnement (celui du client)
	 * 	@param registre le registre nationnal du client
	 * 	@throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoAbo(int validite, String gareDepart, String gareArrivee, int classe, 
			String reduction, String type, String nom, String registre) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrées lors du renouvellement d'un abonnement
	 * 	@param validite une validite
	 * 	@param numAbo un numéro d'abonnement
	 * 	@throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoAboRen(int validite, String numAbo) throws ErreurDEncodage;
	
	/**
	 * 	Communique le fait que l'utilisateur active la panne "Vider caisse"
	 */
	public void viderCaisse();
	
	/**
	 * 	Communique le fait que l'utilisateur active la panne d'un composant en particulier
	 * 	@param composant un composant
	 */
	public void TombeEnPanne(Composant composant); // pas sur que ce soit la solution 
	
	/**
	 * 	Retourne si une gare existe ou non
	 * 	@param gare une gare
	 * 	@return existance vrai si la gare existe, faux sinon
	 */
	public boolean existanceGare(String gare);
	
	/**
	 * 	Retourne si un trajet entre deux gare existe ou non
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@return existance vrai si la gare existe, faux sinon
	 */
	public boolean existanceTrajet(String gareDepart, String gareArrivee);
	
	/**
	 * 	Retourne une liste de tout les abonnements existants
	 * 	@return liste une liste des abonnements existans
	 */
	public ArrayList<String> listeNumeroAbonnement();
	
	/**
	 * 	Communique les informations rentrées lors de l'achat d'un pass illimite
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param classe une classe
	 * 	@param reduction une réduction
	 * 	@param type un type de pass
	 * 	@param nbrJours un nombre de jours de validité
	 * 	@throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoPassIllimite(String nom, int classe, String reduction, String type, int nbrJours) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrées lors de l'achat d'un pass dix trajets
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param classe une classe
	 *	@param reduction une réduction
	 *	@param type un type de pass
	 * 	@throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoPass10Trajets(String nom, int classe, String reduction, String type) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrées lors de l'achat d'un pass dix trajets entre deux
	 * 	gares
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param classe une classe
	 * 	@param reduction une réduction
	 * 	@param type un type de pass
	 * 	@throws ErreurDEncodage (peut générer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentré est incorrect)
	 */
	public void infoPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type) throws ErreurDEncodage;
	
	/**
	 * 	Communique le temps d'attente lors de l'exécution d'une action (en général, temps
	 * 	d'affichage d'une fenêtre)
	 */
	public void apres5secondes();
	
	/**
	 * 	Communique le temps d'attente lors de l'exécution d'une action (en général, temps
	 * 	d'affichage d'une fenêtre)
	 */
	public void apres15secondes();
	
	/**
	 * 	Communique le temps d'attente lors de l'exécution d'une action (en général, temps
	 * 	d'affichage d'une fenêtre)
	 */
	public void apres5secondesOk();
	
}