package interfaceGraphique;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;
import javafx.scene.layout.*;

public abstract class ComposantVisible extends Pane 
{	
	private boolean enMarche;
	protected GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance(); 
	
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