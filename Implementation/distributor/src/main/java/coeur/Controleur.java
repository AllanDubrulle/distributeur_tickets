package coeur;

import interfaceGraphique.CoeurAGraphique;
import interfaceGraphique.CoeurAGraphiqueImpl;

class Controleur 
{
	private ControleurEtat etatPrecedent;
	private ControleurEtat etatActuel;
	private CoeurAGraphique coeurAGraphique = new CoeurAGraphiqueImpl();
	public void modifEtat(ControleurEtat etat) 
	{
		etatPrecedent = etatActuel;
		etatActuel = etat;
		etat.entree();
	}
	public ControleurEtat getEtatPrecedent() 
	{
		return etatPrecedent;
	}
	public CoeurAGraphique getCoeurAGraphique() 
	{
		return coeurAGraphique;
	}
	
}
