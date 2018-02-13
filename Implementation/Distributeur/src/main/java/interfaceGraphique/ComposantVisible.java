package interfaceGraphique;

import javafx.scene.layout.*;

public abstract class ComposantVisible extends Pane
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
	public ComposantVisible() {};
	
}
