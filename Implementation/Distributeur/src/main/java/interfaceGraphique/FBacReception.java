package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;

class FBacReception extends Ecran
{
	public FBacReception(double hauteur, double largeur) 
    {
		Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        Button button = new Button();

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

        texte.setLayoutX(284.0*largeur);
        texte.setLayoutY(144.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Veuillez recuperer votre (vos) ticket(s) dans le bac de reception");
        texte.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte.setWrappingWidth(231.5*largeur);
        texte.setFont(new Font("System Italic", 18.0*hauteur));
        
        button.setLayoutX(377.5*largeur);
        button.setLayoutY(333.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(45.0*largeur);
        button.setText("Ok");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixOk();
            }
        });

        getChildren().addAll(rectangle, texte, button);
        
        button.setFocusTraversable(false);
    }
	public void actionEntrer()
	{
		graphAC.choixOk();
	}
}