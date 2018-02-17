package coeur;

class EtatCreationBillet extends EtatCreationTitre
{	
	public void entree() 
	{
		controleur.getCoeurAGraphique().afficherRecapBillet();
	}
}