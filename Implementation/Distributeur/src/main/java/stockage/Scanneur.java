package stockage;

class Scanneur 
{
	private CoeurAStockage cAStock;
	
	public Scanneur (CoeurAStockage cAStock)
	{
		this.cAStock = cAStock;
	}
	
	public void scanne() throws ComposantHorsService
	{
		if (!cAStock.estEnMarche(Composant.SCANNEUR))
			throw new ComposantHorsService("Scanneur hors service");
	}
}
