package stockage;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import coeur.Commande;
import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TitreDeTransport;
import stockage.imprimable.TypePass;
import stockage.imprimable.TypeTitre;

public interface CoeurAStockage 
{
	/**
	 * 	Permet de recuperer les informations d'une carte a l'aide de son identifiant et 
	 * 	creer un objet carte
	 * 	@param id le numero de la carte
	 */
	public void creerCarte(String id);
	
	/**
	 * 	Permet de faire passer les informations d'un achat d'un billet et de le creer
	 * 	@param dateValidite la date de depart du billet
	 * 	@param nbrBillet le nombre de billet
	 * 	@param classe la classe du billet
	 * 	@param gareDepart la gare de depart
	 * 	@param gareArrivee la gare d'arrivee
	 * 	@param typeBillet le type de billet
	 * 	@param reduction la reduction du billet
	 * 	@param allerRetour le booleen qui indique s'il s'agit d'un aller simple (faux)
	 * 	ou d'un aller retour (vrai)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerBillet(LocalDate dateValidite, int nbrBillet, int classe, String gareDepart, 
			String gareArrivee, String typeBillet, String reduction, boolean allerRetour) throws ErreurDEncodage;
	
	/**
	 * 	Permet de faire passer les informations d'un achat d'un abonnement et de le creer
	 * 	@param validite la periode de validite de l'abonnement
	 * 	@param gareDepart la gare source de l'abonnement
	 * 	@param gareArrivee la gare de destination de l'abonnement
	 * 	@param classe la classe de l'abonnement
	 * 	@param reduction la reduction de l'abonnement
	 * 	@param type le type de l'abonnement
	 * 	@param nom le nom auquel est enregistre l'abonnement
	 * 	@param registreNational le registre national de l'utilisateur
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerAbonnement(int validite, String gareDepart, String gareArrivee, int classe, String reduction, 
			String type, String nom, String registreNational) throws ErreurDEncodage;
	
	/**
	 * 	Permet de faire passer les informations d'un renouvellement d'un abonnement
	 * 	@param validite la nouvelle validite de l'abonnement
	 * 	@param numAbo le numero de l'abonnement a renouveler
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void modifierAbo(int validite, String numAbo) throws ErreurDEncodage;
	
	/**	
	 * 	Permet de savoir si un abonnement existe (grace a son numero)
	 * 	@param numAbo un numero d'abonnement
	 * 	@return existe un booleen vrai si le numero d'abonnement existe dans la base de donnees, faux sinon
	 */
	public boolean existenceAbo(String numAbo);
	
	/**
	 *  Permet de faire passer les informations d'un achat d'un pass illimite et de le creer
	 * 	@param nom le nom auquel sera enregistre le pass
	 * 	@param classe la classe du pass
	 * 	@param reduction la reduction du pass
	 * 	@param type le type de titre du pass
	 * 	@param nbrJours le nombre de jour de la validite
	 * 	@param typePass le type du pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerPassIllimite(String nom, int classe, String reduction, String type, int nbrJours, String typePass) 
			throws ErreurDEncodage;
	
	/**
	 * 	Permet de faire passer les informations d'un achat d'un pass dix trajets et de le creer
	 * 	@param nom le nom auquel sera enregistre le pass
	 * 	@param classe la classe du pass
	 * 	@param reduction la reduction du pass
	 * 	@param type le type de titre du pass
	 * 	@param typePass le type du pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerPass10Trajets(String nom, int classe, String reduction, String type, String typePass) throws ErreurDEncodage;
	
	/**
	 * 	Permet de faire passer les informations d'un achat d'un pass dix trajets entre deux gares
	 * 	@param nom le nom auquel sera enregistre le pass
	 * 	@param gareDepart la gare de depart du pass
	 * 	@param gareArrivee la gare d'arrivee du pass
	 * 	@param classe la classe du pass
	 * 	@param reduction la reduction du pass
	 * 	@param type le type de titre du pass
	 * 	@param typePass le type du pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type, 
			String typePass) throws ErreurDEncodage;
	
	/**
	 * 	Permet de rechercher le prix d'un titre de transport
	 * 	@param commande la commande d'un titre de transport
	 * 	@param gareDepart la gare de depart de la commande
	 * 	@param gareArrivee la gare d'arrivee de la commande
	 * 	@return prix le prix de la commande
	 */
	public double rechercherPrix(Commande commande ,String gareDepart,String gareArrivee);
	
