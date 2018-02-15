package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

public class FRecapAboAchat extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public VBox vBox;
    public HBox hBox;
    public HBox hBox0;
    public Text text0;
    public Text text1;
    public HBox hBox1;
    public Text text2;
    public Text text3;
    public HBox hBox2;
    public Text text4;
    public Text text5;
    public HBox hBox3;
    public Text text6;
    public Text text7;
    public HBox hBox4;
    public Text text8;
    public Text text9;
    public HBox hBox5;
    public Text text10;
    public Text text11;
    public HBox hBox6;
    public Text text12;
    public Text text13;
    public HBox hBox7;
    public Text text14;
    public Text text15;
    public Button button;
    public Button button0;
    
    public static FRecapAboAchat instance;
    
    private FRecapAboAchat() {

        rectangle = new Rectangle();
        text = new Text();
        vBox = new VBox();
        hBox = new HBox();
        hBox0 = new HBox();
        text0 = new Text();
        text1 = new Text();
        hBox1 = new HBox();
        text2 = new Text();
        text3 = new Text();
        hBox2 = new HBox();
        text4 = new Text();
        text5 = new Text();
        hBox3 = new HBox();
        text6 = new Text();
        text7 = new Text();
        hBox4 = new HBox();
        text8 = new Text();
        text9 = new Text();
        hBox5 = new HBox();
        text10 = new Text();
        text11 = new Text();
        hBox6 = new HBox();
        text12 = new Text();
        text13 = new Text();
        hBox7 = new HBox();
        text14 = new Text();
        text15 = new Text();
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
        text.setText("Achat d'un abonnement (récapitulatif de commande)");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        vBox.setLayoutX(87.0);
        vBox.setLayoutY(86.0);
        vBox.setPrefHeight(169.0);
        vBox.setPrefWidth(490.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0);

        hBox0.setPrefHeight(12.0);
        hBox0.setPrefWidth(711.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        HBox.setMargin(text0, new Insets(0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("(nom)");
        text1.setWrappingWidth(200.0);
        text1.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text1, new Insets(0.0, 0.0, 0.0, 159.0));
        hBox0.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox1.setPrefHeight(12.0);
        hBox1.setPrefWidth(711.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Numéro de registre national : ");
        HBox.setMargin(text2, new Insets(0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("(numero de registre)");
        text3.setWrappingWidth(200.0);
        text3.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text3, new Insets(0.0, 0.0, 0.0, 5.0));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Gare de départ :");
        HBox.setMargin(text4, new Insets(0.0, 70.0, 0.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("(gare depart)");
        text5.setWrappingWidth(200.0);
        text5.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text5, new Insets(0.0, 0.0, 0.0, 25.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(31.0);
        hBox3.setPrefWidth(729.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Gare d'arrivée :");
        HBox.setMargin(text6, new Insets(0.0, 77.0, 0.0, 0.0));

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("(gare arrivee)");
        text7.setWrappingWidth(200.0);
        text7.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text7, new Insets(0.0, 0.0, 0.0, 25.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox4.setPrefHeight(41.0);
        hBox4.setPrefWidth(725.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Validité de l'abonnement :");
        HBox.setMargin(text8, new Insets(0.0, 31.0, 0.0, 0.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("(validite)");
        text9.setWrappingWidth(200.0);
        text9.setFont(new Font("System Bold Italic", 15.0));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(17.0);
        hBox5.setPrefWidth(244.0);

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("Classe :");
        HBox.setMargin(text10, new Insets(0.0, 157.0, 0.0, 0.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("(classe)");
        text11.setWrappingWidth(200.0);
        text11.setFont(new Font("System Bold Italic", 15.0));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox6.setPrefHeight(17.0);
        hBox6.setPrefWidth(244.0);

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("Réduction :");
        HBox.setMargin(text12, new Insets(0.0));

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("(reduction)");
        text13.setWrappingWidth(200.0);
        text13.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text13, new Insets(0.0, 0.0, 0.0, 130.0));
        hBox6.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox7.setPrefHeight(17.0);
        hBox7.setPrefWidth(244.0);

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText("Prix :");
        HBox.setMargin(text14, new Insets(0.0));

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("(prix)");
        text15.setWrappingWidth(200.0);
        text15.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text15, new Insets(0.0, 0.0, 0.0, 170.0));
        hBox7.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        button.setLayoutX(23.0);
        button.setLayoutY(354.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Retour");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixRetour();
        	}
        });

        button0.setLayoutX(679.0);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(100.0);
        button0.setText("Paiement");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixPaiement();
        	}
        });

        hBox0.getChildren().addAll(text0, text1);
        hBox1.getChildren().addAll(text2, text3);
        hBox2.getChildren().addAll(text4, text5);
        hBox3.getChildren().addAll(text6, text7);
        hBox4.getChildren().addAll(text8, text9);
        hBox5.getChildren().addAll(text10, text11);
        hBox6.getChildren().addAll(text12, text13);
        hBox7.getChildren().addAll(text14, text15);
        vBox.getChildren().addAll(hBox0, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }

    public static FRecapAboAchat getInstance() {
    	if (instance == null)
    		instance = new FRecapAboAchat();
    	return instance;
    }
}