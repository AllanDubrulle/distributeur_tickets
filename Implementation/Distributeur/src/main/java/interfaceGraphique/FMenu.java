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
    public FMenu(boolean possible, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Button bouton1 = new Button();
        Button bouton2 = new Button();
        Button bouton3 = new Button();
        Text texte = new Text();

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

        bouton.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(250.0*largeur);
        bouton.setText("Acheter un billet");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixBillet();
            }
        });

        bouton0.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(283.0*largeur);
        bouton0.setText("Acheter un abonnement");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton0, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixAchatAbo();
            }
        });

        bouton1.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(288.0*largeur);
        bouton1.setText("Renouveler un abonnement");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton1, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixRenouvAbo();
            }
        });

        bouton2.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        bouton2.setMnemonicParsing(false);
        bouton2.setPrefHeight(31.0*hauteur);
        bouton2.setPrefWidth(300.0*largeur);
        bouton2.setText("Acheter un pass");
        bouton2.setFont(new Font(15.0*hauteur));
        bouton2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton2, new Insets(0.0, 0.0, 5.0*largeur, 0.0));
        bouton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixPass();
            }
        });

        bouton3.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        bouton3.setMnemonicParsing(false);
        bouton3.setPrefHeight(31.0*hauteur);
        bouton3.setPrefWidth(392.0*largeur);
        bouton3.setText("Verifier l'horaire d'un train");
        bouton3.setFont(new Font(15.0*hauteur));
        bouton3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixHoraire();
            }
        });

        texte.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte.setLayoutX(44.0*largeur);
        texte.setLayoutY(62.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Que voulez-vous faire ?");
        texte.setFont(new Font(22.0*hauteur));

<<<<<<< HEAD
        vBox.getChildren().addAll(bouton, bouton0, bouton1, bouton2, bouton3);
        getChildren().addAll(rectangle, vBox, texte);
=======
        if (!possible)
        {
        	button.setDisable(true);
        	button0.setDisable(true);
        	button1.setDisable(true);
        	button2.setDisable(true);
        }
        
        vBox.getChildren().addAll(button, button0, button1, button2, button3);
        getChildren().addAll(rectangle, vBox, text);
        
>>>>>>> a289dbcde9b060828655c4871ecdc8c901e20a70
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