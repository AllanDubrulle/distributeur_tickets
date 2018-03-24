package interfaceGraphique;

import javafx.scene.text.*;
import javafx.stage.Stage;
import coeur.GraphiqueACoeurImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

class FChoixAbo extends Pane 
{
    private ChoiceBox<String> choiceBox;
    private Stage stage;
    private FAboRenouveler aboRenouv;

    public FChoixAbo(Stage stage, FAboRenouveler aboRenouv)
    {
    	this.stage = stage;
        Button button = new Button();
        choiceBox = new ChoiceBox<String>();
        Text text = new Text();
        choiceBox.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().listeNumeroAbonnement()));

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        button.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
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
            	aboRenouv.setNumAbo(choiceBox.getValue());	
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

        getChildren().addAll(button, choiceBox, text);

    }
	
	public String getNumAbo()
	{
		return choiceBox.getValue();	
	}
}