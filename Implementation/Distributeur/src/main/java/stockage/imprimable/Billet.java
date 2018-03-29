package stockage.imprimable;

import java.util.Date;

/**
 * Classe Billet
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Billet extends TitreDeTransport
{
	private boolean retour;

	/**
	 * 	Constructeur de Billet
	 * 	@param dateValidite la date de depart du billet
	 * 	@param gareDepart la gare de depart du billet
	 * 	@param gareArrivee la gare d'arrivee du billet
	 * 	@param classe la classe du billet (Classe)
	 * 	@param type le type du billet (TypeTitre)
	 * 	@param reduction la reduction du billet (Reduction)
	 * 	@param retour un booleen vrai s'il s'agit d'un aller-retour, faux sinon
	 */
	public Billet(Date dateValidite, String gareDepart, String gareArrivee, Classe classe, TypeTitre type,
			Reduction reduction, boolean retour)
	{
		super(dateValidite, gareDepart, gareArrivee, classe, type, reduction);
		this.retour = retour;
	}
	
	/**
	 * 	Permet de savoir si le billet est un billet aller-retour ou un aller simple
	 * 	@return retour vrai s'il s'agit d'un aller-retour, faux s'il s'agit d'un aller simple
	 */
	public boolean estAllerRetour()
	{
		return retour;
	}
	
}