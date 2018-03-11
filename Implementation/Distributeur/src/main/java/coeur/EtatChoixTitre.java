package coeur;

public abstract class EtatChoixTitre extends EtatAnnulable
{
	public void confirme() 
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
	public void valider() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapCommande(Controleur.getInstance().getCommande());
	}
	
	public void entree()
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixCommande(Controleur.getInstance().getCommande());
	}
}
