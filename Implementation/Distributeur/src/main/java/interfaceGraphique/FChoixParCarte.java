package interfaceGraphique;

import javafx.scene.text.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

public class FChoixParCarte extends Fenetre {

    public Button button;
    public Button button0;
    public ChoiceBox<String> choiceBox;
    public Text text;

    public static FChoixParCarte instance;
    
    private FChoixParCarte() {

        button = new Button();
        button0 = new Button();
        choiceBox = new ChoiceBox<String>();
        text = new Text();
        choiceBox.getItems().addAll("0000000001", "0000000002", "0000000003");

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
        button.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixValider();
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
        button0.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixRetour();
        	}
        });

        choiceBox.setLayoutX(100.0);
        choiceBox.setLayoutY(85.0);
        choiceBox.setPrefWidth(200.0);

        text.setLayoutX(20.0);
        text.setLayoutY(30.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un numéro de carte :");
        text.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, button0, choiceBox, text);
    }
    
    public static FChoixParCarte getInstance() {
    	if (instance == null)
    		instance = new FChoixParCarte();
    	return instance;
    }
}
