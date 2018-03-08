package interfaceGraphique;

import javafx.scene.shape.*;

class Reception extends ComposantVisible 
{
	private static Reception instance;
	
	public Reception(boolean enMarche) 
	{
		super(enMarche);
	}
	
	private Reception(double hauteur, double largeur)
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

	public static Reception getInstance(double hauteur, double largeur) 
	{
		if (instance == null)
			instance = new Reception(hauteur, largeur);
		return instance;
	}
}