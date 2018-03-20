package interfaceGraphique;

import javafx.scene.shape.*;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherPassIllimite extends Pane 
{
    public AfficherPassIllimite(String nom, int classe, String reduction, String type, int nbrJours, double prix) 
    {
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text text = new Text();
        Text text0 = new Text();
        HBox hBox0 = new HBox();
        Text text1 = new Text();
        Text text2 = new Text();
        HBox hBox1 = new HBox();
        Text text3 = new Text();
        HBox hBox2 = new HBox();
        Text text4 = new Text();
        Text text5 = new Text();
        Text text6 = new Text();
        Text text7 = new Text();
        HBox hBox3 = new HBox();
        Text text8 = new Text();
        Text text9 = new Text();
        Text text10 = new Text();
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(205.0);
        setPrefWidth(580.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(205.0);
        vBox.setPrefWidth(580.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(580.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PASS ILLIMITE");
        text.setWrappingWidth(200.0);
        text.setFont(new Font("System Bold Italic", 18.0));
        
        String format = "dd/MM/yy   HH:mm:ss"; 
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format); 
        java.util.Date date = new java.util.Date(); 
        
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(formater.format(date));
        text0.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text0.setWrappingWidth(150.0);
        HBox.setMargin(text0, new Insets(0.0, 0.0, 0.0, 180.0));
        hBox.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(580.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(nom);
        text1.setWrappingWidth(200.0);
        text1.setFont(new Font("System Bold Italic", 18.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Gare de MONS");
        text2.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text2.setWrappingWidth(150.0);
        HBox.setMargin(text2, new Insets(0.0, 0.0, 0.0, 180.0));
        hBox0.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox0, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(580.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(classe + "e classe (" + type.toUpperCase() + ")");
        text3.setWrappingWidth(200.0);
        text3.setFont(new Font("System Bold", 18.0));
        hBox1.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 20.0, 20.0));

        hBox2.setPrefHeight(0.0);
        hBox2.setPrefWidth(580.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Valable du ");
        text4.setWrappingWidth(75.0);
        HBox.setMargin(text4, new Insets(0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        if(date.getMonth() == 9 || date.getMonth() == 10 || date.getMonth() == 11)
        	text5.setText(date.getDate() + "/" + (date.getMonth()+1) + "/" + (date.getYear()+1900));
        else
        	text5.setText(date.getDate() + "/0" + (date.getMonth()+1) + "/" + (date.getYear()+1900));
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text5.setWrappingWidth(100.0);
        HBox.setMargin(text5, new Insets(0.0, 0.0, 0.0, 50.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("au");
        text6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text6.setWrappingWidth(50.0);

        date.setDate(date.getDate()+nbrJours);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        if(date.getMonth() == 9 || date.getMonth() == 10 || date.getMonth() == 11)
        	text7.setText(date.getDate() + "/" + (date.getMonth()+1) + "/" + (date.getYear()+1900));
        else
        	text7.setText(date.getDate() + "/0" + (date.getMonth()+1) + "/" + (date.getYear()+1900));
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text7.setWrappingWidth(100.0);
        hBox2.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(0.0, 20.0, 20.0, 20.0));

        hBox3.setPrefHeight(0.0);
        hBox3.setPrefWidth(580.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("REDUCTION :");
        text8.setFont(new Font("System Bold", 15.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(reduction);
        text9.setWrappingWidth(175.0);
        HBox.setMargin(text9, new Insets(0.0, 0.0, 0.0, 44.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText(prix +"   EUR");
        text10.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text10.setWrappingWidth(100.0);
        HBox.setMargin(text10, new Insets(0.0, 0.0, 0.0, 110.0));
        text10.setFont(new Font("System Bold", 16.0));
        hBox3.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox3, new Insets(10.0, 20.0, 0.0, 20.0));
        vBox.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#ffffff00"));
        rectangle.setHeight(180.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(560.0);

        hBox.getChildren().addAll(text, text0);
        hBox0.getChildren().addAll(text1, text2);
        hBox1.getChildren().add(text3);
        hBox2.getChildren().addAll(text4, text5, text6, text7);
        hBox3.getChildren().addAll(text8, text9, text10);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3);
        getChildren().addAll(vBox, rectangle);

    }
}
