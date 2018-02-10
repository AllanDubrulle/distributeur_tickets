package Distributeur;

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
    
    public FAboAchat() {

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
        pos = 0;

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
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FMenu fen = new FMenu();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        button0.setLayoutX(702.5);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Valider");

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
    @Override
    public void retour(){
        FMenu fen = new FMenu();
        FSimulation.fenetre = fen;
        getChildren().setAll(fen);
    }
    @Override
    public void valider(){}
    @Override
    public void touche0(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "0");
        }
    }
    @Override
    public void touche1(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "1");
        }
    }
    @Override
    public void touche2(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "2");
        }
    }
    @Override
    public void touche3(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "3");
        }
    }
    @Override
    public void touche4(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "4");
        }
    }
    @Override
    public void touche5(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "5");
        }
    }
    @Override
    public void touche6(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "6");
        }
    }
    @Override
    public void touche7(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "7");
        }
    }
    @Override
    public void touche8(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "8");
        }
    }
    @Override
    public void touche9(){
        if (pos == 1){
            String s = textField0.getText();
            textField0.setText(s + "9");
        }
    }
    @Override
    public void toucheA(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "A");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "A");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "A");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "A");
        }
    }
    @Override
    public void toucheB(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "B");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "B");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "B");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "B");
        }
    }
    @Override
    public void toucheC(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "C");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "C");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "C");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "C");
        }
    }
    @Override
    public void toucheD(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "D");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "D");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "D");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "D");
        }
    }
    @Override
    public void toucheE(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "E");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "E");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "E");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "E");
        }
    }
    @Override
    public void toucheF(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "F");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "F");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "F");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "F");
        }
    }
    @Override
    public void toucheG(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "G");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "G");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "G");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "G");
        }
    }
    @Override
    public void toucheH(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "H");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "H");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "H");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "H");
        }
    }
    @Override
    public void toucheI(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "I");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "I");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "I");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "I");
        }
    }
    @Override
    public void toucheJ(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "J");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "J");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "J");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "J");
        }
    }
    @Override
    public void toucheK(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "K");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "K");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "K");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "K");
        }
    }
    @Override
    public void toucheL(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "L");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "L");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "L");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "L");
        }
    }
    @Override
    public void toucheM(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "M");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "M");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "M");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "M");
        }
    }
    @Override
    public void toucheN(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "N");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "N");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "N");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "N");
        }
    }
    @Override
    public void toucheO(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "O");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "O");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "O");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "O");
        }
    }
    @Override
    public void toucheP(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "P");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "P");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "P");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "P");
        }
    }
    @Override
    public void toucheQ(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "Q");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "Q");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "Q");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "Q");
        }
    }
    @Override
    public void toucheR(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "R");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "R");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "R");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "R");
        }
    }
    @Override
    public void toucheS(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "S");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "S");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "S");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "S");
        }
    }
    @Override
    public void toucheT(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "T");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "T");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "T");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "T");
        }
    }
    @Override
    public void toucheU(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "U");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "U");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "U");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "U");
        }
    }
    @Override
    public void toucheV(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "V");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "V");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "V");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "V");
        }
    }
    @Override
    public void toucheW(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "W");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "W");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "W");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "W");
        }
    }
    @Override
    public void toucheX(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "X");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "X");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "X");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "X");
        }
    }
    @Override
    public void toucheY(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "Y");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "Y");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "Y");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "Y");
        }
    }
    @Override
    public void toucheZ(){
        if (pos == 0){
        	String s = textField.getText();
        	textField.setText(s + "Z");
        }
        else if(pos == 2) {
        	String s = textField1.getText();
        	textField1.setText(s + "Z");
        }
        else if(pos == 3) {
        	String s = textField2.getText();
        	textField2.setText(s + "Z");
        }
        else if(pos == 4) {
        	String s = textField3.getText();
        	textField3.setText(s + "Z");
        }
    }
    @Override
    public void toucheEff(){
        if (pos == 0){
            String s = textField.getText();
            if (s.length()!=0)
                textField.setText(s.substring(0, s.length()-1));
        }
        else if(pos == 1){
            String s = textField0.getText();
            if (s.length()!=0)
                textField0.setText(s.substring(0, s.length()-1));
        }
        else if(pos == 2){
            String s = textField1.getText();
            if (s.length()!=0)
                textField1.setText(s.substring(0, s.length()-1));
        }
        else if(pos == 3){
            String s = textField2.getText();
            if (s.length()!=0)
                textField2.setText(s.substring(0, s.length()-1));
        }
        else if(pos == 4){
            String s = textField3.getText();
            if (s.length()!=0)
                textField3.setText(s.substring(0, s.length()-1));
        }
    }
    @Override
    public void toucheEsp(){
    	if (pos == 0) {
    		String s = textField.getText();
    		textField.setText(s + " ");
    	}
    	else if (pos == 2) {
    		String s = textField1.getText();
    		textField1.setText(s + " ");
    	}
    	else if (pos == 3) {
    		String s = textField2.getText();
    		textField2.setText(s + " ");
    	}
    }
    @Override
    public void toucheSuiv(){
        if (pos == 4)
            pos=0;
        else
            pos++;
    }
    @Override
    public void touche0_1(){}
    @Override
    public void touche1_1(){}
    @Override
    public void touche2_1(){}
    @Override
    public void touche3_1(){}
    @Override
    public void touche4_1(){}
    @Override
    public void touche5_1(){}
    @Override
    public void touche6_1(){}
    @Override
    public void touche7_1(){}
    @Override
    public void touche8_1(){}
    @Override
    public void touche9_1(){}
    @Override
    public void toucheInserer(){}
    @Override
    public void toucheOk(){}
    @Override
    public void toucheEff_1(){}
    @Override
    public void touche1ct(){}
    @Override
    public void touche2ct(){}
    @Override
    public void touche5ct(){}
    @Override
    public void touche10ct(){}
    @Override
    public void touche20ct(){}
    @Override
    public void touche50ct(){}
    @Override
    public void touche1e(){}
    @Override
    public void touche2e(){}
    @Override
    public void touche5e(){}
    @Override
    public void touche10e(){}
    @Override
    public void touche20e(){}
    @Override
    public void touche50e(){}
}
