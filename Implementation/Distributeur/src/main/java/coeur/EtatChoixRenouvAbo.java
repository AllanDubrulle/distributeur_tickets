package coeur;

public class EtatChoixRenouvAbo extends EtatChoixTitre
{
	private static EtatChoixRenouvAbo instance;
	
	public static EtatChoixRenouvAbo getInstance() 
	{
		if (instance == null)
				instance = new EtatChoixRenouvAbo();
		return (EtatChoixRenouvAbo) instance;
	}
	
	public void entree() 
	{
		Controleur.getInstance().setCommande(Commande.REVOUVELLEMENTABO);
		super.entree();
	}
	
	public void scanneCode() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherNumAbo();
	}
	
	public void valideNumAbo() 
	{
		Controleur.getInstance().modifEtat(EtatChoixScannerCode2.getInstance());
	}
	
	public void choixTaperCode() 
	{
		Controleur.getInstance().modifEtat(EtatChoixTaperCode.getInstance());
	}
}
