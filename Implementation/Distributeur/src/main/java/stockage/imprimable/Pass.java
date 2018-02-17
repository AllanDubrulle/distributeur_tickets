package stockage.imprimable;

import java.util.Date;

import stockage.imprimable.TitreDeTransport;

class Pass extends TitreDeTransport
{
	private TypePass typePass;
	
	public Pass(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, int classe, TypeTitre type, Reduction reduction, int montantAPayer,TypePass typePass)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction, montantAPayer);
		this.typePass=typePass;
	}

	public TypePass getTypePass()
	{
		return typePass;
	}
}