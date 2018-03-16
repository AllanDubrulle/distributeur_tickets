package stockage.imprimable;

import stockage.Valeur;

public enum Reduction implements Valeur // changer les valeurs 
{
	AUCUNE( "Aucune")
	{ public int valeur()
		{ return 0; }
	},
	FAMILLENOMBREUSE( "Famille nombreuses")
	{ public int valeur()
		{ return 50; }
	},
	PMR("Personne à mobilité réduite")
	{ public int valeur()
		{ return 40; }
	}, 
	PARENTEMPLOYE("Parent Employé")
	{ public int valeur()
		{ return 30; }
	}; 
	
	private String name = "";
	   
	Reduction (String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}

}