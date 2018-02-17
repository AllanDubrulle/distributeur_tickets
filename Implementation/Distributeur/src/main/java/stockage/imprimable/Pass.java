package stockage.imprimable;

import java.util.Date;

import stockage.imprimable.TitreDeTransport;

class Pass extends TitreDeTransport
{
	private TypePass typePass;
	
	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			int montantAPayer,TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, montantAPayer);
		this.typePass=typePass;
		
	}

	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction, int montantAPayer,TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, reduction, montantAPayer);
		this.typePass=typePass;
	}


	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			int montantAPayer,TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, montantAPayer);
		this.typePass=typePass;
	}
	
	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction,
			int montantAPayer,TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction, montantAPayer);
		this.typePass=typePass;
	}

	
	public TypePass getTypePass()
	{
		return typePass;
	}
}