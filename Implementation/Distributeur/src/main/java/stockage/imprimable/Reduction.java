package stockage.imprimable;

import stockage.Valeur;

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