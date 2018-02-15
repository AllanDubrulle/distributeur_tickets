package interfaceGraphique;

import javafx.scene.text.*;
import javafx.scene.control.*;

public class FChoixAbo extends Fenetre {

    protected final Button button;
    protected final Button button0;
    protected final ChoiceBox<String> choiceBox;
    protected final Text text;
    
    public static FChoixAbo instance;

    private FChoixAbo() {

        button = new Button();
        button0 = new Button();
        choiceBox = new ChoiceBox<String>();
        text = new Text();

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

        button0.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        button0.setLayoutX(10.0);
        button0.setLayoutY(160.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Retour");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        choiceBox.setLayoutX(100.0);
        choiceBox.setLayoutY(85.0);
        choiceBox.setPrefWidth(200.0);

        text.setLayoutX(20.0);
        text.setLayoutY(30.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez un num�ro d'abonnement :");
        text.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, button0, choiceBox, text);

    }

    public static FChoixAbo getInstance() {
    	if (instance == null)
    		instance = new FChoixAbo();
    	return instance;
    }
}