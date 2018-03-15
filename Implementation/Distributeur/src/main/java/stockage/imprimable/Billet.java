package stockage.imprimable;

import java.util.Date;

public class Billet extends TitreDeTransport
{
	private boolean retour;

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe);
		this.retour=retour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, reduction);
		this.retour=retour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type);
		this.retour=retour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			Reduction reduction,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.retour=retour;
	}
	
}