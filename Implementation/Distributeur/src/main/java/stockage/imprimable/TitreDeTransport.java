package stockage.imprimable;

import java.util.Date;

public abstract class TitreDeTransport
{
	protected Date dateValidite ;
	protected Date dateExp;
	protected String gareDepart;
	protected String gareArrivee;
	protected Classe classe;
	protected TypeTitre type = TypeTitre.STANDARD;
	protected Reduction reduction = Reduction.AUCUNE;
	protected int montantAPayer;

	
	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee,Classe classe, TypeTitre type, int montantAPayer)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
		this.montantAPayer = montantAPayer;
	}

	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, Reduction reduction, int montantAPayer)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.reduction = reduction;
		this.montantAPayer = montantAPayer;
	}

	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, int montantAPayer)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.montantAPayer = montantAPayer;
	}

	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction, int montantAPayer)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
		this.montantAPayer = montantAPayer;
	}
}