package interfaceGraphique;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * Classe Scanneur (permet de representer le bac de reception sur l'interface graphique)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class Scanneur extends Pane 
{
	/**
	 * 	Constructeur de Scanneur
	 * 	@param hauteur l'indice de multiplication de hauteur (pour un affichage optimal)
	 * 	@param largeur l'indice de multiplication de largeur (pour un affichage optimal)
	 */
	public Scanneur(double hauteur, double largeur)
	{
		Rectangle rectangle = new Rectangle();
    
		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(80.0*hauteur);
		setPrefWidth(210.0*largeur);
    
		rectangle.setArcHeight(25.0*hauteur);
		rectangle.setArcWidth(25.0*largeur);
		rectangle.setHeight(70.0*hauteur);
		rectangle.setLayoutX(0.0*largeur);
		rectangle.setLayoutY(0.0*hauteur);
		rectangle.setStroke(javafx.scene.paint.Color.BLACK);
		rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle.setWidth(200.0*largeur);
		
		getChildren().add(rectangle);
	}
}