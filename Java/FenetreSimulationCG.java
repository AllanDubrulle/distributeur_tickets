package Distributeur;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import java.lang.*;
import javafx.scene.layout.*;

public class FenetreSimulationCG extends BorderPane {

    protected final Pane pane;
    protected final Rectangle rectangle;
    protected final VBox vBox;
    protected final PasswordField passwordField;
    protected final HBox hBox;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final HBox hBox0;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final HBox hBox1;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final HBox hBox2;
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;
    protected final Button button11;
    protected final Pane pane0;
    protected final Rectangle rectangle0;
    protected final VBox vBox0;
    protected final Button button12;
    protected final Button button13;
    protected final Button button14;
    protected final Button button15;
    protected final Button button16;
    protected final Text text;
    protected final Circle circle;
    protected final Rectangle rectangle1;
    protected final Button button17;
    protected final Button button18;
    protected final Button button19;
    protected final Button button110;
    protected final Button button111;
    protected final Button button112;
    protected final Button button113;
    protected final Button button114;
    protected final Rectangle rectangle2;
    protected final Button button115;
    protected final Button button116;
    protected final Button button117;
    protected final Button button118;
    protected final Rectangle rectangle3;
    protected final Pane pane1;
    protected final Rectangle rectangle4;
    protected final VBox vBox1;
    protected final HBox hBox3;
    protected final Button button119;
    protected final Button button1110;
    protected final Button button1111;
    protected final Button button1112;
    protected final Button button1113;
    protected final Button button1114;
    protected final Button button1115;
    protected final Button button1116;
    protected final Button button1117;
    protected final Button button1118;
    protected final HBox hBox4;
    protected final Button button1119;
    protected final Button button11110;
    protected final Button button11111;
    protected final Button button11112;
    protected final Button button11113;
    protected final Button button11114;
    protected final Button button11115;
    protected final Button button11116;
    protected final Button button11117;
    protected final Button button11118;
    protected final HBox hBox5;
    protected final Button button11119;
    protected final Button button111110;
    protected final Button button111111;
    protected final Button button111112;
    protected final Button button111113;
    protected final Button button111114;
    protected final Button button111115;
    protected final HBox hBox6;
    protected final Button button111116;
    protected final Pane pane2;
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final CheckMenuItem checkMenuItem;
    protected final CheckMenuItem checkMenuItem0;
    protected final CheckMenuItem checkMenuItem1;
    protected final CheckMenuItem checkMenuItem2;
    protected final CheckMenuItem checkMenuItem3;
    protected final CheckMenuItem checkMenuItem4;

