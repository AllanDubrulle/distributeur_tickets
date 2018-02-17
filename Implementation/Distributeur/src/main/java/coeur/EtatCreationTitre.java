package coeur;

abstract class EtatCreationTitre extends EtatAnnulable 
{	
	public void confirme() 
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}