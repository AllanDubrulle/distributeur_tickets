package stockage;

public class CoeurAStockageImpl implements CoeurAStockage {

	private Carte carte;
	public void creerCarte(String id, int codePIN) 
	{
		carte = new Carte(id, codePIN);
	}
	public Carte getCarte()
	{
		return carte;
	}
	@Override
	public void creerBillet() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void creerAbonnement() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void creerPass() {
		// TODO Auto-generated method stub
		
	}
}
