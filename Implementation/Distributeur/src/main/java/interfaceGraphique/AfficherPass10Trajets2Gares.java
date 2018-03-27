package interfaceGraphique;

import javafx.scene.shape.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherPass10Trajets2Gares extends Pane 
{
    public AfficherPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type, double prix) 
    {
        VBox boxVer = new VBox();
        HBox boxHor1 = new HBox();
        HBox boxHor2 = new HBox();
        HBox boxHor3 = new HBox();
        HBox boxHor4 = new HBox();
        HBox boxHor5 = new HBox();
        HBox boxHor6 = new HBox();
        HBox boxHor7 = new HBox();
        HBox boxHor8 = new HBox();
        HBox boxHor9 = new HBox();
        HBox boxHor10 = new HBox();
        HBox boxHor11 = new HBox();
        HBox boxHor12 = new HBox();
        HBox boxHor13 = new HBox();
        HBox boxHor14 = new HBox();
        HBox boxHor15 = new HBox();
        Text texte1 = new Text();
        Text texte2 = new Text();
        Text texte3 = new Text();
        Text texte4 = new Text();
        Text texte5 = new Text();
        Text texte6 = new Text();
        Text texte7 = new Text();
        Text texte8 = new Text();
        Text texte9 = new Text();
        Text texte10 = new Text();
        Text texte11 = new Text();
        Text texte12 = new Text();
        Text texte13 = new Text();
        Text texte14 = new Text();
        Text texte15 = new Text();
        Text texte16 = new Text();
        Text texte17 = new Text();
        Text texte18 = new Text();
        Text texte19 = new Text();
        Text texte20 = new Text();
        Text texte21 = new Text();
        Text texte22 = new Text();
        Text texte23 = new Text();
        Text texte24 = new Text();
        Text texte25 = new Text();
        Text texte26 = new Text();
        Text texte27 = new Text();
        Text texte28 = new Text();
        Text texte29 = new Text();
        Text texte30 = new Text();
        Text texte31 = new Text();
        Text texte32 = new Text();
        Text texte33 = new Text();
        Text texte34 = new Text();
        Text texte35 = new Text();
        Text texte36 = new Text();
        Text texte37 = new Text();
        Text texte38 = new Text();
        Text texte39 = new Text();
        Text texte40 = new Text();
        Text texte41 = new Text();
        Rectangle rectangle = new Rectangle();
        Line ligne1 = new Line();
        Line ligne2 = new Line();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(350.0);
        setPrefWidth(580.0);

        boxVer.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        boxVer.setPrefHeight(265.0);
        boxVer.setPrefWidth(580.0);

        boxHor1.setPrefHeight(0.0);
        boxHor1.setPrefWidth(580.0);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("PASS 10 TRAJETS 2 GARES");
        texte1.setWrappingWidth(250.0);
        texte1.setFont(new Font("System Bold Italic", 18.0));
        
        String format = "dd/MM/yy   HH:mm:ss"; 
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format); 
        java.util.Date date = new java.util.Date(); 

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText(formater.format(date));
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte2.setWrappingWidth(150.0);
        HBox.setMargin(texte2, new Insets(0.0, 0.0, 0.0, 130.0));
        boxHor1.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor1, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor2.setPrefHeight(0.0);
        boxHor2.setPrefWidth(580.0);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText(nom.toUpperCase());
        texte3.setWrappingWidth(200.0);
        texte3.setFont(new Font("System Bold Italic", 18.0));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Gare de MONS");
        texte4.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte4.setWrappingWidth(150.0);
        HBox.setMargin(texte4, new Insets(0.0, 0.0, 0.0, 180.0));
        boxHor2.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor2, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor3.setPrefHeight(0.0);
        boxHor3.setPrefWidth(580.0);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText(classe + "e classe (" + type.toUpperCase() + ")");
        texte5.setWrappingWidth(200.0);
        texte5.setFont(new Font("System Bold Italic", 18.0));
        boxHor3.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor3, new Insets(0.0, 20.0, 15.0, 20.0));

        boxHor4.setPrefHeight(0.0);
        boxHor4.setPrefWidth(580.0);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("Date :");
        texte6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte6.setWrappingWidth(170.0);
        HBox.setMargin(texte6, new Insets(0.0, 5.0, 0.0, 5.0));

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText("De :");
        texte7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte7.setWrappingWidth(170.0);
        HBox.setMargin(texte7, new Insets(0.0, 5.0, 0.0, 5.0));

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText("A :");
        texte8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte8.setWrappingWidth(170.0);
        HBox.setMargin(texte8, new Insets(0.0, 5.0, 0.0, 5.0));
        boxHor4.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor4, new Insets(0.0, 20.0, 5.0, 20.0));

        boxHor5.setPrefHeight(0.0);
        boxHor5.setPrefWidth(580.0);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte9.setWrappingWidth(170.0);
        HBox.setMargin(texte9, new Insets(0.0, 5.0, 0.0, 5.0));
        texte9.setFont(new Font(10.0));

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText(gareDepart.toUpperCase());
        texte10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte10.setWrappingWidth(170.0);
        texte10.setFont(new Font(10.0));

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText(gareArrivee.toUpperCase());
        texte11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte11.setWrappingWidth(170.0);
        texte11.setFont(new Font(10.0));
        boxHor5.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor5, new Insets(0.0, 20.0, 5.0, 20.0));

        boxHor6.setPrefHeight(0.0);
        boxHor6.setPrefWidth(580.0);

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte12.setWrappingWidth(170.0);
        texte12.setFont(new Font(10.0));
        HBox.setMargin(texte12, new Insets(0.0, 5.0, 0.0, 5.0));

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText(gareDepart.toUpperCase());
        texte13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte13.setWrappingWidth(170.0);
        texte13.setFont(new Font(10.0));

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setText(gareArrivee.toUpperCase());
        texte14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte14.setWrappingWidth(170.0);
        texte14.setFont(new Font(10.0));
        boxHor6.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor6, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor7.setPrefHeight(0.0);
        boxHor7.setPrefWidth(580.0);

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        texte15.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte15.setWrappingWidth(170.0);
        texte15.setFont(new Font(10.0));
        HBox.setMargin(texte15, new Insets(0.0, 5.0, 0.0, 5.0));

        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte16.setStrokeWidth(0.0);
        texte16.setText(gareDepart.toUpperCase());
        texte16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte16.setWrappingWidth(170.0);
        texte16.setFont(new Font(10.0));

        texte17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte17.setStrokeWidth(0.0);
        texte17.setText(gareArrivee.toUpperCase());
        texte17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte17.setWrappingWidth(170.0);
        texte17.setFont(new Font(10.0));
        boxHor7.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor7, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor8.setPrefHeight(0.0);
        boxHor8.setPrefWidth(580.0);

        texte18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte18.setStrokeWidth(0.0);
        texte18.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte18.setWrappingWidth(170.0);
        texte18.setFont(new Font(10.0));
        HBox.setMargin(texte18, new Insets(0.0, 5.0, 0.0, 5.0));

        texte19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte19.setStrokeWidth(0.0);
        texte19.setText(gareDepart.toUpperCase());
        texte19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte19.setWrappingWidth(170.0);
        texte19.setFont(new Font(10.0));

        texte20.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte20.setStrokeWidth(0.0);
        texte20.setText(gareArrivee.toUpperCase());
        texte20.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte20.setWrappingWidth(170.0);
        texte20.setFont(new Font(10.0));
        boxHor8.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor8, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor9.setPrefHeight(0.0);
        boxHor9.setPrefWidth(580.0);

        texte21.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte21.setStrokeWidth(0.0);
        texte21.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte21.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte21.setWrappingWidth(170.0);
        texte21.setFont(new Font(10.0));
        HBox.setMargin(texte21, new Insets(0.0, 5.0, 0.0, 5.0));

        texte22.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte22.setStrokeWidth(0.0);
        texte22.setText(gareDepart.toUpperCase());
        texte22.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte22.setWrappingWidth(170.0);
        texte22.setFont(new Font(10.0));

        texte23.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte23.setStrokeWidth(0.0);
        texte23.setText(gareArrivee.toUpperCase());
        texte23.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte23.setWrappingWidth(170.0);
        texte23.setFont(new Font(10.0));
        boxHor9.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor9, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor10.setPrefHeight(0.0);
        boxHor10.setPrefWidth(580.0);

        texte24.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte24.setStrokeWidth(0.0);
        texte24.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte24.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte24.setWrappingWidth(170.0);
        texte24.setFont(new Font(10.0));
        HBox.setMargin(texte24, new Insets(0.0, 5.0, 0.0, 5.0));

        texte25.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte25.setStrokeWidth(0.0);
        texte25.setText(gareDepart.toUpperCase());
        texte25.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte25.setWrappingWidth(170.0);
        texte25.setFont(new Font(10.0));

        texte26.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte26.setStrokeWidth(0.0);
        texte26.setText(gareArrivee.toUpperCase());
        texte26.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte26.setWrappingWidth(170.0);
        texte26.setFont(new Font(10.0));
        boxHor10.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor10, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor11.setPrefHeight(0.0);
        boxHor11.setPrefWidth(580.0);

        texte27.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte27.setStrokeWidth(0.0);
        texte27.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte27.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte27.setWrappingWidth(170.0);
        texte27.setFont(new Font(10.0));
        HBox.setMargin(texte27, new Insets(0.0, 5.0, 0.0, 5.0));

        texte28.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte28.setStrokeWidth(0.0);
        texte28.setText(gareDepart.toUpperCase());
        texte28.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte28.setWrappingWidth(170.0);
        texte28.setFont(new Font(10.0));

        texte29.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte29.setStrokeWidth(0.0);
        texte29.setText(gareArrivee.toUpperCase());
        texte29.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte29.setWrappingWidth(170.0);
        texte29.setFont(new Font(10.0));
        boxHor11.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor11, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor12.setPrefHeight(0.0);
        boxHor12.setPrefWidth(580.0);

        texte30.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte30.setStrokeWidth(0.0);
        texte30.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte30.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte30.setWrappingWidth(170.0);
        texte30.setFont(new Font(10.0));
        HBox.setMargin(texte30, new Insets(0.0, 5.0, 0.0, 5.0));

        texte31.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte31.setStrokeWidth(0.0);
        texte31.setText(gareDepart.toUpperCase());
        texte31.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte31.setWrappingWidth(170.0);
        texte31.setFont(new Font(10.0));

        texte32.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte32.setStrokeWidth(0.0);
        texte32.setText(gareArrivee.toUpperCase());
        texte32.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte32.setWrappingWidth(170.0);
        texte32.setFont(new Font(10.0));
        boxHor12.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor12, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor13.setPrefHeight(0.0);
        boxHor13.setPrefWidth(580.0);

        texte33.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte33.setStrokeWidth(0.0);
        texte33.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte33.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte33.setWrappingWidth(170.0);
        texte33.setFont(new Font(10.0));
        HBox.setMargin(texte33, new Insets(0.0, 5.0, 0.0, 5.0));

        texte34.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte34.setStrokeWidth(0.0);
        texte34.setText(gareDepart.toUpperCase());
        texte34.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte34.setWrappingWidth(170.0);
        texte34.setFont(new Font(10.0));

        texte35.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte35.setStrokeWidth(0.0);
        texte35.setText(gareArrivee.toUpperCase());
        texte35.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte35.setWrappingWidth(170.0);
        texte35.setFont(new Font(10.0));
        boxHor13.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor13, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor14.setPrefHeight(0.0);
        boxHor14.setPrefWidth(580.0);

        texte36.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte36.setStrokeWidth(0.0);
        texte36.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        texte36.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte36.setWrappingWidth(170.0);
        texte36.setFont(new Font(10.0));
        HBox.setMargin(texte36, new Insets(0.0, 5.0, 0.0, 5.0));

        texte37.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte37.setStrokeWidth(0.0);
        texte37.setText(gareDepart.toUpperCase());
        texte37.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte37.setWrappingWidth(170.0);
        texte37.setFont(new Font(10.0));

        texte38.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte38.setStrokeWidth(0.0);
        texte38.setText(gareArrivee.toUpperCase());
        texte38.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte38.setWrappingWidth(170.0);
        texte38.setFont(new Font(10.0));
        boxHor14.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor14, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor15.setPrefHeight(0.0);
        boxHor15.setPrefWidth(580.0);

        texte39.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte39.setStrokeWidth(0.0);
        texte39.setText("REDUCTION :");
        texte39.setFont(new Font("System Bold", 15.0));

        texte40.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte40.setStrokeWidth(0.0);
        texte40.setText(reduction);
        texte40.setWrappingWidth(200.0);
        HBox.setMargin(texte40, new Insets(0.0, 0.0, 0.0, 19.0));

        texte41.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte41.setStrokeWidth(0.0);
        texte41.setText(prix + "   EUR");
        texte41.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte41.setWrappingWidth(100.0);
        HBox.setMargin(texte41, new Insets(0.0, 0.0, 0.0, 110.0));
        texte41.setFont(new Font("System Bold", 16.0));
        boxHor15.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor15, new Insets(10.0, 20.0, 0.0, 20.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#ffffff00"));
        rectangle.setHeight(330.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(560.0);

        ligne1.setEndY(150.0);
        ligne1.setLayoutX(195.0);
        ligne1.setLayoutY(125.0);

        ligne2.setEndY(150.0);
        ligne2.setLayoutX(370.0);
        ligne2.setLayoutY(125.0);

        boxHor1.getChildren().addAll(texte1, texte2);
        boxHor2.getChildren().addAll(texte3, texte4);
        boxHor3.getChildren().add(texte5);
        boxHor4.getChildren().addAll(texte6, texte7, texte8);
        boxHor5.getChildren().addAll(texte9, texte10, texte11);
        boxHor6.getChildren().addAll(texte12, texte13, texte14);
        boxHor7.getChildren().addAll(texte15, texte16, texte17);
        boxHor8.getChildren().addAll(texte18, texte19, texte20);
        boxHor9.getChildren().addAll(texte21, texte22, texte23);
        boxHor10.getChildren().addAll(texte24, texte25, texte26);
        boxHor11.getChildren().addAll(texte27, texte28, texte29);
        boxHor12.getChildren().addAll(texte30, texte31, texte32);
        boxHor13.getChildren().addAll(texte33, texte34, texte35);
        boxHor14.getChildren().addAll(texte36, texte37, texte38);
        boxHor15.getChildren().addAll(texte39, texte40, texte41);
        boxVer.getChildren().addAll(boxHor1, boxHor2, boxHor3, boxHor4, boxHor5, boxHor6, boxHor7, boxHor8, boxHor9, boxHor10, boxHor11, boxHor12, boxHor13, boxHor14, boxHor15);
        getChildren().addAll(boxVer, rectangle, ligne1, ligne2);

    }
}
