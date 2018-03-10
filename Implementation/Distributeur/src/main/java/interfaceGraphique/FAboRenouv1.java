package interfaceGraphique;

import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class FAboRenouv1 extends Ecran 
{   
    public FAboRenouv1(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        Button button = new Button();
        Button button0 = new Button();
        Button button1 = new Button();

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
        text.setLayoutX(54.0*largeur);
        text.setLayoutY(83.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Renouveler un abonnement");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        button.setLayoutX(200.0*largeur);
        button.setLayoutY(150.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefWidth(200.0*largeur);
        button.setPrefHeight(35.0*hauteur);
        button.setText("Scanner le code barre");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixScannerCode();
            }
        });
        
        button1.setLayoutX(200.0*largeur);
        button1.setLayoutY(220.0*hauteur);
        button1.setMnemonicParsing(false);
        button1.setPrefWidth(200.0*largeur);
        button1.setPrefHeight(35.0*hauteur);
        button1.setText("Taper le code");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixTaperCodeAbo();
            }
        });

        button0.setLayoutX(359.5*largeur);
        button0.setLayoutY(349.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(75.0*largeur);
        button0.setText("Annuler");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event)
            {
            	graphAC.choixAnnuler();
            }
        });

        getChildren().addAll(rectangle, text, button, button0, button1);
    }
    
    public void actionClavier(String a) {}

	public void actionClavier(int a) 
	{
		if (a == 1)
			graphAC.choixTaperCodeAbo();
		else if (a == 2)
			graphAC.choixScannerCode();
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}