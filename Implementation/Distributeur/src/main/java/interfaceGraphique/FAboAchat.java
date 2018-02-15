package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FAboAchat extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public VBox vBox;
    public HBox hBox;
    public HBox hBox0;
    public Text text0;
    public TextField textField;
    public HBox hBox1;
    public Text text1;
    public TextField textField0;
    public HBox hBox2;
    public Text text2;
    public TextField textField1;
    public HBox hBox3;
    public Text text3;
    public TextField textField2;
    public HBox hBox4;
    public Text text4;
    public RadioButton radioButton;
    public RadioButton radioButton0;
    public RadioButton radioButton1;
    public RadioButton radioButton2;
    public HBox hBox5;
    public Text text5;
    public RadioButton radioButton3;
    public RadioButton radioButton4;
    public HBox hBox6;
    public Text text6;
    public TextField textField3;
    public Button button;
    public Button button0;
    
    public static FAboAchat instance;
    
    private FAboAchat() {

        rectangle = new Rectangle();
        text = new Text();
        vBox = new VBox();
        hBox = new HBox();
        hBox0 = new HBox();
        text0 = new Text();
        textField = new TextField();
        hBox1 = new HBox();
        text1 = new Text();
        textField0 = new TextField();
        hBox2 = new HBox();
        text2 = new Text();
        textField1 = new TextField();
        hBox3 = new HBox();
        text3 = new Text();
        textField2 = new TextField();
        hBox4 = new HBox();
        text4 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        hBox5 = new HBox();
        text5 = new Text();
        radioButton3 = new RadioButton();
        radioButton4 = new RadioButton();
        hBox6 = new HBox();
        text6 = new Text();
        textField3 = new TextField();
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
        text.setLayoutY(60.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un abonnement");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        vBox.setLayoutX(60.0);
        vBox.setLayoutY(78.0);
        vBox.setPrefHeight(219.0);
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
        textField.setPromptText("Entrez votre nom.");
        textField.setPrefColumnCount(50);
        textField.getText();
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0, 159.0));

        hBox1.setPrefHeight(12.0);
        hBox1.setPrefWidth(711.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Numéro de registre national : ");
        HBox.setMargin(text1, new Insets(0.0));

        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(300.0);
        textField0.setPromptText("Entrez votre numéro de registre nationnal.");
        textField0.setPrefColumnCount(50);
        textField0.getText();
        HBox.setMargin(textField0, new Insets(0.0, 0.0, 10.0, 6.0));

        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Gare de départ :");
        HBox.setMargin(text2, new Insets(0.0, 70.0, 0.0, 0.0));

        textField1.setPrefWidth(300.0);
        textField1.setPromptText("Entrez la gare de départ.");
        textField1.setPrefColumnCount(50);
        textField1.getText();
        HBox.setMargin(textField1, new Insets(0.0, 0.0, 0.0, 30.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Gare d'arrivée :");
        HBox.setMargin(text3, new Insets(0.0, 77.0, 0.0, 0.0));

        textField2.setPrefWidth(300.0);
        textField2.setPromptText("Entrez la gare d'arrivée.");
        textField2.setPrefColumnCount(50);
        textField2.getText();
        HBox.setMargin(textField2, new Insets(0.0, 0.0, 0.0, 30.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox4.setPrefHeight(41.0);
        hBox4.setPrefWidth(725.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Validité de l'abonnement :");
        HBox.setMargin(text4, new Insets(0.0, 31.0, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1 mois");
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("3 mois");
        HBox.setMargin(radioButton0, new Insets(0.0, 15.0, 0.0, 65.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("6 mois");
        HBox.setMargin(radioButton1, new Insets(0.0, 15.0, 0.0, 50.0));

        radioButton2.setMnemonicParsing(false);
        radioButton2.setText("12 mois");
        HBox.setMargin(radioButton2, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);
        radioButton1.setToggleGroup(t1);
        radioButton2.setToggleGroup(t1);

        hBox5.setPrefHeight(17.0);
        hBox5.setPrefWidth(244.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Classe :");
        HBox.setMargin(text5, new Insets(0.0, 157.0, 0.0, 0.0));

        radioButton3.setMnemonicParsing(false);
        radioButton3.setText("1e classe");
        radioButton3.setSelected(true);

        radioButton4.setMnemonicParsing(false);
        radioButton4.setText("2e classe");
        HBox.setMargin(radioButton4, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton3.setToggleGroup(t2);
        radioButton4.setToggleGroup(t2);

        hBox6.setPrefHeight(17.0);
        hBox6.setPrefWidth(244.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Réduction :");
        HBox.setMargin(text6, new Insets(0.0));

        textField3.setPrefWidth(300.0);
        textField3.setPromptText("Entrez un type de réduction.");
        textField3.setPrefColumnCount(50);
        textField3.getText();
        HBox.setMargin(textField3, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox6.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        button.setLayoutX(23.0);
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

        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, textField0);
        hBox2.getChildren().addAll(text2, textField1);
        hBox3.getChildren().addAll(text3, textField2);
        hBox4.getChildren().addAll(text4, radioButton, radioButton0, radioButton1, radioButton2);
        hBox5.getChildren().addAll(text5, radioButton3, radioButton4);
        hBox6.getChildren().addAll(text6, textField3);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }

    public static FAboAchat getInstance() {
    	if (instance == null)
    		instance = new FAboAchat();
    	return instance;
    }
}