package interfaceGraphique;

import javafx.scene.layout.Pane;
import javafx.scene.shape.*;

/**
 * Classe Reception (permet de representer le bac de reception sur l'interface graphique)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class Reception extends Pane 
{
	/**
	 * 	Constructeur de Reception
	 * 	@param hauteur l'indice de multiplication de hauteur (pour un affichage optimal)
	 * 	@param largeur l'indice de multiplication de largeur (pour un affichage optimal)
	 */
	public Reception(double hauteur, double largeur)
	{
        Rectangle rectangle = new Rectangle();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(50.0*hauteur);
        setPrefWidth(1010.0*largeur);
        
        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setHeight(40.0*hauteur);
        rectangle.setLayoutX(5.0*largeur);
        rectangle.setLayoutY(5.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(1000.0*largeur);
        
        getChildren().add(rectangle);
    }
}