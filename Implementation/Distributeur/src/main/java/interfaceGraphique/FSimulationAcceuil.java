package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FSimulationAcceuil extends Ecran 
{
    public FSimulationAcceuil(double hauteur, double largeur)
    {
        Rectangle rectangle = new Rectangle();
        Button button = new Button();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(400.0*hauteur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#b2e5ff"));
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        button.setLayoutX(334.0*largeur);
        button.setLayoutY(175.0*hauteur);
        button.setMnemonicParsing(false);
        button.setText("Démarrer");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setFont(new Font(24.0*hauteur));
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixDemarrerSimul();	
            }
        });
        getChildren().addAll(rectangle, button);
    }
	
	public void actionEntrer() 
	{
		graphAC.choixDemarrerSimul();
	}
}