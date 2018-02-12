package coeur;

public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{
	private Controleur controleur;
	public void choixBillet() 
	{
		controleur.modifEtat(EtatChoixBillet.getInstance());
	}
}
