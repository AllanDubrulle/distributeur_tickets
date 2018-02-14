package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FPass3 extends Fenetre {

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
    public RadioButton radioButton;
    public RadioButton radioButton0;
    public HBox hBox4;
    public Text text4;
    public TextField textField2;
    public Button button;
    public Button button0;

    public FPass3() {

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
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        hBox4 = new HBox();
        text4 = new Text();
        textField2 = new TextField();
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
        text.setLayoutX(24.0);
        text.setLayoutY(64.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass dix trajets entre deux gares prédéfinies");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        vBox.setLayoutX(53.0);
        vBox.setLayoutY(109.0);
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
        textField.setPrefWidth(250.0);
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0, 129.0));

        hBox1.setPrefHeight(17.0);
        hBox1.setPrefWidth(244.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Gare de départ :");
        HBox.setMargin(text1, new Insets(0.0, 70.0, 0.0, 0.0));

        textField0.setPrefWidth(300.0);
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Gare d'arrivée :");
        HBox.setMargin(text2, new Insets(0.0, 77.0, 0.0, 0.0));

        textField1.setPrefWidth(300.0);
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Classe :");
        HBox.setMargin(text3, new Insets(0.0, 127.0, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1e classe");
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("2e classe");
        HBox.setMargin(radioButton0, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t = new ToggleGroup();
        radioButton.setToggleGroup(t);
        radioButton0.setToggleGroup(t);

        hBox4.setPrefHeight(17.0);
        hBox4.setPrefWidth(244.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        HBox.setMargin(text4, new Insets(0.0));

        textField2.setPrefWidth(250.0);
        HBox.setMargin(textField2, new Insets(0.0, 0.0, 0.0, 100.0));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        button.setLayoutX(23.0);
        button.setLayoutY(354.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Annuler");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixAnnuler();
            }});

        button0.setLayoutX(703.0);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Valider");
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixValider();
            }});

        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, textField0);
        hBox2.getChildren().addAll(text2, textField1);
        hBox3.getChildren().addAll(text3, radioButton, radioButton0);
        hBox4.getChildren().addAll(text4, textField2);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }
}