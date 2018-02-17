package stockage.imprimable;

import java.util.Date;

class Billet extends TitreDeTransport
{
	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, int classe, TypeTitre type, Reduction reduction, int montantAPayer) 
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction, montantAPayer);	
	}
	private boolean retour;
}