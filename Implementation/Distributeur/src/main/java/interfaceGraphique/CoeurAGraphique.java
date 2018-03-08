package interfaceGraphique;

public interface CoeurAGraphique 
{
	public void afficherAccueil();
	public void afficherMenu();
	public void afficherFin();
	
	public void afficherChoixBillet();
	public void afficherChoixAchatAbo();
	public void afficherChoixRenouvAbo();
	public void afficherChoixPass();
	public void afficherChoixPassIllimite();
	public void afficherChoixPass10Trajets();
	public void afficherChoixPass10Trajets2Gares();
	public void afficherChoixHoraire();
	public void afficherChoixItineraire();
	public void afficherChoixDepart();
	public void afficherChoixArrivee();
	
	public void afficherRecapBillet();
	public void afficherRecapAchatAbo();
	public void afficherRecapRenouvAbo();
	public void afficherRecapRenouvAboScanne();
	public void afficherRecapPassIllimite();
	public void afficherRecapPass10Trajets();
	public void afficherRecapPass10Trajets2Gares();
	
	public void afficherResultatsHoraires();
	
	public void afficherNumAbo();
	public void afficherChoixTaperCode();
	
	public void afficherPaiement();
	public void afficherChoixParLiquide();
	public void afficherChoixParCarte();
	public void afficherInsertionCarte();
	public void afficherAttentePIN();
	public void afficherCodePINIncor();
	public void afficherValidationPaiement();
	public void insererMonnaie(double i);
	public void afficherRendreMonnaie();
	
	public void afficherImpression();
	public void afficherViderBacRecep();
}