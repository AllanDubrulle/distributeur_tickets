package interfaceGraphique;

import javafx.scene.text.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

class FChoixParCarte extends Ecran 
{
    private static FChoixParCarte instance;
    private static TextField textField;
    
    private FChoixParCarte() 
    {
        Button button = new Button();
        Button button0 = new Button();
        textField = new TextField();
        Text text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        button.setLayoutX(315.0);
        button.setLayoutY(160.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Valider");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixValider();
        	}
        });

        button0.setLayoutX(10.0);
        button0.setLayoutY(160.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Annuler");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixAnnuler();
        	}
        });

        textField.setLayoutX(100.0);
        textField.setLayoutY(85.0);
        textField.setPrefWidth(200.0);

        text.setLayoutX(20.0);
        text.setLayoutY(30.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un numéro de carte :");
        text.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, button0, textField, text);
    }
    
    public static FChoixParCarte getInstance() {
    	if (instance == null)
    		instance = new FChoixParCarte();
    	return instance;
    }
    
    public void actionClavier(String a) {}

	public void actionClavier(int a) 
	{
		textField.setText(textField.getText() + a);
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() 
	{
		if (textField.getText().length() > 0)
			textField.setText(textField.getText().substring(0, textField.getText().length()-1));
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValider();
	}
}