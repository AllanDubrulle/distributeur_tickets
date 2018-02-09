package interfaceGraphique;

public abstract class ComposantVisible
{
	private boolean enMarche;
	
	public ComposantVisible(boolean enMarche)
	{
		this.setEnMarche(enMarche);
	}

	public boolean estEnMarche()
	{
		return enMarche;
	}

	public void setEnMarche(boolean enMarche)
	{
		this.enMarche = enMarche;
	}
	
}
