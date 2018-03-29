package stockage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

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
	public void creerBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart, 
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
	 *  Permet de faire passer les informations d'un achat d'un pass illimite et de le creer
	 * 	@param nom le nom auquel sera enregistre le pass
	 * 	@param classe la classe du pass
	 * 	@param reduction la reduction du pass
	 * 	@param type le type du pass
	 * 	@param nbrJours le nombre de jour de la validite
	 * 	@param typePass le type du pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerPassIllimite(String nom, int classe, String reduction, String type, int nbrJours, String typePass) 
			throws ErreurDEncodage;
	
	/**
	 * 	Permet de faire passer les informations d'un achat d'un pass 10 trajets et de le creer
	 * 	@param nom le nom auquel sera enregistre le pass
	 * 	@param classe la classe du pass
	 * 	@param reduction la reduction du pass
	 * 	@param type le type du pass
	 * 	@param typePass le type du pass (illimite, dix trajets, dix trajets entre deux gares)
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerPass10Trajets(String nom, int classe, String reduction, String type, String typePass) throws ErreurDEncodage;
	
	/**
	 * 	
	 * 	@param nom
	 * 	@param gareDepart
	 * 	@param gareArrivee
	 * 	@param classe
	 * 	@param reduction
	 * 	@param type
	 * 	@param typePass
	 * 	@throws ErreurDEncodage (peut generer une exception s'il y a une erreur d'encodage)
	 */
	public void creerPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type, 
			String typePass) throws ErreurDEncodage;
	
	/**
	 * 	
	 * 	@param commande
	 * 	@param gareDepart
	 * 	@param gareArrivee
	 * 	@return
	 */
	public double rechercherPrix(Commande commande ,String gareDepart,String gareArrivee);
	
	/**
	 * 	
	 * 	@param typePass
	 * 	@return
	 */
	public double rechercherPrix(TypePass typePass);
	public TypeTitre conversionType(String type ) throws ErreurDEncodage;
	public Classe conversionClasse(int classe) throws ErreurDEncodage;
	public Reduction conversionReduction(String reduction ) throws ErreurDEncodage;
	
	public boolean existenceTrajet(String gareDepart,String gareArrivee);
	public boolean existenceGare(String gare);
	public boolean existenceAbo(String numAbo);
	
	public String[] rechercherHoraireDepart(String gareDepart, int heure, int minute) throws SQLException;
	public String[] getListeReduction();
	public String[] getListeType();
	public String[] getHoraire();
	
	public TitreDeTransport getTitre();
	public int getNbrTitre();
	public void setPrix(int prix);
	
	public void ajoutMonnaie(int i) throws ComposantHorsService;
	public Rendu rendreMonnaie() throws PasAssezDeMonnaie;
	public Rendu rendreMontantRecu();
	public void reinitialisation();
	
	
	public boolean estEnMarche(Composant composant);
	public void impression() throws ComposantHorsService, PlusDePapier;
	public void scanne() throws ComposantHorsService;
	public void lireCarte() throws ComposantHorsService;
	
	public void miseAJourValiditeAbonnement();
	public void insertionAbonnement();

	public String[] rechercherHoraireItineraire(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException;
	public String[] rechercherHoraireArrivee(String gareArrivee, int heure, int minute) throws SQLException;
	public boolean depassementPrix();
	public int getPrix();
	public double prixAffichable();
	public double renduAffichable();
	public double montantRecuAffichable();
	public boolean existenceCarte(String numero);
	public Carte getCarte();
	public boolean verifCode(int codePIN);
	public boolean verifSolde();
	public void mauvaisPin();
	public boolean tropDErreur();
	public void actualiserSolde();
	public ArrayList<String> getListeAbonnement();
	
	public void viderCaisse();
	public void rechargerCaisse();
	public void rechargerEncreEtPapier();
	public void viderEncreEtPapier();
	public void actualiserPanne(Composant composant);
	public void carteEnlevee();
	public boolean carteInseree();
	public double prixTicketAffichable();
}