package interfaceGraphique;

import java.time.LocalDate;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;
import javafx.scene.layout.Pane;

/**
 * Classe abstraite Ecran (classe parent de toute les fenetres)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
abstract class Ecran extends Pane 
{	
	public Ecran() {}
	
	protected GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();
	protected int pos;
	
	/**
	 * 	Action effectuee lorsque l'on appuie sur une lettre du clavier
	 * 	@param a la lettre sur laquelle on a appuye
	 */
	public void actionClavier(String a) {}

	/**
	 * 	Action effectuee lorsque l'on appuie sur un chiffre du clavier
	 * 	@param a le chiffre sur lequel on a appuye
	 */
	public void actionClavier(int a) {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur la touche "Retour" du clavier
	 */
	public void actionRetour() {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur la touche "Suivant" du clavier
	 */
	public void actionSuivant() {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur la touche "Espace" du clavier
	 */
	public void actionEspace() {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur la touche "Effacer" du clavier
	 */
	public void actionEffacer() {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur la touche "Entrer" du clavier
	 */
	public void actionEntrer() {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur un numero du lecteur de carte
	 * 	@param a le numero sur lequel on a appuye (sur le lecteur de carte)
	 */
	public void actionLecteur(int a) {}
	
	/**
	 * 	Action effectuee lorque l'on appuie sur la touche "Eff." du lecteur de carte
	 */
	public void actionLecteurEff() {}
	
	/**
	 * 	Action effectuee lorque l'on passe du mode tactile au non tactile et vice versa
	 */
	public void mettreToutAJour() {}
	
	/**
	 * 	Permet de verifier si le nom en parametre ne possede pas de chiffre
	 * 	@param nom le nom a verifier
	 * 	@return verif vrai si le nom ne comporte pas de numero, faux sinon
	 */
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

	/**
	 * 	Permet de verifier si la date rentree est bien une date et ulterieure ou egale a celle du
	 * 	jour de l'achat
	 * 	@param jour le jour de la date a verifier
	 * 	@param mois le mois de la date a verifer
	 * 	@param annee l'annee de la date a verifier
	 * 	@return verif vrai si la date est conforme, faux sinon
	 */
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