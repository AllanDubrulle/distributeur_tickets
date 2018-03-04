package coeur;

import java.util.Stack;

import interfaceGraphique.CoeurAGraphiqueImpl;
import stockage.CoeurAStockageImpl;

class Controleur 
{	
	private ControleurEtat etatActuel = EtatAccueil.getInstance();
	private Stack<ControleurEtat> etatsPrecedents = new Stack<ControleurEtat>();
	private CoeurAGraphiqueImpl coeurAGraphique = CoeurAGraphiqueImpl.getInstance();
	private CoeurAStockageImpl coeurAStockage = new CoeurAStockageImpl();
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
		System.out.println(etat);
		etatsPrecedents.push(etatActuel);
		etatActuel = etat;
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
	
	public CoeurAStockageImpl getCoeurAStockage() 
	{
		return coeurAStockage;
	}
	public ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}
}