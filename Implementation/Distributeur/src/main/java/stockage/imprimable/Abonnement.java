package stockage.imprimable;

import java.util.Date;

public class Abonnement extends TitreDeTransport
{

	private String codeBarre;
	private String nom;
	private String registreNational;
	
	public Abonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction, TypeTitre type,String codeBarre,
			String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.codeBarre=codeBarre;
		this.nom=nom;
		this.registreNational=registreNational;
	}
	public String getNom() 
	{
		return nom;
	}
	public String getRegNat()
	{
		return registreNational;
	}
	public int getValidite(Date dateVal, Date dateExp)
	{
		return dateExp.getMonth() - dateVal.getMonth();
	}
}