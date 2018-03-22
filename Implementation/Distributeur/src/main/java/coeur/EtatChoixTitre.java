package coeur;

/**
 * Classe abstraite EtatChoixTitre
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
abstract class EtatChoixTitre extends EtatAnnulable
{
	public void confirme() 
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	public void valider() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapCommande(Controleur.getInstance().getCommande(),
				Controleur.getInstance().getCoeurAStockage().getTitre(),
				Controleur.getInstance().getCoeurAStockage().prixAffichable(),
				Controleur.getInstance().getCoeurAStockage().getNbrTitre());
	}
	
	public void entree()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixCommande(Controleur.getInstance().getCommande());
	}
}
