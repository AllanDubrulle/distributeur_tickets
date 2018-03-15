package stockage.imprimable;

import stockage.Valeur;

public enum TypeTitre implements Valeur // changer les valeurs
{
	STANDARD("Standard"){ public int valeur()
		{ return 100; }
	},
	SENIOR("Senior"){ public int valeur()
		{ return 8; }
	},
	JUNIOR("Junior"){ public int valeur()
		{ return 100; }
	},
	ENFANT("Enfant"){ public int valeur()
		{ return 100; }
	},
	EXCURSION("Excursion"){ public int valeur()
		{ return 100; }
	},
	VELO("Velo"){ public int valeur()
		{ return 100; }
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