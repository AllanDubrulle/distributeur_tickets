package coeur;

import java.util.Stack;

import interfaceGraphique.CoeurAGraphiqueImpl;
import stockage.CoeurAStockage;
import stockage.CoeurAStockageImpl;

class Controleur 
{	
	private ControleurEtat etatActuel = EtatAccueil.getInstance();
	private Stack<ControleurEtat> etatsPrecedents = new Stack<ControleurEtat>();
	private CoeurAGraphiqueImpl coeurAGraphique = CoeurAGraphiqueImpl.getInstance();
	private CoeurAStockage coeurAStockage = new CoeurAStockageImpl(); // pourquoi pas de singleton ici
	private static Controleur instance;
	
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
	
	public CoeurAGraphiqueImpl getCoeurAGraphique() 
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
}