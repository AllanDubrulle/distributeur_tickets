package coeur;

import java.sql.SQLException;

import stockage.Composant;

/**
 * 	Classe abstraite ControleurEtat (classe parent de tout les diff�rents �tats dans lesquels
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
	 *	Permet de valider les choix s�l�ctionn�s dans la fen�tre de configuration
	 */
	public void valideConfig() {}
	
	/**
	 *	Permet de lancer la simulation une fois la Configuration valid�e
	 */
	public void demarreSimulation() {}
	
	/**
	 *	Permet de retourner au menu principal
	 */
	public void retourMenuPrincipal() {}
	
	/**
	 * 	Action d'entr�e de chaque �tat, comportement diff�rent selon l'�tat mais en g�n�ral 
	 * 	permet d'afficher la bonne fen�tre
	 */
	public void entree() {}
	
	/**
	 * 	Permet d'annuler et en g�n�ral permet de revenir sur le menu principal et vide la pile
	 * 	d'�tats
	 */
	public void annule() {}
	
	/**
	 *	Permet de revenir sur le choix du titre lorsque nous sommes dans les r�capitulatifs
	 *	de commande
	 */
	public void retourTitre() {}
	
	/**
	 * 	Permet de revenir sur la fen�tre pr�c�dente, en �liminant le dernier �tat dans la 
	 * 	pile d'�tats
	 */
	public void retour() {}
	
	/**
	 * 	Permet de confirmer un achat, en g�n�ral permet de passer du r�capitulatif de l'achat
	 *	au paiement
	 */
	public void confirme() {}
	
	/**
	 *	Permet de valider les informations entr�es lors d'un achat d'un Titre de transport,
	 *	en g�n�ral permet de passer de la fen�tre du Titre vers le r�capitulatif 
	 *	OU 
	 *	Permet de valider le num�ro de la carte bancaire entr� lors du paiement par carte
	 */
	public void valider() {}
	
	/**
	 * 	Permet de passer de menu vers la fen�tre de billet
	 */
	public void choixBillet() {}
	
	/**
	 * 	Permet de passer de menu vers la fen�tre d'achat d'un abonnement
	 */
	public void choixAchatAbo() {}
	
	/**
	 * 	Permet de passer de menu vers la fen�tre de renouvellement d'un abonnement
	 */
	public void choixRenouvAbo() {}
	
	/**
	 * 	Permet de passer de menu vers la fen�tre de menu des Pass qui permet de choisir le
	 * 	type de pass voulu
	 */
	public void choixPass() {}
	
	/**
	 * 	Permet de passer de menu des Pass vers la fen�tre de pass illimit�
	 */
	public void choixPassIllimite() {}

	/**
	 * 	Permet de passer de menu des Pass vers la fen�tre de pass 10 trajets
	 */
	public void choixPass10Trajets() {}

	/**
	 * 	Permet de passer de menu des Pass vers la fen�tre de pass 10 trajets 2 gares (10 trajets 
	 * 	entre deux gares)
	 */
	public void choixPass10Trajets2Gares() {}
	
	/**
	 * 	Permet de passer de menu vers la fen�tre de menu des horaires qui permet de choisir 
	 * 	le type de recherche voulu
	 */
	public void choixHoraire() {}

	/**
	 * 	Permet de passer de menu d'horaire vers la fen�tre de recherche de l'heure d'un 
	 * 	itin�raire
	 */
	public void choixItineraire() {}
	
	/**
	 * 	Permet de passer de menu d'horaire vers la fen�tre de recherche de l'heure des
	 * 	arriv�es
	 */
	public void choixArrivees() {}
	
	/**
	 * 	Permet de passer de menu d'horaire vers la fen�tre de recherche de l'heure des
	 * 	d�parts
	 */
	public void choixDeparts() {}
	
	/**
	 * 	Permet de passer de la fen�tre des recherches des horaires d'itin�raires vers la 
	 * 	fen�tre des r�sultats
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param heure l'heure de l'heure du d�part
	 * 	@param minute la minute de l'heure du d�part
	 * 	@throws SQLException (peut g�n�rer une exception lors de l'envoi de la requ�te) 
	 */
	public void valideRechercheItineraire(String gareDepart, String gareArrivee, int heure, int minute) 
			throws SQLException {}
	
	/**
	 * 	Permet de passer de la fen�tre des recherches des horaires des d�parts vers la 
	 * 	fen�tre des r�sultats
	 * 	@param gareDepart une gare de d�part
	 * 	@param heure l'heure de l'heure du d�part
	 * 	@param minute la minute de l'heure du d�part
	 * 	@throws SQLException (peut g�n�rer une exception lors de l'envoi de la requ�te)
	 */
	public void valideRechercheGA(String gareDepart, int heure, int minute) throws SQLException {}
	
	/**
	 * 	Permet de passer de la fen�tre des recherches des horaires des arriv�es vers la 
	 * 	fen�tre des r�sultats
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param heure l'heure de l'heure d'arriv�e
	 * 	@param minute la minute de l'heure d'arriv�e
	 * 	@throws SQLException (peut g�n�rer une exception lors de l'envoi de la requ�te) 
	 */
	public void valideRechercheGD(String gareArrivee, int heure, int minute) throws SQLException {}
	
	public void choixImpressionHoraire() {}
	
	/**
	 * 	Permet de valider le num�ro de l'abonnement s�l�ctionn�
	 */
	public void valideNumAbo() {}
	
	/**
	 * 	Permet de valider le code PIN entr� et de lancer la v�rification
	 * 	@param codePIN le code PIN entr� par l'utilisateur
	 */
	public void validePIN(int codePIN) {}
	
	/**
	 *	Permet de scanner le code d'un num�ro d'abonnement (afficher une fen�tre de choix de 
	 *	num�ro d'abonnement)
	 */
	public void scanneCode() {}
	
	/**
	 * 	Permet de passer de la fen�tre paiement vers la fen�tre du paiement par carte 
	 * 	(affiche la fen�tre permettant de choisir le num�ro de la carte)
	 */
	public void choixParCarte() {}
	
	/**
	 *	Permet de d'ins�rer/de retirer une carte dans le lecteur de carte
	 */
	public void choixInsererRetirerCarte() {}
	
	public void retirerFentes() {}
	
	/**
	 * 	Permet de passer de la fen�tre paiement vers la fen�tre du paiement liquide
	 */
	public void choixEnLiquide() {}
	
	/**
	 * Permet d'ins�rer un montant i (met � jour le montant � payer et le montant introduit)
	 * 	@param i un montant (en cents)
	 */
	public void inserer(int i) {}
	
	/**
	 * 	Permet de demander l'impression d'un re�u
	 */
	public void choixOui() {}
	
	/**
	 * 	Permet de ne pas demander l'impression d'un re�u et donc de passer � la fen�tre de
	 * 	fin
	 */
	public void choixNon() {}
	
	/**
	 * 	Permet de r�cuperer les documents imprim�s par la machine (et de les afficher � 
	 * 	l'�cran)
	 */
	public void choixOk() {}
	
	/**
	 * 	Permet d'effectuer une action apr�s un certain temps (ici, 5 secondes) ; le temps 
	 * 	d'affichage d'une erreur OU pour ins�rer le code PIN
	 */
	public void apres5sec() {}
	
	/**
	 * 	Permet d'effectuer une action apr�s un certain temps (ici, 15 secondes) ; le temps
	 * 	d'attente maximum � la fin pour revenir � la page d'accueil
	 */
	public void apres15sec() {}
	
	/**
	 * 	Permet d'effectuer une action apr�s un certain temps (ici, 5 secondes) ; le temps 
	 * 	d'affichage d'une impression OU de l'�jection de la carte OU de la validation du
	 * 	paiement par carte
	 */
	public void apres5secOk() {}
	
	/**
	 * 	Permet de mettre en panne un composant (lecteur, imprimante, ...)
	 * 	@param composant un Composant � mettre en panne
	 */
	public void actualiserPanne(Composant composant)
	{
		Controleur.getInstance().getCoeurAStockage().actualiserPanne(composant);
		//Controleur.getInstance().getCoeurAGraphique().actualiserComposant(composant,
		//		Controleur.getInstance().getCoeurAStockage().estEnMarche(composant));
	}
	
	/**
	 * 	Permet d'�crire le nom de l'�tat
	 * 	@return nom le nom de l'�tat
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