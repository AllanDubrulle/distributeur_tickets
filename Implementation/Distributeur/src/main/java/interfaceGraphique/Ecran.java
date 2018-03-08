package interfaceGraphique;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;

abstract class Ecran extends ComposantVisible 
{
	public Ecran(boolean enMarche) 
	{
		super(enMarche);
	}
	
	public Ecran() {};
	
	protected GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();
	protected int pos;
	
	public abstract void actionClavier(String a);
	public abstract void actionClavier(int a);
	public abstract void actionRetour();
	public abstract void actionSuivant();
	public abstract void actionEspace();
	public abstract void actionEffacer();
	public abstract void actionEntrer();
}