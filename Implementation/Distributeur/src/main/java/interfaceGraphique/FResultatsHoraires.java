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
	private Button button1;
	
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
        VBox vBox2 = new VBox();
        Text text18 = new Text();
        Text text19 = new Text();
        Text text20 = new Text();
        Text text21 = new Text();
        Text text22 = new Text();
        Text text23 = new Text();
        Button button = new Button();
        Button button0 = new Button();
        button1 = new Button();

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

        hBox.setLayoutX(67.5*largeur);
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
        text1.setText(tab[6]);
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text1, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setWrappingWidth(100.0*largeur);
        text2.setText(tab[12]);
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setWrappingWidth(100.0*largeur);
        text3.setText(tab[18]);
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text3, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setWrappingWidth(100.0*largeur);
        text4.setText(tab[24]);
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        vBox.setOpaqueInsets(new Insets(0.0));
        HBox.setMargin(vBox, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);
        HBox.setMargin(vBox0, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

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
        text7.setText(tab[7]);
        text7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text7, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setWrappingWidth(100.0*largeur);
        text8.setText(tab[13]);
        text8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setWrappingWidth(100.0*largeur);
        text9.setText(tab[19]);
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text9, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setWrappingWidth(100.0*largeur);
        text10.setText(tab[25]);
        text10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        vBox1.setPrefHeight(200.0*hauteur);
        vBox1.setPrefWidth(120.0*largeur);
        HBox.setMargin(vBox1, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Heure de départ :");
        text11.setWrappingWidth(120.0*largeur);
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
        if (tab[8] != null)
        {
        	if (tab[9].length() == 1)
        		text13.setText(tab[8]+":0"+tab[9]);
        	else
        		text13.setText(tab[8]+":"+tab[9]);
        }
        text13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text13, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setWrappingWidth(100.0*largeur);
        if (tab[14] != null)
        {
        	if (tab[15].length() == 1)
        		text14.setText(tab[14]+":0"+tab[15]);
        	else
        		text14.setText(tab[14]+":"+tab[15]);
        }
        text14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setWrappingWidth(100.0*largeur);
        if (tab[20] != null)
        {
        	if (tab[21].length() == 1)
        		text15.setText(tab[20]+":0"+tab[21]);
        	else
        		text15.setText(tab[20]+":"+tab[21]);
        }
        text15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text15, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setWrappingWidth(100.0*largeur);
        if (tab[26] != null)
        {
        	if (tab[27].length() == 1)
        		text16.setText(tab[26]+":0"+tab[27]);
        	else
        		text16.setText(tab[26]+":"+tab[27]);
        }
        text16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        
        text23.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text23.setStrokeWidth(0.0);
        text23.setText("Heure d'arrivée :");
        text23.setWrappingWidth(120.0*largeur);
        text23.setUnderline(true);
        text23.setFont(new Font("System Italic", 18.0*hauteur));
        text23.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text23, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        vBox2.setPrefHeight(200.0*hauteur);
        vBox2.setPrefWidth(120.0*largeur);
        
        text18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text18.setStrokeWidth(0.0);
        text18.setWrappingWidth(100.0*largeur);
        if (tab[4] != null)
        {
        	if (tab[5].length() == 1)
        		text18.setText(tab[4]+":0"+tab[5]);
        	else
        		text18.setText(tab[4]+":"+tab[5]);
        }
        text18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text19.setStrokeWidth(0.0);
        text19.setWrappingWidth(100.0*largeur);
        if (tab[10] != null)
        {
        	if (tab[11].length() == 1)
        		text19.setText(tab[10]+":0"+tab[11]);
        	else
        		text19.setText(tab[10]+":"+tab[11]);
        }
        text19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text19, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text20.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text20.setStrokeWidth(0.0);
        text20.setWrappingWidth(100.0*largeur);
        if (tab[16] != null)
        {
        	if (tab[17].length() == 1)
        		text20.setText(tab[16]+":0"+tab[17]);
        	else
        		text20.setText(tab[16]+":"+tab[17]);
        }
        text20.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        text21.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text21.setStrokeWidth(0.0);
        text21.setWrappingWidth(100.0*largeur);
        if (tab[22] != null)
        {
        	if (tab[23].length() == 1)
        		text21.setText(tab[22]+":0"+tab[23]);
        	else
        		text21.setText(tab[22]+":"+tab[23]);
        }
        text21.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(text21, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        text22.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text22.setStrokeWidth(0.0);
        text22.setWrappingWidth(100.0*largeur);
        if (tab[28] != null)
        {
        	if (tab[29].length() == 1)
        		text22.setText(tab[28]+":0"+tab[29]);
        	else
        		text22.setText(tab[28]+":"+tab[29]);
        }
        text22.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

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
        		if(graphAC.estTactile())
        			graphAC.choixRetour();
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
        		if(graphAC.estTactile())
        			graphAC.choixRetourEcranPrinc();
        	}
        });
        
        button1.setLayoutX(300.0*largeur);
        button1.setLayoutY(340.0*hauteur);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(200.0*largeur);
        button1.setText("Imprimer horaire");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixImprimerHoraire();
        	}
        });

        vBox.getChildren().addAll(text, text0, text1, text2, text3, text4);
        vBox0.getChildren().addAll(text5, text6, text7, text8, text9, text10);
        vBox1.getChildren().addAll(text11, text12, text13, text14, text15, text16);
        vBox2.getChildren().addAll(text23, text18, text19, text20, text21, text22);
        hBox.getChildren().addAll(vBox, vBox0, vBox1, vBox2);
        getChildren().addAll(rectangle, hBox, text17, button, button0, button1);
        
        button.setFocusTraversable(false);
        button0.setFocusTraversable(false);
        button1.setFocusTraversable(false);
    }

	public void actionRetour() 
	{
		graphAC.choixRetour();
	}
	
	public void actionEntrer()
	{
		graphAC.choixRetourEcranPrinc();
	}
	
	public void actionEspace()
	{
		graphAC.choixImprimerHoraire();
	}
}