package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FPass1 extends Fenetre {

    private static FPass1 instance;
    
    private FPass1() {

        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text text0 = new Text();
        TextField textField = new TextField();
        HBox hBox1 = new HBox();
        Text text1 = new Text();
        TextField textField1 = new TextField();
        HBox hBox2 = new HBox();
        Text text2 = new Text();
        TextField textField2 = new TextField();
        HBox hBox3 = new HBox();
        Text text3 = new Text();
        RadioButton radioButton = new RadioButton();
        RadioButton radioButton1 = new RadioButton();
        HBox hBox4 = new HBox();
        Text text4 = new Text();
        TextField textField3 = new TextField();
        HBox hBox5 = new HBox();
        Text text5 = new Text();
        TextField textField0 = new TextField();
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

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(44.0);
        text.setLayoutY(63.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass avec choix du nombre de jours");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        vBox.setLayoutX(78.0);
        vBox.setLayoutY(98.0);
        vBox.setPrefHeight(150.0);
        vBox.setPrefWidth(711.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0);

        hBox0.setPrefHeight(12.0);
        hBox0.setPrefWidth(711.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        HBox.setMargin(text0, new Insets(0.0));

        textField.setPrefHeight(31.0);
        textField.setPrefWidth(300.0);
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0, 161.0));

        hBox1.setPrefHeight(17.0);
        hBox1.setPrefWidth(244.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Gare de départ :");
        HBox.setMargin(text1, new Insets(0.0, 102.0, 0.0, 0.0));

        textField1.setPrefWidth(300.0);
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Gare d'arrivée :");
        HBox.setMargin(text2, new Insets(0.0, 109.0, 0.0, 0.0));

        textField2.setPrefWidth(300.0);
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Classe :");
        HBox.setMargin(text3, new Insets(0.0, 159.0, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1e classe");
        radioButton.setSelected(true);

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("2e classe");
        HBox.setMargin(radioButton1, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t = new ToggleGroup();
        radioButton.setToggleGroup(t);
        radioButton1.setToggleGroup(t);

        hBox4.setPrefHeight(17.0);
        hBox4.setPrefWidth(244.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        HBox.setMargin(text4, new Insets(0.0));

        textField3.setPrefWidth(300.0);
        HBox.setMargin(textField3, new Insets(0.0, 0.0, 0.0, 132.0));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(12.0);
        hBox5.setPrefWidth(711.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Nombre de jours de validité : ");
        HBox.setMargin(text5, new Insets(0.0));

        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(85.0);
        HBox.setMargin(textField0, new Insets(0.0, 0.0, 10.0, 10.0));

        button.setLayoutX(23.0);
        button.setLayoutY(354.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Annuler");
        button.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
            	graphAC.choixAnnuler();
            }});

        button0.setLayoutX(702.5);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Valider");
        button0.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
            	graphAC.choixValider();
            }});

        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, textField1);
        hBox2.getChildren().addAll(text2, textField2);
        hBox3.getChildren().addAll(text3, radioButton, radioButton1);
        hBox4.getChildren().addAll(text4, textField3);
        hBox5.getChildren().addAll(text5, textField0);
        vBox.getChildren().addAll(hBox, hBox1, hBox2, hBox3, hBox4, hBox5);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }

    public static FPass1 getInstance() {
    	if (instance == null)
    		instance = new FPass1();
    	return instance;
    }
    
    public void actionClavier(String a) {}

	public void actionClavier(int a) {}

	public void actionRetour() {}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}