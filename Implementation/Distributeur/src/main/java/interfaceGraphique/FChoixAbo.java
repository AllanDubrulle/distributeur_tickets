package interfaceGraphique;

import javafx.scene.text.*;
import javafx.stage.Stage;
import coeur.GraphiqueACoeurImpl;
import javafx.collections.FXCollections;
//import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

class FChoixAbo extends Pane 
{
    private ChoiceBox<String> choiceBox;
    private Stage stage;

    public FChoixAbo(Stage stage)
    {
    	this.stage = stage;
        Button button = new Button();
        Button button0 = new Button();
        choiceBox = new ChoiceBox<String>();
        Text text = new Text();
        choiceBox.setItems(FXCollections.observableArrayList("00001", "00002", "00003"));

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        button.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
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
            	GraphiqueACoeurImpl.getInstance().choixValiderNumAbo();
            	stage.close();
            }
        });

        button0.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        button0.setLayoutX(10.0);
        button0.setLayoutY(160.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Retour");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	GraphiqueACoeurImpl.getInstance().choixAnnulerScanner();
            	stage.close();
            }
        });

        choiceBox.setLayoutX(100.0);
        choiceBox.setLayoutY(85.0);
        choiceBox.setPrefWidth(200.0);

        text.setLayoutX(20.0);
        text.setLayoutY(30.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un numéro d'abonnement :");
        text.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, button0, choiceBox, text);

    }
	
	public String getNumAbo()
	{
		return choiceBox.getSelectionModel().getSelectedItem();	
	}
}