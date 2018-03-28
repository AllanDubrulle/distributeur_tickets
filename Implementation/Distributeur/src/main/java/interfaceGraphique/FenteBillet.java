package interfaceGraphique;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;

class FenteBillet extends Pane 
{
	private Button bouton, bouton1, bouton0, bouton2;
	private GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();

	
	public FenteBillet(double hauteur, double largeur) 
	{
        Rectangle rectangle = new Rectangle();
        bouton = new Button();
        bouton0 = new Button();
        bouton1 = new Button();
        bouton2 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(60.0*hauteur);
        setPrefWidth(252.5*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setHeight(7.0*hauteur);
        rectangle.setLayoutX(18.7*largeur);
        rectangle.setLayoutY(5.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(220.0*largeur);

        bouton.setLayoutX(5.0*largeur);
        bouton.setLayoutY(24.0*hauteur);
        bouton.setFont(new Font(14.5*hauteur));
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(55.0*largeur);
        bouton.setText("5 eur");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix5eur();
            }
        });

        bouton0.setLayoutX(67.5*largeur);
        bouton0.setLayoutY(24.0*hauteur);
        bouton0.setFont(new Font(14.5*hauteur));
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(55.0*largeur);
        bouton0.setText("10 eur");
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix10eur();
            }
        });

        bouton1.setLayoutX(192.5*largeur);
        bouton1.setLayoutY(24.0*hauteur);
        bouton1.setFont(new Font(14.5*hauteur));
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(55.0*largeur);
        bouton1.setText("50 eur");
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix50eur();
            }
        });

        bouton2.setLayoutX(130.0*largeur);
        bouton2.setLayoutY(24.0*hauteur);
        bouton2.setFont(new Font(14.5*hauteur));
        bouton2.setMnemonicParsing(false);
        bouton2.setPrefHeight(31.0*hauteur);
        bouton2.setPrefWidth(55.0*largeur);
        bouton2.setText("20 eur");
        bouton2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix20eur();
            }
        });

        getChildren().addAll(rectangle, bouton, bouton0, bouton1, bouton2);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
        bouton1.setFocusTraversable(false);
        bouton2.setFocusTraversable(false);
    }
	
	public Button getButton(int i)
	{
		if (i == 0)
			return bouton;
		else if (i == 1)
			return bouton0;
		else if (i == 2)
			return bouton1;
		else
			return bouton2;
		
	}
}