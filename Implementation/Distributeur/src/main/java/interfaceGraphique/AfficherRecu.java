package interfaceGraphique;

import javafx.scene.shape.*;

import java.text.NumberFormat;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherRecu extends Pane 
{	
    public AfficherRecu(double prix , double introduit , double rendu, String modePaiement) 
    {
    	NumberFormat nf = NumberFormat.getInstance();
    	nf.setMaximumFractionDigits(2);
    	
        VBox boxVer = new VBox();
        HBox boxHor1 = new HBox();
        HBox boxHor2 = new HBox();
        HBox boxHor3 = new HBox();
        HBox boxHor4 = new HBox();
        HBox boxHor5 = new HBox();
        HBox boxHor6 = new HBox();
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
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(250.0);

        boxVer.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        boxVer.setPrefHeight(250.0);
        boxVer.setPrefWidth(250.0);

        boxHor1.setPrefHeight(0.0);
        boxHor1.setPrefWidth(300.0);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Gare de MONS");
        texte1.setWrappingWidth(150.0);
        VBox.setMargin(boxHor1, new Insets(0.0, 0.0, 5.0, 0.0));

        boxHor2.setPrefHeight(0.0);
        boxHor2.setPrefWidth(300.0);

        String format = "dd/MM/yy   HH:mm:ss"; 
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(format); 
        java.util.Date date = new java.util.Date(); 
        
        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText(formater.format(date));
        texte2.setWrappingWidth(150.0);
        HBox.setMargin(texte2, new Insets(0.0));
        VBox.setMargin(boxHor2, new Insets(0.0, 0.0, 10.0, 0.0));

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("RECU");
        texte3.setFont(new Font("System Bold Italic", 18.0));
        VBox.setMargin(texte3, new Insets(0.0, 0.0, 20.0, 0.0));

        boxHor3.setPrefHeight(0.0);
        boxHor3.setPrefWidth(300.0);

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Montant à payer :");
        texte4.setWrappingWidth(150.0);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText(nf.format(prix) + " €");
        texte5.setWrappingWidth(60.0);

        boxHor4.setPrefHeight(0.0);
        boxHor4.setPrefWidth(300.0);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("Montant payé :");
        texte6.setWrappingWidth(150.0);
        HBox.setMargin(texte6, new Insets(0.0));

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(nf.format(introduit) + " €");
        texte7.setWrappingWidth(60.0);
        VBox.setMargin(boxHor4, new Insets(5.0, 0.0, 5.0, 0.0));

        boxHor5.setPrefHeight(0.0);
        boxHor5.setPrefWidth(300.0);
        
        if (modePaiement.equals("Liquide"))
        {
        	texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        	texte8.setStrokeWidth(0.0);
        	texte8.setText("Rendu :");
        	texte8.setWrappingWidth(150.0);
        	
        	texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        	texte9.setStrokeWidth(0.0);
        	texte9.setText(nf.format(rendu) + " €");
        	texte9.setWrappingWidth(60.0);
        }

        boxHor6.setPrefHeight(0.0);
        boxHor6.setPrefWidth(300.0);

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText(modePaiement);
        texte10.setWrappingWidth(150.0);
        HBox.setMargin(texte10, new Insets(0.0));
        VBox.setMargin(boxHor6, new Insets(20.0, 0.0, 5.0, 0.0));
        
        boxVer.setPadding(new Insets(20.0, 20.0, 0.0, 20.0));

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

        boxHor1.getChildren().add(texte1);
        boxHor2.getChildren().add(texte2);
        boxHor3.getChildren().addAll(texte4, texte5);
        boxHor4.getChildren().addAll(texte6, texte7);
        boxHor5.getChildren().addAll(texte8, texte9);
        boxHor6.getChildren().add(texte10);
        boxVer.getChildren().addAll(boxHor1, boxHor2, texte3, boxHor3, boxHor4, boxHor5, boxHor6);
        getChildren().addAll(boxVer, rectangle);

    }
}