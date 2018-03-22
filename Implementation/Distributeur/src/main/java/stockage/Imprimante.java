package stockage;

/**
 * Classe Imprimante
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class Imprimante 
{
	private int nbrImpressions = 250;
	private CoeurAStockage cAStock;
	
	/**
	 * 	Constructeur de Imprimante
	 * 	@param cAStock une instance de CoeurAStockage à laquelle on va associer l'imprimante
	 */
	public Imprimante(CoeurAStockage cAStock)
	{
		this.cAStock = cAStock;
	}	
	
	/**
	 * 	Permet de récupérer le nombre d'impressions
	 * 	@return nbrImpression le nombre d'impression restantes
	 */
	public int getNbrImpressions() 
	{
		return nbrImpressions;
	}
	
	/**
	 * 	Permet de modifier le nombre d'impressions restantes
	 * 	@param nbrImpressions le nouveau nombre d'impressions
	 */
	public void setNbrImpressions(int nbrImpressions)
	{
		this.nbrImpressions = nbrImpressions;
	}
	
	/**
	 * 	Permet de mettre à jour le compteur de nombre d'impression au fur et à mesure qu'on
	 * 	imprime
	 * 	@throws ComposantHorsService (si le composant est en panne)
	 * 	@throws PlusDePapier (s'il n'y a plus de papier)
	 */
	public void imprimer() throws ComposantHorsService, PlusDePapier
	{
		if(!cAStock.estEnMarche(Composant.IMPRIMANTE))
		{
			throw new ComposantHorsService("Imprimante hors service");
		}
		else if(getNbrImpressions() == 0)
		{
			throw new PlusDePapier("Plus de papier en réserve");
		}
		setNbrImpressions(getNbrImpressions()-1);
	}


}