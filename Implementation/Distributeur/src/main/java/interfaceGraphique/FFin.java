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
        Button bouton = new Button();

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

        bouton.setLayoutX(287.0*largeur);
        bouton.setLayoutY(181.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setText("Revenir a l'ecran principal");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setFont(new Font(18.0*hauteur));
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixRetourEcranPrinc();
            }
        });

        getChildren().addAll(rectangle, bouton);
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