package interfaceGraphique;

import javafx.scene.text.*;
import javafx.scene.shape.*;

class FInsererCarte extends Ecran 
{
    public FInsererCarte(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        text.setLayoutX(284.0*largeur);
        text.setLayoutY(193.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Veuillez insérer votre carte");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(231.5*largeur);
        text.setFont(new Font("System Italic", 18.0*hauteur));

        getChildren().addAll(rectangle, text);
    }
    
	public void actionClavier(String a) {}

	public void actionClavier(int a) {}

	public void actionRetour() {}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}