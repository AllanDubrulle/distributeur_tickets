package interfaceGraphique;

import javafx.scene.shape.*;
import javafx.scene.control.*;
import coeur.GraphiqueACoeurImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherRendu extends Pane 
{
	private FChoixParLiquide fLiquide;
    public AfficherRendu(FChoixParLiquide fenLiquide,FBillet fenBillet) 
    {
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
        Text text9 = new Text();
        HBox hBox5 = new HBox();
        Text text10 = new Text();
        Text text11 = new Text();
        HBox hBox6 = new HBox();
        Text text12 = new Text();
        Text text13 = new Text();
        HBox hBox7 = new HBox();
        Text text14 = new Text();
        Text text15 = new Text();
        HBox hBox8 = new HBox();
        Text text16 = new Text();
        Text text17 = new Text();
        HBox hBox9 = new HBox();
        Text text18 = new Text();
        Text text19 = new Text();
        HBox hBox10 = new HBox();
        Text text110 = new Text();
        Text text111 = new Text();
        HBox hBox11 = new HBox();
        Text text112 = new Text();
        Text text113 = new Text();
        HBox hBox12 = new HBox();
        Text text114 = new Text();
        Text text115 = new Text();
        HBox hBox13 = new HBox();
        Text text116 = new Text();
        Text text117 = new Text();
        HBox hBox14 = new HBox();
        Text text118 = new Text();
        Text text119 = new Text();
        HBox hBox15 = new HBox();
        Text text1110 = new Text();
        Text text1111 = new Text();
        Button button = new Button();
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(550.0);
        setPrefWidth(250.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(550.0);
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
        text1.setText("RENDU");
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
        text3.setText(String.valueOf(Double.valueOf(fenBillet.getPrix())/100));
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
        text5.setText(String.valueOf(fenLiquide.getMontantIntroduit()/100));
        text5.setText(String.valueOf(fLiquide.getMontantIntroduit()/100));
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
        text7.setText(String.valueOf(Math.abs(fenLiquide.getRestant()/100)));
        text7.setText(String.valueOf(Math.abs(fLiquide.getRestant()/100)));
        text7.setWrappingWidth(60.0);

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(300.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("50 €   x");
        text8.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text8.setWrappingWidth(75.0);
        HBox.setMargin(text8, new Insets(0.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("(50)");
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text9.setWrappingWidth(75.0);
        VBox.setMargin(hBox4, new Insets(10.0, 0.0, 0.0, 30.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(300.0);

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("20 €   x");
        text10.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text10.setWrappingWidth(75.0);
        HBox.setMargin(text10, new Insets(0.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("(20)");
        text11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text11.setWrappingWidth(75.0);
        VBox.setMargin(hBox5, new Insets(5.0, 0.0, 5.0, 30.0));

        hBox6.setPrefHeight(0.0);
        hBox6.setPrefWidth(300.0);

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("10 €   x");
        text12.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text12.setWrappingWidth(75.0);
        HBox.setMargin(text12, new Insets(0.0));

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("(10)");
        text13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text13.setWrappingWidth(75.0);
        VBox.setMargin(hBox6, new Insets(0.0, 0.0, 0.0, 30.0));

        hBox7.setPrefHeight(0.0);
        hBox7.setPrefWidth(300.0);

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText("5 €   x");
        text14.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text14.setWrappingWidth(75.0);
        HBox.setMargin(text14, new Insets(0.0));

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("(5)");
        text15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text15.setWrappingWidth(75.0);
        VBox.setMargin(hBox7, new Insets(5.0, 0.0, 5.0, 30.0));

        hBox8.setPrefHeight(0.0);
        hBox8.setPrefWidth(300.0);

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setText("2 €   x");
        text16.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text16.setWrappingWidth(75.0);
        HBox.setMargin(text16, new Insets(0.0));

        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText("(2)");
        text17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text17.setWrappingWidth(75.0);
        VBox.setMargin(hBox8, new Insets(0.0, 0.0, 0.0, 30.0));

        hBox9.setPrefHeight(0.0);
        hBox9.setPrefWidth(300.0);

        text18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text18.setStrokeWidth(0.0);
        text18.setText("1 €   x");
        text18.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text18.setWrappingWidth(75.0);
        HBox.setMargin(text18, new Insets(0.0));

        text19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text19.setStrokeWidth(0.0);
        text19.setText("(1)");
        text19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text19.setWrappingWidth(75.0);
        VBox.setMargin(hBox9, new Insets(0.0, 0.0, 0.0, 30.0));

        hBox10.setPrefHeight(0.0);
        hBox10.setPrefWidth(300.0);

        text110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text110.setStrokeWidth(0.0);
        text110.setText("0.50 €   x");
        text110.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text110.setWrappingWidth(75.0);
        HBox.setMargin(text110, new Insets(0.0));

        text111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111.setStrokeWidth(0.0);
        text111.setText("(0.50)");
        text111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text111.setWrappingWidth(75.0);
        VBox.setMargin(hBox10, new Insets(5.0, 0.0, 5.0, 30.0));

        hBox11.setPrefHeight(0.0);
        hBox11.setPrefWidth(300.0);

        text112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text112.setStrokeWidth(0.0);
        text112.setText("0.20 €   x");
        text112.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text112.setWrappingWidth(75.0);
        HBox.setMargin(text112, new Insets(0.0));

        text113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text113.setStrokeWidth(0.0);
        text113.setText("(0.20)");
        text113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text113.setWrappingWidth(75.0);
        VBox.setMargin(hBox11, new Insets(0.0, 0.0, 0.0, 30.0));

        hBox12.setPrefHeight(0.0);
        hBox12.setPrefWidth(300.0);

        text114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text114.setStrokeWidth(0.0);
        text114.setText("0.10 €   x");
        text114.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text114.setWrappingWidth(75.0);
        HBox.setMargin(text114, new Insets(0.0));

        text115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text115.setStrokeWidth(0.0);
        text115.setText("(0.10)");
        text115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text115.setWrappingWidth(75.0);
        VBox.setMargin(hBox12, new Insets(5.0, 0.0, 5.0, 30.0));

        hBox13.setPrefHeight(0.0);
        hBox13.setPrefWidth(300.0);

        text116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text116.setStrokeWidth(0.0);
        text116.setText("0.05 €   x");
        text116.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text116.setWrappingWidth(75.0);
        HBox.setMargin(text116, new Insets(0.0));

        text117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text117.setStrokeWidth(0.0);
        text117.setText("(0.05)");
        text117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text117.setWrappingWidth(75.0);
        VBox.setMargin(hBox13, new Insets(0.0, 0.0, 0.0, 30.0));

        hBox14.setPrefHeight(0.0);
        hBox14.setPrefWidth(300.0);

        text118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text118.setStrokeWidth(0.0);
        text118.setText("0.02 €   x");
        text118.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text118.setWrappingWidth(75.0);
        HBox.setMargin(text118, new Insets(0.0));

        text119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text119.setStrokeWidth(0.0);
        text119.setText("(0.02)");
        text119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text119.setWrappingWidth(75.0);
        VBox.setMargin(hBox14, new Insets(5.0, 0.0, 5.0, 30.0));

        hBox15.setPrefHeight(0.0);
        hBox15.setPrefWidth(300.0);

        text1110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1110.setStrokeWidth(0.0);
        text1110.setText("0.01 €   x");
        text1110.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text1110.setWrappingWidth(75.0);
        HBox.setMargin(text1110, new Insets(0.0));

        text1111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111.setStrokeWidth(0.0);
        text1111.setText("(0.01)");
        text1111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1111.setWrappingWidth(75.0);
        VBox.setMargin(hBox15, new Insets(0.0, 0.0, 0.0, 30.0));

        button.setMnemonicParsing(false);
        button.setText("Ok");
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	GraphiqueACoeurImpl.getInstance().choixOk();
            }
        });
        VBox.setMargin(button, new Insets(20.0, 0.0, 0.0, 0.0));
        vBox.setOpaqueInsets(new Insets(0.0));
        vBox.setPadding(new Insets(20.0, 20.0, 0.0, 20.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#f7f7f700"));
        rectangle.setHeight(495.0);
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
        hBox4.getChildren().addAll(text8, text9);
        hBox5.getChildren().addAll(text10, text11);
        hBox6.getChildren().addAll(text12, text13);
        hBox7.getChildren().addAll(text14, text15);
        hBox8.getChildren().addAll(text16, text17);
        hBox9.getChildren().addAll(text18, text19);
        hBox10.getChildren().addAll(text110, text111);
        hBox11.getChildren().addAll(text112, text113);
        hBox12.getChildren().addAll(text114, text115);
        hBox13.getChildren().addAll(text116, text117);
        hBox14.getChildren().addAll(text118, text119);
        hBox15.getChildren().addAll(text1110, text1111);
        vBox.getChildren().addAll(hBox, hBox0, text1, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7, hBox8, hBox9, hBox10, hBox11, hBox12, hBox13, hBox14, hBox15, button);
        getChildren().add(vBox);
        getChildren().add(rectangle);

    }
}