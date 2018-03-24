package interfaceGraphique;

import javafx.scene.text.*;
import javafx.stage.Stage;
import stockage.ErreurDEncodage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

class FChoixParCarte extends Ecran 
{
    private static TextField textField;
    private Stage stage;
    
    public FChoixParCarte(Stage stage) 
    {
    	this.stage = stage;
        Button button = new Button();
        textField = new TextField();
        Text text = new Text();
        Text text0 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        button.setLayoutX(167.5);
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
        		try 
        		{
					graphAC.infoCarte(textField.getText());
	        		graphAC.choixValider();
	        		stage.close();
				} 
        		catch (ErreurDEncodage e) 
        		{
					text0.setText("Le numéro de carte saisi est incorrect");
				}
        	}
        });

        text0.setFont(new Font("System Bold", 15.0));
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
		text0.setWrappingWidth(200.0);
		text0.setFill(javafx.scene.paint.Color.RED);
		text0.setLayoutX(100.0);
		text0.setLayoutY(160.0);

        textField.setLayoutX(100.0);
        textField.setLayoutY(85.0);
        textField.setPrefWidth(200.0);

        text.setLayoutX(20.0);
        text.setLayoutY(30.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un numéro de carte :");
        text.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, textField, text, text0);
    }

	public void actionClavier(int a) 
	{
		textField.setText(textField.getText() + a);
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

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