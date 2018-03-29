package coeur;

import java.util.Stack;
import interfaceGraphique.CoeurAGraphique;
import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;
import stockage.imprimable.Abonnement;
import stockage.imprimable.Billet;
import stockage.imprimable.Classe;
import stockage.imprimable.Pass;
import stockage.imprimable.Reduction;
import stockage.imprimable.TypeTitre;

/**
 * Classe Controleur
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Controleur 
{	
	private ControleurEtat etatActuel = EtatAccueil.getInstance();
	private Stack<ControleurEtat> etatsPrecedents = new Stack<ControleurEtat>();
	private CoeurAGraphique coeurAGraphique;
	private CoeurAStockage coeurAStockage = CoeurAStockageImpl.getInstance();
	private static Controleur instance;
	private Commande commande;
	private ControleurEtat modePaiement;
	private boolean ecranTactile;
	private boolean scanneurPresent;
	private boolean fenteBillet, fentePiece;
	
	
	/**
	 * 	Constructeur de Controleur
	 */
	private Controleur() {}
	
	/**
	 *	Permet de recupererer l'instance unique de Controleur (Singleton Design Pattern)
	 *	@return instance l'instance de Controleur
	 */
	public static Controleur getInstance()
	{
		if(instance == null)
		{
			instance = new Controleur();
		}
		return instance;
	}
	
	/**
	 *	Permet de recuperer cette instance de CoeurAGraphiqueImpl
	 *	@return coeurAGraphqique l'instance de coeurAGraphiqueImpl
	 */
	public CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}

	/**
	 *	Permet de recuperer cette instance de CoeurAStockageImpl
	 *	@return coeurAStockage l'instance de coeurAStockageImpl
	 */
	public CoeurAStockage getCoeurAStockage() 
	{
		return coeurAStockage;
	}
	
	/**
	 * 	Cette methode permet d'initialiser coeurAGraphique (pour les test unitaires)
	 * 	@param cAGraph une instance de CoeurAGraphiqueImpl
	 */
	public void setGraphique(CoeurAGraphique cAGraph)
	{
		this.coeurAGraphique = cAGraph;
	}
	
	/**
	 *	Permet de modifier les etats au fur et a mesure de l'execution (ajout a la pile
	 *	et mise a jour de etatActuel)
	 *	@param etat un etat de type ControleurEtat
	 */
	public void modifEtat(ControleurEtat etat) 
	{
		etatsPrecedents.push(etatActuel);
		etatActuel = etat;
		etatActuel.entree();
	}
	
	/**
	 *	Permet de recuperer la pile contenant les etats dans lesquels nous sommes passes
	 *	@return etatPrecedents la pile des etats precedents
	 */
	public Stack<ControleurEtat> getEtatsPrecedents() 
	{
		return etatsPrecedents;
	}
	
	/**
	 *	Permet de recuperer l'etat dans lequel nous nous trouvons (etatActuel)
	 *	@return etatActuel etat dans lequel nous nous trouvons
	 */
	public ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}

	/**
	 *	Permet de recuperer la commande en cours (billet, abonnement, pass, ...)
	 *	@return commande la commande en cours d'achat
	 */
	public Commande getCommande()
	{
		return this.commande;
	}

	/**
	 *	Permet de mettre a jour la commande en cours
	 *	@param commande une commande (billet, abonnement, pass, ...)
	 */
	public void setCommande(Commande commande)
	{
		this.commande = commande;
	}

	/**
	 *	Permet de reinitialiser la commande pour une eventuelle seconde utilisation
	 */
	public void reinitialisationCommande()
	{
		this.commande = null;
	}

	/**
	 *	Permet de mettre a jour le mode de paiement (soit liquide ou par carte)
	 *	@param modePaiement un mode de paiement
	 */
	public void setModePaiement(ControleurEtat modePaiement)
	{
		this.modePaiement = modePaiement;	
	}
	
	/**
	 *	Permet de recuperer le mode de paiement
	 *	@return modePaiement le mode de paiement utilise
	 */
	public ControleurEtat getModePaiement()
	{
		return modePaiement;
	}

	/**
	 *	Permet de calculer le prix d'un billet a partir d'une gare de depart, d'une gare
	 *	d'arrivee, d'une reduction, d'un type et d'une classe
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param reduc une reduction (Reduction)
	 * 	@param type un type de billet (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix du billet
	 */
	public void calculerPrix(Billet billet)
	{
		double calculPrix = getCoeurAStockage().rechercherPrix(commande,billet.getGareDepart(),billet.getGareArrivee());
		int res = ajusterPrix(calculPrix ,billet.getReduction(), billet.getType(), billet.getClasse())* getCoeurAStockage().getNbrTitre();
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 * 	Permet de calculer le prix d'un abonnement a partir d'une gare de depart, d'une gare
	 *	d'arrivee, d'une reduction, d'un type, d'une classe et d'une validite
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param reduc une reduction (Reduction)
	 * 	@param type un type d'abonnement (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@param validite une validite (1, 3, 6 ou 12 mois)
	 * 	@return le prix de l'abonnement
	 */
	public void calculerPrix(Abonnement abo)
	{	
		double calculPrix = getCoeurAStockage().rechercherPrix(commande,abo.getGareDepart(), abo.getGareArrivee());	
		int res = ajusterPrix(calculPrix ,abo.getReduction(), abo.getType(), abo.getClasse());
		res *= abo.getValidite();	
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 *  Permet de calculer le prix d'un pass illimite a partir d'une classe, d'une reduction,
	 *	d'un type et un nombre de jours
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une reduction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param nbrJours le nombre de jour de validite
	 * 	@return le prix du pass
	 */
	public void calculerPrixIllimite(Pass pass)
	{
		double calculPrix = getCoeurAStockage().rechercherPrix(pass.getTypePass());
		int res = ajusterPrix(calculPrix ,pass.getReduction(), pass.getType(), pass.getClasse());
		res *= pass.getNbrJours();	
		getCoeurAStockage().setPrix(res);
	}

	/**
	 * 	Permet de calculer le prix d'un pass dix trajets a partir d'une classe, d'une reduction
	 *	et d'un type
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une reduction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@return le prix du pass
	 */
	public void calculerPrixPass10trajet(Pass pass)
	{
		double calculPrix = getCoeurAStockage().rechercherPrix(pass.getTypePass());
		int res = ajusterPrix(calculPrix ,pass.getReduction(), pass.getType(), pass.getClasse());	
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 * 	Permet de calculer le prix d'un pass dix trajets entre deux gares a partir d'une gare
	 *	de depart, d'une gare d'arrivee, d'une classe, d'une reduction et d'un type
	 * 	@param gareDepart une gare de depart
	 * 	@param gareArrivee une gare d'arrivee
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une reduction (Reduction)
	 * 	@param type un type de pass (TypeTitre)
	 * 	@return le prix du pass
	 */
	public void calculerPrixPass10Trajets2Gares(Pass pass)
	{	
		double calculPrix = getCoeurAStockage().rechercherPrix(commande,pass.getGareDepart(),pass.getGareArrivee());
		int res = ajusterPrix(calculPrix ,pass.getReduction(), pass.getType(), pass.getClasse());		
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 * 	Permet de calculer le prix d'un titre de transport en fonction des donnees entrees
	 *	(le prix de base du titre, la reduction, le type et la classe)
	 * 	@param prix un prix a ajuster (en euros)
	 * 	@param reduc une reduction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix (en cents) du titre calcule en fonction des donnees introduites
	 */
	private int ajusterPrix(double prix ,Reduction reduc, TypeTitre type, Classe classe)
	{
		double res= prix;
		res*=100;
		res -= res * (double)reduc.valeur()/100;	
		res -= res * (double)type.valeur()/100;	
		res *= (3-classe.valeur());	
		return (int) res;
	}
	
	/**
	 * 	Permet de mettre a jour la configuration de l'ecran du distributeur
	 * 	@param tactile vrai si l'ecran choisi est tactile, faux sinon
	 */
	public void setTactile(boolean tactile)
	{
		this.ecranTactile = tactile;
	}
	
	/**
	 * 	Permet de savoir si l'ecran est tactile ou non
	 * 	@return ecranTactile qui est vrai si l'ecran est tactile, faux sinon
	 */
	public boolean getTactile()
	{
		return ecranTactile;
	}
	
	/**
	 * 	Permet de mettre a jour le scanneur du distributeur (l'ajoute s'il n'est pas present,
	 * 	l'enleve s'il l'est)
	 * 	@param present vrai si le distributeur est equipe d'un scanneur, faux sinon
	 */
	public void setScanneur(boolean present) 
	{
		this.scanneurPresent = present;
	}
	
	/**
	 * 	Permet de savoir si le scanneur de codes est present sur le distributeur ou non
	 * 	@return scanneurPresent qui est vrai si le distributeur est equipe d'un scanneur, faux
	 * 	sinon
	 */
	public boolean scanneurPresent()
	{
		return scanneurPresent;
	}
	
	/**
	 * 	Permet de mettre a jour les fentes du distributeur (les ajoutes si elles ne sont pas 
	 * 	presentes ou les enleve)
	 * 	@param fenteBillet vrai si la fente a billet veut etre mise, faux si elle doit etre 
	 * 	enlevee
	 * 	@param fentePiece vrai si la fente a piece veut etre mise, faux si elle doit etre 
	 * 	enlevee
	 */
	public void setFentes(boolean fenteBillet, boolean fentePiece) 
	{
		this.fentePiece = fentePiece;
		this.fenteBillet = fenteBillet;
	}
	
	/**
	 * 	Permet de savoir si au moins une fente est presente sur le distributeur
	 * 	@return fente vrai si on a au moins une fente (fenteBillet ou fentePiece), faux sinon
	 */
	public boolean fentePresente()
	{
		return (fentePiece || fenteBillet);
	}
	
	
}