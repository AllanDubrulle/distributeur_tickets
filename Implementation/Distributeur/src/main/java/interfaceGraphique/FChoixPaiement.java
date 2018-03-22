package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;

class FChoixPaiement extends Ecran 
{
    public FChoixPaiement(double hauteur, double largeur) 
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

        text.setLayoutX(60.0*largeur);
        text.setLayoutY(75.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un mode de paiement :");
        text.setFont(new Font("System Bold", 22.0*hauteur));

        button.setLayoutX(150.0*largeur);
        button.setLayoutY(170.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(175.0*largeur);
        button.setText("Paiement liquide");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setFont(new Font(17.0*hauteur));
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixPaiementLiquide();
            }
        });

        button0.setLayoutX(475.0*largeur);
        button0.setLayoutY(170.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(175.0*largeur);
        button0.setText("Paiement par carte");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setFont(new Font(17.0*hauteur));
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixPaiementParCarte();
            }
        });

        button1.setLayoutX(362.5*largeur);
        button1.setLayoutY(333.0*hauteur);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(75.0*largeur);
        button1.setText("Annuler");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixAnnuler();
            }
        });

        getChildren().addAll(rectangle, text, button, button0, button1);
    }

	public void actionClavier(int a) 
	{
		if (a == 1)
			graphAC.choixPaiementLiquide();
		if (a == 2)
			graphAC.choixPaiementParCarte();
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}
}