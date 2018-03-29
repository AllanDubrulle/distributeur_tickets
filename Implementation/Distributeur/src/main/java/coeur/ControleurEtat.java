package coeur;

import java.sql.SQLException;

import stockage.Composant;

/**
 * 	Classe abstraite ControleurEtat (classe parent de tout les differents etats dans lesquels
 * 	nous pouvons voyager)
 * 	@author TheoDaix, AllanDubrulle, VictorVerhoye
 * 	@version 1.0
 */
abstract class ControleurEtat 
{	
	/**
	 * 	Constructeur de ControleurEtat
	 */
	protected ControleurEtat() {}
	
	/**
	 *	Permet de valider les choix selectionnes dans la fenetre de configuration
	 */
	public void valideConfig() {}
	
	/**
	 *	Permet de lancer la simulation une fois la Configuration validee
	 */
	public void demarreSimulation() {}
	
	/**
	 *	Permet de retourner au menu principal
	 */
	public void retourMenuPrincipal() {}
	
	/**
	 * 	Action d'entree de chaque etat, comportement different selon l'etat mais en general 
	 * 	permet d'afficher la bonne fenetre
	 */
	public void entree() {}
	
	/**
	 * 	Permet d'annuler et en general permet de revenir sur le menu principal et vide la pile
	 * 	d'etats
	 */
	public void annule() {}
	
	/**
	 *	Permet de revenir sur le choix du titre lorsque nous sommes dans les recapitulatifs
	 *	de commande
	 */
	public void retourTitre() {}
	
	/**
	 * 	Permet de revenir sur la fenetre precedente, en eliminant le dernier etat dans la 
	 * 	pile d'etats
	 */
	public void retour() {}
	
	/**
	 * 	Permet de confirmer un achat, en general permet de passer du recapitulatif de l'achat
	 *	au paiement
	 */
	public void confirme() {}
	
	/**
	 *	Permet de valider les informations entrees lors d'un achat d'un Titre de transport,
	 *	en general permet de passer de la fenetre du Titre vers le recapitulatif 
	 *	OU 
	 *	Permet de valider le numero de la carte bancaire entre lors du paiement par carte
	 */
	public void valider() {}
	
	/**
	 * 	Permet de passer de menu vers la fenetre de billet
	 */
	public void choixBillet() {}
	
	/**
	 * 	Permet de passer de menu vers la fenetre d'achat d'un abonnement
	 */
	public void choixAchatAbo() {}
	
	/**
	 * 	Permet de passer de menu vers la fenetre de renouvellement d'un abonnement
	 */
	public void choixRenouvAbo() {}
	
	/**
	 * 	Permet de passer de menu vers la fenetre de menu des Pass qui permet de choisir le
	 * 	type de pass voulu
	 */
	public void choixPass() {}
	
	/**
	 * 	Permet de passer de menu des Pass vers la fenetre de pass illimite
	 */
	public void choixPassIllimite() {}

	/**
	 * 	Permet de passer de menu des Pass vers la fenetre de pass 10 trajets
	 */
	public void choixPass10Trajets() {}

	/**
	 * 	Permet de passer de menu des Pass vers la fenetre de pass 10 trajets 2 gares (10 trajets 
	 * 	entre deux gares)
	 */
	public void choixPass10Trajets2Gares() {}
	
	/**
	 * 	Permet de passer de menu vers la fenetre de menu des horaires qui permet de choisir 
	 * 	le type de recherche voulu
	 */
	public void choixHoraire() {}

	/**
	 * 	Permet de passer de menu d'horaire vers la fenetre de recherche de l'heure d'un 
	 * 	itineraire
	 */
	public void choixItineraire() {}
	
	/**
	 * 	Permet de passer de menu d'horaire vers la fenetre de recherche de l'heure des
	 * 	arrivees
	 */
	public void choixArrivees() {}
	
	/**
	 * 	Permet de passer de menu d'horaire vers la fenetre de recherche de l'heure des
	 * 	departs
	 */
	public void choixDeparts() {}
	
