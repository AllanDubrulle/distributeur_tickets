package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FPaiementOk extends Ecran {
    
    private static FPaiementOk instance;

    private FPaiementOk() {

        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        Button button = new Button();
        Button button0 = new Button();

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
        text.setLayoutY(100.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Souhaitez-vous un ticket ?");
        text.setFont(new Font("System Bold", 22.0));

        button.setLayoutX(575.0);
        button.setLayoutY(200.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Non");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixNon();
            }
        });

        button0.setLayoutX(150.0);
        button0.setLayoutY(200.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Oui");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixOui();
            }
        });

        getChildren().addAll(rectangle, text, button, button0);
    }

    public static FPaiementOk getInstance() 
    {
    	if(instance == null)
    		instance = new FPaiementOk();
    	return instance;
    }	
    
    public void actionClavier(String a) {}

	public void actionClavier(int a) 
	{
		if (a == 1)
			graphAC.choixNon();
		else if (a == 2)
			graphAC.choixOui();
	}

	public void actionRetour() {}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}