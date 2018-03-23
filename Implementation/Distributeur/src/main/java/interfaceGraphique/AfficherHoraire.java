package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

class AfficherHoraire extends Pane {

    protected final VBox vBox;
    protected final Text text;
    protected final HBox hBox;
    protected final VBox vBox0;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final VBox vBox1;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;
    protected final Text text9;
    protected final Text text10;
    protected final Text text11;
    protected final VBox vBox2;
    protected final Text text12;
    protected final Text text13;
    protected final Text text14;
    protected final Text text15;
    protected final Text text16;
    protected final Text text17;
    protected final VBox vBox3;
    protected final Text text18;
    protected final Text text19;
    protected final Text text110;
    protected final Text text111;
    protected final Text text112;
    protected final Text text113;

    public AfficherHoraire(String[] horaire) {

        vBox = new VBox();
        text = new Text();
        hBox = new HBox();
        vBox0 = new VBox();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        vBox1 = new VBox();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
        text10 = new Text();
        text11 = new Text();
        vBox2 = new VBox();
        text12 = new Text();
        text13 = new Text();
        text14 = new Text();
        text15 = new Text();
        text16 = new Text();
        text17 = new Text();
        vBox3 = new VBox();
        text18 = new Text();
        text19 = new Text();
        text110 = new Text();
        text111 = new Text();
        text112 = new Text();
        text113 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(600.0);

        vBox.setPrefHeight(250.0);
        vBox.setPrefWidth(600.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("VERIFICATION D'HORAIRE");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setUnderline(true);
        text.setWrappingWidth(300.0);
        text.setFont(new Font("System Bold Italic", 21.0));
        VBox.setMargin(text, new Insets(15.0, 0.0, 15.0, 150.0));

        hBox.setPrefHeight(160.0);
        hBox.setPrefWidth(600.0);

        vBox0.setPrefHeight(160.0);
        vBox0.setPrefWidth(150.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Gare de depart :");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setUnderline(true);
        text0.setWrappingWidth(150.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(horaire[0]);
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(150.0);
        VBox.setMargin(text1, new Insets(10.0, 0.0, 5.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(horaire[6]);
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setWrappingWidth(150.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(horaire[12]);
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text3.setWrappingWidth(150.0);
        VBox.setMargin(text3, new Insets(5.0, 0.0, 5.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText(horaire[18]);
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text4.setWrappingWidth(150.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(horaire[24]);
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text5.setWrappingWidth(150.0);
        VBox.setMargin(text5, new Insets(5.0, 0.0, 0.0, 0.0));

        vBox1.setPrefHeight(160.0);
        vBox1.setPrefWidth(150.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Gare d'arrivee :");
        text6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text6.setUnderline(true);
        text6.setWrappingWidth(150.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(horaire[1]);
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text7.setWrappingWidth(150.0);
        VBox.setMargin(text7, new Insets(10.0, 0.0, 5.0, 0.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(horaire[7]);
        text8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text8.setWrappingWidth(150.0);

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(horaire[13]);
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text9.setWrappingWidth(150.0);
        VBox.setMargin(text9, new Insets(5.0, 0.0, 5.0, 0.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText(horaire[19]);
        text10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text10.setWrappingWidth(150.0);

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText(horaire[25]);
        text11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text11.setWrappingWidth(150.0);
        VBox.setMargin(text11, new Insets(5.0, 0.0, 0.0, 0.0));

        vBox2.setPrefHeight(160.0);
        vBox2.setPrefWidth(150.0);

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("Heure de depart :");
        text12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text12.setUnderline(true);
        text12.setWrappingWidth(150.0);

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        if (horaire[2] != null)
        {
        	if (horaire[3].length() == 1)
        		text13.setText(horaire[2]+":0"+horaire[3]);
        	else
        		text13.setText(horaire[2]+":"+horaire[3]);
        }
        text13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text13.setWrappingWidth(150.0);
        VBox.setMargin(text13, new Insets(10.0, 0.0, 5.0, 0.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        if (horaire[8] != null)
        {
        	if (horaire[9].length() == 1)
        		text14.setText(horaire[8]+":0"+horaire[9]);
        	else
        		text14.setText(horaire[8]+":"+horaire[9]);
        }
        text14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text14.setWrappingWidth(150.0);

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        if (horaire[14] != null)
        {
        	if (horaire[15].length() == 1)
        		text15.setText(horaire[14]+":0"+horaire[15]);
        	else
        		text15.setText(horaire[14]+":"+horaire[15]);
        }
        text15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text15.setWrappingWidth(150.0);
        VBox.setMargin(text15, new Insets(5.0, 0.0, 5.0, 0.0));

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        if (horaire[20] != null)
        {
        	if (horaire[21].length() == 1)
        		text16.setText(horaire[20]+":0"+horaire[21]);
        	else
        		text16.setText(horaire[20]+":"+horaire[21]);
        }
        text16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text16.setWrappingWidth(150.0);

        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        if (horaire[26] != null)
        {
        	if (horaire[27].length() == 1)
        		text17.setText(horaire[26]+":0"+horaire[27]);
        	else
        		text17.setText(horaire[26]+":"+horaire[27]);
        }
        text17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text17.setWrappingWidth(150.0);
        VBox.setMargin(text17, new Insets(5.0, 0.0, 0.0, 0.0));

        vBox3.setPrefHeight(160.0);
        vBox3.setPrefWidth(150.0);

        text18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text18.setStrokeWidth(0.0);
        text18.setText("Heure d'arrivee :");
        text18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text18.setUnderline(true);
        text18.setWrappingWidth(150.0);

        text19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text19.setStrokeWidth(0.0);
        if (horaire[4] != null)
        {
        	if (horaire[5].length() == 1)
        		text19.setText(horaire[4]+":0"+horaire[5]);
        	else
        		text19.setText(horaire[4]+":"+horaire[5]);
        }
        text19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text19.setWrappingWidth(150.0);
        VBox.setMargin(text19, new Insets(10.0, 0.0, 5.0, 0.0));

        text110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text110.setStrokeWidth(0.0);
        if (horaire[10] != null)
        {
        	if (horaire[11].length() == 1)
        		text110.setText(horaire[10]+":0"+horaire[11]);
        	else
        		text110.setText(horaire[10]+":"+horaire[11]);
        }
        text110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text110.setWrappingWidth(150.0);

        text111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111.setStrokeWidth(0.0);
        if (horaire[16] != null)
        {
        	if (horaire[17].length() == 1)
        		text111.setText(horaire[16]+":0"+horaire[17]);
        	else
        		text111.setText(horaire[16]+":"+horaire[17]);
        }
        text111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text111.setWrappingWidth(150.0);
        VBox.setMargin(text111, new Insets(5.0, 0.0, 5.0, 0.0));

        text112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text112.setStrokeWidth(0.0);
        if (horaire[22] != null)
        {
        	if (horaire[23].length() == 1)
        		text112.setText(horaire[22]+":0"+horaire[23]);
        	else
        		text112.setText(horaire[22]+":"+horaire[23]);
        }
        text112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text112.setWrappingWidth(150.0);

        text113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text113.setStrokeWidth(0.0);
        if (horaire[28] != null)
        {
        	if (horaire[29].length() == 1)
        		text113.setText(horaire[28]+":0"+horaire[29]);
        	else
        		text113.setText(horaire[28]+":"+horaire[29]);
        }
        text113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text113.setWrappingWidth(150.0);
        VBox.setMargin(text113, new Insets(5.0, 0.0, 0.0, 0.0));
        VBox.setMargin(hBox, new Insets(0.0));

        vBox.getChildren().add(text);
        vBox0.getChildren().add(text0);
        vBox0.getChildren().add(text1);
        vBox0.getChildren().add(text2);
        vBox0.getChildren().add(text3);
        vBox0.getChildren().add(text4);
        vBox0.getChildren().add(text5);
        hBox.getChildren().add(vBox0);
        vBox1.getChildren().add(text6);
        vBox1.getChildren().add(text7);
        vBox1.getChildren().add(text8);
        vBox1.getChildren().add(text9);
        vBox1.getChildren().add(text10);
        vBox1.getChildren().add(text11);
        hBox.getChildren().add(vBox1);
        vBox2.getChildren().add(text12);
        vBox2.getChildren().add(text13);
        vBox2.getChildren().add(text14);
        vBox2.getChildren().add(text15);
        vBox2.getChildren().add(text16);
        vBox2.getChildren().add(text17);
        hBox.getChildren().add(vBox2);
        vBox3.getChildren().add(text18);
        vBox3.getChildren().add(text19);
        vBox3.getChildren().add(text110);
        vBox3.getChildren().add(text111);
        vBox3.getChildren().add(text112);
        vBox3.getChildren().add(text113);
        hBox.getChildren().add(vBox3);
        vBox.getChildren().add(hBox);
        getChildren().add(vBox);

    }
}