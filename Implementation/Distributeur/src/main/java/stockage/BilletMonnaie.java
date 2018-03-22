package stockage;

/**
 * Enum�ration BilletMonnaie (diff�rents billets utilis�s lors de l'application)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public enum BilletMonnaie implements Valeur 
{
	
	B50 { public int valeur()
		{ return 5000; }
	},
	
	B20 { public int valeur()
		{ return 2000; }
	},
	
	B10 { public int valeur()
		{ return 1000; }
	},
	
	B5 { public int valeur()
		{ return 500; }
	};
}