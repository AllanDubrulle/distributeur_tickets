package stockage.imprimable;

import stockage.Valeur;

/**
 *  Enumeration Classe (classes d'un titre de transport)
 *  @author TheoDaix, AllanDubrulle, VictorVerhoye
 *	@version 1.0
 */
public enum Classe implements Valeur
{
	C1	{ public int valeur()
		{ return 1; }
	},
	C2	{ public int valeur()
		{ return 2; }
	};
}
