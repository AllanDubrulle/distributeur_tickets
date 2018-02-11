package coeur;

class EtatCreationBillet extends EtatCreationTitre 
{
	@Override
	public void entree() 
	{
		controleur.getCoeurAGraphique().afficherCreationBillet();
	}
}
