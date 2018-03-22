package interfaceGraphique;

import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.*;

class FMenu extends Ecran 
{
    public FMenu(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        Button button = new Button();
        Button button0 = new Button();
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Text text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#b2e5ff"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        vBox.setLayoutX(74.0*largeur);
        vBox.setLayoutY(119.0*hauteur);
        vBox.setPrefHeight(202.0*hauteur);
        vBox.setPrefWidth(244.0*largeur);

        button.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(250.0*largeur);
        button.setText("Acheter un billet");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixBillet();
            }
        });

        button0.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(283.0*largeur);
        button0.setText("Acheter un abonnement");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button0, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixAchatAbo();
            }
        });

        button1.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(288.0*largeur);
        button1.setText("Renouveler un abonnement");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button1, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixRenouvAbo();
            }
        });

        button2.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0*hauteur);
        button2.setPrefWidth(300.0*largeur);
        button2.setText("Acheter un pass");
        button2.setFont(new Font(15.0*hauteur));
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button2, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        button2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixPass();
            }
        });

        button3.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0*hauteur);
        button3.setPrefWidth(392.0*largeur);
        button3.setText("V�rifier l'horaire d'un train");
        button3.setFont(new Font(15.0*hauteur));
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixHoraire();
            }
        });

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(44.0*largeur);
        text.setLayoutY(62.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Que voulez-vous faire ?");
        text.setFont(new Font(22.0*hauteur));

        vBox.getChildren().addAll(button, button0, button1, button2, button3);
        getChildren().addAll(rectangle, vBox, text);
    }

	public void actionClavier(int a) 
	{
		if (a == 1)
			graphAC.choixBillet();
		else if (a == 2)
			graphAC.choixAchatAbo();
		else if (a == 3)
			graphAC.choixRenouvAbo();
		else if (a == 4)
			graphAC.choixPass();
		else if (a == 5)
			graphAC.choixHoraire();
	}
}