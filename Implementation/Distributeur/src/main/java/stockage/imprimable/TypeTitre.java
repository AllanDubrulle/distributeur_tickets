package stockage.imprimable;

import stockage.Valeur;

public enum TypeTitre implements Valeur // changer les valeurs
{
	STANDARD("Standard"){ public int valeur()
		{ return 0; }
	},
	SENIOR("Senior"){ public int valeur()
		{ return 8; }
	},
	JUNIOR("Junior"){ public int valeur()
		{ return 70; }
	},
	ENFANT("Enfant"){ public int valeur()
		{ return 60; }
	},
	EXCURSION("Excursion"){ public int valeur()
		{ return 20; }
	},
	VELO("Velo"){ public int valeur()
		{ return -10; }
	};
	
	private String name = "";
	   
	TypeTitre (String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}