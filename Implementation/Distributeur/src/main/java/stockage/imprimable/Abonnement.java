package stockage.imprimable;

import java.util.Date;

class Abonnement extends TitreDeTransport
{

	private String codeBarre;
	private String nom;
	private String registreNational;
	
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			String codeBarre,String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction,String codeBarre,String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, reduction);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			TypeTitre type,String codeBarre,String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			TypeTitre type, Reduction reduction,String codeBarre,
			String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}

}