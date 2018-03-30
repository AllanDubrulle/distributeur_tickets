package coeur;

import stockage.ComposantHorsService;
import stockage.PasAssezDeMonnaie;

/**
 * Classe EtatPaiementLiquide
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EtatPaiementLiquide extends EtatAnnulable
{
	private static EtatPaiementLiquide instance;
	public static EtatPaiementLiquide getInstance() 
	{
		if (instance ==null)
		{
			instance = new EtatPaiementLiquide();
		}
		return (EtatPaiementLiquide) instance;
	}
	public void entree()
	{
		Controleur.getInstance().setModePaiement(this);
		Controleur.getInstance().getCoeurAStockage().reinitialisation();
		Controleur.getInstance().getCoeurAGraphique().afficherChoixParLiquide(Controleur.getInstance().getCoeurAStockage().montantAPayerAffichable());
	}
	public void inserer(int i)
	{
		try
		{
			Controleur.getInstance().getCoeurAStockage().ajoutMonnaie(i);
			if(Controleur.getInstance().getCoeurAStockage().depassementMontantAPayer())
			{
				Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage()
						.rendreMonnaie());
				Controleur.getInstance().modifEtat(EtatImpressionTitre.getInstance());
			}
			else
			{
				Controleur.getInstance().getCoeurAGraphique().actualiserMontant(
						Controleur.getInstance().getCoeurAStockage().renduAffichable(),
						Controleur.getInstance().getCoeurAStockage().montantRecuAffichable());
			}
		}
		
		catch(PasAssezDeMonnaie e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherRendu(Controleur.getInstance().getCoeurAStockage().rendreMontantRecu());
			Controleur.getInstance().getCoeurAGraphique().afficherRendreMonnaieInseree();
		}
		catch(ComposantHorsService e)
		{
			Controleur.getInstance().getCoeurAGraphique().afficherPanne(e.getMessage());
		}
	}
	public void apres5secOk()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	
	public void apres5sec()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	
	public void retirerFentes()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherMessageDErreur();
	}
}
