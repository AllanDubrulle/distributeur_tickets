package interfaceGraphique;

import javafx.scene.shape.*;

import java.text.NumberFormat;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherRecu extends Pane 
{	
    public AfficherRecu(double prix , double introduit , double rendu) 
    {
    	NumberFormat nf = NumberFormat.getInstance();
    	nf.setMaximumFractionDigits(2);
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text text = new Text();
        HBox hBox0 = new HBox();
        Text text0 = new Text();
        Text text1 = new Text();
        HBox hBox1 = new HBox();
        Text text2 = new Text();
        Text text3 = new Text();
        HBox hBox2 = new HBox();
        Text text4 = new Text();
        Text text5 = new Text();
        HBox hBox3 = new HBox();
        Text text6 = new Text();
        Text text7 = new Text();
        HBox hBox4 = new HBox();
        Text text8 = new Text();
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(250.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(250.0);
        vBox.setPrefWidth(250.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(300.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de MONS");
        text.setWrappingWidth(150.0);
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 5.0, 0.0));

        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(300.0);

        String format = "dd/MM/yy   HH:mm:ss"; 
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format); 
        java.util.Date date = new java.util.Date(); 
        
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(formater.format(date));
        text0.setWrappingWidth(150.0);
        HBox.setMargin(text0, new Insets(0.0));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("RECU");
        text1.setFont(new Font("System Bold Italic", 18.0));
        VBox.setMargin(text1, new Insets(0.0, 0.0, 20.0, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(300.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Montant à payer :");
        text2.setWrappingWidth(150.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(nf.format(prix) + " €");
        text3.setWrappingWidth(60.0);

        hBox2.setPrefHeight(0.0);
        hBox2.setPrefWidth(300.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Montant payé :");
        text4.setWrappingWidth(150.0);
        HBox.setMargin(text4, new Insets(0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(nf.format(introduit) + " €");
        text5.setWrappingWidth(60.0);
        VBox.setMargin(hBox2, new Insets(5.0, 0.0, 5.0, 0.0));

        hBox3.setPrefHeight(0.0);
        hBox3.setPrefWidth(300.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Rendu :");
        text6.setWrappingWidth(150.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(nf.format(rendu) + " €");
        text7.setWrappingWidth(60.0);

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(300.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("(carte / liquide)");
        text8.setWrappingWidth(150.0);
        HBox.setMargin(text8, new Insets(0.0));
        VBox.setMargin(hBox4, new Insets(20.0, 0.0, 5.0, 0.0));
        
        vBox.setPadding(new Insets(20.0, 20.0, 0.0, 20.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#f7f7f700"));
        rectangle.setHeight(235.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setSmooth(false);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(230.0);

        hBox.getChildren().add(text);
        hBox0.getChildren().add(text0);
        hBox1.getChildren().addAll(text2, text3);
        hBox2.getChildren().addAll(text4, text5);
        hBox3.getChildren().addAll(text6, text7);
        hBox4.getChildren().add(text8);
        vBox.getChildren().addAll(hBox, hBox0, text1, hBox1, hBox2, hBox3, hBox4);
        getChildren().addAll(vBox, rectangle);

    }
}