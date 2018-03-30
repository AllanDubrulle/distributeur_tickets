package coeur;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import stockage.Composant;
import stockage.ErreurDEncodage;

/**
 * Interface GraphiqueACoeur
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public interface GraphiqueACoeur 
{	
	/**
	 * 	Communique le choix de demarrer la simulation
	 */
	public void choixDemarrerSimul();
	
	/**
	 * 	Communique le fait que l'action en cours a ete annulee
	 */
	public void choixAnnuler();

	/**
	 * 	Communique le fait que l'utilisateur valide un choix
	 */
	public void choixValider();
	
	/**
	 * 	Communique le fait que l'on revient faire des modifications sur un titre
	 * 	precedemment valide (passer de recapitulatif vers la page qui precede)
	 */
	public void choixRetourTitre();
	
	/**
	 * 	Communique le fait qu'un choix retour est effectue (revenir a la fenetre qui 
	 * 	precede)
	 */
	public void choixRetour();
	
	/**
	 * 	Communique le fait que l'utilisateur a vu le message affiche et va afficher
	 * 	la suite (par exemple, afficher les titre une fois qu'ils ont etes imprimes)
	 */
	public void choixOk();
	
	/**
	 * 	Communique le fait que le recu a ete demande
	 */
	public void choixOui();
	
	/**
	 * 	Communique le fait que le recu n'a pas ete demande
	 */
	public void choixNon();
	
	/**
	 * 	Communique le fait qu'il faille revenir a l'ecran principal
	 */
	public void choixRetourEcranPrinc();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de billet
	 */
	public void choixBillet();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de renouvellement d'un 
	 * 	abonnement
	 */
	public void choixRenouvAbo();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre d'achat d'un nouvel
	 * 	abonnement
	 */
	public void choixAchatAbo();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de menu des pass
	 */
	public void choixPass();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de pass illimite
	 */
	public void choixPassIllimite();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de pass dix trajets
	 */
	public void choixPass10Trajets();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de pass dix trajets entre
	 * 	deux gares
	 */
	public void choixPass10Tajets2Gares();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de menu des horaires
	 */
	public void choixHoraire();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de recherche des gares d'arrivee
	 * 	ainsi que leur heure de depart 
	 */
	public void choixHoraireArrivee();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de recherche des gares de depart
	 * 	ainsi que leur heure d'arrivee
	 */
	public void choixHoraireDepart();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fenetre de rechercher des horaires d'un
	 * 	itineraire bien precis
	 */
	public void choixHoraireItineraire();
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des gares d'arrivee demarrant
	 * 	apres heure:minute
	 * 	@param gareDepart une gare de depart
	 * 	@param heure heure de l'heure minimale a afficher
	 * 	@param minute minute de l'heure minimale a afficher
	 * 	@throws SQLException (peut generer une exception lors de l'envoi de la requete)
	 */
	public void choixRechercheGD(String gareDepart, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des gares de depart arrivant 
	 * 	avant heure:minute
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param heure heure de l'heure maximale a afficher
	 * 	@param minute minute de l'heure maximale a afficher
	 * 	@throws SQLException (peut generer une exception lors de l'envoi de la requete)
	 */
	public void choixRechercheGA(String gareArrivee, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des itineraire entre une gare
	 *	de depart et une gare d'arrivee demarrant apres heure:minute
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param heure heure de l'heure minimale a afficher
	 * 	@param minute minute de l'heure minimale a afficher
	 * 	@throws SQLException (peut generer une exception lors de l'envoi de la requete)
	 */
	public void choixRechercheGDEtGA(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite imprimer l'horaire de train qu'il a recherche
	 */
	public void choixImprimerHoraire();
		
	/**
	 * 	Communique le fait que l'utilisateur souhaite scanner le code barre de son abonnement
	 */
	public void choixScannerCode();
	
	/**
	 * 	Communique le fait que l'utilisateur valide le numero de l'abonnement une fois scanne
	 */
	public void choixValiderNumAbo();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 5 euros dans la machine
	 */
	public void choix5eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 10 euros dans la machine
	 */
	public void choix10eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 20 euros dans la machine
	 */
	public void choix20eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 50 euros dans la machine
	 */
	public void choix50eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 1 cent dans la machine
	 */
	public void choix1ct();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 2 cents dans la machine
	 */
	public void choix2cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 5 cents dans la machine
	 */
	public void choix5cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 10 cents dans la machine
	 */
	public void choix10cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 20 cents dans la machine
	 */
	public void choix20cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 50 cents dans la machine
	 */
	public void choix50cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 1 euro dans la machine
	 */
	public void choix1eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentre 2 euros dans la machine
	 */
	public void choix2eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a appuye sur le bouton "Ok" du lecteur de carte
	 * 	@param PIN le code PIN entre par l'utilisateur
	 */
	public void choixLecteurOK(int PIN);
	
	/**
	 * 	Communique le fait que l'utilisateur a appuye sur le bouton "Inserer/Retirer carte"
	 * 	du lecteur de carte
	 */
	public void choixLecteurInsererRetirer();
	
	/**
	 * 	Communique le numero de carte bancaire introduit lors du choix de la carte
	 *  @param numero un numero de carte
	 *  @throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
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
	 * 	Communique les informations rentrees lors de l'achat d'un billet
	 * 	@param dateValidite le jour du depart
	 * 	@param nbrBillet le nombre de billet(s)
	 *  @param gareDepart une gare de depart
	 *  @param gareArrivee une gare d'arrivee
	 *  @param classe une classe (1 pour 1e classe et 2 pour 2e classe)
	 *  @param type un type de billet
	 *  @param reduction une reduction
	 *  @param allerRetour un booleen qui indique s'il s'agit d'un aller simple (si vrai)
	 *  ou d'un aller-retour (si faux)
	 *  @throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
	 */
	public void infoBillet(LocalDate dateValidite, int nbrBillet, int classe, String gareDepart, 
			String gareArrivee, String type, String reduction, boolean allerRetour) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrees lors de l'achat d'un nouvel abonnement
	 * 	@param validite la periode de validite (1, 3, 6 ou 12 mois)
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param classe une classe (1 pour 1e classe et 2 pour 2e classe)
	 * 	@param reduction une reduction
	 * 	@param type un type
	 * 	@param nom le nom auquel sera enregistre l'abonnement (celui du client)
	 * 	@param registre le registre nationnal du client
	 * 	@throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
	 */
	public void infoAbo(int validite, String gareDepart, String gareArrivee, int classe, 
			String reduction, String type, String nom, String registre) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrees lors du renouvellement d'un abonnement
	 * 	@param validite une validite
	 * 	@param numAbo un numero d'abonnement
	 * 	@throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
	 */
	public void infoAboRen(int validite, String numAbo) throws ErreurDEncodage;

	/**
	 * 	Communique les informations rentrees lors de l'achat d'un pass illimite
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param classe une classe
	 * 	@param reduction une reduction
	 * 	@param type un type de pass
	 * 	@param nbrJours un nombre de jours de validite
	 * 	@throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
	 */
	public void infoPassIllimite(String nom, int classe, String reduction, String type, int nbrJours) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrees lors de l'achat d'un pass dix trajets
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param classe une classe
	 *	@param reduction une reduction
	 *	@param type un type de pass
	 * 	@throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
	 */
	public void infoPass10Trajets(String nom, int classe, String reduction, String type) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentrees lors de l'achat d'un pass dix trajets entre deux
	 * 	gares
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param classe une classe
	 * 	@param reduction une reduction
	 * 	@param type un type de pass
	 * 	@throws ErreurDEncodage (peut generer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentre est incorrect)
	 */
	public void infoPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type) throws ErreurDEncodage;
	
	/**
	 * 	Permet de recuperer toutes les reductions possibles
	 * 	@return reductions un tableau avec toutes les reductions
	 */
	public String[] getReductions();
	
	/**
	 * 	Permet de recuperer tous les types possibles
	 * 	@return types un tableau avec tous les types
	 */
	public String[] getTypes();
	
	/**
	 * 	Retourne si une gare existe ou non
	 * 	@param gare une gare
	 * 	@return existance vrai si la gare existe, faux sinon
	 */
	public boolean existenceGare(String gare);
	
	/**
	 * 	Retourne si un trajet entre deux gare existe ou non
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@return existance vrai si la gare existe, faux sinon
	 */
	public boolean existenceTrajet(String gareDepart, String gareArrivee);
	
	/**
	 * 	Retourne une liste de tout les abonnements existants
	 * 	@return liste une liste des abonnements existans
	 */
	public ArrayList<String> listeNumeroAbonnement();
	
	/**
	 * 	Communique le temps d'attente lors de l'execution d'une action (en general, temps
	 * 	d'affichage d'une fenetre)
	 */
	public void apres5secondes();
	
	/**
	 * 	Communique le temps d'attente lors de l'execution d'une action (en general, temps
	 * 	d'affichage d'une fenetre)
	 */
	public void apres15secondes();
	
	/**
	 * 	Communique le temps d'attente lors de l'execution d'une action (en general, temps
	 * 	d'affichage d'une fenetre)
	 */
	public void apres5secondesOk();

	/**
	 * 	Communique si l'ecran du distributeur est tactile ou non	
	 * 	@return estTactile vrai si l'ecran est tactile, faux sinon
	 */
	public boolean estTactile();
	
	/**
	 * 	Communique le choix de mettre l'ecran en mode tactile ou non
	 * 	@param tactile vrai si l'ecran desire est tactile, faux sinon
	 */
	public void mettreTactile(boolean tactile);
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite mettre a jour les fentes du distributeur
	 * 	@param fenteBillet vrai si l'on souhaite mettre une fente a billet, faux sinon
	 * 	@param fentePiece vrai si l'on souhaite mettre une fente a piece, faux sinon
	 */
	public void setFentes(boolean fenteBillet, boolean fentePiece);
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite mettre a jour le scanneur du distributeur
	 * 	@param present vrai si l'on souhaite mettre un scanneur, faux sinon
	 */
	public void setScanneur(boolean present);

	/**
	 * 	Communique le fait que l'utilisateur souhaite retirer les fentes du distributeur
	 */
	public void choixRetirerFentes();
	
	/**
	 * 	Permet d'actualiser la panne du composant en parametre (le passer a en panne s'il ne l'est pas
	 * 	et vice versa)
	 * 	@param composant un composant du distributeur (Composant)
	 */
	public void actualiserPanne(Composant composant);
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite mettre a jour le blocage de 
	 * 	la carte dans le distributeur
	 */
	public void bloquerCarte();
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite recharger la caisse du distributeur
	 */
	public void rechargerCaisse();

	/**
	 * 	Communique le fait que l'utilisateur souhaite recharger le niveau d'encre et le stock
	 * 	de papier du distributeur
	 */
	public void rechargerEncreEtPapier();

	/**
	 * 	Communique le fait que l'utilisateur souhaite vider le stock d'encre et de papier du 
	 * 	distributeur
	 */
	public void viderEncreEtPapier();

	/**
	 * 	Communique le fait que l'utilisateur souhaite vider la caisse du distributeur
	 */
	public void viderCaisse();

	/**
	 * 	Communique si le scanneur de code est sur le distributeur ou non
	 * 	@return present vrai si le distributeur est equipe d'un scanneur de code, faux sinon
	 */
	public boolean codeScanneurDispo();

	/**
	 * 	Communique si il y a au moins une fente presente sur le distributeur
	 * 	@return	present vrai si le distributeur est equipe d'au moins une fente (fente a billet ou fente
	 * 	a piece)
	 */
	public boolean fentePresente();
	
	/**
	 * 	Communique le fait que l'utilisateur souhaite mettre a jour la panne du lecteur de carte
	 */

	public void paiement();
}