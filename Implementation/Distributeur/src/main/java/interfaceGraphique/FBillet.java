package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class FBillet extends Fenetre {
    public Rectangle rectangle;
    public VBox vBox;
    public HBox hBox;
    public Text text;
    public TextField textField3;
    public HBox hBox0;
    public Text text0;
    public TextField textField4;
    public HBox hBox1;
    public HBox hBox2;
    public Text text1;
    public RadioButton radioButton;
    public RadioButton radioButton0;
    public HBox hBox3;
    public Text text2;
    public RadioButton radioButton1;
    public RadioButton radioButton2;
    public HBox hBox4;
    public Text text3;
    public TextField textField5;
    public Text text4;
    public TextField textField6;
    public HBox hBox5;
    public Text text5;
    public TextField textField;
    public HBox hBox6;
    public Text text6;
    public TextField textField0;
    public Text text7;
    public TextField textField1;
    public Text text8;
    public TextField textField2;
    public Button button;
    public Button button0;
    public Text text9;
    
    public static FBillet instance;

    private FBillet() {

        rectangle = new Rectangle();
        vBox = new VBox();
        hBox = new HBox();
        text = new Text();
        textField3 = new TextField();
        hBox0 = new HBox();
        text0 = new Text();
        textField4 = new TextField();
        hBox1 = new HBox();
        hBox2 = new HBox();
        text1 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        hBox3 = new HBox();
        text2 = new Text();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        hBox4 = new HBox();
        text3 = new Text();
        textField5 = new TextField();
        text4 = new Text();
        textField6 = new TextField();
        hBox5 = new HBox();
        text5 = new Text();
        textField = new TextField();
        hBox6 = new HBox();
        text6 = new Text();
        textField0 = new TextField();
        text7 = new Text();
        textField1 = new TextField();
        text8 = new Text();
        textField2 = new TextField();
        button = new Button();
        button0 = new Button();
        text9 = new Text();

        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        vBox.setLayoutX(47.0);
        vBox.setLayoutY(83.5);
        vBox.setPrefHeight(258.0);
        vBox.setPrefWidth(711.0);

        hBox.setPrefHeight(17.0);
        hBox.setPrefWidth(244.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        HBox.setMargin(text, new Insets(0.0, 70.0, 0.0, 0.0));

        textField3.setPrefWidth(200.0);
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox0.setPrefHeight(17.0);
        hBox0.setPrefWidth(244.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Gare d'arrivée :");
        HBox.setMargin(text0, new Insets(0.0, 77.0, 0.0, 0.0));

        textField4.setPrefWidth(200.0);
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0);

        hBox2.setPrefHeight(41.0);
        hBox2.setPrefWidth(725.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Aller/ Aller-retour :");
        HBox.setMargin(text1, new Insets(0.0, 52.0, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("Aller");
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Aller-retour");
        HBox.setMargin(radioButton0, new Insets(0.0, 0.0, 0.0, 53.0));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Classe :");
        HBox.setMargin(text2, new Insets(0.0, 127.0, 0.0, 0.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("1e classe");
        radioButton1.setSelected(true);

        radioButton2.setMnemonicParsing(false);
        radioButton2.setText("2e classe");
        HBox.setMargin(radioButton2, new Insets(0.0, 0.0, 0.0, 50.0));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton2.setToggleGroup(t2);
        radioButton1.setToggleGroup(t2);

        hBox4.setPrefHeight(17.0);
        hBox4.setPrefWidth(244.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Type de billet :");
        HBox.setMargin(text3, new Insets(0.0, 77.0, 0.0, 0.0));

        textField5.setPrefWidth(150.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        HBox.setMargin(text4, new Insets(0.0, 0.0, 0.0, 70.0));

        textField6.setPrefWidth(150.0);
        HBox.setMargin(textField6, new Insets(0.0, 0.0, 0.0, 50.0));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(12.0);
        hBox5.setPrefWidth(711.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Nombre de billet(s) : ");
        HBox.setMargin(text5, new Insets(0.0));

        textField.setPrefHeight(31.0);
        textField.setPrefWidth(40.0);
        HBox.setMargin(textField, new Insets(0.0, 0.0, 0.0, 32.0));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox6.setLayoutX(82.0);
        hBox6.setPrefHeight(33.0);
        hBox6.setPrefWidth(711.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Jour de départ :");
        HBox.setMargin(text6, new Insets(0.0, 70.0, 0.0, 0.0));

        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(35.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(" / ");
        HBox.setMargin(text7, new Insets(5.0, 0.0, 0.0, 0.0));

        textField1.setPrefHeight(31.0);
        textField1.setPrefWidth(35.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(" / ");
        HBox.setMargin(text8, new Insets(5.0, 0.0, 0.0, 0.0));

        textField2.setPrefHeight(31.0);
        textField2.setPrefWidth(55.0);
        HBox.setMargin(textField2, new Insets(0.0, 50.0, 0.0, 0.0));

        button.setLayoutX(22.5);
        button.setLayoutY(354.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Annuler");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixAnnuler();
            }});

        button0.setLayoutX(702.5);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Valider");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixValider();
            }});

        text9.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text9.setLayoutX(31.0);
        text9.setLayoutY(58.5);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Achat d'un billet de train");
        text9.setUnderline(true);
        text9.setFont(new Font("System Bold", 22.0));

        hBox.getChildren().addAll(text, textField3);
        hBox0.getChildren().addAll(text0, textField4);
        hBox2.getChildren().addAll(text1, radioButton, radioButton0);
        hBox1.getChildren().add(hBox2);
        hBox3.getChildren().addAll(text2, radioButton1, radioButton2);
        hBox4.getChildren().addAll(text3, textField5, text4, textField6);
        hBox5.getChildren().addAll(text5, textField);
        hBox6.getChildren().addAll(text6, textField0, text7, textField1, text8, textField2);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox3, hBox4, hBox5, hBox6);
        getChildren().addAll(rectangle, vBox, button, button0, text9);
    }

    public static FBillet getInstance() {
    	if (instance == null)
    		instance = new FBillet();
    	return instance;
    }
}