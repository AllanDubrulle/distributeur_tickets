package interfaceGraphique;

import javafx.scene.shape.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherPass10Trajets extends Pane 
{
    public AfficherPass10Trajets(FPass10Trajets fen) 
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
        HBox hBox3 = new HBox();
        Text text7 = new Text();
        Text text8 = new Text();
        Text text9 = new Text();
        HBox hBox4 = new HBox();
        Text text10 = new Text();
        Text text11 = new Text();
        Text text12 = new Text();
        HBox hBox5 = new HBox();
        Text text13 = new Text();
        Text text14 = new Text();
        Text text15 = new Text();
        HBox hBox6 = new HBox();
        Text text16 = new Text();
        Text text17 = new Text();
        Text text18 = new Text();
        HBox hBox7 = new HBox();
        Text text19 = new Text();
        Text text110 = new Text();
        Text text111 = new Text();
        HBox hBox8 = new HBox();
        Text text112 = new Text();
        Text text113 = new Text();
        Text text114 = new Text();
        HBox hBox9 = new HBox();
        Text text115 = new Text();
        Text text116 = new Text();
        Text text117 = new Text();
        HBox hBox10 = new HBox();
        Text text118 = new Text();
        Text text119 = new Text();
        Text text1110 = new Text();
        HBox hBox11 = new HBox();
        Text text1111 = new Text();
        Text text1112 = new Text();
        Text text1113 = new Text();
        HBox hBox12 = new HBox();
        Text text1114 = new Text();
        Text text1115 = new Text();
        Text text1116 = new Text();
        HBox hBox13 = new HBox();
        Text text1117 = new Text();
        Text text1118 = new Text();
        Text text1119 = new Text();
        HBox hBox14 = new HBox();
        Text text11110 = new Text();
        Text text11111 = new Text();
        Text text11112 = new Text();
        Text text11113 = new Text();
        Rectangle rectangle = new Rectangle();
        Line line = new Line();
        Line line0 = new Line();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(350.0);
        setPrefWidth(580.0);

        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(265.0);
        vBox.setPrefWidth(580.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(580.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("PASS 10 TRAJETS");
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
        text1.setText(fen.getNom());
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
        text3.setText(fen.getClasse());
        text3.setWrappingWidth(200.0);
        text3.setFont(new Font("System Bold Italic", 18.0));
        hBox1.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox1, new Insets(0.0, 20.0, 15.0, 20.0));

        hBox2.setPrefHeight(0.0);
        hBox2.setPrefWidth(580.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Date :");
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text4.setWrappingWidth(180.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("De :");
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text5.setWrappingWidth(180.0);
        HBox.setMargin(text5, new Insets(0.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("A :");
        text6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text6.setWrappingWidth(180.0);
        hBox2.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(0.0, 20.0, 5.0, 20.0));

        hBox3.setPrefHeight(0.0);
        hBox3.setPrefWidth(580.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text7.setWrappingWidth(170.0);
        HBox.setMargin(text7, new Insets(0.0, 5.0, 0.0, 5.0));
        text7.setFont(new Font(10.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text8.setWrappingWidth(170.0);
        text8.setFont(new Font(10.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text9.setWrappingWidth(170.0);
        text9.setFont(new Font(10.0));
        hBox3.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox3, new Insets(0.0, 20.0, 5.0, 20.0));

        hBox4.setPrefHeight(0.0);
        hBox4.setPrefWidth(580.0);

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text10.setWrappingWidth(170.0);
        text10.setFont(new Font(10.0));
        HBox.setMargin(text10, new Insets(0.0, 5.0, 0.0, 5.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text11.setWrappingWidth(170.0);
        text11.setFont(new Font(10.0));

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text12.setWrappingWidth(170.0);
        text12.setFont(new Font(10.0));
        hBox4.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox4, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(580.0);

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text13.setWrappingWidth(170.0);
        text13.setFont(new Font(10.0));
        HBox.setMargin(text13, new Insets(0.0, 5.0, 0.0, 5.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text14.setWrappingWidth(170.0);
        text14.setFont(new Font(10.0));

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text15.setWrappingWidth(170.0);
        text15.setFont(new Font(10.0));
        hBox5.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox5, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox6.setPrefHeight(0.0);
        hBox6.setPrefWidth(580.0);

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text16.setWrappingWidth(170.0);
        text16.setFont(new Font(10.0));
        HBox.setMargin(text16, new Insets(0.0, 5.0, 0.0, 5.0));

        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text17.setWrappingWidth(170.0);
        text17.setFont(new Font(10.0));

        text18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text18.setStrokeWidth(0.0);
        text18.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text18.setWrappingWidth(170.0);
        text18.setFont(new Font(10.0));
        hBox6.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox6, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox7.setPrefHeight(0.0);
        hBox7.setPrefWidth(580.0);

        text19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text19.setStrokeWidth(0.0);
        text19.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text19.setWrappingWidth(170.0);
        text19.setFont(new Font(10.0));
        HBox.setMargin(text19, new Insets(0.0, 5.0, 0.0, 5.0));

        text110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text110.setStrokeWidth(0.0);
        text110.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text110.setWrappingWidth(170.0);
        text110.setFont(new Font(10.0));

        text111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111.setStrokeWidth(0.0);
        text111.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text111.setWrappingWidth(170.0);
        text111.setFont(new Font(10.0));
        hBox7.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox7, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox8.setPrefHeight(0.0);
        hBox8.setPrefWidth(580.0);

        text112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text112.setStrokeWidth(0.0);
        text112.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text112.setWrappingWidth(170.0);
        text112.setFont(new Font(10.0));
        HBox.setMargin(text112, new Insets(0.0, 5.0, 0.0, 5.0));

        text113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text113.setStrokeWidth(0.0);
        text113.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text113.setWrappingWidth(170.0);
        text113.setFont(new Font(10.0));

        text114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text114.setStrokeWidth(0.0);
        text114.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text114.setWrappingWidth(170.0);
        text114.setFont(new Font(10.0));
        hBox8.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox8, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox9.setPrefHeight(0.0);
        hBox9.setPrefWidth(580.0);

        text115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text115.setStrokeWidth(0.0);
        text115.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text115.setWrappingWidth(170.0);
        text115.setFont(new Font(10.0));
        HBox.setMargin(text115, new Insets(0.0, 5.0, 0.0, 5.0));

        text116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text116.setStrokeWidth(0.0);
        text116.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text116.setWrappingWidth(170.0);
        text116.setFont(new Font(10.0));

        text117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text117.setStrokeWidth(0.0);
        text117.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text117.setWrappingWidth(170.0);
        text117.setFont(new Font(10.0));
        hBox9.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox9, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox10.setPrefHeight(0.0);
        hBox10.setPrefWidth(580.0);

        text118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text118.setStrokeWidth(0.0);
        text118.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text118.setWrappingWidth(170.0);
        text118.setFont(new Font(10.0));
        HBox.setMargin(text118, new Insets(0.0, 5.0, 0.0, 5.0));

        text119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text119.setStrokeWidth(0.0);
        text119.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text119.setWrappingWidth(170.0);
        text119.setFont(new Font(10.0));

        text1110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1110.setStrokeWidth(0.0);
        text1110.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1110.setWrappingWidth(170.0);
        text1110.setFont(new Font(10.0));
        hBox10.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox10, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox11.setPrefHeight(0.0);
        hBox11.setPrefWidth(580.0);

        text1111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111.setStrokeWidth(0.0);
        text1111.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1111.setWrappingWidth(170.0);
        text1111.setFont(new Font(10.0));
        HBox.setMargin(text1111, new Insets(0.0, 5.0, 0.0, 5.0));

        text1112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1112.setStrokeWidth(0.0);
        text1112.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1112.setWrappingWidth(170.0);
        text1112.setFont(new Font(10.0));

        text1113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1113.setStrokeWidth(0.0);
        text1113.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1113.setWrappingWidth(170.0);
        text1113.setFont(new Font(10.0));
        hBox11.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox11, new Insets(0.0, 20.0, 0.0, 20.0));

        hBox12.setPrefHeight(0.0);
        hBox12.setPrefWidth(580.0);

        text1114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1114.setStrokeWidth(0.0);
        text1114.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1114.setWrappingWidth(170.0);
        text1114.setFont(new Font(10.0));
        HBox.setMargin(text1114, new Insets(0.0, 5.0, 0.0, 5.0));

        text1115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1115.setStrokeWidth(0.0);
        text1115.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1115.setWrappingWidth(170.0);
        text1115.setFont(new Font(10.0));

        text1116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1116.setStrokeWidth(0.0);
        text1116.setText(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . ");
        text1116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1116.setWrappingWidth(170.0);
        text1116.setFont(new Font(10.0));
        hBox12.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox12, new Insets(0.0, 20.0, 5.0, 20.0));

        hBox13.setPrefHeight(0.0);
        hBox13.setPrefWidth(580.0);

        text1117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1117.setStrokeWidth(0.0);
        text1117.setText("REDUCTION :");
        text1117.setFont(new Font("System Bold", 15.0));

        text1118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1118.setStrokeWidth(0.0);
        text1118.setText(fen.getReduction());
        text1118.setWrappingWidth(175.0);
        HBox.setMargin(text1118, new Insets(0.0, 0.0, 0.0, 44.0));

        text1119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1119.setStrokeWidth(0.0);
        text1119.setText("10.02   EUR");
        text1119.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text1119.setWrappingWidth(100.0);
        HBox.setMargin(text1119, new Insets(0.0, 0.0, 0.0, 110.0));
        text1119.setFont(new Font("System Bold", 16.0));
        hBox13.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox13, new Insets(10.0, 20.0, 0.0, 20.0));

        hBox14.setPrefHeight(0.0);
        hBox14.setPrefWidth(580.0);

        text11110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11110.setStrokeWidth(0.0);
        text11110.setText("Valable du ");
        text11110.setWrappingWidth(75.0);
        HBox.setMargin(text11110, new Insets(0.0));

        text11111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11111.setStrokeWidth(0.0);
        text11111.setText("(date)");
        text11111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text11111.setWrappingWidth(100.0);
        HBox.setMargin(text11111, new Insets(0.0, 0.0, 0.0, 50.0));

        text11112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11112.setStrokeWidth(0.0);
        text11112.setText("au");
        text11112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text11112.setWrappingWidth(50.0);

        text11113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11113.setStrokeWidth(0.0);
        text11113.setText("(date)");
        text11113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text11113.setWrappingWidth(100.0);
        hBox14.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(hBox14, new Insets(0.0, 20.0, 20.0, 20.0));
        vBox.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#ffffff00"));
        rectangle.setHeight(330.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(560.0);

        line.setEndY(150.0);
        line.setLayoutX(195.0);
        line.setLayoutY(125.0);

        line0.setEndY(150.0);
        line0.setLayoutX(370.0);
        line0.setLayoutY(125.0);

        hBox.getChildren().addAll(text, text0);
        hBox0.getChildren().addAll(text1, text2);
        hBox1.getChildren().add(text3);
        hBox2.getChildren().addAll(text4, text5, text6);
        hBox3.getChildren().addAll(text7, text8, text9);
        hBox4.getChildren().addAll(text10, text11, text12);
        hBox5.getChildren().addAll(text13, text14, text15);
        hBox6.getChildren().addAll(text16, text17, text18);
        hBox7.getChildren().addAll(text19, text110, text111);
        hBox8.getChildren().addAll(text112, text113, text114);
        hBox9.getChildren().addAll(text115, text116, text117);
        hBox10.getChildren().addAll(text118, text119, text1110);
        hBox11.getChildren().addAll(text1111, text1112, text1113);
        hBox12.getChildren().addAll(text1114, text1115, text1116);
        hBox13.getChildren().addAll(text1117, text1118, text1119);
        hBox14.getChildren().addAll(text11110, text11111, text11112, text11113);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7, hBox8, hBox9, hBox10, hBox11, hBox12, hBox13, hBox14);
        getChildren().addAll(vBox, rectangle, line, line0);

    }
}
