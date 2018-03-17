package stockage.imprimable;

import java.util.Date;

public class Billet extends TitreDeTransport
{
	private boolean allerRetour;

	public boolean isAllerRetour()
	{
		return allerRetour;
	}

	public Billet(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			Reduction reduction,boolean retour)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.allerRetour=retour;
	}
	
}