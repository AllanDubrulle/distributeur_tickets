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
	
	public void actionClavier(String a) {}
	public void actionClavier(int a) {}
	public void actionRetour() {}
	public void actionSuivant() {}
	public void actionEspace() {}
	public void actionEffacer() {}
	public void actionEntrer() {}
	public void mettreToutAJour() {}
	
	public void actionLecteur(int a) {}
	public void actionLecteurEff() {}
	
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
		if(annee >= 2100 || annee < 2000 || mois > 12 || mois == 0 || jour > 31 || jour == 0)
			return false;
		if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 30)
			return false;
		if (mois == 2)
		{
			if (jour > 29)
				return false;
			else if (annee%4 != 0)
				if (jour > 28)
					return false;
		}
		LocalDate date = LocalDate.now();
		if (annee < date.getYear())
			return false;
		else if (annee > date.getYear())
			return true;
		else
		{
			if (mois < date.getMonth().getValue())
				return false;
			else if (mois > date.getMonth().getValue())
				return true;
			else
			{
				if (jour < date.getDayOfMonth())
					return false;
				else
					return true;
			}
		}
	}
}