package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FHoraireMenu extends Ecran 
{
	public FHoraireMenu(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        Text text0 = new Text();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Button button = new Button();
        Button button0 = new Button();
        Button button1 = new Button();
        VBox vBox0 = new VBox();
        Text text1 = new Text();
        Text text2 = new Text();
        Text text3 = new Text();
        Button button2 = new Button();

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

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(44.0*largeur);
        text.setLayoutY(55.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Vérifier un horaire de train");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        text0.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text0.setLayoutX(81.0*largeur);
        text0.setLayoutY(133.0*hauteur);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Sélectionner une option :");
        text0.setFont(new Font(18.0*hauteur));

        hBox.setLayoutX(56.0*largeur);
        hBox.setLayoutY(175.0*hauteur);
        hBox.setPrefHeight(96.0*hauteur);
        hBox.setPrefWidth(729.0*largeur);

        vBox.setPrefHeight(139.0*hauteur);
        vBox.setPrefWidth(172.0*largeur);

        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(185.0*largeur);
        button.setText("Départs");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button, new Insets(0.0, 0.0, 20.0*largeur, 0.0));
        button.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixHoraireDepart();
        	}
        });

        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(237.0*largeur);
        button0.setText("Arrivées");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixHoraireArrivee();
        	}
        });

        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(192.0*largeur);
        button1.setText("Itinéraire");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button1, new Insets(20.0*hauteur, 0.0, 0.0, 0.0));
        button1.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixHoraireItineraire();
        	}
        });

        vBox0.setPrefHeight(125.0*hauteur);
        vBox0.setPrefWidth(531.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(":      Permet de consulter les départs à partir d'une gare");
        text1.setFont(new Font(15.0*hauteur));
        VBox.setMargin(text1, new Insets(5.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(":      Permet de consulter les arrivées dans une gare");
        text2.setFont(new Font(15.0*hauteur));
        VBox.setMargin(text2, new Insets(20.0*hauteur, 0.0, 20.0*hauteur, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(":      Permet de consulter l'horaire d'un itinéraire entre deux gares");
        text3.setFont(new Font(15.0*hauteur));
        VBox.setMargin(text3, new Insets(12.0*hauteur, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox0, new Insets(0.0, 0.0, 0.0, 20.0*largeur));

        button2.setLayoutX(385.0*largeur);
        button2.setLayoutY(344.0*hauteur);
        button2.setMnemonicParsing(false);
        button2.setText("Annuler");
        button2.setFont(new Font(15.0*hauteur));
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixAnnuler();
        	}
        });
        
        vBox.getChildren().addAll(button, button0, button1);
        vBox0.getChildren().addAll(text1, text2, text3);
        hBox.getChildren().addAll(vBox, vBox0);
        getChildren().addAll(rectangle, text, text0, hBox, button2);
        
        button2.setFocusTraversable(false);
    }

	public void actionClavier(int a) 
	{
		if (a == 3)
			graphAC.choixHoraireItineraire();
		else if (a == 1)
			graphAC.choixHoraireDepart();
		else if (a == 2)
			graphAC.choixHoraireArrivee();
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}
}