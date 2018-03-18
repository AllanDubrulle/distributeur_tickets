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
	private Button button, button1, button0, button2;
	private GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();

	
	public FenteBillet(double hauteur, double largeur) 
	{
        Rectangle rectangle = new Rectangle();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(60.0*hauteur);
        setPrefWidth(232.5*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setHeight(7.0*hauteur);
        rectangle.setLayoutX(18.7*largeur);
        rectangle.setLayoutY(5.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0*largeur);

        button.setLayoutX(5.0*largeur);
        button.setLayoutY(24.0*hauteur);
        button.setFont(new Font(15.0*hauteur));
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(50.0*largeur);
        button.setText("5 €");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix5eur();
            }
        });

        button0.setLayoutX(62.5*largeur);
        button0.setLayoutY(24.0*hauteur);
        button0.setFont(new Font(15.0*hauteur));
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(50.0*largeur);
        button0.setText("10 €");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix10eur();
            }
        });

        button1.setLayoutX(177.5*largeur);
        button1.setLayoutY(24.0*hauteur);
        button1.setFont(new Font(15.0*hauteur));
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(50.0*largeur);
        button1.setText("50 €");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix50eur();
            }
        });

        button2.setLayoutX(120.0*largeur);
        button2.setLayoutY(24.0*hauteur);
        button2.setFont(new Font(15.0*hauteur));
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0*hauteur);
        button2.setPrefWidth(50.0*largeur);
        button2.setText("20 €");
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix20eur();
            }
        });

        getChildren().addAll(rectangle, button, button0, button1, button2);
    }
	
	public Button getButton(int i)
	{
		if (i == 0)
			return button;
		else if (i == 1)
			return button0;
		else if (i == 2)
			return button1;
		else
			return button2;
		
	}
}