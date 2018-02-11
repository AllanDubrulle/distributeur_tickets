package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

public class FSimulation extends BorderPane {
    public Pane pane;
    public Rectangle rectangle;
    public VBox vBox;
    public PasswordField passwordField;
    public HBox hBox;
    public Button button;
    public Button button0;
    public Button button1;
    public HBox hBox0;
    public Button button2;
    public Button button3;
    public Button button4;
    public HBox hBox1;
    public Button button5;
    public Button button6;
    public Button button7;
    public HBox hBox2;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Pane pane0;
    public Circle circle;
    public Rectangle rectangle0;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;
    public Button button17;
    public Button button18;
    public Button button19;
    public Rectangle rectangle1;
    public Button button110;
    public Button button111;
    public Button button112;
    public Button button113;
    public Pane pane1;
    public MenuBar menuBar;
    public Menu menu;
    public CheckMenuItem checkMenuItem;
    public CheckMenuItem checkMenuItem0;
    public CheckMenuItem checkMenuItem1;
    public CheckMenuItem checkMenuItem2;
    public CheckMenuItem checkMenuItem3;
    public CheckMenuItem checkMenuItem4;
    public Menu menu0;
    public MenuItem menuItem;
    public MenuItem menuItem0;
    public Menu menu1;
    public MenuItem menuItem1;
    public MenuItem menuItem2;
    public Menu menu2;
    public CheckMenuItem checkMenuItem5;
    public Menu menu3;
    public CheckMenuItem checkMenuItem6;
    public CheckMenuItem checkMenuItem7;
    public CheckMenuItem checkMenuItem8;
    public Menu menu4;
    public CheckMenuItem checkMenuItem9;
    public CheckMenuItem checkMenuItem10;
    public CheckMenuItem checkMenuItem11;
    public VBox vBox0;
    public Pane pane2;
    public Rectangle rectangle2;
    public VBox vBox1;
    public HBox hBox3;
    public Button button114;
    public Button button115;
    public Button button116;
    public Button button117;
    public Button button118;
    public Button button119;
    public Button button1110;
    public Button button1111;
    public Button button1112;
    public Button button1113;
    public HBox hBox4;
    public Button button1114;
    public Button button1115;
    public Button button1116;
    public Button button1117;
    public Button button1118;
    public Button button1119;
    public Button button11110;
    public Button button11111;
    public Button button11112;
    public Button button11113;
    public HBox hBox5;
    public Button button11114;
    public Button button11115;
    public Button button11116;
    public Button button11117;
    public Button button11118;
    public Button button11119;
    public Button button111110;
    public Button button111111;
    public Button button111112;
    public Button button111113;
    public HBox hBox6;
    public Button button111114;
    public Button button111115;
    public Button button111116;
    public Button button111117;
    public Button button111118;
    public Button button111119;
    public Button button1111110;
    public HBox hBox7;
    public Button button1111111;
    public Button button1111112;
    public Button button1111113;
    public Button button1111114;
    public Rectangle rectangle3;
    public static Fenetre fenetre;

