package coeur;

import java.util.Stack;
import java.time.LocalDate;
import interfaceGraphique.CoeurAGraphique;
import interfaceGraphique.CoeurAGraphiqueImpl;
import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;

class Controleur 
{	
	private ControleurEtat etatActuel = EtatAccueil.getInstance();
	private Stack<ControleurEtat> etatsPrecedents = new Stack<ControleurEtat>();
	private CoeurAGraphique coeurAGraphique = CoeurAGraphiqueImpl.getInstance();
	private CoeurAStockage coeurAStockage = new CoeurAStockageImpl(); // pourquoi pas de singleton ici AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH
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

	public boolean verifierNom(String nom) 
	{
		for(int i = 0; i < nom.length(); i++)
		{
			for (int j = 0; j < 10; j++)
				if (nom.substring(i, i+1).equals(Integer.toString(j)))
					return false;
		}
		return true;
	}

	public boolean verifierDate(int jour, int mois, int annee) 
	{
		boolean res = true;
		if(annee > 2100 || annee < 2000)
			res = false;
		if (mois > 12 || mois == 0)
			res = false;
		if(jour > 31 || jour == 0)
			res = false;
		if (mois == 4 || mois == 6 || mois == 9 || mois == 11)
			if(jour > 30)
				res = false;
		if (mois == 2)
		{
			if (jour > 29)
				res = false;
			else if (annee%4 != 0)
				if (jour > 28)
					res = false;
		}
		LocalDate date = LocalDate.now();
		if (annee < date.getYear())
			res = false;
		else if (annee > date.getYear())
			res = true;
		else
		{
			if (mois < date.getMonth().getValue())
				res = false;
			else if (mois > date.getMonth().getValue())
				res = true;
			else
			{
				if (jour < date.getDayOfMonth())
					res = false;
				else
					res = true;
			}
		}
		return res;
	}
}