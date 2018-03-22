package coeur;

import java.util.Stack;
import interfaceGraphique.CoeurAGraphique;
import interfaceGraphique.CoeurAGraphiqueImpl;
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
class Controleur 
{	
	private ControleurEtat etatActuel = EtatAccueil.getInstance();
	private Stack<ControleurEtat> etatsPrecedents = new Stack<ControleurEtat>();
	private CoeurAGraphique coeurAGraphique = CoeurAGraphiqueImpl.getInstance();
	private CoeurAStockage coeurAStockage = CoeurAStockageImpl.getInstance();
	private static Controleur instance;
	private Commande commande;
	private ControleurEtat modePaiement;
	
	/**
	 * 	Constructeur de Controleur
	 */
	private Controleur() {}
	
	/**
	 *	Permet de récuperérer l'instance unique de Controleur (Singleton Design Pattern)
	 *	@return instance l'instance de Controleur
	 */
	public static Controleur getInstance()
	{
		if(instance==null)
		{
			instance = new Controleur();
		}
		return instance;
	}
	
	/**
	 *	Permet de modifier les états au fur et à mesure de l'exécution (ajout à la pile
	 *	et mise à jour de etatActuel)
	 *	@param etat un état de type ControleurEtat
	 */
	public void modifEtat(ControleurEtat etat) 
	{
		etatsPrecedents.push(etatActuel);
		etatActuel = etat;
		System.out.println(etatActuel);
		etatActuel.entree();
	}
	
	/**
	 *	Permet de récupérer la pile contenant les état dans lesquels nous sommes passés
	 *	@return etatPrecedents la pile des états précédents
	 */
	public Stack<ControleurEtat> getEtatsPrecedents() 
	{
		return etatsPrecedents;
	}
	
	/**
	 *	Permet de récupérer cette instance de CoeurAGraphiqueImpl
	 *	@return coeurAGraphqique l'instance de coeurAGraphiqueImpl
	 */
	public CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}

	/**
	 *	Permet de récupérer cette instance de CoeurAStockageImpl
	 *	@return coeurAStockage l'instance de coeurAStockageImpl
	 */
	public CoeurAStockage getCoeurAStockage() 
	{
		return coeurAStockage;
	}

	/**
	 *	Permet de récupérer l'état dans lequel nous nous trouvons (etatActuel)
	 *	@return etatActuel etat dans lequel nous nous trouvons
	 */
	public ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}

	/**
	 *	Permet de récupérer la commande en cours (billet, abonnement, pass, ...)
	 *	@return commande la commande en cours d'achat
	 */
	public Commande getCommande()
	{
		return this.commande;
	}

	/**
	 *	Permet de mettre à jour la commande en cours
	 *	@param commande une commande (billet, abonnement, pass, ...)
	 */
	public void setCommande(Commande commande)
	{
		this.commande = commande;
	}

	/**
	 *	Permet de réinitialiser la commande pour une éventuelle seconde utilisation
	 */
	public void reinitialisationCommande()
	{
		this.commande = null;
	}

	/**
	 *	Permet de mettre à jour le mode de paiement (soit liquide ou par carte)
	 *	@param modePaiement un mode de paiement
	 */
	public void setModePaiement(ControleurEtat modePaiement)
	{
		this.modePaiement = modePaiement;	
	}
	
	/**
	 *	Permet de récuperer le mode de paiement
	 *	@return modePaiement le mode de paiement utilisé
	 */
	public ControleurEtat getModePaiement()
	{
		return modePaiement;
	}

	/**
	 *	Permet de calculer le prix d'un billet à partir d'une gare de départ, d'une gare
	 *	d'arrivée, d'une réduction, d'un type et d'une classe
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param reduc une réduction (Reduction)
	 * 	@param type un type de billet (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix du billet
	 */
	public void calculerPrix(Billet billet)
	{
		double calculPrix = getCoeurAStockage().rechercherPrix(commande,billet.getGareDepart(),billet.getGareArrivee());
		System.out.println(calculPrix);
		int res = ajusterPrix((int) calculPrix ,billet.getReduction(), billet.getType(), billet.getClasse())* getCoeurAStockage().getNbrTitre();
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 * 	Permet de calculer le prix d'un abonnement à partir d'une gare de départ, d'une gare
	 *	d'arrivée, d'une réduction, d'un type, d'une classe et d'une validité
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param reduc une réduction (Reduction)
	 * 	@param type un type d'abonnement (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@param validite une validité (1, 3, 6 ou 12 mois)
	 * 	@return le prix de l'abonnement
	 */
	public void calculerPrix(Abonnement abo)
	{	
		double calculPrix = getCoeurAStockage().rechercherPrix(commande,abo.getGareDepart(), abo.getGareArrivee());	
		int res = ajusterPrix((int) calculPrix ,abo.getReduction(), abo.getType(), abo.getClasse());
		res *= abo.getValidite();	
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 *  Permet de calculer le prix d'un pass illimité à partir d'une classe, d'une réduction,
	 *	d'un type et un nombre de jours
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une réduction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param nbrJours le nombre de jour de validité
	 * 	@return le prix du pass
	 */
	public void calculerPrixIllimite(Pass pass)
	{
		double calculPrix = getCoeurAStockage().rechercherPrix(pass.getTypePass());
		int res = ajusterPrix((int) calculPrix ,pass.getReduction(), pass.getType(), pass.getClasse());
		res *= pass.getNbrJours();	
		getCoeurAStockage().setPrix(res);
	}

	/**
	 * 	Permet de calculer le prix d'un pass dix trajets à partir d'une classe, d'une réduction
	 *	et d'un type
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une réduction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@return le prix du pass
	 */
	public void calculerPrixPass10trajet(Pass pass)
	{
		double calculPrix = getCoeurAStockage().rechercherPrix(pass.getTypePass());
		int res = ajusterPrix((int) calculPrix ,pass.getReduction(), pass.getType(), pass.getClasse());	
		getCoeurAStockage().setPrix(res);
	}
	/**
	 * 	Permet de calculer le prix d'un pass dix trajets entre deux gares à partir d'une gare
	 *	de départ, d'une gare d'arrivée, d'une classe, d'une réduction et d'un type
	 * 	@param gareDepart une gare de départ
	 * 	@param gareArrivee une gare d'arrivée
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une réduction (Reduction)
	 * 	@param type un type de pass (TypeTitre)
	 * 	@return le prix du pass
	 */
	public void calculerPrixPass10Trajets2Gares(Pass pass)
	{	
		double calculPrix = getCoeurAStockage().rechercherPrix(commande,pass.getGareDepart(),pass.getGareArrivee());
		int res = ajusterPrix((int) calculPrix ,pass.getReduction(), pass.getType(), pass.getClasse());		
		getCoeurAStockage().setPrix(res);
	}
	
	/**
	 * 	Permet de calculer le prix d'un Titre de transport en fonction des données entrées
	 *	(le prix de base du titre, la réduction, le type et la classe)
	 * 	@param prix un prix à ajuster (en cents)
	 * 	@param reduc une réduction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix du titre calculé en fonction des données introduites
	 */
	private int ajusterPrix(int prix ,Reduction reduc, TypeTitre type, Classe classe)
	{
		double res= prix;
		res*=100;
		res -= res * (double)reduc.valeur()/100;	
		res -= res * (double)type.valeur()/100;	
		res *= (3-classe.valeur());	
		return (int) res;
	}
}