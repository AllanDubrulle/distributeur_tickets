package interfaceGraphique;

import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FAboRenouv1 extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public Button button;
    public Button button0;

    public static FAboRenouv1 instance;
    
    private FAboRenouv1() {

        rectangle = new Rectangle();
        text = new Text();
        button = new Button();
        button0 = new Button();

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

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(54.0);
        text.setLayoutY(83.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Renouveler un abonnement");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        button.setLayoutX(318.0);
        button.setLayoutY(185.0);
        button.setMnemonicParsing(false);
        button.setText("Scanner le code barre");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixScannerCode();
            }});

        button0.setLayoutX(359.5);
        button0.setLayoutY(349.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Annuler");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixAnnuler();
            }});

        getChildren().addAll(rectangle, text, button, button0);
    }

    public static FAboRenouv1 getInstance() {
    	if (instance == null)
    		instance = new FAboRenouv1();
    	return instance;
    }
}