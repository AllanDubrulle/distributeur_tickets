package coeur;

import stockage.Composant;
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
			for(int i = 0; i < Controleur.getInstance().getCoeurAStockage().getNbrTitre(); i++)
				Controleur.getInstance().getCoeurAStockage().impression();
			Controleur.getInstance().getCoeurAGraphique().afficherImpression();
		}
		catch(PlusDePapier e)
		{
			Controleur.getInstance().getCoeurAStockage().actualiserPanne(Composant.IMPRIMANTE);
			Controleur.getInstance().getCoeurAGraphique().imprimanteEnPanne(); 
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
	
	public void apres5secOk()
	{
		Controleur.getInstance().modifEtat(EtatFin.getInstance());
	}

	public void choixOk()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherTitre(Controleur.getInstance().getCommande(),Controleur.getInstance().getCoeurAStockage().getTitre() 
				,Controleur.getInstance().getCoeurAStockage().prixTicketAffichable()); 
		Controleur.getInstance().modifEtat(EtatDemandeRecu.getInstance());
	}
	
}