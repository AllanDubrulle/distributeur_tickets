package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FResultatsHoraires extends Ecran 
{    
    public FResultatsHoraires(String[] tab, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Text text = new Text();
        Text text0 = new Text();
        Text text1 = new Text();
        Text text2 = new Text();
        Text text3 = new Text();
        Text text4 = new Text();
        VBox vBox0 = new VBox();
        Text text5 = new Text();
        Text text6 = new Text();
        Text text7 = new Text();
        Text text8 = new Text();
        Text text9 = new Text();
        Text text10 = new Text();
        VBox vBox1 = new VBox();
        Text text11 = new Text();
        Text text12 = new Text();
        Text text13 = new Text();
        Text text14 = new Text();
        Text text15 = new Text();
        Text text16 = new Text();
        Text text17 = new Text();
        Button button = new Button();
        Button button0 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        hBox.setLayoutX(166.0*largeur);
        hBox.setLayoutY(111.0*hauteur);
        hBox.setPrefHeight(189.0*hauteur);
        hBox.setPrefWidth(425.0*largeur);

        vBox.setPrefHeight(200.0*hauteur);
        vBox.setPrefWidth(100.0*largeur);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        text.setWrappingWidth(115.0*largeur);
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setUnderline(true);
        text.setFont(new Font("System Italic", 18.0*hauteur));
        VBox.setMargin(text, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setWrappingWidth(100.0*largeur);
        text0.setText(tab[0]);
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(98.5*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setWrappingWidth(100.0*largeur);
        text1.setText(tab[4]);
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text1, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setWrappingWidth(100.0*largeur);
        text2.setText(tab[8]);
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setWrappingWidth(100.0*largeur);
        text3.setText(tab[12]);
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text3, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setWrappingWidth(100.0*largeur);
        text4.setText(tab[16]);
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        vBox.setOpaqueInsets(new Insets(0.0));
        HBox.setMargin(vBox, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Gare d'arrivée :");
        text5.setWrappingWidth(110.0*largeur);
        text5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text5.setUnderline(true);
        text5.setFont(new Font("System Italic", 18.0*hauteur));
        VBox.setMargin(text5, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setWrappingWidth(100.0*largeur);
        text6.setText(tab[1]);
        text6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setWrappingWidth(100.0*largeur);
        text7.setText(tab[5]);
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text7, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setWrappingWidth(100.0*largeur);
        text8.setText(tab[9]);
        text8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setWrappingWidth(100.0*largeur);
        text9.setText(tab[13]);
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text9, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setWrappingWidth(100.0*largeur);
        text10.setText(tab[17]);
        text10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        vBox0.setPadding(new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        vBox1.setPrefHeight(200.0*hauteur);
        vBox1.setPrefWidth(100.0*largeur);

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Heure :");
        text11.setWrappingWidth(100.0*largeur);
        text11.setUnderline(true);
        text11.setFont(new Font("System Italic", 18.0*hauteur));
        text11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text11, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setWrappingWidth(100.0*largeur);
        if (tab[2] != null)
        {
        	if (tab[3].length() == 1)
        		text12.setText(tab[2]+":0"+tab[3]);
        	else
        		text12.setText(tab[2]+":"+tab[3]);
        }
        text12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setWrappingWidth(100.0*largeur);
        if (tab[6] != null)
        {
        	if (tab[7].length() == 1)
        		text13.setText(tab[6]+":0"+tab[7]);
        	else
        		text13.setText(tab[6]+":"+tab[7]);
        }
        text13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text13, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setWrappingWidth(100.0*largeur);
        if (tab[10] != null)
        {
        	if (tab[11].length() == 1)
        		text14.setText(tab[10]+":0"+tab[11]);
        	else
        		text14.setText(tab[10]+":"+tab[11]);
        }
        text14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setWrappingWidth(100.0*largeur);
        if (tab[14] != null)
        {
        	if (tab[15].length() == 1)
        		text15.setText(tab[14]+":0"+tab[15]);
        	else
        		text15.setText(tab[14]+":"+tab[15]);
        }
        text15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text15, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setWrappingWidth(100.0*largeur);
        if (tab[18] != null)
        {
        	if (tab[19].length() == 1)
        		text16.setText(tab[18]+":0"+tab[19]);
        	else
        		text16.setText(tab[18]+":"+tab[19]);
        }
        text16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text17.setLayoutX(35.0*largeur);
        text17.setLayoutY(69.0*hauteur);
        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText("Résultats de votre recherche");
        text17.setFont(new Font("System Bold", 24.0*hauteur));

        button.setLayoutX(50.0*largeur);
        button.setLayoutY(340.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(200.0*largeur);
        button.setText("Changer l'heure");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixRetourRecherche();
        	}
        });

        button0.setLayoutX(550.0*largeur);
        button0.setLayoutY(340.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(200.0*largeur);
        button0.setText("Retour à l'écran principal");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixRetourEcranPrinc();
        	}
        });

        vBox.getChildren().addAll(text, text0, text1, text2, text3, text4);
        vBox0.getChildren().addAll(text5, text6, text7, text8, text9, text10);
        vBox1.getChildren().addAll(text11, text12, text13, text14, text15, text16);
        hBox.getChildren().addAll(vBox, vBox0, vBox1);
        getChildren().addAll(rectangle, hBox, text17, button, button0);
    }
    
    public void actionClavier(String a) {}

	public void actionClavier(int a) {}

	public void actionRetour() 
	{
		graphAC.choixRetour();
	}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer()
	{
		graphAC.choixRetourEcranPrinc();
	}
}