	/**
	 * 	Permet de passer de la fenetre des recherches des horaires d'itineraires vers la 
	 * 	fenetre des resultats
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param heure l'heure de l'heure du depart
	 * 	@param minute la minute de l'heure du depart
	 * 	@throws SQLException (peut generer une exception lors de l'envoi de la requete) 
	 */
	public void valideRechercheItineraire(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException {}
	
	/**
	 * 	Permet de passer de la fenetre des recherches des horaires des departs vers la 
	 * 	fenetre des resultats
	 * 	@param gareDepart une gare de depart
	 * 	@param heure l'heure de l'heure du depart
	 * 	@param minute la minute de l'heure du depart
	 * 	@throws SQLException (peut generer une exception lors de l'envoi de la requete)
	 */
	public void valideRechercheGA(String gareDepart, int heure, int minute) throws SQLException {}
	
	/**
	 * 	Permet de passer de la fenetre des recherches des horaires des arrivees vers la 
	 * 	fenetre des resultats
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param heure l'heure de l'heure d'arrivee
	 * 	@param minute la minute de l'heure d'arrivee
	 * 	@throws SQLException (peut generer une exception lors de l'envoi de la requete) 
	 */
	public void valideRechercheGD(String gareArrivee, int heure, int minute) throws SQLException {}
	
	/**
	 * 	Permet d'imprimer l'horaire d'une recherche effectuee
	 */
	public void choixImpressionHoraire() {}
	
	/**
	 * 	Permet de valider le numero de l'abonnement selectionne
	 */
	public void valideNumAbo() {}
	
	/**
	 * 	Permet de valider le code PIN entre et de lancer la verification
	 * 	@param codePIN le code PIN entre par l'utilisateur
	 */
	public void validePIN(int codePIN) {}
	
	/**
	 *	Permet de scanner le code d'un numero d'abonnement (afficher une fenetre de choix de 
	 *	numero d'abonnement)
	 */
	public void scanneCode() {}
	
	/**
	 * 	Permet de passer de la fenetre paiement vers la fenetre du paiement par carte 
	 * 	(affiche la fenetre permettant de choisir le numero de la carte)
	 */
	public void choixParCarte() {}
	
	/**
	 *	Permet de d'inserer/de retirer une carte dans le lecteur de carte
	 */
	public void choixInsererRetirerCarte() {}
	
	/**
	 * 	Permet de passer de la fenetre paiement vers la fenetre du paiement liquide
	 */
	public void choixEnLiquide() {}
	
	/**
	 * Permet d'inserer un montant i (met a jour le montant a payer et le montant introduit)
	 * 	@param i un montant (en cents)
	 */
	public void inserer(int i) {}
	
	/**
	 * 	Permet de demander l'impression d'un recu
	 */
	public void choixOui() {}
	
	/**
	 * 	Permet de ne pas demander l'impression d'un recu et donc de passer a la fenetre de
	 * 	fin
	 */
	public void choixNon() {}
	
	/**
	 * 	Permet de recuperer les documents imprimes par la machine (et de les afficher a 
	 * 	l'ecran)
	 */
	public void choixOk() {}
	
	/**
	 * 	Permet d'effectuer une action apres un certain temps (ici, 5 secondes) ; le temps 
	 * 	d'affichage d'une erreur OU pour inserer le code PIN
	 */
	public void apres5sec() {}
	
	/**
	 * 	Permet d'effectuer une action apres un certain temps (ici, 15 secondes) ; le temps
	 * 	d'attente maximum a la fin pour revenir a la page d'accueil
	 */
	public void apres15sec() {}
	
	/**
	 * 	Permet d'effectuer une action apres un certain temps (ici, 5 secondes) ; le temps 
	 * 	d'affichage d'une impression OU de l'ejection de la carte OU de la validation du
	 * 	paiement par carte
	 */
	public void apres5secOk() {}
	
	/**
	 * 	Permet de mettre en panne un composant (lecteur, imprimante, ...)
	 * 	@param composant un Composant a mettre en panne
	 */
	public void actualiserPanne(Composant composant)
	{
		Controleur.getInstance().getCoeurAStockage().actualiserPanne(composant);
	}

	/**
	 * 	Permet de rechaerger la caisse du distributeur
	 */
	public void rechargerCaisse()
	{
		Controleur.getInstance().getCoeurAStockage().rechargerCaisse();
	}
	
	/**
	 * 	Permet de vider la caisse du distributeur
	 */
	public void viderCaisse()
	{
		Controleur.getInstance().getCoeurAStockage().viderCaisse();
	}

	/**
	 * 	Permet de recharger le stock d'encre et de papier du distibuteur
	 */
	public void rechargerEncreEtPapier()
	{
		Controleur.getInstance().getCoeurAStockage().rechargerEncreEtPapier();
		
	}

	/**
	 * 	Permet de vider le stock d'encre et de papier du distributeur
	 */
	public void viderEncreEtPapier()
	{
		Controleur.getInstance().getCoeurAStockage().viderEncreEtPapier();
	}

	/**
	 * 	Permet d'actualiser l'etat de blocage de la carte dans le distributeur
	 */
	public void bloquerCarte()
	{
		if(Controleur.getInstance().getCoeurAStockage().carteInseree())
		{
			actualiserPanne(Composant.LECTEURCARTE);
			if (!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.LECTEURCARTE))
			{
				Controleur.getInstance().getCoeurAGraphique().carteBloquee();
			}
			else
			{
				Controleur.getInstance().getCoeurAStockage().carteEnlevee();
				Controleur.getInstance().getCoeurAGraphique().carteNonBloquee();
			}
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().carteNonBloquee();
		}
	}
	
