package coeur;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import stockage.Composant;
import stockage.ErreurDEncodage;
/**
 * Interface GraphiqueACoeur (permet � l'interface graphique de communiquer avec le coeur)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public interface GraphiqueACoeur 
{	
	/**
	 * 	Communique le choix de d�marrer la simulation
	 */
	public void choixDemarrerSimul();
	
	/**
	 * 	Communique le fait que l'action en cours a �t� annul�e
	 */
	public void choixAnnuler();
	
	/**
	 * 	Communique le fait que l'on revient faire des modifications sur un titre
	 * 	pr�c�demment valid� (passer de r�capitulatif vers la page qui pr�c�de)
	 */
	public void choixRetourTitre();
	
	/**
	 * 	Communique le fait qu'un choix retour est effectu� (revenir � la fen�tre qui 
	 * 	pr�c�de)
	 */
	public void choixRetour();
	
	/**
	 * 	Communique le fait que l'utilisateur a vu le message affich� et va afficher
	 * 	la suite (par exemple, afficher les titre une fois qu'ils ont �t�s imprim�s)
	 */
	public void choixOk();
	
	/**
	 * 	Communique le fait que le re�u a �t� demand�
	 */
	public void choixOui();
	
	/**
	 * 	Communique le fait que le re�u n'a pas �t� demand�
	 */
	public void choixNon();
	
	/**
	 * 	Communique le fait qu'il faille revenir � l'�cran principal
	 */
	public void choixRetourEcranPrinc();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de billet
	 */
	public void choixBillet();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de renouvellement d'un 
	 * 	abonnement
	 */
	public void choixRenouvAbo();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre d'achat d'un nouvel
	 * 	abonnement
	 */
	public void choixAchatAbo();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de menu des pass
	 */
	public void choixPass();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de pass illimit�
	 */
	public void choixPassIllimite();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de pass dix trajets
	 */
	public void choixPass10Trajets();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de pass dix trajets entre
	 * 	deux gares
	 */
	public void choixPass10Tajets2Gares();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de menu des horaires
	 */
	public void choixHoraire();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de recherche des gares d'arriv�e
	 * 	ainsi que leur heure de d�part 
	 */
	public void choixHoraireArrivee();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de recherche des gares de d�part
	 * 	ainsi que leur heure d'arriv�e
	 */
	public void choixHoraireDepart();
	
	/**
	 * 	Communique le fait qu'il faille afficher la fen�tre de rechercher des horaires d'un
	 * 	itin�raire bien pr�cis
	 */
	public void choixHoraireItineraire();
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des gares d'arriv�e d�marrant
	 * 	apr�s heure:minute
	 * 	@param gareDepart une gare de d�part
	 * 	@param heure heure de l'heure minimale � afficher
	 * 	@param minute minute de l'heure minimale � afficher
	 * 	@throws SQLException (peut g�n�rer une exception lors de l'envoi de la requ�te)
	 */
	public void choixRechercheGD(String gareDepart, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des gares de d�part arrivant 
	 * 	avant heure:minute
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param heure heure de l'heure maximale � afficher
	 * 	@param minute minute de l'heure maximale � afficher
	 * 	@throws SQLException (peut g�n�rer une exception lors de l'envoi de la requ�te)
	 */
	public void choixRechercheGA(String gareArrivee, int heure, int minute) throws SQLException;
	
	/**
	 * 	Communique le fait qu'il faille lancer une recherche des itin�raire entre une gare
	 *	de d�part et une gare d'arriv�e d�marrant apr�s heure:minute
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param heure heure de l'heure minimale � afficher
	 * 	@param minute minute de l'heure minimale � afficher
	 * 	@throws SQLException (peut g�n�rer une exception lors de l'envoi de la requ�te)
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
	 * 	Communique le fait que l'utilisateur valide le num�ro de l'abonnement une fois scann�
	 */
	public void choixValiderNumAbo();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 5 euros dans la machine
	 */
	public void choix5eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 10 euros dans la machine
	 */
	public void choix10eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 20 euros dans la machine
	 */
	public void choix20eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 50 euros dans la machine
	 */
	public void choix50eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 1 cent dans la machine
	 */
	public void choix1ct();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 2 cents dans la machine
	 */
	public void choix2cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 5 cents dans la machine
	 */
	public void choix5cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 10 cents dans la machine
	 */
	public void choix10cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 20 cents dans la machine
	 */
	public void choix20cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 50 cents dans la machine
	 */
	public void choix50cts();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 1 euro dans la machine
	 */
	public void choix1eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a rentr� 2 euros dans la machine
	 */
	public void choix2eur();
	
	/**
	 * 	Communique le fait que l'utilisateur a appuy� sur le bouton "Ok" du lecteur de carte
	 * 	@param PIN le code PIN entr� par l'utilisateur
	 */
	public void choixLecteurOK(int PIN);
	
	/**
	 * 	Communique le fait que l'utilisateur a appuy� sur le bouton "Ins�rer/Retirer carte"
	 * 	du lecteur de carte
	 */
	public void choixLecteurInsererRetirer();
	
	/**
	 * 	Communique le num�ro de carte bancaire introduit lors du choix de la carte
	 *  @param numero un num�ro de carte
	 *  @throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
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
	 * 	Communique les informations rentr�es lors de l'achat d'un billet
	 * 	@param dateValidite le jour du d�part
	 * 	@param nbrBillet le nombre de billet(s)
	 *  @param gareDepart une gare de d�part
	 *  @param gareArrivee une gare d'arriv�e
	 *  @param classe une classe (1 pour 1e classe et 2 pour 2e classe)
	 *  @param type un type de billet
	 *  @param reduction une r�duction
	 *  @param allerRetour un bool�en qui indique s'il s'agit d'un aller simple (si vrai)
	 *  ou d'un aller-retour (si faux)
	 *  @throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
	 */
	public void infoBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart, 
			String gareArrivee, String type, String reduction, boolean allerRetour) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentr�es lors de l'achat d'un nouvel abonnement
	 * 	@param validite la p�riode de validit� (1, 3, 6 ou 12 mois)
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param classe une classe (1 pour 1e classe et 2 pour 2e classe)
	 * 	@param reduction une r�duction
	 * 	@param type un type
	 * 	@param nom le nom auquel sera enregistr� l'abonnement (celui du client)
	 * 	@param registre le registre nationnal du client
	 * 	@throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
	 */
	public void infoAbo(int validite, String gareDepart, String gareArrivee, int classe, 
			String reduction, String type, String nom, String registre) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentr�es lors du renouvellement d'un abonnement
	 * 	@param validite une validite
	 * 	@param numAbo un num�ro d'abonnement
	 * 	@throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
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
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@return existance vrai si la gare existe, faux sinon
	 */
	public boolean existanceTrajet(String gareDepart, String gareArrivee);
	
	/**
	 * 	Retourne une liste de tout les abonnements existants
	 * 	@return liste une liste des abonnements existans
	 */
	public ArrayList<String> listeNumeroAbonnement();
	
	/**
	 * 	Communique les informations rentr�es lors de l'achat d'un pass illimite
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param classe une classe
	 * 	@param reduction une r�duction
	 * 	@param type un type de pass
	 * 	@param nbrJours un nombre de jours de validit�
	 * 	@throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
	 */
	public void infoPassIllimite(String nom, int classe, String reduction, String type, int nbrJours) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentr�es lors de l'achat d'un pass dix trajets
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param classe une classe
	 *	@param reduction une r�duction
	 *	@param type un type de pass
	 * 	@throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
	 */
	public void infoPass10Trajets(String nom, int classe, String reduction, String type) throws ErreurDEncodage;
	
	/**
	 * 	Communique les informations rentr�es lors de l'achat d'un pass dix trajets entre deux
	 * 	gares
	 * 	@param nom le nom auquel sera fait le pass (celui du client)
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param classe une classe
	 * 	@param reduction une r�duction
	 * 	@param type un type de pass
	 * 	@throws ErreurDEncodage (peut g�n�rer une erreur d'encodage si ce que l'utilisateur
	 * 	a rentr� est incorrect)
	 */
	public void infoPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type) throws ErreurDEncodage;
	
	/**
	 * 	Communique le temps d'attente lors de l'ex�cution d'une action (en g�n�ral, temps
	 * 	d'affichage d'une fen�tre)
	 */
	public void apres5secondes();
	
	/**
	 * 	Communique le temps d'attente lors de l'ex�cution d'une action (en g�n�ral, temps
	 * 	d'affichage d'une fen�tre)
	 */
	public void apres15secondes();
	
	/**
	 * 	Communique le temps d'attente lors de l'ex�cution d'une action (en g�n�ral, temps
	 * 	d'affichage d'une fen�tre)
	 */
	public void apres5secondesOk();
	
}