    public FenetreSimulationCG() {

        pane = new Pane();
        rectangle = new Rectangle();
        vBox = new VBox();
        passwordField = new PasswordField();
        hBox = new HBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        hBox0 = new HBox();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        hBox1 = new HBox();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        hBox2 = new HBox();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
        button11 = new Button();
        pane0 = new Pane();
        rectangle0 = new Rectangle();
        vBox0 = new VBox();
        button12 = new Button();
        button13 = new Button();
        button14 = new Button();
        button15 = new Button();
        button16 = new Button();
        text = new Text();
        circle = new Circle();
        rectangle1 = new Rectangle();
        button17 = new Button();
        button18 = new Button();
        button19 = new Button();
        button110 = new Button();
        button111 = new Button();
        button112 = new Button();
        button113 = new Button();
        button114 = new Button();
        rectangle2 = new Rectangle();
        button115 = new Button();
        button116 = new Button();
        button117 = new Button();
        button118 = new Button();
        rectangle3 = new Rectangle();
        pane1 = new Pane();
        rectangle4 = new Rectangle();
        vBox1 = new VBox();
        hBox3 = new HBox();
        button119 = new Button();
        button1110 = new Button();
        button1111 = new Button();
        button1112 = new Button();
        button1113 = new Button();
        button1114 = new Button();
        button1115 = new Button();
        button1116 = new Button();
        button1117 = new Button();
        button1118 = new Button();
        hBox4 = new HBox();
        button1119 = new Button();
        button11110 = new Button();
        button11111 = new Button();
        button11112 = new Button();
        button11113 = new Button();
        button11114 = new Button();
        button11115 = new Button();
        button11116 = new Button();
        button11117 = new Button();
        button11118 = new Button();
        hBox5 = new HBox();
        button11119 = new Button();
        button111110 = new Button();
        button111111 = new Button();
        button111112 = new Button();
        button111113 = new Button();
        button111114 = new Button();
        button111115 = new Button();
        hBox6 = new HBox();
        button111116 = new Button();
        pane2 = new Pane();
        menuBar = new MenuBar();
        menu = new Menu();
        checkMenuItem = new CheckMenuItem();
        checkMenuItem0 = new CheckMenuItem();
        checkMenuItem1 = new CheckMenuItem();
        checkMenuItem2 = new CheckMenuItem();
        checkMenuItem3 = new CheckMenuItem();
        checkMenuItem4 = new CheckMenuItem();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(1300.0);

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(200.0);
        pane.setPrefWidth(200.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle.setHeight(250.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0);

        vBox.setPrefHeight(800.0);
        vBox.setPrefWidth(205.0);

        VBox.setMargin(passwordField, new Insets(10.0, 20.0, 10.0, 20.0));

        hBox.setPrefHeight(37.0);
        hBox.setPrefWidth(205.0);

        button.setMnemonicParsing(false);
        button.setText("1");
        HBox.setMargin(button, new Insets(0.0));

        button0.setMnemonicParsing(false);
        button0.setText("2");
        HBox.setMargin(button0, new Insets(0.0, 10.0, 0.0, 10.0));

        button1.setMnemonicParsing(false);
        button1.setText("3");
        HBox.setMargin(button1, new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 0.0, 45.0));

        hBox0.setPrefHeight(39.0);
        hBox0.setPrefWidth(205.0);

        button2.setMnemonicParsing(false);
        button2.setText("4");
        HBox.setMargin(button2, new Insets(0.0, 0.0, 0.0, 17.0));

        button3.setMnemonicParsing(false);
        button3.setText("5");
        HBox.setMargin(button3, new Insets(0.0, 10.0, 0.0, 10.0));

        button4.setMnemonicParsing(false);
        button4.setText("6");
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 0.0, 28.0));

        hBox1.setPrefHeight(40.0);
        hBox1.setPrefWidth(205.0);

        button5.setMnemonicParsing(false);
        button5.setText("7");
        HBox.setMargin(button5, new Insets(0.0, 0.0, 0.0, 17.0));

        button6.setMnemonicParsing(false);
        button6.setText("8");
        HBox.setMargin(button6, new Insets(0.0, 10.0, 0.0, 10.0));

        button7.setMnemonicParsing(false);
        button7.setText("9");
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 0.0, 28.0));

        hBox2.setPrefHeight(40.0);
        hBox2.setPrefWidth(205.0);

        button8.setMnemonicParsing(false);
        button8.setText("EFF.");

        button9.setMnemonicParsing(false);
        button9.setText("0");
        HBox.setMargin(button9, new Insets(0.0, 10.0, 0.0, 10.0));

        button10.setMnemonicParsing(false);
        button10.setText("OK");
        HBox.setMargin(button10, new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(0.0, 0.0, 0.0, 28.0));

        button11.setMnemonicParsing(false);
        button11.setText("Insérer carte");
        VBox.setMargin(button11, new Insets(0.0, 0.0, 0.0, 47.0));
        BorderPane.setMargin(pane, new Insets(100.0, 25.0, 0.0, 0.0));
        setRight(pane);

        BorderPane.setAlignment(pane0, javafx.geometry.Pos.CENTER);
        pane0.setPrefHeight(200.0);
        pane0.setPrefWidth(200.0);

        rectangle0.setArcHeight(5.0);
        rectangle0.setArcWidth(5.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#b9d8eb"));
        rectangle0.setHeight(400.0);
        rectangle0.setLayoutX(250.0);
        rectangle0.setLayoutY(50.0);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(800.0);

        vBox0.setLayoutX(304.0);
        vBox0.setLayoutY(149.0);
        vBox0.setPrefHeight(202.0);
        vBox0.setPrefWidth(244.0);

        button12.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button12.setMnemonicParsing(false);
        button12.setPrefHeight(31.0);
        button12.setPrefWidth(250.0);
        button12.setText("1 - Acheter un billet");
        VBox.setMargin(button12, new Insets(0.0, 0.0, 5.0, 0.0));

        button13.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button13.setMnemonicParsing(false);
        button13.setPrefHeight(31.0);
        button13.setPrefWidth(283.0);
        button13.setText("2 - Acheter un abonnement");
        VBox.setMargin(button13, new Insets(0.0, 0.0, 5.0, 0.0));

        button14.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button14.setMnemonicParsing(false);
        button14.setPrefHeight(31.0);
        button14.setPrefWidth(288.0);
        button14.setText("3 - Renouveler un abonnement");
        VBox.setMargin(button14, new Insets(0.0, 0.0, 5.0, 0.0));

        button15.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button15.setMnemonicParsing(false);
        button15.setPrefHeight(31.0);
        button15.setPrefWidth(300.0);
        button15.setText("4 - Acheter un pass");
        VBox.setMargin(button15, new Insets(0.0, 0.0, 5.0, 0.0));

        button16.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button16.setMnemonicParsing(false);
        button16.setPrefHeight(31.0);
        button16.setPrefWidth(392.0);
        button16.setText("5 - Vérifier l'horaire d'un train");

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(294.0);
        text.setLayoutY(112.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Que voulez-vous faire ?");
        text.setFont(new Font(22.0));

        circle.setFill(javafx.scene.paint.Color.valueOf("#48556198"));
        circle.setLayoutX(110.0);
        circle.setLayoutY(295.0);
        circle.setRadius(37.0);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        rectangle1.setArcHeight(5.0);
        rectangle1.setArcWidth(5.0);
        rectangle1.setHeight(50.0);
        rectangle1.setLayoutX(106.0);
        rectangle1.setLayoutY(270.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(9.0);

        button17.setLayoutX(86.0);
        button17.setLayoutY(220.0);
        button17.setMnemonicParsing(false);
        button17.setText("1 ct ");

        button18.setLayoutX(25.0);
        button18.setLayoutY(236.0);
        button18.setMnemonicParsing(false);
        button18.setText(" 2 € ");

        button19.setLayoutX(14.0);
        button19.setLayoutY(280.0);
        button19.setMnemonicParsing(false);
        button19.setText(" 1 € ");

        button110.setLayoutX(20.0);
        button110.setLayoutY(322.0);
        button110.setMnemonicParsing(false);
        button110.setText("50 cts");

        button111.setLayoutX(81.0);
        button111.setLayoutY(346.0);
        button111.setMnemonicParsing(false);
        button111.setText("20 cts");

        button112.setLayoutX(147.0);
        button112.setLayoutY(235.0);
        button112.setMnemonicParsing(false);
        button112.setText("2 cts");

        button113.setLayoutX(161.0);
        button113.setLayoutY(280.0);
        button113.setMnemonicParsing(false);
        button113.setText("5 cts");

        button114.setLayoutX(143.0);
        button114.setLayoutY(322.0);
        button114.setMnemonicParsing(false);
        button114.setText("10 cts");

        rectangle2.setArcHeight(5.0);
        rectangle2.setArcWidth(5.0);
        rectangle2.setHeight(7.0);
        rectangle2.setLayoutX(20.0);
        rectangle2.setLayoutY(118.0);
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setWidth(200.0);

        button115.setLayoutX(14.0);
        button115.setLayoutY(134.0);
        button115.setMnemonicParsing(false);
        button115.setText("5 €");

        button116.setLayoutX(62.0);
        button116.setLayoutY(134.0);
        button116.setMnemonicParsing(false);
        button116.setText("10 €");

        button117.setLayoutX(117.0);
        button117.setLayoutY(134.0);
        button117.setMnemonicParsing(false);
        button117.setText("20 €");

        button118.setLayoutX(171.0);
        button118.setLayoutY(134.0);
        button118.setMnemonicParsing(false);
        button118.setText("50 €");
        setLeft(pane0);

        BorderPane.setAlignment(rectangle3, javafx.geometry.Pos.CENTER);
        rectangle3.setArcHeight(5.0);
        rectangle3.setArcWidth(5.0);
        rectangle3.setHeight(53.0);
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setWidth(886.0);
        BorderPane.setMargin(rectangle3, new Insets(0.0, 0.0, 25.0, 0.0));
        setBottom(rectangle3);

        BorderPane.setAlignment(pane1, javafx.geometry.Pos.CENTER);
        pane1.setPrefHeight(86.0);
        pane1.setPrefWidth(875.0);

        rectangle4.setArcHeight(5.0);
        rectangle4.setArcWidth(5.0);
        rectangle4.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle4.setHeight(175.0);
        rectangle4.setLayoutX(135.0);
        rectangle4.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle4.setWidth(625.0);

        vBox1.setLayoutY(6.0);
        vBox1.setPrefHeight(107.0);
        vBox1.setPrefWidth(973.0);

        hBox3.setPrefHeight(0.0);
        hBox3.setPrefWidth(973.0);

        button119.setMinWidth(USE_PREF_SIZE);
        button119.setMnemonicParsing(false);
        button119.setPrefHeight(31.0);
        button119.setPrefWidth(50.0);
        button119.setText("A");
        button119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button119, new Insets(0.0));

        button1110.setMinWidth(USE_PREF_SIZE);
        button1110.setMnemonicParsing(false);
        button1110.setPrefHeight(31.0);
        button1110.setPrefWidth(50.0);
        button1110.setText("Z");
        button1110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1110, new Insets(0.0, 8.0, 0.0, 8.0));

        button1111.setMnemonicParsing(false);
        button1111.setPrefHeight(31.0);
        button1111.setPrefWidth(50.0);
        button1111.setText("E");
        button1111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button1112.setMnemonicParsing(false);
        button1112.setPrefHeight(31.0);
        button1112.setPrefWidth(50.0);
        button1112.setText("R");
        button1112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1112, new Insets(0.0, 8.0, 0.0, 8.0));

        button1113.setMnemonicParsing(false);
        button1113.setPrefHeight(31.0);
        button1113.setPrefWidth(50.0);
        button1113.setText("T");
        button1113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button1114.setMnemonicParsing(false);
        button1114.setPrefHeight(31.0);
        button1114.setPrefWidth(50.0);
        button1114.setText("Y");
        button1114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1114, new Insets(0.0, 8.0, 0.0, 8.0));

        button1115.setMnemonicParsing(false);
        button1115.setPrefHeight(31.0);
        button1115.setPrefWidth(50.0);
        button1115.setText("U");
        button1115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1115, new Insets(0.0, 8.0, 0.0, 0.0));

        button1116.setMnemonicParsing(false);
        button1116.setPrefHeight(31.0);
        button1116.setPrefWidth(50.0);
        button1116.setText("I");
        button1116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1116, new Insets(0.0));

        button1117.setMnemonicParsing(false);
        button1117.setPrefHeight(31.0);
        button1117.setPrefWidth(50.0);
        button1117.setText("O");
        button1117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1117, new Insets(0.0, 8.0, 0.0, 8.0));

        button1118.setMnemonicParsing(false);
        button1118.setPrefHeight(31.0);
        button1118.setPrefWidth(50.0);
        button1118.setText("P");
        button1118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox3, new Insets(10.0, 0.0, 0.0, 4.0));

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(973.0);

        button1119.setMnemonicParsing(false);
        button1119.setPrefHeight(31.0);
        button1119.setPrefWidth(50.0);
        button1119.setText("Q");
        button1119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button11110.setMnemonicParsing(false);
        button11110.setPrefHeight(31.0);
        button11110.setPrefWidth(50.0);
        button11110.setText("S");
        button11110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11110, new Insets(0.0, 8.0, 0.0, 8.0));

        button11111.setMnemonicParsing(false);
        button11111.setPrefHeight(31.0);
        button11111.setPrefWidth(50.0);
        button11111.setText("D");
        button11111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button11112.setMnemonicParsing(false);
        button11112.setPrefHeight(31.0);
        button11112.setPrefWidth(50.0);
        button11112.setText("F");
        button11112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11112, new Insets(0.0, 8.0, 0.0, 8.0));

        button11113.setMnemonicParsing(false);
        button11113.setPrefHeight(31.0);
        button11113.setPrefWidth(50.0);
        button11113.setText("G");
        button11113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button11114.setMnemonicParsing(false);
        button11114.setPrefHeight(31.0);
        button11114.setPrefWidth(50.0);
        button11114.setText("H");
        button11114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11114, new Insets(0.0, 8.0, 0.0, 16.0));

        button11115.setMnemonicParsing(false);
        button11115.setPrefHeight(31.0);
        button11115.setPrefWidth(50.0);
        button11115.setText("J");
        button11115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button11116.setMnemonicParsing(false);
        button11116.setPrefHeight(31.0);
        button11116.setPrefWidth(50.0);
        button11116.setText("K");
        button11116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11116, new Insets(0.0, 8.0, 0.0, 8.0));

        button11117.setMnemonicParsing(false);
        button11117.setPrefHeight(31.0);
        button11117.setPrefWidth(50.0);
        button11117.setText("L");
        button11117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button11118.setMnemonicParsing(false);
        button11118.setPrefHeight(31.0);
        button11118.setPrefWidth(50.0);
        button11118.setText("M");
        button11118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11118, new Insets(0.0, 0.0, 0.0, 8.0));
        VBox.setMargin(hBox4, new Insets(5.0, 0.0, 0.0, 0.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(973.0);

        button11119.setMnemonicParsing(false);
        button11119.setPrefHeight(31.0);
        button11119.setPrefWidth(50.0);
        button11119.setText("W");
        button11119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button111110.setMnemonicParsing(false);
        button111110.setPrefHeight(31.0);
        button111110.setPrefWidth(50.0);
        button111110.setText("X");
        button111110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button111110, new Insets(0.0, 8.0, 0.0, 8.0));

        button111111.setMnemonicParsing(false);
        button111111.setPrefHeight(31.0);
        button111111.setPrefWidth(50.0);
        button111111.setText("C");
        button111111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button111112.setMnemonicParsing(false);
        button111112.setPrefHeight(31.0);
        button111112.setPrefWidth(50.0);
        button111112.setText("V");
        button111112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button111112, new Insets(0.0, 8.0, 0.0, 8.0));

        button111113.setMnemonicParsing(false);
        button111113.setPrefHeight(31.0);
        button111113.setPrefWidth(50.0);
        button111113.setText("B");
        button111113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        button111114.setMnemonicParsing(false);
        button111114.setPrefHeight(31.0);
        button111114.setPrefWidth(50.0);
        button111114.setText("N");
        button111114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button111114, new Insets(0.0, 8.0, 0.0, 8.0));

        button111115.setMnemonicParsing(false);
        button111115.setPrefHeight(31.0);
        button111115.setPrefWidth(200.0);
        button111115.setText("EFFACER");
        button111115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox5, new Insets(5.0, 0.0, 0.0, 20.0));

        hBox6.setPrefHeight(1.0);
        hBox6.setPrefWidth(973.0);

        button111116.setMnemonicParsing(false);
        button111116.setPrefHeight(31.0);
        button111116.setPrefWidth(500.0);
        button111116.setText("ESPACE");
        button111116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button111116, new Insets(0.0, 0.0, 0.0, 45.0));
        VBox.setMargin(hBox6, new Insets(5.0, 0.0, 0.0, 0.0));
        vBox1.setPadding(new Insets(0.0, 0.0, 0.0, 155.0));
        BorderPane.setMargin(pane1, new Insets(490.0, 0.0, 25.0, 0.0));
        setCenter(pane1);

        BorderPane.setAlignment(pane2, javafx.geometry.Pos.CENTER);
        pane2.setPrefHeight(39.0);
        pane2.setPrefWidth(1300.0);

        menuBar.setPrefHeight(1.0);
        menuBar.setPrefWidth(88.0);

        menu.setMnemonicParsing(false);
        menu.setText("Pannes");

        checkMenuItem.setMnemonicParsing(false);
        checkMenuItem.setText("Lecteur de cartes");

        checkMenuItem0.setMnemonicParsing(false);
        checkMenuItem0.setText("Fente à billets");

        checkMenuItem1.setMnemonicParsing(false);
        checkMenuItem1.setText("Fente à pièces");

        checkMenuItem2.setMnemonicParsing(false);
        checkMenuItem2.setText("Scanneur de codes");

        checkMenuItem3.setMnemonicParsing(false);
        checkMenuItem3.setText("Bloquer la carte");

        checkMenuItem4.setMnemonicParsing(false);
        checkMenuItem4.setText("Imprimante");
        setTop(pane2);

        pane.getChildren().add(rectangle);
        vBox.getChildren().add(passwordField);
        hBox.getChildren().add(button);
        hBox.getChildren().add(button0);
        hBox.getChildren().add(button1);
        vBox.getChildren().add(hBox);
        hBox0.getChildren().add(button2);
        hBox0.getChildren().add(button3);
        hBox0.getChildren().add(button4);
        vBox.getChildren().add(hBox0);
        hBox1.getChildren().add(button5);
        hBox1.getChildren().add(button6);
        hBox1.getChildren().add(button7);
        vBox.getChildren().add(hBox1);
        hBox2.getChildren().add(button8);
        hBox2.getChildren().add(button9);
        hBox2.getChildren().add(button10);
        vBox.getChildren().add(hBox2);
        vBox.getChildren().add(button11);
        pane.getChildren().add(vBox);
        pane0.getChildren().add(rectangle0);
        vBox0.getChildren().add(button12);
        vBox0.getChildren().add(button13);
        vBox0.getChildren().add(button14);
        vBox0.getChildren().add(button15);
        vBox0.getChildren().add(button16);
        pane0.getChildren().add(vBox0);
        pane0.getChildren().add(text);
        pane0.getChildren().add(circle);
        pane0.getChildren().add(rectangle1);
        pane0.getChildren().add(button17);
        pane0.getChildren().add(button18);
        pane0.getChildren().add(button19);
        pane0.getChildren().add(button110);
        pane0.getChildren().add(button111);
        pane0.getChildren().add(button112);
        pane0.getChildren().add(button113);
        pane0.getChildren().add(button114);
        pane0.getChildren().add(rectangle2);
        pane0.getChildren().add(button115);
        pane0.getChildren().add(button116);
        pane0.getChildren().add(button117);
        pane0.getChildren().add(button118);
        pane1.getChildren().add(rectangle4);
        hBox3.getChildren().add(button119);
        hBox3.getChildren().add(button1110);
        hBox3.getChildren().add(button1111);
        hBox3.getChildren().add(button1112);
        hBox3.getChildren().add(button1113);
        hBox3.getChildren().add(button1114);
        hBox3.getChildren().add(button1115);
        hBox3.getChildren().add(button1116);
        hBox3.getChildren().add(button1117);
        hBox3.getChildren().add(button1118);
        vBox1.getChildren().add(hBox3);
        hBox4.getChildren().add(button1119);
        hBox4.getChildren().add(button11110);
        hBox4.getChildren().add(button11111);
        hBox4.getChildren().add(button11112);
        hBox4.getChildren().add(button11113);
        hBox4.getChildren().add(button11114);
        hBox4.getChildren().add(button11115);
        hBox4.getChildren().add(button11116);
        hBox4.getChildren().add(button11117);
        hBox4.getChildren().add(button11118);
        vBox1.getChildren().add(hBox4);
        hBox5.getChildren().add(button11119);
        hBox5.getChildren().add(button111110);
        hBox5.getChildren().add(button111111);
        hBox5.getChildren().add(button111112);
        hBox5.getChildren().add(button111113);
        hBox5.getChildren().add(button111114);
        hBox5.getChildren().add(button111115);
        vBox1.getChildren().add(hBox5);
        hBox6.getChildren().add(button111116);
        vBox1.getChildren().add(hBox6);
        pane1.getChildren().add(vBox1);
        menu.getItems().add(checkMenuItem);
        menu.getItems().add(checkMenuItem0);
        menu.getItems().add(checkMenuItem1);
        menu.getItems().add(checkMenuItem2);
        menu.getItems().add(checkMenuItem3);
        menu.getItems().add(checkMenuItem4);
        menuBar.getMenus().add(menu);
        pane2.getChildren().add(menuBar);

    }
}
