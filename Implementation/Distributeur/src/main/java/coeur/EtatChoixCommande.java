package coeur;

public abstract class EtatChoixCommande extends EtatAnnulable {

	public void valider() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherRecapCommande(Controleur.getInstance().getCommande());
	}
	
	public void entree() 
	{
		Controleur.getInstance().getCoeurAGraphique().afficherChoixCommande(Controleur.getInstance().getCommande());
	}
}
