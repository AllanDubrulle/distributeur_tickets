package coeur;

import stockage.ComposantHorsService;
import stockage.PlusDePapier;

/**
 * Classe EtatImpressionTitre
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatImpressionTitre extends EtatAnnulable 
{	
	private static EtatImpressionTitre instance;
	
	public static EtatImpressionTitre getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatImpressionTitre();
		}
		return (EtatImpressionTitre) instance;
	}
	
	public void entree() 
	{
		try
		{
			Commande commande = Controleur.getInstance().getCommande();
			switch(commande)
			{
			case ACHATABO:
				Controleur.getInstance().getCoeurAStockage().insertionAbonnement();
			case RENOUVELLEMENTABO:
				Controleur.getInstance().getCoeurAStockage().miseAJourValiditeAbonnement();
			default:
				break;
			}
			Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
			int prix = Controleur.getInstance().getCoeurAStockage().getPrix();
			Controleur.getInstance().getCoeurAStockage().setPrix(prix/Controleur.getInstance().getCoeurAStockage().getNbrTitre());
			Controleur.getInstance().getCoeurAGraphique().afficherTitre(Controleur.getInstance().getCommande(),Controleur.getInstance().getCoeurAStockage().getTitre() 
					,Controleur.getInstance().getCoeurAStockage().prixAffichable()); 
			for(int i = 0; i < Controleur.getInstance().getCoeurAStockage().getNbrTitre(); i++)
				Controleur.getInstance().getCoeurAStockage().impression();
			Controleur.getInstance().getCoeurAStockage().setPrix(prix);
			Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
		}
		catch(PlusDePapier e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur();
			Controleur.getInstance().modifEtat(EtatMenu.getInstance());
		} 
		catch (ComposantHorsService e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur(); 
			Controleur.getInstance().modifEtat(EtatMenu.getInstance());
		}
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherViderBacRecep();
	}
	public void choixOk()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherTitre(Controleur.getInstance().getCommande(),Controleur.getInstance().getCoeurAStockage().getTitre() 
				,Controleur.getInstance().getCoeurAStockage().prixAffichable()); 
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
	
}