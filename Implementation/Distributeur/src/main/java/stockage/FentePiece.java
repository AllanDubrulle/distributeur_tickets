package stockage;

class FentePiece 
{
	private CoeurAStockage cAStock;
	
	public FentePiece (CoeurAStockage cAStock)
	{
		this.cAStock = cAStock;
	}
	
	public void inserePiece() throws ComposantHorsService
	{
		if (!cAStock.estEnMarche(Composant.FENTEPIECE))
			throw new ComposantHorsService("Fente a pieces hors service");
	}
}