	/**
	 * 	Permet de rechercher le prix d'un type de pass
	 * 	@param typePass le type du pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@return prix le prix du pass
	 */
	public double rechercherPrix(TypePass typePass);
	
	/**
	 * 	Permet de reconvertir un type (chaine de caractere) en un type TypePass
	 * 	@param typePassStr un type de pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@return typePass un type de pass (TypePass)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public TypePass conversionTypePass(String typePassStr) throws ErreurDEncodage;
	
	/**
	 * 	Permet de reconvertir un type (chaine de caractere) en un type TypeTitre
	 * 	@param type un type de titre de transport
	 * 	@return type le type associe au type en parametre
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public TypeTitre conversionType(String type ) throws ErreurDEncodage;
	
	/**
	 * 	Permet de reconvertir une classe (chaine de caractere) en une classe Classe
	 * 	@param classe une classe du titre de tranport
	 * 	@return classe la classe associee a la classe en parametre
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public Classe conversionClasse(int classe) throws ErreurDEncodage;
	
	/**
	 * 	Permet de reconvertir une reduction (chaine de caractere) en une reduction Reduction
	 * 	@param reduction une reduction de titre de transport
	 * 	@return reduction la reduction associee a la reduction en parametre
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public Reduction conversionReduction(String reduction ) throws ErreurDEncodage;

	/**
	 * 	Permet de recuperer une liste de toutes les reductions existantes
	 * 	@return reductions un tableau contenant toutes les reductions existantes
	 */
	public String[] getListeReduction();
	
	/**
	 * 	Permet de recuperer une liste de tous les types existants
	 * 	@return types un tableau contenant tous les types existants
	 */
	public String[] getListeType();
	
	/**
	 * 	Permet de savoir si un trajet existe entre deux gares
	 * 	@param gareDepart la gare source du trajet
	 * 	@param gareArrivee la gare d'arrivee du trajet
	 * 	@return existe un booleen vrai si le trajet existe entre les deux gares dans la base de donnees, faux sinon
	 */
	public boolean existenceTrajet(String gareDepart,String gareArrivee);
	
	/**
	 * 	Permet de savoir si une gare existe
	 * 	@param gare une gare
	 * 	@return	existe un booleen qui est vrai si la gare existe dans la base de donnees, faux sinon
	 */
	public boolean existenceGare(String gare);
	
	/**
	 * 	Permet de rechercher un horaire a patir d'une gare de depart
	 *	@param gareDepart une gare de depart
	 *	@param heure l'heure du depart
	 * 	@param minute la minute de l'heure du depart
	 * 	@return horaire un tableau contenant les cinq premiers horaires au depart d'une gare
	 * 	@throws SQLException (peut generer une exception SQL)
	 */
	public String[] rechercherHoraireDepart(String gareDepart, int heure, int minute) throws SQLException;
	
	/**
	 * 	Permet de rechercher l'horaire d'un itineraire entre une gare de depart et une
	 * 	gare d'arrivee
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param heure l'heure du depart
	 * 	@param minute la minute de l'heure du depart
	 * 	@return horaire le tableau contenant l'horaire des cinq premiers horaires de
	 * 	l'itineraire
	 * 	@throws SQLException (peut generer une exception SQL)
	 */
	public String[] rechercherHoraireItineraire(String gareDepart, String gareArrivee, 
			int heure, int minute) throws SQLException;
	
	/**
	 * 	Permet de rechercher un horaire d'arrivees d'une gare
	 *	@param gareArrivee une gare d'arrivee
	 *	@param heure l'heure de l'arrivee
	 * 	@param minute la minute de l'heure de l'arrivee
	 * 	@return horaire un tableau contenant les cinq premiers horaires des arrivees dans une gare
	 * 	@throws SQLException (peut generer une exception SQL)
	 */
	public String[] rechercherHoraireArrivee(String gareArrivee, int heure, int minute) 
			throws SQLException;
	
	/**
	 * 	Permet de recupere le tableau contenant l'horaire recherche prealablement
	 * 	@return horaire un tableau contenant l'horaire recherche prealablement
	 */
	public String[] getHoraire();
	
