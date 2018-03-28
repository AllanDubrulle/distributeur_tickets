package coeur;

import java.sql.SQLException;

import stockage.Composant;

/**
 * 	Classe abstraite ControleurEtat (classe parent de tout les différents états dans lesquels
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
	 *	Permet de valider les choix séléctionnés dans la fenêtre de configuration
	 */
	public void valideConfig() {}
	
	/**
	 *	Permet de lancer la simulation une fois la Configuration validée
	 */
	public void demarreSimulation() {}
	
	/**
	 *	Permet de retourner au menu principal
	 */
	public void retourMenuPrincipal() {}
	
	/**
	 * 	Action d'entrée de chaque état, comportement différent selon l'état mais en général 
	 * 	permet d'afficher la bonne fenêtre
	 */
	public void entree() {}
	
	/**
	 * 	Permet d'annuler et en général permet de revenir sur le menu principal et vide la pile
	 * 	d'états
	 */
	public void annule() {}
	
	/**
	 *	Permet de revenir sur le choix du titre lorsque nous sommes dans les récapitulatifs
	 *	de commande
	 */
	public void retourTitre() {}
	
	/**
	 * 	Permet de revenir sur la fenêtre précédente, en éliminant le dernier état dans la 
	 * 	pile d'états
	 */
	public void retour() {}
	
	/**
	 * 	Permet de confirmer un achat, en général permet de passer du récapitulatif de l'achat
	 *	au paiement
	 */
	public void confirme() {}
	
	/**
	 *	Permet de valider les informations entrées lors d'un achat d'un Titre de transport,
	 *	en général permet de passer de la fenêtre du Titre vers le récapitulatif 
	 *	OU 
	 *	Permet de valider le numéro de la carte bancaire entré lors du paiement par carte
	 */
	public void valider() {}
	
	/**
	 * 	Permet de passer de menu vers la fenêtre de billet
	 */
	public void choixBillet() {}
	
	/**
	 * 	Permet de passer de menu vers la fenêtre d'achat d'un abonnement
	 */
	public void choixAchatAbo() {}
	
	/**
	 * 	Permet de passer de menu vers la fenêtre de renouvellement d'un abonnement
	 */
	public void choixRenouvAbo() {}
	
	/**
	 * 	Permet de passer de menu vers la fenêtre de menu des Pass qui permet de choisir le
	 * 	type de pass voulu
	 */
	public void choixPass() {}
	
	/**
	 * 	Permet de passer de menu des Pass vers la fenêtre de pass illimité
	 */
	public void choixPassIllimite() {}

	/**
	 * 	Permet de passer de menu des Pass vers la fenêtre de pass 10 trajets
	 */
	public void choixPass10Trajets() {}

	/**
	 * 	Permet de passer de menu des Pass vers la fenêtre de pass 10 trajets 2 gares (10 trajets 
	 * 	entre deux gares)
	 */
	public void choixPass10Trajets2Gares() {}
	
	/**
	 * 	Permet de passer de menu vers la fenêtre de menu des horaires qui permet de choisir 
	 * 	le type de recherche voulu
	 */
	public void choixHoraire() {}

	/**
	 * 	Permet de passer de menu d'horaire vers la fenêtre de recherche de l'heure d'un 
	 * 	itinéraire
	 */
	public void choixItineraire() {}
	
	/**
	 * 	Permet de passer de menu d'horaire vers la fenêtre de recherche de l'heure des
	 * 	arrivées
	 */
	public void choixArrivees() {}
	
	/**
	 * 	Permet de passer de menu d'horaire vers la fenêtre de recherche de l'heure des
	 * 	départs
	 */
	public void choixDeparts() {}
	
	/**
	 * 	Permet de passer de la fenêtre des recherches des horaires d'itinéraires vers la 
	 * 	fenêtre des résultats
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param heure l'heure de l'heure du départ
	 * 	@param minute la minute de l'heure du départ
	 * 	@throws SQLException (peut générer une exception lors de l'envoi de la requête) 
	 */
	public void valideRechercheItineraire(String gareDepart, String gareArrivee, int heure, int minute) 
			throws SQLException {}
	
	/**
	 * 	Permet de passer de la fenêtre des recherches des horaires des départs vers la 
	 * 	fenêtre des résultats
	 * 	@param gareDepart une gare de départ
	 * 	@param heure l'heure de l'heure du départ
	 * 	@param minute la minute de l'heure du départ
	 * 	@throws SQLException (peut générer une exception lors de l'envoi de la requête)
	 */
	public void valideRechercheGA(String gareDepart, int heure, int minute) throws SQLException {}
	
	/**
	 * 	Permet de passer de la fenêtre des recherches des horaires des arrivées vers la 
	 * 	fenêtre des résultats
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param heure l'heure de l'heure d'arrivée
	 * 	@param minute la minute de l'heure d'arrivée
	 * 	@throws SQLException (peut générer une exception lors de l'envoi de la requête) 
	 */
	public void valideRechercheGD(String gareArrivee, int heure, int minute) throws SQLException {}
	
	public void choixImpressionHoraire() {}
	
	/**
	 * 	Permet de valider le numéro de l'abonnement séléctionné
	 */
	public void valideNumAbo() {}
	
	/**
	 * 	Permet de valider le code PIN entré et de lancer la vérification
	 * 	@param codePIN le code PIN entré par l'utilisateur
	 */
	public void validePIN(int codePIN) {}
	
	/**
	 *	Permet de scanner le code d'un numéro d'abonnement (afficher une fenêtre de choix de 
	 *	numéro d'abonnement)
	 */
	public void scanneCode() {}
	
	/**
	 * 	Permet de passer de la fenêtre paiement vers la fenêtre du paiement par carte 
	 * 	(affiche la fenêtre permettant de choisir le numéro de la carte)
	 */
	public void choixParCarte() {}
	
	/**
	 *	Permet de d'insérer/de retirer une carte dans le lecteur de carte
	 */
	public void choixInsererRetirerCarte() {}
	
	public void retirerFentes() {}
	
	/**
	 * 	Permet de passer de la fenêtre paiement vers la fenêtre du paiement liquide
	 */
	public void choixEnLiquide() {}
	
	/**
	 * Permet d'insérer un montant i (met à jour le montant à payer et le montant introduit)
	 * 	@param i un montant (en cents)
	 */
	public void inserer(int i) {}
	
	/**
	 * 	Permet de demander l'impression d'un reçu
	 */
	public void choixOui() {}
	
	/**
	 * 	Permet de ne pas demander l'impression d'un reçu et donc de passer à la fenêtre de
	 * 	fin
	 */
	public void choixNon() {}
	
	/**
	 * 	Permet de récuperer les documents imprimés par la machine (et de les afficher à 
	 * 	l'écran)
	 */
	public void choixOk() {}
	
	/**
	 * 	Permet d'effectuer une action après un certain temps (ici, 5 secondes) ; le temps 
	 * 	d'affichage d'une erreur OU pour insérer le code PIN
	 */
	public void apres5sec() {}
	
	/**
	 * 	Permet d'effectuer une action après un certain temps (ici, 15 secondes) ; le temps
	 * 	d'attente maximum à la fin pour revenir à la page d'accueil
	 */
	public void apres15sec() {}
	
	/**
	 * 	Permet d'effectuer une action après un certain temps (ici, 5 secondes) ; le temps 
	 * 	d'affichage d'une impression OU de l'éjection de la carte OU de la validation du
	 * 	paiement par carte
	 */
	public void apres5secOk() {}
	
	/**
	 * 	Permet de mettre en panne un composant (lecteur, imprimante, ...)
	 * 	@param composant un Composant à mettre en panne
	 */
	public void actualiserPanne(Composant composant)
	{
		Controleur.getInstance().getCoeurAStockage().actualiserPanne(composant);
		//Controleur.getInstance().getCoeurAGraphique().actualiserComposant(composant,
		//		Controleur.getInstance().getCoeurAStockage().estEnMarche(composant));
	}
	
	/**
	 * 	Permet d'écrire le nom de l'état
	 * 	@return nom le nom de l'état
	 */
	public String toString() 
	{
		return this.getClass().getName();
	}

	public void rechargerCaisse()
	{
		Controleur.getInstance().getCoeurAStockage().rechargerCaisse();
	}
	
	public void viderCaisse()
	{
		Controleur.getInstance().getCoeurAStockage().viderCaisse();
	}

	public void rechargerEncreEtPapier()
	{
		Controleur.getInstance().getCoeurAStockage().rechargerEncreEtPapier();
		
	}

	public void viderEncreEtPapier()
	{
		Controleur.getInstance().getCoeurAStockage().viderEncreEtPapier();
	}

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
			Controleur.getInstance().getCoeurAGraphique().carteBloquee();
			
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().carteNonBloquee();
		}
	}
	
	public void lecteurPanne() 
	{
		actualiserPanne(Composant.LECTEURCARTE);
		if(Controleur.getInstance().getModePaiement().equals(EtatParCarte.getInstance()))
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
	
	public void fenteBilletPanne() 
	{
		actualiserPanne(Composant.FENTEBILLET);
		if(Controleur.getInstance().getModePaiement().equals(EtatPaiementLiquide.getInstance()))
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
	
	public void fentePiecePanne() 
	{
		actualiserPanne(Composant.FENTEPIECE);
		if(Controleur.getInstance().getModePaiement().equals(EtatPaiementLiquide.getInstance()))
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
}