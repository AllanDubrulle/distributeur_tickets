package stockage.imprimable;

import java.util.Date;

public abstract class TitreDeTransport
{
	protected Date dateValidite ;
	protected Date dateExp;
	protected String gareDepart;
	protected String gareArrivee;
	protected Classe classe;
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

	protected TypeTitre type = TypeTitre.STANDARD;
	protected Reduction reduction = Reduction.AUCUNE;

	
	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee,Classe classe, TypeTitre type)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
	}

	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, Reduction reduction)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.reduction = reduction;
	}

	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
	}

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
}