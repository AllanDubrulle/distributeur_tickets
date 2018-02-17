package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;

class FChoixPaiement extends Ecran 
{    
    private static FChoixPaiement instance;

    private FChoixPaiement() 
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
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        text.setLayoutX(60.0);
        text.setLayoutY(75.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un mode de paiement :");
        text.setFont(new Font("System Bold", 22.0));

        button.setLayoutX(150.0);
        button.setLayoutY(170.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(175.0);
        button.setText("Paiement liquide");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setFont(new Font(17.0));
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixPaiementLiquide();
            }
        });

        button0.setLayoutX(475.0);
        button0.setLayoutY(170.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(175.0);
        button0.setText("Paiement par carte");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setFont(new Font(17.0));
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixPaiementParCarte();
            }
        });

        button1.setLayoutX(362.5);
        button1.setLayoutY(333.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(75.0);
        button1.setText("Annuler");
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

    public static FChoixPaiement getInstance() 
    {
    	if(instance == null)
    		instance = new FChoixPaiement();
    	return instance;
    }
    
    public void actionClavier(String a) {}

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

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}