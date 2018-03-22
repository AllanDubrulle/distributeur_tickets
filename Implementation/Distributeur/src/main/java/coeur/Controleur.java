package coeur;

import java.util.Stack;
import interfaceGraphique.CoeurAGraphique;
import interfaceGraphique.CoeurAGraphiqueImpl;
import stockage.BDDTitre;
import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;
import stockage.imprimable.Classe;
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
	 *	Permet de modifier les �tats au fur et � mesure de l'ex�cution : ajout � la pile
	 *	et mise � jour de etatActuel
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
	 */
	public Stack<ControleurEtat> getEtatsPrecedents() 
	{
		return etatsPrecedents;
	}
	
	/**
	 *	Permet de r�cup�rer cette instance de CoeurAGraphiqueImpl
	 */
	public CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}

	/**
	 *	Permet de r�cup�rer cette instance de CoeurAStockageImpl
	 */
	public CoeurAStockage getCoeurAStockage() 
	{
		return coeurAStockage;
	}

	/**
	 *	Permet de r�cup�rer l'�tat dans lequel nous nous trouvons (etatActuel)
	 */
	public ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}

	/**
	 *	Permet de r�cup�rer la commande en cours (billet, abonnement, pass, ...)
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
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, 
			TypeTitre type, Classe classe)
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix= bTitre.calculerPrixBillet(gareDepart, gareArrivee);
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduc, type, classe);
		return  res;
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
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, 
			TypeTitre type, Classe classe, int validite)
	{	
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix = bTitre.calculerPrixAbo(gareDepart, gareArrivee);	
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduc, type, classe);
		res *= validite;	
		return  res;	
	}
	
	/**
	 *  Permet de calculer le prix d'un Pass illimit� � partir d'une classe, d'une r�duction,
	 *	d'un type et un nombre de jours
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type d'abonement (TypeTitre)
	 * 	@param nbrJours le nombre de jour de validit�
	 * 	@return le prix du pass
	 */
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type, int nbrJours)
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix = bTitre.calculerPrixPass("SansRestriction");	
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduction, type, classe);
		res *= nbrJours;	
		return  res;
	}

	/**
	 * 	Permet de calculer le prix d'un Pass 10 trajets � partir d'une classe, d'une r�duction
	 *	et d'un type
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type d'abonnement (TypeTitre)
	 * 	@return le prix du pass
	 */
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type)
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix = bTitre.calculerPrixPass("10Trajets");	
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduction, type, classe);	
		return  res;
	}
	/**
	 * 	Permet de calculer le prix d'un Pass 10 trajets entre deux gares � partir d'une gare
	 *	de d�part, d'une gare d'arriv�e, d'une classe, d'une r�duction et d'un type
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type de pass (TypeTitre)
	 * 	@return le prix du pass
	 */
	public int calculerPrix(String gareDepart, String gareArrivee, Classe classe, 
			Reduction reduction, TypeTitre type)
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix = bTitre.calculerPrixBillet(gareDepart, gareArrivee);	
		System.out.println(calculPrix);
		bTitre.deconnexion();
		calculPrix *=800;
		int res = ajusterPrix((int) calculPrix ,reduction, type, classe);	
		return  res;
	}
	
	/**
	 * 	Permet de calculer le prix d'un Titre de transport en fonction des donn�es entr�es
	 *	(le prix de base du titre, la r�duction, le type et la classe)
	 * 	@param prix un prix � ajuster (en cents)
	 * 	@param reduc une r�duction (Reduction)
	 * 	@param type un type (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix du titre calcul� en fonction des donn�es introduites
	 */
	private int ajusterPrix(int prix ,Reduction reduc, TypeTitre type, Classe classe)
	{
		double res= prix;
		res -= res * (double)reduc.valeur()/100;	
		res -= res * (double)type.valeur()/100;	
		res *= (3-classe.valeur());	
		return (int) res;
	}
}