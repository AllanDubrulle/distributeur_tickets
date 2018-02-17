package coeur;

class EtatPaiementLiquide extends EtatAnnulable {
	public void entree()
	{
		controleur.getCoeurAGraphique().afficherChoixParLiquide();
	}
}
