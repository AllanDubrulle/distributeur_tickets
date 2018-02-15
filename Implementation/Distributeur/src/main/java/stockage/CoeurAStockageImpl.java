package stockage;

public class CoeurAStockageImpl implements CoeurAStockage {

	private Carte carte;
	
	public void creerCarte(String id, int codePIN) {
		carte = new Carte(id, codePIN);
	}
	
	public Carte getCarte(){
		return carte;
	}
	
	public void creerBillet() {
		
	}

	public void creerAbonnement() {
		
	}

	public void creerPass() {
		
	}
}
