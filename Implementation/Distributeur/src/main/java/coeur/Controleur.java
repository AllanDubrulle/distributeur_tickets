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

class Controleur 
{	
	private ControleurEtat etatActuel = EtatAccueil.getInstance();
	private Stack<ControleurEtat> etatsPrecedents = new Stack<ControleurEtat>();
	private CoeurAGraphique coeurAGraphique = CoeurAGraphiqueImpl.getInstance();
	private CoeurAStockage coeurAStockage = CoeurAStockageImpl.getInstance();
	private static Controleur instance;
	private Commande commande;
	private ControleurEtat modePaiement;
	

	private Controleur() {}
	
	public static Controleur getInstance()
	{
		if(instance==null)
		{
			instance = new Controleur();
		}
		return instance;
	}	
	
	public void modifEtat(ControleurEtat etat) 
	{
		etatsPrecedents.push(etatActuel);
		etatActuel = etat;
		System.out.println(etatActuel);
		etatActuel.entree();
	}
	
	public Stack<ControleurEtat> getEtatsPrecedents() 
	{
		return etatsPrecedents;
	}
	
	public CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}
	
	public CoeurAStockage getCoeurAStockage() 
	{
		return coeurAStockage;
	}
	public ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}

	public Commande getCommande()
	{
		return this.commande;
	}
	
	public void setCommande(Commande commande)
	{
		this.commande = commande;
	}
	
	public void ReinitialisationCommande()
	{
		this.commande = null;
	}

	public void setModePaiement(ControleurEtat modePaiement)
	{
		this.modePaiement = modePaiement;
		
	}

	public ControleurEtat getModePaiement()
	{
		return modePaiement;
	}

	public int calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre type,Classe classe) 	//Billet
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix= bTitre.calculerPrixBillet(gareDepart, gareArrivee);
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduc, type, classe);
		return  res;
	}
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre type, Classe classe, int validite)	//Abonnement
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
	
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type, int nbrJours)		//PassIllimite
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
	
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type)		//Pass10Trajets
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix = bTitre.calculerPrixPass("10Trajets");	
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduction, type, classe);	
		return  res;
	}
	
	public int calculerPrix(String gareDepart, String gareArrivee, Classe classe, Reduction reduction, TypeTitre type)		//Pass10Trajets2Gares
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
	
	private int ajusterPrix(int prix ,Reduction reduc, TypeTitre type, Classe classe)
	{
		double res= prix;
		res -= res * (double)reduc.valeur()/100;	
		res -= res * (double)type.valeur()/100;	
		res *= (3-classe.valeur());	
		return (int) res;
	}
}