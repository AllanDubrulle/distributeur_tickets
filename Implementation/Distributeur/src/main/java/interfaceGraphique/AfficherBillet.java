package interfaceGraphique;

import java.util.Date;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;

class AfficherBillet extends Pane 
{
    public AfficherBillet(String gareDepart, String gareArrivee, boolean allerRetour, int classe, String type, String reduc, Date date, double prix) 
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
        HBox hBox3 = new HBox();
        Text text6 = new Text();
        Text text7 = new Text();
        HBox hBox4 = new HBox();
        Text text8 = new Text();
        Text text9 = new Text();
        HBox hBox5 = new HBox();
        Text text10 = new Text();
        Text text11 = new Text();
        Text text12 = new Text();
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(580.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(300.0);
        vBox.setPrefWidth(580.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(580.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("BILLET " + type.toUpperCase());
        text.setWrappingWidth(200.0);
        text.setFont(new Font("System Bold Italic", 18.0));

        String format = "dd/MM/yy   HH:mm:ss"; 
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format); 
        java.util.Date dateAchat = new java.util.Date(); 
        
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(formater.format(dateAchat));
        text0.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text0.setWrappingWidth(150.0);
        HBox.setMargin(text0, new Insets(0.0, 0.0, 0.0, 180.0));
        hBox.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(580.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        if (allerRetour)
        {
        	text1.setText("Aller retour");	
        }
        else
        {
        	text1.setText("Aller simple");
        }
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
        text3.setText(Integer.toString(classe) +"e classe");
        text3.setWrappingWidth(200.0);
        text3.setFont(new Font("System Bold", 18.0));
        hBox1.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 20.0, 20.0));

        hBox2.setPrefHeight(0.0);
        hBox2.setPrefWidth(580.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("De :");
        text4.setWrappingWidth(35.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(gareDepart);
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(text5, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox2.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(0.0, 20.0, 5.0, 20.0));

        hBox3.setPrefHeight(0.0);
        hBox3.setPrefWidth(580.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("A :");
        text6.setWrappingWidth(35.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(gareArrivee);
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(text7, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox3.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox3, new Insets(0.0, 20.0, 5.0, 20.0));

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(580.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Le :");
        text8.setWrappingWidth(35.0);
        HBox.setMargin(text8, new Insets(0.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(date.getDate() + "/" + String.valueOf(date.getMonth()+1) + "/" + String.valueOf(date.getYear()+1900));
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(text9, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox4.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox4, new Insets(0.0, 20.0, 20.0, 20.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(580.0);

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("REDUCTION :");
        text10.setFont(new Font("System Bold", 15.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText(reduc);
        text11.setWrappingWidth(175.0);
        HBox.setMargin(text11, new Insets(0.0, 0.0, 0.0, 44.0));

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText(prix + "   EUR");
        text12.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text12.setWrappingWidth(100.0);
        HBox.setMargin(text12, new Insets(0.0, 0.0, 0.0, 110.0));
        text12.setFont(new Font("System Bold", 16.0));
        hBox5.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox5, new Insets(10.0, 20.0, 0.0, 20.0));
        
        vBox.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#ffffff00"));
        rectangle.setHeight(240.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(560.0);

        hBox.getChildren().addAll(text, text0);
        hBox0.getChildren().addAll(text1, text2);
        hBox1.getChildren().add(text3);
        hBox2.getChildren().addAll(text4, text5);
        hBox3.getChildren().addAll(text6, text7);
        hBox4.getChildren().addAll(text8, text9);
        hBox5.getChildren().addAll(text10, text11, text12);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4, hBox5);
        getChildren().addAll(vBox, rectangle);
    }
}
