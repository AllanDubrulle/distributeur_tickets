package coeur;

class EtatCreationBillet extends EtatCreationTitre
{	
	public void entree() 
	{
		controleur.getCoeurAGraphique().afficherRecapBillet();
	}
	public void confirmeBillet()
	{
		controleur.modifEtat(EtatPaiement.getInstance());
	}
}