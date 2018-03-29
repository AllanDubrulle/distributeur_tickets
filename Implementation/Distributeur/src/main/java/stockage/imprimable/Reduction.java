package stockage.imprimable;

import stockage.Valeur;

/**
 *  Enumeration Reduction (reductions possibles d'un titre de transport)
 *  @author TheoDaix, AllanDubrulle, VictorVerhoye
 *  @version 1.0
 */
public enum Reduction implements Valeur
{
	AUCUNE( "Aucune")
	{ public int valeur()
		{ return 0; }
	},
	FAMILLENOMBREUSE( "Famille nombreuse")
	{ public int valeur()
		{ return 50; }
	},
	PMR("Personne a mobilite reduite")
	{ public int valeur()
		{ return 40; }
	}, 
	PARENTEMPLOYE("Parent employe")
	{ public int valeur()
		{ return 30; }
	}; 
	
	private String nom = "";
	   
	Reduction (String nom)
	{
		this.nom = nom;
	}
	
	/**
	 *  Permet de recuperer le nom d'une reduction
	 *  @return nom le nom d'une reduction
	 */
	public String toString()
	{
		return nom;
	}

}