package interfaceGraphique;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * Classe EcranContout (represente le contour de l'ecran sur l'interface graphique)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class EcranContour extends Pane
{
	private double hauteur = FenetreConfiguration.getInstance().getHauteur()/850;
	private double largeur = FenetreConfiguration.getInstance().getLargeur()/1350;
	
	private static EcranContour instance;
	
	private EcranContour() 
	{
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();
		Rectangle rectangle4 = new Rectangle();
		Rectangle rectangle5 = new Rectangle();

		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(460.0*hauteur);
		setPrefWidth(860.0*largeur);

		rectangle1.setArcHeight(5.0*hauteur);
		rectangle1.setArcWidth(5.0*largeur);
		rectangle1.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle1.setHeight(450.0*hauteur);
		rectangle1.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle1.setWidth(28.0*largeur);

		rectangle2.setArcHeight(5.0*hauteur);
		rectangle2.setArcWidth(5.0*largeur);
		rectangle2.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle2.setHeight(450.0*hauteur);
		rectangle2.setLayoutX(822.0*largeur);
		rectangle2.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle2.setWidth(28.0*largeur);

		rectangle3.setArcHeight(5.0*hauteur);
		rectangle3.setArcWidth(5.0*largeur);
		rectangle3.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle3.setHeight(28.0*hauteur);
		rectangle3.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle3.setWidth(850.0*largeur);
		
		rectangle4.setArcHeight(5.0*hauteur);
		rectangle4.setArcWidth(5.0*largeur);
		rectangle4.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle4.setHeight(28.0*hauteur);
		rectangle4.setLayoutY(422.0*hauteur);
		rectangle4.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle4.setWidth(850.0*largeur);

		rectangle5.setArcHeight(5.0*hauteur);
		rectangle5.setArcWidth(5.0*largeur);
		rectangle5.setFill(javafx.scene.paint.Color.valueOf("#1f93ff00"));
		rectangle5.setHeight(450.0*hauteur);
		rectangle5.setStroke(javafx.scene.paint.Color.BLACK);
		rectangle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle5.setStrokeWidth(2.0*hauteur);
		rectangle5.setWidth(850.0*largeur);
       
		getChildren().addAll(rectangle1, rectangle2, rectangle3, rectangle4, rectangle5);	    
	}
	
	public static EcranContour getInstance()
	{
		if (instance == null)
			instance = new EcranContour();
		return instance;
	}
}
