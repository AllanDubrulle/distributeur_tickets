package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FPass1 extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public VBox vBox;
    public HBox hBox;
    public HBox hBox0;
    public Text text0;
    public TextField textField;
    public HBox hBox1;
    public Text text1;
    public TextField textField1;
    public HBox hBox2;
    public Text text2;
    public TextField textField2;
    public HBox hBox3;
    public Text text3;
    public RadioButton radioButton;
    public RadioButton radioButton1;
    public HBox hBox4;
    public Text text4;
    public TextField textField3;
    public HBox hBox5;
    public Text text5;
    public TextField textField0;
    public Button button;
    public Button button0;

    public FPass1() {

        rectangle = new Rectangle();
        text = new Text();
        vBox = new VBox();
        hBox = new HBox();
        hBox0 = new HBox();
        text0 = new Text();
        textField = new TextField();
        hBox1 = new HBox();
        text1 = new Text();
        textField1 = new TextField();
        hBox2 = new HBox();
        text2 = new Text();
        textField2 = new TextField();
        hBox3 = new HBox();
        text3 = new Text();
        radioButton = new RadioButton();
        radioButton1 = new RadioButton();
        hBox4 = new HBox();
        text4 = new Text();
        textField3 = new TextField();
        hBox5 = new HBox();
        text5 = new Text();
        textField0 = new TextField();
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
            @Override
            public void handle(ActionEvent event){
                FPassMenu fen = new FPassMenu();
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
        hBox1.getChildren().addAll(text1, textField1);
        hBox2.getChildren().addAll(text2, textField2);
        hBox3.getChildren().addAll(text3, radioButton, radioButton1);
        hBox4.getChildren().addAll(text4, textField3);
        hBox5.getChildren().addAll(text5, textField0);
        vBox.getChildren().addAll(hBox, hBox1, hBox2, hBox3, hBox4, hBox5);
        getChildren().addAll(rectangle, text, vBox, button, button0);

    }
    @Override
    public void retour(){
        FPassMenu fen = new FPassMenu();
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
