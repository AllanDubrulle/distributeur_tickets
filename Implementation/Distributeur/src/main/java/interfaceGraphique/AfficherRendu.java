package interfaceGraphique;

import javafx.scene.shape.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherRendu extends Pane 
{
    public AfficherRendu(int b50, int b20, int b10, int b5, int p200, int p100,
    		int p50, int p20, int p10, int p5, int p2, int p1) 
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
        Text texte25 = new Text();
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
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(385.0);
        setPrefWidth(250.0);

        boxVer.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        boxVer.setPrefHeight(385.0);
        boxVer.setPrefWidth(250.0);

        texte25.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte25.setStrokeWidth(0.0);
        texte25.setText("RENDU");
        texte25.setFont(new Font("System Bold Italic", 18.0));
        VBox.setMargin(texte25, new Insets(0.0, 0.0, 20.0, 0.0));

        boxHor1.setPrefHeight(0.0);
        boxHor1.setPrefWidth(300.0);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("50 €   x");
        texte1.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte1.setWrappingWidth(75.0);
        HBox.setMargin(texte1, new Insets(0.0));

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText(String.valueOf(b50));
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte2.setWrappingWidth(75.0);
        VBox.setMargin(boxHor1, new Insets(10.0, 0.0, 0.0, 30.0));

        boxHor2.setPrefHeight(0.0);
        boxHor2.setPrefWidth(300.0);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("20 €   x");
        texte3.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte3.setWrappingWidth(75.0);
        HBox.setMargin(texte3, new Insets(0.0));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText(String.valueOf(b20));
        texte4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte4.setWrappingWidth(75.0);
        VBox.setMargin(boxHor2, new Insets(5.0, 0.0, 5.0, 30.0));

        boxHor3.setPrefHeight(0.0);
        boxHor3.setPrefWidth(300.0);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText("10 €   x");
        texte5.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte5.setWrappingWidth(75.0);
        HBox.setMargin(texte5, new Insets(0.0));

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText(String.valueOf(b10));
        texte6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte6.setWrappingWidth(75.0);
        VBox.setMargin(boxHor3, new Insets(0.0, 0.0, 0.0, 30.0));

        boxHor4.setPrefHeight(0.0);
        boxHor4.setPrefWidth(300.0);

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText("5 €   x");
        texte7.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte7.setWrappingWidth(75.0);
        HBox.setMargin(texte7, new Insets(0.0));

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText(String.valueOf(b5));
        texte8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte8.setWrappingWidth(75.0);
        VBox.setMargin(boxHor4, new Insets(5.0, 0.0, 5.0, 30.0));

        boxHor5.setPrefHeight(0.0);
        boxHor5.setPrefWidth(300.0);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText("2 €   x");
        texte9.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte9.setWrappingWidth(75.0);
        HBox.setMargin(texte9, new Insets(0.0));

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText(String.valueOf(p200));
        texte10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte10.setWrappingWidth(75.0);
        VBox.setMargin(boxHor5, new Insets(0.0, 0.0, 0.0, 30.0));

        boxHor6.setPrefHeight(0.0);
        boxHor6.setPrefWidth(300.0);

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText("1 €   x");
        texte11.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte11.setWrappingWidth(75.0);
        HBox.setMargin(texte11, new Insets(0.0));

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText(String.valueOf(p100));
        texte12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte12.setWrappingWidth(75.0);
        VBox.setMargin(boxHor6, new Insets(0.0, 0.0, 0.0, 30.0));

        boxHor7.setPrefHeight(0.0);
        boxHor7.setPrefWidth(300.0);

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText("0.50 €   x");
        texte13.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte13.setWrappingWidth(75.0);
        HBox.setMargin(texte13, new Insets(0.0));

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setText(String.valueOf(p50));
        texte14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte14.setWrappingWidth(75.0);
        VBox.setMargin(boxHor7, new Insets(5.0, 0.0, 5.0, 30.0));

        boxHor8.setPrefHeight(0.0);
        boxHor8.setPrefWidth(300.0);

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        texte15.setText("0.20 €   x");
        texte15.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte15.setWrappingWidth(75.0);
        HBox.setMargin(texte15, new Insets(0.0));

        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte16.setStrokeWidth(0.0);
        texte16.setText(String.valueOf(p20));
        texte16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte16.setWrappingWidth(75.0);
        VBox.setMargin(boxHor8, new Insets(0.0, 0.0, 0.0, 30.0));

        boxHor9.setPrefHeight(0.0);
        boxHor9.setPrefWidth(300.0);

        texte17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte17.setStrokeWidth(0.0);
        texte17.setText("0.10 €   x");
        texte17.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte17.setWrappingWidth(75.0);
        HBox.setMargin(texte17, new Insets(0.0));

        texte18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte18.setStrokeWidth(0.0);
        texte18.setText(String.valueOf(p10));
        texte18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte18.setWrappingWidth(75.0);
        VBox.setMargin(boxHor9, new Insets(5.0, 0.0, 5.0, 30.0));

        boxHor10.setPrefHeight(0.0);
        boxHor10.setPrefWidth(300.0);

        texte19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte19.setStrokeWidth(0.0);
        texte19.setText("0.05 €   x");
        texte19.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte19.setWrappingWidth(75.0);
        HBox.setMargin(texte19, new Insets(0.0));

        texte20.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte20.setStrokeWidth(0.0);
        texte20.setText(String.valueOf(p5));
        texte20.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte20.setWrappingWidth(75.0);
        VBox.setMargin(boxHor10, new Insets(0.0, 0.0, 0.0, 30.0));

        boxHor11.setPrefHeight(0.0);
        boxHor11.setPrefWidth(300.0);

        texte21.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte21.setStrokeWidth(0.0);
        texte21.setText("0.02 €   x");
        texte21.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte21.setWrappingWidth(75.0);
        HBox.setMargin(texte21, new Insets(0.0));

        texte22.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte22.setStrokeWidth(0.0);
        texte22.setText(String.valueOf(p2));
        texte22.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte22.setWrappingWidth(75.0);
        VBox.setMargin(boxHor11, new Insets(5.0, 0.0, 5.0, 30.0));

        boxHor12.setPrefHeight(0.0);
        boxHor12.setPrefWidth(300.0);

        texte23.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte23.setStrokeWidth(0.0);
        texte23.setText("0.01 €   x");
        texte23.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte23.setWrappingWidth(75.0);
        HBox.setMargin(texte23, new Insets(0.0));

        texte24.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte24.setStrokeWidth(0.0);
        texte24.setText(String.valueOf(p1));
        texte24.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte24.setWrappingWidth(75.0);
        VBox.setMargin(boxHor12, new Insets(0.0, 0.0, 0.0, 30.0));
        
        boxVer.setPadding(new Insets(20.0, 20.0, 0.0, 20.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#f7f7f700"));
        rectangle.setHeight(365.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setSmooth(false);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(230.0);

        boxHor1.getChildren().addAll(texte1, texte2);
        boxHor2.getChildren().addAll(texte3, texte4);
        boxHor3.getChildren().addAll(texte5, texte6);
        boxHor4.getChildren().addAll(texte7, texte8);
        boxHor5.getChildren().addAll(texte9, texte10);
        boxHor6.getChildren().addAll(texte11, texte12);
        boxHor7.getChildren().addAll(texte13, texte14);
        boxHor8.getChildren().addAll(texte15, texte16);
        boxHor9.getChildren().addAll(texte17, texte18);
        boxHor10.getChildren().addAll(texte19, texte20);
        boxHor11.getChildren().addAll(texte21, texte22);
        boxHor12.getChildren().addAll(texte23, texte24);
        boxVer.getChildren().addAll(texte25, boxHor1, boxHor2, boxHor3, boxHor4, boxHor5, boxHor6, boxHor7, boxHor8, boxHor9, boxHor10, boxHor11, boxHor12);
        getChildren().add(boxVer);
        getChildren().add(rectangle);

    }
}