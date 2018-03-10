package interfaceGraphique;

import javafx.scene.shape.Rectangle;

class EcranContour extends ComposantVisible
{
	private double hauteur = FenetreConfiguration.getInstance().getHauteur()/850;
	private double largeur = FenetreConfiguration.getInstance().getLargeur()/1350;
	
	private static EcranContour instance;
	
	private EcranContour() 
	{
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle0 = new Rectangle();
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();

		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(460.0*hauteur);
		setPrefWidth(860.0*largeur);

		rectangle.setArcHeight(5.0*hauteur);
		rectangle.setArcWidth(5.0*largeur);
		rectangle.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle.setHeight(450.0*hauteur);
		rectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle.setWidth(28.0*largeur);

		rectangle0.setArcHeight(5.0*hauteur);
		rectangle0.setArcWidth(5.0*largeur);
		rectangle0.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle0.setHeight(450.0*hauteur);
		rectangle0.setLayoutX(822.0*largeur);
		rectangle0.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle0.setWidth(28.0*largeur);

		rectangle1.setArcHeight(5.0*hauteur);
		rectangle1.setArcWidth(5.0*largeur);
		rectangle1.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle1.setHeight(28.0*hauteur);
		rectangle1.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle1.setWidth(850.0*largeur);
		
		rectangle2.setArcHeight(5.0*hauteur);
		rectangle2.setArcWidth(5.0*largeur);
		rectangle2.setFill(javafx.scene.paint.Color.valueOf("#a1a1a1"));
		rectangle2.setHeight(28.0*hauteur);
		rectangle2.setLayoutY(422.0*hauteur);
		rectangle2.setStroke(javafx.scene.paint.Color.TRANSPARENT);
		rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle2.setWidth(850.0*largeur);

		rectangle3.setArcHeight(5.0*hauteur);
		rectangle3.setArcWidth(5.0*largeur);
		rectangle3.setFill(javafx.scene.paint.Color.valueOf("#1f93ff00"));
		rectangle3.setHeight(450.0*hauteur);
		rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
		rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle3.setStrokeWidth(2.0*hauteur);
		rectangle3.setWidth(850.0*largeur);
       
		getChildren().addAll(rectangle, rectangle0, rectangle1, rectangle2, rectangle3);	    
	}
	
	public static EcranContour getInstance()
	{
		if (instance == null)
			instance = new EcranContour();
		return instance;
	}
}