	/**
	 * 	Permet de recuperer l'instance de TitreDeTransport
	 * 	@return titre le titre de transport
	 */
	public TitreDeTransport getTitre();
	
	/**
	 * 	Permet de recuperer le nombre de titre(s) commande(s)
	 * 	@return nombre le nombre de titre commande
	 */
	public int getNbrTitre();
	
	/**
	 * 	Permet de recuperer le prix de la commande (en cents)
	 * 	@return prix le prix de la commande
	 */
	public int getPrix();
	
	/**
	 * 	Permet d'initialiser le prix d'un titre de transport
	 * 	@param prix le prix du titre de transport (en cents)
	 */
	public void setPrix(int prix);
	
	/**
	 * 	Permet d'ajouter de la monnaie, d'incrementer le montant intoduit
	 * 	@param i le montant (en cents) a ajouter
	 * 	@throws ComposantHorsService (peut generer une exceptions si une des fentes est en panne)
	 */
	public void ajoutMonnaie(int i) throws ComposantHorsService;
	
	/**
	 * 	Permet d'avoir un detail de la monnaie qui sera rendue
	 * 	@return	rendu le detail de ce qui sera rendu
	 * 	@throws PasAssezDeMonnaie (peut generer une exception s'il n'y a pas assez de monnaie)
	 */
	public Rendu rendreMonnaie() throws PasAssezDeMonnaie;
	
	/**
	 * 	Permet d'avoir le detail de la monnaie qui a ete inseree a rendre
	 * 	@return rendu le detail de ce qui sera rendu
	 */
	public Rendu rendreMontantRecu();
	
	/**
	 * Permet de mettre le compteur "introduit" (monnaie introduite) a zero
	 */
	public void reinitialisation();
	
	/**
	 * 	Permet de recuperer une liste de tout les abonnements deja existants dans la base 
	 * 	de donnees
	 * 	@return liste une liste de tout les abonnements existants dans la base de donnees
	 */
	public ArrayList<String> getListeAbonnement();
	
	/**
	 * 	Permet de mettre a jour la validite de l'abonnement renouvele dans la base de
	 * 	donnees
	 */
	public void miseAJourValiditeAbonnement();
	
	/**
	 * 	Permet d'inserer le nouvel abonnement achete dans la base de donnees
	 */
	public void insertionAbonnement();

	/**
	 * 	Permet de savoir si l'utilisateur a rentre assez de monnaie lors de son paiement
	 * 	@return depasse un booleen vrai si l'utilisateur a depasse le prix a payer, faux
	 * 	sinon
	 */
	public boolean depassementMontantAPayer();
	
	/**
	 * 	Permet de recuperer le prix affichable (en euros)
	 * 	@return montantAPayer le prix de la commande (en euros)
	 */
	public double montantAPayerAffichable();
	
	/**
	 * 	Permet de recuperer le prix d'un titre de transport commande (s'il y en a plusieurs)
	 * 	@return prix le prix (en euros) d'un titre de transport commande
	 */
	public double prixTicketAffichable();
	
	/**
	 * 	Permet de recuperer le montant rendu (en euros)
	 * 	@return rendu le montant rendu
	 */
	public double renduAffichable();
	
	/**
	 * 	Permet de recuperer le montant introduit (en euros)
	 * 	@return introduit le montant introduit (en euros)
	 */
	public double montantRecuAffichable();
	
	/**
	 * 	Permet de savoir si la carte associee au numero en parametre
	 * 	@param numero le numero d'une carte bancaire
	 * 	@return existe un booleen vrai si le numero de carte existe dans la base de donnees
	 */
	public boolean existenceCarte(String numero);
	
	/**
	 * 	Permet de recuperer la carte que l'on utilise actuellement
	 * 	@return carte la carte que l'on utilise (qui a ete inseree)
	 */
	public Carte getCarte();
	
	/**
	 * 	Permet de verifier le code PIN de la carte que l'on utilise actuellement
	 * 	@param codePIN le code PIN entre par l'utilisateur
	 * 	@return verif un booleen vrai si le code PIN entre est correct, si c'est le meme
	 * 	que celui de la carte que l'on utilise
	 */
	public boolean verifCode(int codePIN);
	
