package coeur;

class EtatPaiement extends EtatAnnulable 
{
	public static EtatPaiement getInstance() 
	{
		if (instance == null)
			instance = new EtatPaiement();
		return (EtatPaiement) instance;
	}
	public void choixParCarte() 
	{
		controleur.modifEtat(EtatParCarte.getInstance());
	}
	@Override
	public void entree() 
	{
		controleur.getCoeurAGraphique().afficherPaiement();
	}
}
