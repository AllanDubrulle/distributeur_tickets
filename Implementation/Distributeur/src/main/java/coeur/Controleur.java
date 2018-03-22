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
	 *	Permet de r�cuper�rer l'instance unique de Controleur (Singleton Design Pattern)
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
	 *	Permet de modifier les �tats au fur et � mesure de l'ex�cution (ajout � la pile
	 *	et mise � jour de etatActuel)
	 *	@param etat un �tat de type ControleurEtat
	 */
	public void modifEtat(ControleurEtat etat) 
	{
		etatsPrecedents.push(etatActuel);
		etatActuel = etat;
		System.out.println(etatActuel);
		etatActuel.entree();
	}
	
	/**
	 *	Permet de r�cup�rer la pile contenant les �tat dans lesquels nous sommes pass�s
	 *	@return etatPrecedents la pile des �tats pr�c�dents
	 */
	public Stack<ControleurEtat> getEtatsPrecedents() 
	{
		return etatsPrecedents;
	}
	
	/**
	 *	Permet de r�cup�rer cette instance de CoeurAGraphiqueImpl
	 *	@return coeurAGraphqique l'instance de coeurAGraphiqueImpl
	 */
	public CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}

	/**
	 *	Permet de r�cup�rer cette instance de CoeurAStockageImpl
	 *	@return coeurAStockage l'instance de coeurAStockageImpl
	 */
	public CoeurAStockage getCoeurAStockage() 
	{
		return coeurAStockage;
	}

	/**
	 *	Permet de r�cup�rer l'�tat dans lequel nous nous trouvons (etatActuel)
	 *	@return etatActuel etat dans lequel nous nous trouvons
	 */
	public ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}

	/**
	 *	Permet de r�cup�rer la commande en cours (billet, abonnement, pass, ...)
	 *	@return commande la commande en cours d'achat
	 */
	public Commande getCommande()
	{
		return this.commande;
	}

	/**
	 *	Permet de mettre � jour la commande en cours
	 *	@param commande une commande (billet, abonnement, pass, ...)
	 */
	public void setCommande(Commande commande)
	{
		this.commande = commande;
	}

	/**
	 *	Permet de r�initialiser la commande pour une �ventuelle seconde utilisation
	 */
	public void reinitialisationCommande()
	{
		this.commande = null;
	}

	/**
	 *	Permet de mettre � jour le mode de paiement (soit liquide ou par carte)
	 *	@param modePaiement un mode de paiement
	 */
	public void setModePaiement(ControleurEtat modePaiement)
	{
		this.modePaiement = modePaiement;	
	}
	
	/**
	 *	Permet de r�cuperer le mode de paiement
	 *	@return modePaiement le mode de paiement utilis�
	 */
	public ControleurEtat getModePaiement()
	{
		return modePaiement;
	}

	/**
	 *	Permet de calculer le prix d'un billet � partir d'une gare de d�part, d'une gare
	 *	d'arriv�e, d'une r�duction, d'un type et d'une classe
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param reduc une r�duction (Reduction)
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
	 * 	Permet de calculer le prix d'un abonnement � partir d'une gare de d�part, d'une gare
	 *	d'arriv�e, d'une r�duction, d'un type, d'une classe et d'une validit�
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param reduc une r�duction (Reduction)
	 * 	@param type un type d'abonnement (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@param validite une validit� (1, 3, 6 ou 12 mois)
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
	 *  Permet de calculer le prix d'un pass illimit� � partir d'une classe, d'une r�duction,
	 *	d'un type et un nombre de jours
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param nbrJours le nombre de jour de validit�
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
	 * 	Permet de calculer le prix d'un pass dix trajets � partir d'une classe, d'une r�duction
	 *	et d'un type
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
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
	 * 	Permet de calculer le prix d'un pass dix trajets entre deux gares � partir d'une gare
	 *	de d�part, d'une gare d'arriv�e, d'une classe, d'une r�duction et d'un type
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
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
	 * 	Permet de calculer le prix d'un Titre de transport en fonction des donn�es entr�es
	 *	(le prix de base du titre, la r�duction, le type et la classe)
	 * 	@param prix un prix � ajuster (en cents)
	 * 	@param reduc une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix du titre calcul� en fonction des donn�es introduites
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