package stockage;

class FenteBillet 
{
	private CoeurAStockage cAStock;
	
	public FenteBillet (CoeurAStockage cAStock)
	{
		this.cAStock = cAStock;
	}
	
	public void insereBillet() throws ComposantHorsService
	{
		if (!cAStock.estEnMarche(Composant.FENTEBILLET))
			throw new ComposantHorsService("Fente à billets hors service");
	}
}
