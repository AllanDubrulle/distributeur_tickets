package stockage;

class Imprimante extends interfaceGraphique.ComposantVisible
{
	private int nbrImpressions = 250;
	
	
	public int getNbrImpressions() {
		return nbrImpressions;
	}

	public void setNbrImpressions(int nbrImpressions) {
		this.nbrImpressions = nbrImpressions;
	}

	public void imprimer() throws ComposantHorsService, PlusDePapier
	{
		if (!estEnMarche())
		{
			throw new ComposantHorsService("Monnayeur hors service");
		}
		if (getNbrImpressions()==0)
		{
			throw new PlusDePapier("Plus de papier en réserve");
		}
		setNbrImpressions(getNbrImpressions()-1);
	}
	

}