package coeur;

import java.util.Stack;

import interfaceGraphique.CoeurAGraphique;
import interfaceGraphique.CoeurAGraphiqueImpl;
import stockage.CoeurAStockageImpl;

class Controleur 
{	
	private static ControleurEtat etatActuel = EtatConfiguration.getInstance();
	private static Stack<ControleurEtat> etatsPrecedents;
	private static CoeurAGraphiqueImpl coeurAGraphique = new CoeurAGraphiqueImpl();
	private static CoeurAStockageImpl coeurAStockage = new CoeurAStockageImpl();
	
	public void modifEtat(ControleurEtat etat) 
	{
		etatsPrecedents.push(etatActuel);
		etatActuel = etat;
		etatActuel.entree();
	}
	
	public Stack<ControleurEtat> getEtatsPrecedents() 
	{
		return etatsPrecedents;
	}
	
	public static CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}
	
	public CoeurAStockageImpl getCoeurAStockage() 
	{
		return coeurAStockage;
	}
	public static ControleurEtat getEtatActuel() 
	{
		return etatActuel;
	}
}