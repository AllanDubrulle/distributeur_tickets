package interfaceGraphique;

import java.time.LocalDate;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;
import javafx.scene.layout.Pane;

abstract class Ecran extends Pane 
{
	/*public Ecran(boolean enMarche) 
	{
		super(enMarche);
	}*/
	
	public Ecran() {}
	
	protected GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();
	protected int pos;
	
	public abstract void actionClavier(String a);
	public abstract void actionClavier(int a);
	public abstract void actionRetour();
	public abstract void actionSuivant();
	public abstract void actionEspace();
	public abstract void actionEffacer();
	public abstract void actionEntrer();
	
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