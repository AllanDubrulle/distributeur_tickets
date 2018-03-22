package stockage;

/**
 * Enumération Pieces (différents pièces utilisés lors de l'application)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public enum Pieces implements Valeur 
{
	P1 { public int valeur()
			{ return 1; }
		},
	
	P2 { public int valeur()
		{ return 2; }
		},
	
	P5 { public int valeur()
		{ return 5; }
		},
	
	P10 { public int valeur()
		{ return 10; }
		},
	
	P20 { public int valeur()
		{ return 20; }
		},
	
	P50 { public int valeur()
		{ return 50; }
		},
	
	P100 { public int valeur()
		{ return 100; }
		},
	
	P200 { public int valeur()
		{ return 200; }
		}; 	
}