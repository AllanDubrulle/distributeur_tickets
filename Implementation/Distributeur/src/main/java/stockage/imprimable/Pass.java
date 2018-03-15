package stockage.imprimable;

import java.util.Date;

import stockage.imprimable.TitreDeTransport;

class Pass extends TitreDeTransport
{
	private TypePass typePass;
	
	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe);
		this.typePass=typePass;
		
	}

	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction,TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, reduction);
		this.typePass=typePass;
	}


	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type);
		this.typePass=typePass;
	}
	
	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction,
			TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.typePass=typePass;
	}

	
	public TypePass getTypePass()
	{
		return typePass;
	}
}