package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FPassMenu extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public Text text0;
    public HBox hBox;
    public VBox vBox;
    public Button button;
    public Button button0;
    public Button button1;
    public VBox vBox0;
    public Text text1;
    public Text text2;
    public Text text3;
    public Button button2;

    public FPassMenu() {

        rectangle = new Rectangle();
        text = new Text();
        text0 = new Text();
        hBox = new HBox();
        vBox = new VBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        vBox0 = new VBox();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        button2 = new Button();

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
        text.setLayoutX(44.0);
        text.setLayoutY(55.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        text0.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text0.setLayoutX(81.0);
        text0.setLayoutY(133.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Sélectionner un type de pass :");
        text0.setFont(new Font(18.0));

        hBox.setLayoutX(56.0);
        hBox.setLayoutY(175.0);
        hBox.setPrefHeight(96.0);
        hBox.setPrefWidth(729.0);

        vBox.setPrefHeight(139.0);
        vBox.setPrefWidth(172.0);

        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(185.0);
        button.setText("Pass illimité");
        VBox.setMargin(button, new Insets(0.0, 0.0, 20.0, 0.0));
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixPassIllimite();
            }});

        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(237.0);
        button0.setText("Pass 10 trajets");
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixPass10Trajets();
            }});

        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(192.0);
        button1.setText("Pass 10 trajets 2 gares");
        VBox.setMargin(button1, new Insets(20.0, 0.0, 0.0, 0.0));
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixPass10Tajets2Gares();
            }});
        
        vBox0.setPrefHeight(125.0);
        vBox0.setPrefWidth(531.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(":      Permet de voyager librement pendant un certain nombre de jours");
        VBox.setMargin(text1, new Insets(5.0, 0.0, 10.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(":     Permet d'effectuer 10 trajets sans gares prédéfinies");
        VBox.setMargin(text2, new Insets(20.0, 0.0, 20.0, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(":      Permet d'effectuer 10 trajets entre les gares d'arrivée et de départ prédéfinies");
        VBox.setMargin(text3, new Insets(12.0, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox0, new Insets(0.0, 0.0, 0.0, 20.0));

        button2.setLayoutX(385.0);
        button2.setLayoutY(344.0);
        button2.setMnemonicParsing(false);
        button2.setText("Annuler");
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){	
            	graphAC.choixAnnuler();
            }});

        vBox.getChildren().addAll(button, button0, button1);
        vBox0.getChildren().addAll(text1, text2, text3);
        hBox.getChildren().addAll(vBox, vBox0);
        getChildren().addAll(rectangle, text, text0, hBox, button2);
    }
}