package coeur;

import java.sql.SQLException;

public class EtatChoixArrivees extends EtatAnnulable 
{
	private static EtatChoixArrivees instance;
	public static EtatChoixArrivees getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixArrivees();
		return (EtatChoixArrivees) instance;
	}
	
	public void valideRechercheGA(String gareArrivee, int heure, int minute) throws SQLException
	{
		String[] tab = Controleur.getInstance().getCoeurAStockage().rechercherHoraireArrivee(gareArrivee, heure, minute);
		Controleur.getInstance().getCoeurAGraphique().afficherResultatsHoraires(tab);
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixArrivee();
	}
}
