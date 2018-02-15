package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FHoraire extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public HBox hBox;
    public VBox vBox;
    public Text text0;
    public Text text1;
    public Text text2;
    public Text text3;
    public Text text4;
    public Text text5;
    public VBox vBox0;
    public TextField textField5;
    public HBox hBox0;
    public TextField textField;
    public Text text6;
    public TextField textField0;
    public TextField textField6;
    public HBox hBox1;
    public TextField textField1;
    public Text text7;
    public TextField textField2;
    public HBox hBox2;
    public TextField textField7;
    public Text text8;
    public TextField textField8;
    public HBox hBox3;
    public TextField textField3;
    public Text text9;
    public TextField textField4;
    public VBox vBox1;
    public Button button;
    public Button button0;
    public Button button1;
    public Button button2;
    
    private static FHoraire instance;

    private FHoraire() {

        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Text text0 = new Text();
        Text text1 = new Text();
        Text text2 = new Text();
        Text text3 = new Text();
        Text text4 = new Text();
        Text text5 = new Text();
        vBox0 = new VBox();
        textField5 = new TextField();
        hBox0 = new HBox();
        textField = new TextField();
        text6 = new Text();
        textField0 = new TextField();
        textField6 = new TextField();
        hBox1 = new HBox();
        textField1 = new TextField();
        text7 = new Text();
        textField2 = new TextField();
        hBox2 = new HBox();
        textField7 = new TextField();
        text8 = new Text();
        textField8 = new TextField();
        hBox3 = new HBox();
        textField3 = new TextField();
        text9 = new Text();
        textField4 = new TextField();
        vBox1 = new VBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();

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
        text.setLayoutY(58.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Vérifier un horaire de train");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        hBox.setLayoutX(60.0);
        hBox.setLayoutY(88.0);
        hBox.setPrefHeight(135.0);
        hBox.setPrefWidth(670.0);

        vBox.setPrefHeight(135.0);
        vBox.setPrefWidth(188.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Départs dans une gare : ");
        VBox.setMargin(text0, new Insets(5.0, 0.0, 5.0, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("     Heure :");
        VBox.setMargin(text1, new Insets(10.0, 0.0, 0.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Arrivées dans une gare :");
        VBox.setMargin(text2, new Insets(30.0, 0.0, 5.0, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("     Heure :");
        VBox.setMargin(text3, new Insets(10.0, 0.0, 0.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Itinéraire :");
        VBox.setMargin(text4, new Insets(30.0, 0.0, 5.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("     Heure de départ :");
        VBox.setMargin(text5, new Insets(10.0, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox, new Insets(0.0, 0.0, 0.0, 20.0));

        vBox0.setPrefHeight(135.0);
        vBox0.setPrefWidth(332.0);

        textField5.setPrefWidth(300.0);
        textField5.setPromptText("Entrez la gare de départ.");
        textField5.setPrefColumnCount(50);
        textField5.getText();
        VBox.setMargin(textField5, new Insets(0.0, 0.0, 5.0, 0.0));

        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);

        textField.setPrefHeight(31.0);
        textField.setPrefWidth(40.0);
        textField.setPromptText("hh");
        textField.setPrefColumnCount(50);
        textField.getText();

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText(" : ");
        HBox.setMargin(text6, new Insets(5.0, 0.0, 0.0, 0.0));

        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(40.0);
        textField0.setPromptText("mm");
        textField0.setPrefColumnCount(50);
        textField0.getText();
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));

        textField6.setPrefWidth(300.0);
        textField6.setPromptText("Entrez la gare d'arrivée.");
        textField6.setPrefColumnCount(50);
        textField6.getText();
        VBox.setMargin(textField6, new Insets(11.0, 0.0, 5.0, 0.0));

        hBox1.setPrefHeight(100.0);
        hBox1.setPrefWidth(200.0);

        textField1.setPrefHeight(31.0);
        textField1.setPrefWidth(40.0);
        textField1.setPromptText("hh");
        textField1.setPrefColumnCount(50);
        textField1.getText();

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(" : ");
        HBox.setMargin(text7, new Insets(5.0, 0.0, 0.0, 0.0));

        textField2.setPrefHeight(31.0);
        textField2.setPrefWidth(40.0);
        textField2.setPromptText("mm");
        textField2.setPrefColumnCount(50);
        textField2.getText();

        hBox2.setPrefHeight(100.0);
        hBox2.setPrefWidth(200.0);

        textField7.setPrefWidth(150.0);
        textField7.setPromptText("Départ");
        textField7.setPrefColumnCount(50);
        textField7.getText();

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("  à   ");
        HBox.setMargin(text8, new Insets(5.0, 0.0, 0.0, 0.0));

        textField8.setPrefWidth(150.0);
        textField8.setPromptText("Arrivée");
        textField8.setPrefColumnCount(50);
        textField8.getText();
        VBox.setMargin(hBox2, new Insets(21.0, 0.0, 5.0, 0.0));

        hBox3.setPrefHeight(100.0);
        hBox3.setPrefWidth(200.0);

        textField3.setPrefHeight(31.0);
        textField3.setPrefWidth(40.0);
        textField3.setPromptText("hh");
        textField3.setPrefColumnCount(50);
        textField3.getText();

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(" : ");
        HBox.setMargin(text9, new Insets(5.0, 0.0, 0.0, 0.0));

        textField4.setPrefHeight(31.0);
        textField4.setPrefWidth(40.0);
        textField4.setPromptText("mm");
        textField4.setPrefColumnCount(50);
        textField4.getText();
        VBox.setMargin(hBox3, new Insets(0.0));

        vBox1.setPrefHeight(200.0);
        vBox1.setPrefWidth(100.0);

        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(185.0);
        button.setText("Rechercher");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button, new Insets(20.0, 0.0, 0.0, 0.0));
        button.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixRechercheGD();
        	}
        });

        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(237.0);
        button0.setText("Rechercher");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button0, new Insets(50.0, 0.0, 0.0, 0.0));
        button0.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixRechercheGA();
        	}
        });

        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(192.0);
        button1.setText("Rechercher");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button1, new Insets(50.0, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox1, new Insets(0.0, 0.0, 0.0, 10.0));
        button.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixRechercheGDEtGA();
        	}
        });

        button2.setLayoutX(359.0);
        button2.setLayoutY(349.0);
        button2.setMnemonicParsing(false);
        button2.setText("Annuler");
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixAnnuler();
            }});

        vBox.getChildren().addAll(text0, text1, text2, text3, text4, text5);
        hBox0.getChildren().addAll(textField, text6, textField0);
        hBox1.getChildren().addAll(textField1, text7, textField2);
        hBox2.getChildren().addAll(textField7, text8, textField8);
        hBox3.getChildren().addAll(textField3, text9, textField4);
        vBox0.getChildren().addAll(textField5, hBox0, textField6, hBox1,hBox2, hBox3);
        vBox1.getChildren().addAll(button, button0, button1);
        hBox.getChildren().addAll(vBox, vBox0, vBox1);
        getChildren().addAll(rectangle, text, hBox, button2);
    }

    public static FHoraire getInstance() {
    	if (instance == null)
    		instance = new FHoraire();
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