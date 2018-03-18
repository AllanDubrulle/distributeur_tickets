package stockage;

class Imprimante 
{
	private int nbrImpressions = 250;
	private CoeurAStockage cAStock;
	
	public Imprimante(CoeurAStockage cAStock)
	{
		this.cAStock = cAStock;
	}	
	public int getNbrImpressions() 
	{
		return nbrImpressions;
	}
	
	public void setNbrImpressions(int nbrImpressions)
	{
		this.nbrImpressions = nbrImpressions;
	}
	
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