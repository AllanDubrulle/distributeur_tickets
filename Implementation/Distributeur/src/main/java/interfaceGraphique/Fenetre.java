package interfaceGraphique;

import coeur.GraphiqueACoeurImpl;
import javafx.scene.layout.Pane;

public abstract class Fenetre extends Pane {
	
    protected GraphiqueACoeurImpl graphAC = new GraphiqueACoeurImpl();
	protected int pos;
    
	public abstract void actionClavier(String a);
	public abstract void actionClavier(int a);
	public abstract void actionRetour();
	public abstract void actionSuivant();
	public abstract void actionEspace();
	public abstract void actionEffacer();
	public abstract void actionEntrer();
}