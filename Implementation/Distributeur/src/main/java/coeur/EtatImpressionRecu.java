package coeur;

import stockage.ComposantHorsService;
import stockage.PlusDePapier;

/**
 * Classe EtatImpressionRecu
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class EtatImpressionRecu extends ControleurEtat
{
	private static  EtatImpressionRecu instance;
	
	public static  EtatImpressionRecu getInstance() 
	{
		if (instance == null)
			instance = new  EtatImpressionRecu();
		return ( EtatImpressionRecu) instance;
	}
	
	public void entree() 
	{
		try
		{
			Controleur.getInstance().getCoeurAStockage().impression();
			Controleur.getInstance().getCoeurAGraphique().afficherImpression();
		}
		catch(PlusDePapier e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur();
		} 
		catch (ComposantHorsService e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur(); 
		}	
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
	
	public void choixOk()
	{
		if (Controleur.getInstance().getModePaiement() == EtatPaiementLiquide.getInstance())
		{
		Controleur.getInstance().getCoeurAGraphique().afficherRecu(Controleur.getInstance().getCoeurAStockage().prixAffichable(),
				Controleur.getInstance().getCoeurAStockage().introduitAffichable(),
				Controleur.getInstance().getCoeurAStockage().renduAffichable(),"Liquide"); 
		}
		else
		{
			Controleur.getInstance().getCoeurAGraphique().afficherRecu(Controleur.getInstance().getCoeurAStockage().prixAffichable(),
					Controleur.getInstance().getCoeurAStockage().introduitAffichable(),
					Controleur.getInstance().getCoeurAStockage().renduAffichable(),"Carte"); 
		}
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}
	
	
}