    public FSimulation() {
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
        circle = new Circle();
        rectangle0 = new Rectangle();
        button12 = new Button();
        button13 = new Button();
        button14 = new Button();
        button15 = new Button();
        button16 = new Button();
        button17 = new Button();
        button18 = new Button();
        button19 = new Button();
        rectangle1 = new Rectangle();
        button110 = new Button();
        button111 = new Button();
        button112 = new Button();
        button113 = new Button();
        pane1 = new Pane();
        menuBar = new MenuBar();
        menu = new Menu();
        checkMenuItem = new CheckMenuItem();
        checkMenuItem0 = new CheckMenuItem();
        checkMenuItem1 = new CheckMenuItem();
        checkMenuItem2 = new CheckMenuItem();
        checkMenuItem3 = new CheckMenuItem();
        checkMenuItem4 = new CheckMenuItem();
        menu0 = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu1 = new Menu();
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        menu2 = new Menu();
        checkMenuItem5 = new CheckMenuItem();
        menu3 = new Menu();
        checkMenuItem6 = new CheckMenuItem();
        checkMenuItem7 = new CheckMenuItem();
        checkMenuItem8 = new CheckMenuItem();
        menu4 = new Menu();
        checkMenuItem9 = new CheckMenuItem();
        checkMenuItem10 = new CheckMenuItem();
        checkMenuItem11 = new CheckMenuItem();
        vBox0 = new VBox();
        pane2 = new Pane();
        rectangle2 = new Rectangle();
        vBox1 = new VBox();
        hBox3 = new HBox();
        button114 = new Button();
        button115 = new Button();
        button116 = new Button();
        button117 = new Button();
        button118 = new Button();
        button119 = new Button();
        button1110 = new Button();
        button1111 = new Button();
        button1112 = new Button();
        button1113 = new Button();
        hBox4 = new HBox();
        button1114 = new Button();
        button1115 = new Button();
        button1116 = new Button();
        button1117 = new Button();
        button1118 = new Button();
        button1119 = new Button();
        button11110 = new Button();
        button11111 = new Button();
        button11112 = new Button();
        button11113 = new Button();
        hBox5 = new HBox();
        button11114 = new Button();
        button11115 = new Button();
        button11116 = new Button();
        button11117 = new Button();
        button11118 = new Button();
        button11119 = new Button();
        button111110 = new Button();
        button111111 = new Button();
        button111112 = new Button();
        button111113 = new Button();
        hBox6 = new HBox();
        button111114 = new Button();
        button111115 = new Button();
        button111116 = new Button();
        button111117 = new Button();
        button111118 = new Button();
        button111119 = new Button();
        button1111110 = new Button();
        hBox7 = new HBox();
        button1111111 = new Button();
        button1111112 = new Button();
        button1111113 = new Button();
        button1111114 = new Button();
        rectangle3 = new Rectangle();
        fenetre = new FSimulationAcceuil();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(1300.0);

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(298.0);
        pane.setPrefWidth(200.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle.setHeight(250.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0);

        vBox.setPrefHeight(256.0);
        vBox.setPrefWidth(205.0);

        VBox.setMargin(passwordField, new Insets(10.0, 20.0, 10.0, 20.0));

        hBox.setPrefHeight(37.0);
        hBox.setPrefWidth(205.0);

        button.setMnemonicParsing(false);
        button.setText("1");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche1_1();
            }});
        HBox.setMargin(button, new Insets(0.0));

        button0.setMnemonicParsing(false);
        button0.setText("2");
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche2_1();
            }});
        HBox.setMargin(button0, new Insets(0.0, 10.0, 0.0, 10.0));

        button1.setMnemonicParsing(false);
        button1.setText("3");
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche3_1();
            }});
        HBox.setMargin(button1, new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 0.0, 45.0));

        hBox0.setPrefHeight(39.0);
        hBox0.setPrefWidth(205.0);

        button2.setMnemonicParsing(false);
        button2.setText("4");
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche4_1();
            }});
        HBox.setMargin(button2, new Insets(0.0, 0.0, 0.0, 17.0));

        button3.setMnemonicParsing(false);
        button3.setText("5");
        button3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche5_1();
            }});
        HBox.setMargin(button3, new Insets(0.0, 10.0, 0.0, 10.0));

        button4.setMnemonicParsing(false);
        button4.setText("6");
        button4.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche6_1();
            }});
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 0.0, 28.0));

        hBox1.setPrefHeight(40.0);
        hBox1.setPrefWidth(205.0);

        button5.setMnemonicParsing(false);
        button5.setText("7");
        button5.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche7_1();
            }});
        HBox.setMargin(button5, new Insets(0.0, 0.0, 0.0, 17.0));

        button6.setMnemonicParsing(false);
        button6.setText("8");
        button6.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche8_1();
            }});
        HBox.setMargin(button6, new Insets(0.0, 10.0, 0.0, 10.0));

        button7.setMnemonicParsing(false);
        button7.setText("9");
        button7.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche9_1();
            }});
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 0.0, 28.0));

        hBox2.setPrefHeight(40.0);
        hBox2.setPrefWidth(205.0);

        button8.setMnemonicParsing(false);
        button8.setText("EFF.");
        button8.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheEff_1();
            }});

        button9.setMnemonicParsing(false);
        button9.setText("0");
        button9.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche0_1();
            }});
        HBox.setMargin(button9, new Insets(0.0, 10.0, 0.0, 10.0));

        button10.setMnemonicParsing(false);
        button10.setText("OK");
        button10.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheOk();
            }});
        HBox.setMargin(button10, new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(0.0, 0.0, 0.0, 28.0));

        button11.setMnemonicParsing(false);
        button11.setText("Insérer carte");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheInserer();
            }});
        VBox.setMargin(button11, new Insets(0.0, 0.0, 0.0, 47.0));
        BorderPane.setMargin(pane, new Insets(100.0, 25.0, 0.0, 0.0));
        setRight(pane);

        BorderPane.setAlignment(pane0, javafx.geometry.Pos.CENTER);
        pane0.setPrefHeight(200.0);
        pane0.setPrefWidth(200.0);

        circle.setFill(javafx.scene.paint.Color.valueOf("#48556198"));
        circle.setLayoutX(110.0);
        circle.setLayoutY(295.0);
        circle.setRadius(37.0);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        rectangle0.setArcHeight(5.0);
        rectangle0.setArcWidth(5.0);
        rectangle0.setHeight(50.0);
        rectangle0.setLayoutX(106.0);
        rectangle0.setLayoutY(270.0);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(9.0);

        button12.setLayoutX(86.0);
        button12.setLayoutY(220.0);
        button12.setMnemonicParsing(false);
        button12.setText("1 ct ");

        button13.setLayoutX(25.0);
        button13.setLayoutY(236.0);
        button13.setMnemonicParsing(false);
        button13.setText(" 2 € ");

        button14.setLayoutX(14.0);
        button14.setLayoutY(280.0);
        button14.setMnemonicParsing(false);
        button14.setText(" 1 € ");

        button15.setLayoutX(20.0);
        button15.setLayoutY(322.0);
        button15.setMnemonicParsing(false);
        button15.setText("50 cts");

        button16.setLayoutX(81.0);
        button16.setLayoutY(346.0);
        button16.setMnemonicParsing(false);
        button16.setText("20 cts");

        button17.setLayoutX(147.0);
        button17.setLayoutY(235.0);
        button17.setMnemonicParsing(false);
        button17.setText("2 cts");

        button18.setLayoutX(161.0);
        button18.setLayoutY(280.0);
        button18.setMnemonicParsing(false);
        button18.setText("5 cts");

        button19.setLayoutX(143.0);
        button19.setLayoutY(322.0);
        button19.setMnemonicParsing(false);
        button19.setText("10 cts");

        rectangle1.setArcHeight(5.0);
        rectangle1.setArcWidth(5.0);
        rectangle1.setHeight(7.0);
        rectangle1.setLayoutX(20.0);
        rectangle1.setLayoutY(118.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(200.0);

        button110.setLayoutX(14.0);
        button110.setLayoutY(134.0);
        button110.setMnemonicParsing(false);
        button110.setText("5 €");

        button111.setLayoutX(62.0);
        button111.setLayoutY(134.0);
        button111.setMnemonicParsing(false);
        button111.setText("10 €");

        button112.setLayoutX(117.0);
        button112.setLayoutY(134.0);
        button112.setMnemonicParsing(false);
        button112.setText("20 €");

        button113.setLayoutX(171.0);
        button113.setLayoutY(134.0);
        button113.setMnemonicParsing(false);
        button113.setText("50 €");
        setLeft(pane0);

        BorderPane.setAlignment(pane1, javafx.geometry.Pos.CENTER);
        pane1.setPrefHeight(39.0);
        pane1.setPrefWidth(1300.0);

        menuBar.setPrefHeight(32.0);
        menuBar.setPrefWidth(270.0);

        menu.setMnemonicParsing(false);
        menu.setText("Pannes");

        checkMenuItem.setMnemonicParsing(false);
        checkMenuItem.setText("Lecteur de cartes");

        checkMenuItem0.setMnemonicParsing(false);
        checkMenuItem0.setText("Fente à  billets");

        checkMenuItem1.setMnemonicParsing(false);
        checkMenuItem1.setText("Fente à  pièces");

        checkMenuItem2.setMnemonicParsing(false);
        checkMenuItem2.setText("Scanneur de codes");

        checkMenuItem3.setMnemonicParsing(false);
        checkMenuItem3.setText("Bloquer la carte");

        checkMenuItem4.setMnemonicParsing(false);
        checkMenuItem4.setText("Imprimante");

        menu0.setMnemonicParsing(false);
        menu0.setText("Caisse");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Recharger caisse");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Vider caisse");

        menu1.setMnemonicParsing(false);
        menu1.setText("Impression");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Recharger encre et papier");

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Vider encre et papier");

        menu2.setMnemonicParsing(false);
        menu2.setText("Composants optionnels");

        checkMenuItem5.setMnemonicParsing(false);
        checkMenuItem5.setText("Scanneur de codes");

        menu3.setMnemonicParsing(false);
        menu3.setText("Fentes");

        checkMenuItem6.setMnemonicParsing(false);
        checkMenuItem6.setText("Fentes à  pièces et à  billets");

        checkMenuItem7.setMnemonicParsing(false);
        checkMenuItem7.setText("Fente à  pièces uniquement");

        checkMenuItem8.setMnemonicParsing(false);
        checkMenuItem8.setText("Aucune fente");

        menu4.setMnemonicParsing(false);
        menu4.setText("Clavier");

        checkMenuItem9.setMnemonicParsing(false);
        checkMenuItem9.setText("Clavier et écran tacitile");

        checkMenuItem10.setMnemonicParsing(false);
        checkMenuItem10.setText("Clavier et écran non tactile");

        checkMenuItem11.setMnemonicParsing(false);
        checkMenuItem11.setText("Ecran tacile sans clavier");
        setTop(pane1);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(265.0);
        vBox0.setPrefWidth(1300.0);

        pane2.setPrefHeight(190.0);
        pane2.setPrefWidth(1083.0);

        rectangle2.setArcHeight(5.0);
        rectangle2.setArcWidth(5.0);
        rectangle2.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle2.setHeight(197.0);
        rectangle2.setLayoutX(337.5);
        rectangle2.setLayoutY(-13.0);
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setWidth(625.0);

        vBox1.setLayoutX(204.0);
        vBox1.setPrefHeight(175.0);
        vBox1.setPrefWidth(739.0);

        hBox3.setPrefHeight(100.0);
        hBox3.setPrefWidth(200.0);

        button114.setMnemonicParsing(false);
        button114.setPrefHeight(31.0);
        button114.setPrefWidth(50.0);
        button114.setText("1");
        button114.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche1();
            }});

        button115.setMnemonicParsing(false);
        button115.setPrefHeight(31.0);
        button115.setPrefWidth(50.0);
        button115.setText("2");
        HBox.setMargin(button115, new Insets(0.0, 8.0, 0.0, 8.0));
        button115.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche2();
            }});

        button116.setMnemonicParsing(false);
        button116.setPrefHeight(31.0);
        button116.setPrefWidth(50.0);
        button116.setText("3");
        button116.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche3();
            }});

        button117.setMnemonicParsing(false);
        button117.setPrefHeight(31.0);
        button117.setPrefWidth(50.0);
        button117.setText("4");
        HBox.setMargin(button117, new Insets(0.0, 8.0, 0.0, 8.0));
        button117.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche4();
            }});

        button118.setMnemonicParsing(false);
        button118.setPrefHeight(31.0);
        button118.setPrefWidth(50.0);
        button118.setText("5");
        button118.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche5();
            }});

        button119.setMnemonicParsing(false);
        button119.setPrefHeight(31.0);
        button119.setPrefWidth(50.0);
        button119.setText("6");
        HBox.setMargin(button119, new Insets(0.0, 8.0, 0.0, 8.0));
        button119.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche6();
            }});

        button1110.setMnemonicParsing(false);
        button1110.setPrefHeight(31.0);
        button1110.setPrefWidth(50.0);
        button1110.setText("7");
        button1110.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche7();
            }});

        button1111.setMnemonicParsing(false);
        button1111.setPrefHeight(31.0);
        button1111.setPrefWidth(50.0);
        button1111.setText("8");
        HBox.setMargin(button1111, new Insets(0.0, 8.0, 0.0, 8.0));
        button1111.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche8();
            }});

        button1112.setMnemonicParsing(false);
        button1112.setPrefHeight(31.0);
        button1112.setPrefWidth(50.0);
        button1112.setText("9");
        button1112.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche9();
            }});

        button1113.setMnemonicParsing(false);
        button1113.setPrefHeight(31.0);
        button1113.setPrefWidth(50.0);
        button1113.setText("0");
        HBox.setMargin(button1113, new Insets(0.0, 0.0, 0.0, 8.0));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 0.0, 4.0));
        button1113.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.touche0();
            }});

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(973.0);

        button1114.setMinWidth(USE_PREF_SIZE);
        button1114.setMnemonicParsing(false);
        button1114.setPrefHeight(31.0);
        button1114.setPrefWidth(50.0);
        button1114.setText("A");
        button1114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1114, new Insets(0.0));
        button1114.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheA();
            }});

        button1115.setMinWidth(USE_PREF_SIZE);
        button1115.setMnemonicParsing(false);
        button1115.setPrefHeight(31.0);
        button1115.setPrefWidth(50.0);
        button1115.setText("Z");
        button1115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1115, new Insets(0.0, 8.0, 0.0, 8.0));
        button1115.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheZ();
            }});

        button1116.setMnemonicParsing(false);
        button1116.setPrefHeight(31.0);
        button1116.setPrefWidth(50.0);
        button1116.setText("E");
        button1116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1116.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheE();
            }});

        button1117.setMnemonicParsing(false);
        button1117.setPrefHeight(31.0);
        button1117.setPrefWidth(50.0);
        button1117.setText("R");
        button1117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1117, new Insets(0.0, 8.0, 0.0, 8.0));
        button1117.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheR();
            }});

        button1118.setMnemonicParsing(false);
        button1118.setPrefHeight(31.0);
        button1118.setPrefWidth(50.0);
        button1118.setText("T");
        button1118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1118.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheT();
            }});

        button1119.setMnemonicParsing(false);
        button1119.setPrefHeight(31.0);
        button1119.setPrefWidth(50.0);
        button1119.setText("Y");
        button1119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1119, new Insets(0.0, 8.0, 0.0, 8.0));
        button1119.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheY();
            }});

        button11110.setMnemonicParsing(false);
        button11110.setPrefHeight(31.0);
        button11110.setPrefWidth(50.0);
        button11110.setText("U");
        button11110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11110, new Insets(0.0, 8.0, 0.0, 0.0));
        button11110.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheU();
            }});

        button11111.setMnemonicParsing(false);
        button11111.setPrefHeight(31.0);
        button11111.setPrefWidth(50.0);
        button11111.setText("I");
        button11111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11111, new Insets(0.0));
        button11111.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheI();
            }});

        button11112.setMnemonicParsing(false);
        button11112.setPrefHeight(31.0);
        button11112.setPrefWidth(50.0);
        button11112.setText("O");
        button11112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11112, new Insets(0.0, 8.0, 0.0, 8.0));
        button11112.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheO();
            }});

        button11113.setMnemonicParsing(false);
        button11113.setPrefHeight(31.0);
        button11113.setPrefWidth(50.0);
        button11113.setText("P");
        button11113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox4, new Insets(5.0, 0.0, 0.0, 4.0));
        button11113.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheP();
            }});

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(973.0);

        button11114.setMnemonicParsing(false);
        button11114.setPrefHeight(31.0);
        button11114.setPrefWidth(50.0);
        button11114.setText("Q");
        button11114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button11114.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheQ();
            }});

        button11115.setMnemonicParsing(false);
        button11115.setPrefHeight(31.0);
        button11115.setPrefWidth(50.0);
        button11115.setText("S");
        button11115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11115, new Insets(0.0, 8.0, 0.0, 8.0));
        button11115.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheS();
            }});

        button11116.setMnemonicParsing(false);
        button11116.setPrefHeight(31.0);
        button11116.setPrefWidth(50.0);
        button11116.setText("D");
        button11116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button11116.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheD();
            }});

        button11117.setMnemonicParsing(false);
        button11117.setPrefHeight(31.0);
        button11117.setPrefWidth(50.0);
        button11117.setText("F");
        button11117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11117, new Insets(0.0, 8.0, 0.0, 8.0));
        button11117.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheF();
            }});

        button11118.setMnemonicParsing(false);
        button11118.setPrefHeight(31.0);
        button11118.setPrefWidth(50.0);
        button11118.setText("G");
        button11118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button11118.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheG();
            }});

        button11119.setMnemonicParsing(false);
        button11119.setPrefHeight(31.0);
        button11119.setPrefWidth(50.0);
        button11119.setText("H");
        button11119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button11119, new Insets(0.0, 8.0, 0.0, 8.0));
        button11119.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheH();
            }});

        button111110.setMnemonicParsing(false);
        button111110.setPrefHeight(31.0);
        button111110.setPrefWidth(50.0);
        button111110.setText("J");
        button111110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111110.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheJ();
            }});

        button111111.setMnemonicParsing(false);
        button111111.setPrefHeight(31.0);
        button111111.setPrefWidth(50.0);
        button111111.setText("K");
        button111111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button111111, new Insets(0.0, 8.0, 0.0, 8.0));
        button111111.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheK();
            }});

        button111112.setMnemonicParsing(false);
        button111112.setPrefHeight(31.0);
        button111112.setPrefWidth(50.0);
        button111112.setText("L");
        button111112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111112.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheL();
            }});

        button111113.setMnemonicParsing(false);
        button111113.setPrefHeight(31.0);
        button111113.setPrefWidth(50.0);
        button111113.setText("M");
        button111113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111113.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheM();
            }});
        
        HBox.setMargin(button111113, new Insets(0.0, 0.0, 0.0, 8.0));
        VBox.setMargin(hBox5, new Insets(5.0, 0.0, 0.0, 4.0));

        hBox6.setPrefHeight(0.0);
        hBox6.setPrefWidth(973.0);

        button111114.setMnemonicParsing(false);
        button111114.setPrefHeight(31.0);
        button111114.setPrefWidth(50.0);
        button111114.setText("W");
        button111114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111114.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheW();
            }});

        button111115.setMnemonicParsing(false);
        button111115.setPrefHeight(31.0);
        button111115.setPrefWidth(50.0);
        button111115.setText("X");
        button111115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111115.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheX();
            }});
        HBox.setMargin(button111115, new Insets(0.0, 8.0, 0.0, 8.0));

        button111116.setMnemonicParsing(false);
        button111116.setPrefHeight(31.0);
        button111116.setPrefWidth(50.0);
        button111116.setText("C");
        button111116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111116.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheC();
            }});

        button111117.setMnemonicParsing(false);
        button111117.setPrefHeight(31.0);
        button111117.setPrefWidth(50.0);
        button111117.setText("V");
        button111117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111117.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheV();
            }});
        HBox.setMargin(button111117, new Insets(0.0, 8.0, 0.0, 8.0));

        button111118.setMnemonicParsing(false);
        button111118.setPrefHeight(31.0);
        button111118.setPrefWidth(50.0);
        button111118.setText("B");
        button111118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111118.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheB();
            }});

        button111119.setMnemonicParsing(false);
        button111119.setPrefHeight(31.0);
        button111119.setPrefWidth(50.0);
        button111119.setText("N");
        button111119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111119.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheN();
            }});
        HBox.setMargin(button111119, new Insets(0.0, 8.0, 0.0, 8.0));
        

        button1111110.setMnemonicParsing(false);
        button1111110.setPrefHeight(31.0);
        button1111110.setPrefWidth(96.0);
        button1111110.setText("EFFACER");
        button1111110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1111110.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheEff();
            }});
        HBox.setMargin(button1111110, new Insets(0.0, 8.0, 0.0, 0.0));

        button1111111.setMnemonicParsing(false);
        button1111111.setPrefHeight(31.0);
        button1111111.setPrefWidth(96.0);
        button1111111.setText("SUIVANT");
        button1111111.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheSuiv();
            }});
        HBox.setMargin(button1111111, new Insets(0.0, 0.0, 0.0, 0.0));
        
        VBox.setMargin(hBox6, new Insets(5.0, 0.0, 0.0, 20.0));

        hBox7.setLayoutX(10.0);
        hBox7.setPrefHeight(1.0);
        hBox7.setPrefWidth(973.0);

        button1111112.setMnemonicParsing(false);
        button1111112.setPrefHeight(31.0);
        button1111112.setPrefWidth(80.0);
        button1111112.setText("RETOUR");
        button1111112.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.retour();
            }});

        button1111113.setMnemonicParsing(false);
        button1111113.setPrefHeight(31.0);
        button1111113.setPrefWidth(402.0);
        button1111113.setText("ESPACE");
        button1111113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1111113.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.toucheEsp();
            }});
        HBox.setMargin(button1111112, new Insets(0.0, 8.0, 0.0, 8.0));

        button1111114.setMnemonicParsing(false);
        button1111114.setPrefHeight(31.0);
        button1111114.setPrefWidth(80.0);
        button1111114.setText("ENTRER");
        
        HBox.setMargin(button1111114, new Insets(0.0, 8.0, 0.0, 8.0));
        VBox.setMargin(hBox7, new Insets(5.0, 0.0, 0.0, 0.0));
        vBox1.setPadding(new Insets(0.0, 0.0, 0.0, 155.0));
        button1111114.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                fenetre.valider();
            }});
        
        rectangle3.setArcHeight(5.0);
        rectangle3.setArcWidth(5.0);
        rectangle3.setHeight(40.0);
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setWidth(1000.0);
        VBox.setMargin(rectangle3, new Insets(10.0, 0.0, 0.0, 150.0));
        setBottom(vBox0);

        BorderPane.setAlignment(fenetre, javafx.geometry.Pos.CENTER);
        setCenter(fenetre);

        hBox.getChildren().addAll(button, button0, button1);
        hBox0.getChildren().addAll(button2, button3, button4);
        hBox1.getChildren().addAll(button5, button6, button7);
        hBox2.getChildren().addAll(button8, button9, button10);
        vBox.getChildren().addAll(passwordField, hBox, hBox0, hBox1, hBox2, button11);
        pane.getChildren().addAll(rectangle, vBox);
        pane0.getChildren().addAll(circle, rectangle0, button12, button13, button14, button15, button16, button17, button18, button19, rectangle1, button110, button111, button112, button113);
        menu0.getItems().addAll(menuItem, menuItem0);
        menu1.getItems().addAll(menuItem1, menuItem2);
        menu.getItems().addAll(checkMenuItem, checkMenuItem0, checkMenuItem1, checkMenuItem2, checkMenuItem3, checkMenuItem4, menu0, menu1);
        menu4.getItems().addAll(checkMenuItem9, checkMenuItem10, checkMenuItem11);
        menu2.getItems().addAll(checkMenuItem5, checkMenuItem6, checkMenuItem7, checkMenuItem8, menu3, menu4);
        menuBar.getMenus().addAll(menu, menu2);
        pane1.getChildren().add(menuBar);
        hBox3.getChildren().addAll(button114, button115, button116, button117, button118, button119, button1110, button1111, button1112, button1113);
        hBox4.getChildren().addAll(button1114, button1115, button1116, button1117, button1118, button1119, button11110, button11111, button11112, button11113);
        hBox5.getChildren().addAll(button11114, button11115, button11116, button11117, button11118, button11119, button111110, button111111, button111112, button111113);
        hBox6.getChildren().addAll(button111114, button111115, button111116, button111117, button111118, button111119, button1111110);
        hBox6.getChildren().add(button1111111);
        hBox7.getChildren().addAll(button1111112, button1111113, button1111114);
        vBox1.getChildren().addAll(hBox3, hBox4, hBox5, hBox6, hBox7);
        pane2.getChildren().addAll(rectangle2, vBox1);
        vBox0.getChildren().addAll(pane2, rectangle3);

    }
}