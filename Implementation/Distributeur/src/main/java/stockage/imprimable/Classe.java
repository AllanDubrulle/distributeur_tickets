package stockage.imprimable;

import stockage.Valeur;

public enum Classe implements Valeur // changer les valeurs
{
	C1	{ public int valeur()
		{ return 1; }
	},
	C2	{ public int valeur()
		{ return 2; }
	};
}
