package interfaceGraphique;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FRecapBillet extends Ecran 
{    
    public FRecapBillet(String gareDepart, String gareArrivee, boolean allerRetour, int classe, String type, String reduction, int nombre, Date date, double prix, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text text = new Text();
        Text text0 = new Text();
        HBox hBox0 = new HBox();
        Text text1 = new Text();
        Text text2 = new Text();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        Text text3 = new Text();
        Text text4 = new Text();
        HBox hBox3 = new HBox();
        Text text5 = new Text();
        Text text6 = new Text();
        HBox hBox4 = new HBox();
        Text text7 = new Text();
        Text text8 = new Text();
        HBox hBox5 = new HBox();
        Text text9 = new Text();
        Text text10 = new Text();
        HBox hBox6 = new HBox();
        Text text11 = new Text();
        Text text12 = new Text();
        HBox hBox7 = new HBox();
        Text text13 = new Text();
        Text text14 = new Text();
        HBox hBox8 = new HBox();
        Text text15 = new Text();
        Text text16 = new Text();
        Button button = new Button();
        Button button0 = new Button();
        Text text17 = new Text();

        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        vBox.setLayoutX(80.0*largeur);
        vBox.setLayoutY(78.0*hauteur);
        vBox.setPrefHeight(258.0*hauteur);
        vBox.setPrefWidth(377.0*largeur);

        hBox.setPrefHeight(17.0*hauteur);
        hBox.setPrefWidth(244.0*largeur);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        text.setWrappingWidth(130*largeur);
        text.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(gareDepart.toUpperCase());
        text0.setWrappingWidth(200.0*largeur);
        text0.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox0.setPrefHeight(17.0*hauteur);
        hBox0.setPrefWidth(244.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Gare d'arrivée :");
        text1.setWrappingWidth(130*largeur);
        text1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(gareArrivee.toUpperCase());
        text2.setWrappingWidth(200.0*largeur);
        text2.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0*largeur);

        hBox2.setPrefHeight(41.0*hauteur);
        hBox2.setPrefWidth(725.0*largeur);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Aller / Aller-retour :");
        text3.setWrappingWidth(130*largeur);
        text3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text3, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        if (allerRetour)
        {
        	text4.setText("Aller-retour");
        }
        else
        {
        	text4.setText("Aller simple");
        }
        text4.setWrappingWidth(200.0*largeur);
        text4.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Classe :");
        text5.setWrappingWidth(130*largeur);
        text5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text5, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText(classe + "e classe");
        
        text6.setWrappingWidth(200.0*largeur);
        text6.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0*largeur);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Type de billet :");
        text7.setWrappingWidth(130*largeur);
        text7.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text7, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(type);
        text8.setWrappingWidth(200.0*largeur);
        text8.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(711.0*largeur);

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Réduction :");
        text9.setWrappingWidth(130*largeur);
        text9.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text9, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText(reduction);
        text10.setWrappingWidth(200.0*largeur);
        text10.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setPrefHeight(12.0*hauteur);
        hBox6.setPrefWidth(711.0*largeur);

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Nombre de billet(s) : ");
        text11.setWrappingWidth(130*largeur);
        text11.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text11, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText(Integer.toString(nombre));
        text12.setWrappingWidth(200.0*largeur);
        text12.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox6, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox7.setLayoutX(82.0*largeur);
        hBox7.setPrefHeight(33.0*hauteur);
        hBox7.setPrefWidth(711.0*largeur);

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("Jour de départ :");
        text13.setWrappingWidth(130*largeur);
        text13.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text13, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        if(date.getMonth() == 9 || date.getMonth() == 10 || date.getMonth() == 11)
        	text14.setText(date.getDate() + "/" + String.valueOf(date.getMonth()+1) + "/" + String.valueOf(date.getYear()+1900));
        else
        	text14.setText(date.getDate() + "/0" + String.valueOf(date.getMonth()+1) + "/" + String.valueOf(date.getYear()+1900));
        text14.setWrappingWidth(200.0*largeur);
        text14.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox7, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox8.setPrefHeight(100.0*hauteur);
        hBox8.setPrefWidth(200.0*largeur);

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("Prix :");
        text15.setWrappingWidth(130*largeur);
        text15.setFont(new Font(15.0*hauteur));

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setText(prix + " €");
        text16.setWrappingWidth(200.0*largeur);
        text16.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text16, new Insets(0.0, 0.0, 0.0, 35.0*largeur));

        button.setLayoutX(23.0*largeur);
        button.setLayoutY(354.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(75.0*largeur);
        button.setText("Retour");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixRetourTitre();
        	}
        });

        button0.setLayoutX(679.0*largeur);
        button0.setLayoutY(354.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(100.0*largeur);
        button0.setText("Paiement");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixPaiement();
        	}
        });

        text17.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text17.setLayoutX(31.0*largeur);
        text17.setLayoutY(54.5*hauteur);
        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText("Achat d'un billet de train (récapitulatif de commande)");
        text17.setUnderline(true);
        text17.setFont(new Font("System Bold", 22.0*hauteur));

        hBox.getChildren().addAll(text, text0);
        hBox0.getChildren().addAll(text1, text2);
        hBox2.getChildren().addAll(text3, text4);
        hBox1.getChildren().addAll(hBox2);
        hBox3.getChildren().addAll(text5, text6);
        hBox4.getChildren().addAll(text7, text8);
        hBox5.getChildren().addAll(text9, text10);
        hBox6.getChildren().addAll(text11, text12);
        hBox7.getChildren().addAll(text13, text14);
        hBox8.getChildren().addAll(text15, text16);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox3, hBox4, hBox5, hBox6, hBox7, hBox8);
        getChildren().addAll(rectangle, vBox, button, button0, text17);
        
        button.setFocusTraversable(false);
        button0.setFocusTraversable(false);
    }

	public void actionRetour() 
	{
		graphAC.choixRetourTitre();
	}
	
	public void actionEntrer() 
	{
		graphAC.choixPaiement();
	}
}