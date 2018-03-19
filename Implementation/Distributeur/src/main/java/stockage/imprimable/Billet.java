package stockage.imprimable;

import java.util.Date;

public class Billet extends TitreDeTransport
{
	private boolean allerRetour;

	public boolean estAllerRetour()
	{
		return allerRetour;
	}

	public Billet(Date dateValidite, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			Reduction reduction,boolean retour)
	{
		super(dateValidite, gareDepart, gareArrivee, classe, type, reduction);
		this.allerRetour=retour;
	}
	
}