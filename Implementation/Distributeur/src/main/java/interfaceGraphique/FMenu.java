package interfaceGraphique;

import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.*;

public class FMenu extends Fenetre {

    public Rectangle rectangle;
    public VBox vBox;
    public Button button;
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Text text;

    public static FMenu instance;
    
    private FMenu() {

        rectangle = new Rectangle();
        vBox = new VBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#b2e5ff"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        vBox.setLayoutX(74.0);
        vBox.setLayoutY(119.0);
        vBox.setPrefHeight(202.0);
        vBox.setPrefWidth(244.0);

        button.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(250.0);
        button.setText("Acheter un billet");
        VBox.setMargin(button, new Insets(0.0, 0.0, 5.0, 0.0));
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixBillet();
            }});

        button0.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(283.0);
        button0.setText("Acheter un abonnement");
        VBox.setMargin(button0, new Insets(0.0, 0.0, 5.0, 0.0));
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixAchatAbo();
            }});

        button1.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(288.0);
        button1.setText("Renouveler un abonnement");
        VBox.setMargin(button1, new Insets(0.0, 0.0, 5.0, 0.0));
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixRenouvAbo();
            }});

        button2.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(300.0);
        button2.setText("Acheter un pass");
        VBox.setMargin(button2, new Insets(0.0, 0.0, 5.0, 0.0));
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixPass();
            }});

        button3.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0);
        button3.setPrefWidth(392.0);
        button3.setText("Vérifier l'horaire d'un train");
        button3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixHoraire();
            }});

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(44.0);
        text.setLayoutY(62.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Que voulez-vous faire ?");
        text.setFont(new Font(22.0));

        vBox.getChildren().addAll(button, button0, button1, button2, button3);
        getChildren().addAll(rectangle, vBox, text);
    }

    public static FMenu getInstance() {
    	if (instance == null)
    		instance = new FMenu();
    	return instance;
    }
}