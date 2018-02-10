package Distributeur;

import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FAboRenouv1 extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public Button button;
    public Button button0;

    public FAboRenouv1() {

        rectangle = new Rectangle();
        text = new Text();
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
        text.setLayoutY(83.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Renouveler un abonnement");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        button.setLayoutX(318.0);
        button.setLayoutY(185.0);
        button.setMnemonicParsing(false);
        button.setText("Scanner le code barre");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FAboRenouv2 fen = new FAboRenouv2();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        button0.setLayoutX(359.5);
        button0.setLayoutY(349.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Annuler");
        button0.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                FMenu fen = new FMenu();
                FSimulation.fenetre = fen;
                getChildren().setAll(fen);
            }});

        getChildren().addAll(rectangle, text, button, button0);

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
    public void touche0(){}
    @Override
    public void touche1(){}
    @Override
    public void touche2(){}
    @Override
    public void touche3(){}
    @Override
    public void touche4(){}
    @Override
    public void touche5(){}
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
