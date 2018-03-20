package stockage.imprimable;

import stockage.imprimable.TitreDeTransport;

public class Pass extends TitreDeTransport
{
	private TypePass typePass;
	private String nom;
	
	public Pass(String nom, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction, TypePass typePass)	//10Trajets2Gares
	{
		super(gareDepart, gareArrivee, classe, type, reduction);
		this.nom = nom;
		this.typePass = typePass;
	}
	public Pass(String nom, int nbrJours, Classe classe, TypeTitre type, Reduction reduction, TypePass typePass)		//Illimite
	{
		super(nbrJours, classe, type, reduction);
		this.nom = nom;
		this.typePass = typePass;
	}
	
	public Pass(String nom, Classe classe, TypeTitre type, Reduction reduction, TypePass typePass)		//10Trajets
	{
		super(classe, type, reduction);
		this.nom = nom;
		this.typePass = typePass;
	}
	
	public TypePass getTypePass()
	{
		return typePass;
	}

	public String getNom() 
	{
		return nom;
	}
}