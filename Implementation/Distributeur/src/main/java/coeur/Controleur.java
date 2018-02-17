package coeur;

import java.util.Stack;

import interfaceGraphique.CoeurAGraphique;
import interfaceGraphique.CoeurAGraphiqueImpl;
import stockage.CoeurAStockageImpl;

class Controleur 
{	
	private ControleurEtat etatActuel = EtatConfiguration.getInstance();
	private Stack<ControleurEtat> etatsPrecedents;
	private CoeurAGraphiqueImpl coeurAGraphique = new CoeurAGraphiqueImpl();
	private CoeurAStockageImpl coeurAStockage = new CoeurAStockageImpl();
	
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
	
	public CoeurAGraphique getCoeurAGraphique() 
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