	/**
	 * 	Permet de verifier si le solde de la carte utilisee est suffisant
	 * 	@return verif un booleen vrai si le solde de la carte est suffisant, faux sinon
	 */
	public boolean verifSolde();
	
	/**
	 * 	Action executee si le PIN entre est mauvais
	 */
	public void mauvaisPin();
	
	/**
	 * 	Permet de regarder si l'utilisateur n'a pas entre trop de fois un mauvais code PIN
	 * 	@return tropDErreur un booleen vrai si l'utilisateur a deja saisi trois fois un 
	 *	code PIN incorrect, faux sinon
	 */
	public boolean tropDErreur();
	
	/**
	 * 	Permet d'actualiser le solde associee a la carte utilisee dans la base de donnees 
	 * 	apres un paiement par carte
	 */
	public void actualiserSolde();
	
	/**
	 * 	Permet de savoir si un composant est en panne ou non
	 * 	@param composant un composant
	 * 	@return enPanne vrai si le composant est fonctionnel, faux sinon
	 */
	public boolean estEnMarche(Composant composant);

	/**
	 * 	Permet d'actualiser la panne d'un composant
	 * 	@param composant un composant a mettre en panne ou a reparer
	 */
	public void actualiserPanne(Composant composant);
	
	/**
	 * 	Pemet de vider la caisse du distributeur
	 */
	public void viderCaisse();
	
	/**
	 * 	Permet de recharger la caisse du distributeur
	 */
	public void rechargerCaisse();
	
	/**
	 * 	Permet recharger le stock d'encre et de papier du distributeur
	 */
	public void rechargerEncreEtPapier();
	
	/**
	 * 	Permet de vider le stock d'encre et de papier du distributeur
	 */
	public void viderEncreEtPapier();
	
	/**
	 * 	Permet d'enlever la carte du distributeur
	 */
	public void carteEnlevee();
	
	/**
	 * 	Permet de voir si une carte est inseree ou non
	 * 	@return inseree un booleen vrai s'il y a une carte dans le lecteur, faux sinon
	 */
	public boolean carteInseree();
		
	/**
	 * 	Permet de decrementer le nombre de papier pour l'impression
	 * 	@throws ComposantHorsService (peut generer une exception si l'imprimante 
	 * est en panne)
	 * 	@throws PlusDePapier (peut generer une exception s'il n'y a plus de papier)
	 */
	public void impression() throws ComposantHorsService, PlusDePapier;
	
	
	/**
	 * 	Permet de mettre a jour la configuration de l'ecran du distributeur
	 * 	@param tactile vrai si l'ecran choisi est tactile, faux sinon
	 */
	public void setTactile(boolean tactile);
	
	/**
	 * 	Permet de savoir si l'ecran est tactile ou non
	 * 	@return ecranTactile qui est vrai si l'ecran est tactile, faux sinon
	 */
	public boolean getTactile();
	
	/**
	 * 	Permet de mettre a jour le scanneur du distributeur (l'ajoute s'il n'est pas present,
	 * 	l'enleve s'il l'est)
	 * 	@param present vrai si le distributeur est equipe d'un scanneur, faux sinon
	 */
	public void setScanneur(boolean present);
	
	/**
	 * 	Permet de savoir si le scanneur de codes est present sur le distributeur ou non
	 * 	@return scanneurPresent qui est vrai si le distributeur est equipe d'un scanneur, faux
	 * 	sinon
	 */
	public boolean scanneurPresent();
	
	/**
	 * 	Permet de mettre a jour les fentes du distributeur (les ajoutes si elles ne sont pas 
	 * 	presentes ou les enleve)
	 * 	@param fenteBillet vrai si la fente a billet veut etre mise, faux si elle doit etre 
	 * 	enlevee
	 * 	@param fentePiece vrai si la fente a piece veut etre mise, faux si elle doit etre 
	 * 	enlevee
	 */
	public void setFentes(boolean fenteBillet, boolean fentePiece);
	
	/**
	 * 	Permet de savoir si au moins une fente est presente sur le distributeur
	 * 	@return fente vrai si on a au moins une fente (fenteBillet ou fentePiece), faux sinon
	 */
	public boolean fentePresente();
}