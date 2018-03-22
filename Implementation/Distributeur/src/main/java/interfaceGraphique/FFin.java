package interfaceGraphique;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.util.Duration;

class FFin extends Ecran 
{
    public FFin(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
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

        button.setLayoutX(287.0*largeur);
        button.setLayoutY(181.0*hauteur);
        button.setMnemonicParsing(false);
        button.setText("Revenir à l'écran principal");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setFont(new Font(18.0*hauteur));
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixRetourEcranPrinc();
            }
        });

        getChildren().addAll(rectangle, button);
        PauseTransition delais = new PauseTransition(Duration.seconds(15));
		delais.setOnFinished( event -> apres15sec());
		delais.play();
    }
    
    private void apres15sec() 
    {
		graphAC.apres15secondes();
    }
	
	public void actionEntrer() 
	{
		graphAC.choixRetourEcranPrinc();
	}
}