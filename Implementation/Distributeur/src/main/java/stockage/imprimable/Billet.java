package stockage.imprimable;

import java.util.Date;

class Billet extends TitreDeTransport
{
	private boolean retour;

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			int montantAPayer,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, montantAPayer);
		this.retour=retour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction, int montantAPayer,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, reduction, montantAPayer);
		this.retour=retour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			int montantAPayer,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, montantAPayer);
		this.retour=retour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			Reduction reduction, int montantAPayer,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction, montantAPayer);
		this.retour=retour;
	}
	
}