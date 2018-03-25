package interfaceGraphique;

import javafx.scene.shape.*;

import java.util.Date;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherAbo extends Pane 
{
	public AfficherAbo(int numero, String nom, int classe, String gareDepart, String gareArrivee, Date dateVal, Date dateExp, String reduction, String type, double prix) 
	{
        VBox boxVer = new VBox();
        HBox boxHor1 = new HBox();
        HBox boxHor2 = new HBox();
        HBox boxHor3 = new HBox();
        HBox boxHor4 = new HBox();
        HBox boxHor5 = new HBox();
        HBox boxHor6 = new HBox();
        HBox boxHor7 = new HBox();
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
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(265.0);
        setPrefWidth(580.0);

        boxVer.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        boxVer.setPrefHeight(265.0);
        boxVer.setPrefWidth(580.0);

        boxHor1.setPrefHeight(0.0);
        boxHor1.setPrefWidth(580.0);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("ABONNEMENT N°" + numero);
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
        texte5.setText(Integer.toString(classe) + "e classe (" + type.toUpperCase() + ")");
        texte5.setWrappingWidth(200.0);
        texte5.setFont(new Font("System Bold", 18.0));
        boxHor3.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor3, new Insets(0.0, 0.0, 20.0, 20.0));

        boxHor4.setPrefHeight(0.0);
        boxHor4.setPrefWidth(580.0);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("De :");
        texte6.setWrappingWidth(35.0);

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(gareDepart.toUpperCase());
        texte7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(texte7, new Insets(0.0, 0.0, 0.0, 50.0));
        boxHor4.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor4, new Insets(0.0, 20.0, 5.0, 20.0));

        boxHor5.setPrefHeight(0.0);
        boxHor5.setPrefWidth(580.0);

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText("A :");
        texte8.setWrappingWidth(35.0);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText(gareArrivee.toUpperCase());
        texte9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(texte9, new Insets(0.0, 0.0, 0.0, 50.0));
        boxHor5.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor5, new Insets(0.0, 20.0, 5.0, 20.0));

        boxHor6.setPrefHeight(0.0);
        boxHor6.setPrefWidth(580.0);

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText("Valable du ");
        texte10.setWrappingWidth(75.0);
        HBox.setMargin(texte10, new Insets(0.0));

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        if(dateVal.getMonth() == 9 || dateVal.getMonth() == 10 || dateVal.getMonth() == 11)
        	texte11.setText(dateVal.getDate() + "/" + String.valueOf(dateVal.getMonth()+1) + "/" + String.valueOf(dateVal.getYear()+1900));
        else
        	texte11.setText(dateVal.getDate() + "/0" + String.valueOf(dateVal.getMonth()+1) + "/" + String.valueOf(dateVal.getYear()+1900));
        texte11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte11.setWrappingWidth(100.0);
        HBox.setMargin(texte11, new Insets(0.0, 0.0, 0.0, 50.0));

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText("au");
        texte12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte12.setWrappingWidth(50.0);

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        if(dateExp.getMonth() == 9 || dateExp.getMonth() == 10 || dateExp.getMonth() == 11)
        	texte13.setText(dateExp.getDate() + "/" + String.valueOf(dateExp.getMonth()+1) + "/" + String.valueOf(dateExp.getYear()+1900));
        else
        	texte13.setText(dateExp.getDate() + "/0" + String.valueOf(dateExp.getMonth()+1) + "/" + String.valueOf(dateExp.getYear()+1900));
        texte13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte13.setWrappingWidth(100.0);
        boxHor6.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor6, new Insets(0.0, 20.0, 20.0, 20.0));

        boxHor7.setPrefHeight(0.0);
        boxHor7.setPrefWidth(580.0);

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setText("REDUCTION :");
        texte14.setFont(new Font("System Bold", 15.0));

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        texte15.setText(reduction);
        texte15.setWrappingWidth(200.0);
        HBox.setMargin(texte15, new Insets(0.0, 0.0, 0.0, 19.0));

        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte16.setStrokeWidth(0.0);
        texte16.setText(prix + "   EUR");
        texte16.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte16.setWrappingWidth(100.0);
        HBox.setMargin(texte16, new Insets(0.0, 0.0, 0.0, 110.0));
        texte16.setFont(new Font("System Bold", 16.0));
        boxHor7.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor7, new Insets(10.0, 20.0, 0.0, 20.0));
        boxVer.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#ffffff00"));
        rectangle.setHeight(240.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(560.0);

        boxHor1.getChildren().addAll(texte1, texte2);
        boxHor2.getChildren().addAll(texte3, texte4);
        boxHor3.getChildren().add(texte5);
        boxHor4.getChildren().addAll(texte6, texte7);
        boxHor5.getChildren().addAll(texte8, texte9);
        boxHor6.getChildren().addAll(texte10, texte11, texte12, texte13);
        boxHor7.getChildren().addAll(texte14, texte15, texte16);
        boxVer.getChildren().addAll(boxHor1, boxHor2, boxHor3, boxHor4, boxHor5, boxHor6, boxHor7);
        getChildren().addAll(boxVer, rectangle);
    }
}
