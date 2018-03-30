package stockage.imprimable;

import stockage.Valeur;

/**
 *  Enumeration TypePass (types de pass possibles pour un pass)
 *  @author TheoDaix, AllanDubrulle, VictorVerhoye
 *  @version 1.0
 */
public enum TypeTitre implements Valeur
{
	STANDARD("Standard"){ public int valeur()
		{ return 0; }
	},
	JUNIOR("Junior"){ public int valeur()
		{ return 70; }
	},
	ENFANT("Enfant"){ public int valeur()
		{ return 60; }
	},
	ETUDIANT("Etudiant"){ public int valeur()
		{ return 30; }
	},

	SENIOR("Senior"){ public int valeur()
		{ return 8; }
	},
	EXCURSION("Excursion"){ public int valeur()
		{ return 20; }
	},
	VELO("Velo"){ public int valeur()
		{ return -10; }
	};
	
	private String nom = "";
	   
	TypeTitre (String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * 	Permet de recuperer le nom d'un type de titre
	 *  @return nom le nom d'un type de titre
	 */
	public String toString()
	{
		return nom;
	}
}