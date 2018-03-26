package stockage;

class Lecteur 
{
	private CoeurAStockage cAStock;
	
	public Lecteur (CoeurAStockage cAStock)
	{
		this.cAStock = cAStock;
	}
	
	public void lireCarte() throws ComposantHorsService
	{
		if (!cAStock.estEnMarche(Composant.LECTEURCARTE))
			throw new ComposantHorsService("Lecteur de cartes hors service");
	}
}
