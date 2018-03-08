package interfaceGraphique;

import javafx.scene.shape.Rectangle;

class Scanneur extends ComposantVisible 
{
	private static Scanneur instance;

	public Scanneur(boolean enMarche) 
	{
		super(enMarche);
	}
	
	private Scanneur(double hauteur, double largeur)
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

	public static Scanneur getInstance(double hauteur, double largeur) 
	{
		if (instance == null)
			instance = new Scanneur(hauteur, largeur);
		return instance;
	}
}