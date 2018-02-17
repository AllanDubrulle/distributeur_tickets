package stockage.imprimable;

import java.util.Date;

class Abonnement extends TitreDeTransport
{
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, int classe, TypeTitre type, Reduction reduction, int montantAPayer) 
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction, montantAPayer);
	}
	private String codeBarre;
	private String nom;
	private String registreNational;
}