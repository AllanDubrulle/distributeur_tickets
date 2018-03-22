package stockage.imprimable;

import java.util.Date;

public class Abonnement extends TitreDeTransport
{
	private String nom;
	private String registreNational;
	private int num;
	
	public Abonnement(int num, Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction, TypeTitre type, String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.nom=nom;
		this.registreNational=registreNational;
		this.num = num;
	}
	public String getNom() 
	{
		return nom;
	}
	public String getRegNat()
	{
		return registreNational;
	}
	public int getValidite()
	{
		int val = dateExp.getMonth() - dateValidite.getMonth();
		if (val == 4)
			val = 3;
		else if (val == 7)
			val = 6;
		else if (val == 2)
			val = 1;
		else if (val == 0)
			val = 12;
		return val;
	}
	public int getNum()
	{
		return num;
	}
}