	/**
	 * 	Permet d'actualiser la mise en panne le lecteur de carte du distributeur
	 */
	public void lecteurPanne() 
	{
		actualiserPanne(Composant.LECTEURCARTE);
		if(EtatParCarte.getInstance().equals(Controleur.getInstance().getModePaiement()))
		{
			if(!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.LECTEURCARTE))
			{
				Controleur.getInstance().getCoeurAGraphique().lecteurEnPanne();
			}
			else
			{
				Controleur.getInstance().getCoeurAGraphique().lecteurPasEnPanne();
			}
		}
	}

	/**
	 * 	Permet de mettre a jour le distributeur lorqu'on retire les fentes
	 */
	public void retirerFentes() {}
	
	/**
	 * 	Permet d'actualiser la mise en panne la fente a billet du distributeur
	 */
	public void fenteBilletPanne() 
	{
		actualiserPanne(Composant.FENTEBILLET);
		if(EtatPaiementLiquide.getInstance().equals(Controleur.getInstance().getModePaiement()))
		{
			if(!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEBILLET))
			{
				Controleur.getInstance().getCoeurAGraphique().fenteBilletEnPanne();
			}
			else
			{
				Controleur.getInstance().getCoeurAGraphique().fenteBilletPasEnPanne();
			}
		}
	}
	
	/**
	 * 	Permet d'actualiser la mise en panne la fente a piece du distributeur
	 */
	public void fentePiecePanne() 
	{
		actualiserPanne(Composant.FENTEPIECE);
		if(EtatPaiementLiquide.getInstance().equals(Controleur.getInstance().getModePaiement()))
		{
			if(!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEPIECE))
			{
				Controleur.getInstance().getCoeurAGraphique().fentePieceEnPanne();
			}
			else
			{
				Controleur.getInstance().getCoeurAGraphique().fentePiecePasEnPanne();
			}
		}
	}
	
	/**
	 * 	Permet d'actualiser la mise en panne le scanneur du distributeur
	 */
	public void scanneurPanne()
	{
		actualiserPanne(Composant.SCANNEUR);
		if(!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.SCANNEUR))
		{
			Controleur.getInstance().getCoeurAGraphique().scanneurEnPanne();
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().scanneurPasEnPanne();
		}
	}
	
	/**
	 * 	Permet d'actualiser la mise en panne l'imprimante du distributeur
	 */
	public void imprimantePanne()
	{
		actualiserPanne(Composant.IMPRIMANTE);
		if(!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.IMPRIMANTE))
		{
			Controleur.getInstance().getCoeurAGraphique().imprimanteEnPanne();
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().imprimantePasEnPanne();
		}
	}
	
	/**
	 * 	Permet d'ecrire le nom de l'etat
	 * 	@return nom le nom de l'etat
	 */
	public String toString() 
	{
		return this.getClass().getName();
	}
}