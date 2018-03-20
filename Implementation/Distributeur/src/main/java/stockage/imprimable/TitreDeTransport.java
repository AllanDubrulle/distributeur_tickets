package stockage.imprimable;

import java.util.Date;

public abstract class TitreDeTransport
{
	protected Date dateValidite ;
	protected Date dateExp;
	protected String gareDepart;
	protected String gareArrivee;
	protected Classe classe;
	protected int nbrJours;
	
	public Date getDateValidite()
	{
		return dateValidite;
	}

	public Date getDateExp()
	{
		return dateExp;
	}

	public String getGareDepart()
	{
		return gareDepart;
	}

	public String getGareArrivee()
	{
		return gareArrivee;
	}

	public Classe getClasse()
	{
		return classe;
	}

	public TypeTitre getType()
	{
		return type;
	}

	public Reduction getReduction()
	{
		return reduction;
	}
	public int getNbrJours() 
	{
		return nbrJours;
	}

	protected TypeTitre type;
	protected Reduction reduction;

	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	public TitreDeTransport(Date dateValidite, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.dateValidite = dateValidite;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}

	public TitreDeTransport(int nbrJours, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.nbrJours = nbrJours;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	public TitreDeTransport(Classe classe, TypeTitre type, Reduction reduction)
	{
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	public TitreDeTransport(String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.gareArrivee = gareArrivee;
		this.gareDepart = gareDepart;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
}