package stockage.imprimable;

import java.util.Date;

class Abonnement extends TitreDeTransport
{

	private String codeBarre;
	private String nom;
	private String registreNational;
	
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			int montantAPayer,String codeBarre,String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, montantAPayer);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction, int montantAPayer,String codeBarre,String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, reduction, montantAPayer);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			TypeTitre type, int montantAPayer,String codeBarre,String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, montantAPayer);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			TypeTitre type, Reduction reduction, int montantAPayer,String codeBarre,
			String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction, montantAPayer);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}

}