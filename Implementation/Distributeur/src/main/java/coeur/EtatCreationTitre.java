package coeur;

class EtatCreationTitre extends EtatAnnulable 
{	
	public void confirme() 
	{
		controleur.modifEtat(EtatPaiement.getInstance());
	}
}