package Distributeur;

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

    public FMenu() {

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
        button.setText("1 - Acheter un billet");
        VBox.setMargin(button, new Insets(0.0, 0.0, 5.0, 0.0));
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FBillet fen = new FBillet();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        button0.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(283.0);
        button0.setText("2 - Acheter un abonnement");
        VBox.setMargin(button0, new Insets(0.0, 0.0, 5.0, 0.0));
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FAboAchat fen = new FAboAchat();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        button1.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(288.0);
        button1.setText("3 - Renouveler un abonnement");
        VBox.setMargin(button1, new Insets(0.0, 0.0, 5.0, 0.0));
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FAboRenouv1 fen = new FAboRenouv1();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        button2.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(300.0);
        button2.setText("4 - Acheter un pass");
        VBox.setMargin(button2, new Insets(0.0, 0.0, 5.0, 0.0));
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FPassMenu fen = new FPassMenu();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        button3.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0);
        button3.setPrefWidth(392.0);
        button3.setText("5 - Vérifier l'horaire d'un train");
        button3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FHoraire fen = new FHoraire();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
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
    @Override
    public void retour(){}
    @Override
    public void valider(){}
    @Override
    public void touche0(){}
    @Override
    public void touche1(){
        FBillet fen = new FBillet();
        FSimulation.fenetre = fen;
        getChildren().setAll(fen);
    }
    @Override
    public void touche2(){
        FAboAchat fen = new FAboAchat();
        FSimulation.fenetre = fen;
        getChildren().setAll(fen);
    }
    @Override
    public void touche3(){
        FAboRenouv1 fen = new FAboRenouv1();
        FSimulation.fenetre = fen;
        getChildren().setAll(fen);
    }
    @Override
    public void touche4(){
        FPassMenu fen = new FPassMenu();
        FSimulation.fenetre = fen;
        getChildren().setAll(fen);
    }
    @Override
    public void touche5(){
        FHoraire fen = new FHoraire();
        FSimulation.fenetre = fen;
        getChildren().setAll(fen);
    }
    @Override
    public void touche6(){}
    @Override
    public void touche7(){}
    @Override
    public void touche8(){}
    @Override
    public void touche9(){}
    @Override
    public void toucheA(){}
    @Override
    public void toucheB(){}
    @Override
    public void toucheC(){}
    @Override
    public void toucheD(){}
    @Override
    public void toucheE(){}
    @Override
    public void toucheF(){}
    @Override
    public void toucheG(){}
    @Override
    public void toucheH(){}
    @Override
    public void toucheI(){}
    @Override
    public void toucheJ(){}
    @Override
    public void toucheK(){}
    @Override
    public void toucheL(){}
    @Override
    public void toucheM(){}
    @Override
    public void toucheN(){}
    @Override
    public void toucheO(){}
    @Override
    public void toucheP(){}
    @Override
    public void toucheQ(){}
    @Override
    public void toucheR(){}
    @Override
    public void toucheS(){}
    @Override
    public void toucheT(){}
    @Override
    public void toucheU(){}
    @Override
    public void toucheV(){}
    @Override
    public void toucheW(){}
    @Override
    public void toucheX(){}
    @Override
    public void toucheY(){}
    @Override
    public void toucheZ(){}
    @Override
    public void toucheEff(){}
    @Override
    public void toucheEsp(){}
    @Override
    public void toucheSuiv(){}
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
