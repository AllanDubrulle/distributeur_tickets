package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FRecapAboRenouveler extends Ecran 
{    
	public FRecapAboRenouveler(String numero, String nom, String registre, String gareDepart, String gareArrivee, int validite, int classe, String reduction, String type, double prix, double hauteur, double largeur)
	{
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text text0 = new Text();
        Text text1 = new Text();
        HBox hBox1 = new HBox();
        Text text2 = new Text();
        Text text3 = new Text();
        HBox hBox2 = new HBox();
        Text text4 = new Text();
        Text text5 = new Text();
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
        Button button = new Button();
        Button button0 = new Button();
        HBox hBox8 = new HBox();	
        Text text16 = new Text();	
        Text text17 = new Text();
        Text text18 = new Text();
        Text text19 = new Text();

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
        
        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(54.0*largeur);
        text.setLayoutY(60.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Renouvelement d'un abonnement (récapitulatif de commande)");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(87.0*largeur);
        vBox.setLayoutY(86.0*hauteur);
        vBox.setPrefHeight(169.0*hauteur);
        vBox.setPrefWidth(490.0*largeur);

        hBox.setPrefHeight(12.0*hauteur);
        hBox.setPrefWidth(711.0*largeur);
        
        text18.setText("Numéro de l'abonnement :");
        text18.setWrappingWidth(180.0*largeur);
        text18.setFont(new Font(15.0*hauteur));
        
        text19.setText(numero);
        text19.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text19, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        text0.setWrappingWidth(180.0*largeur);
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(nom.toUpperCase());
        text1.setWrappingWidth(200.0*largeur);
        text1.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(12.0*hauteur);
        hBox1.setPrefWidth(711.0*largeur);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Numéro de registre national : ");
        text2.setWrappingWidth(180.0*largeur);
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(registre);
        text3.setWrappingWidth(200.0*largeur);
        text3.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text3, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Gares :");
        text4.setWrappingWidth(180.0*largeur);
        text4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text4, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(gareDepart.toUpperCase());
        text5.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text5, new Insets(0.0, 0.0, 0.0, 0.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("    -    ");
        text6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text6, new Insets(0.0, 20.0*largeur, 0.0, 20.0*largeur));

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(gareArrivee.toUpperCase());
        text7.setFont(new Font("System Bold Italic", 15.0*hauteur));

        hBox4.setPrefHeight(41.0*hauteur);
        hBox4.setPrefWidth(725.0*largeur);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Validité de l'abonnement :");
        text8.setWrappingWidth(180.0*largeur);
        text8.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text8, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(validite + " mois");
        text9.setWrappingWidth(200.0*largeur);
        text9.setFont(new Font("System Bold Italic", 15.0*hauteur));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(17.0*hauteur);
        hBox5.setPrefWidth(244.0*largeur);

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("Classe :");
        text10.setWrappingWidth(180.0*largeur);
        text10.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text10, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText(classe + "e classe");
        text11.setWrappingWidth(200.0*largeur);
        text11.setFont(new Font("System Bold Italic", 15.0*hauteur));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setPrefHeight(17.0*hauteur);
        hBox6.setPrefWidth(244.0);

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("Réduction :");
        text12.setWrappingWidth(180.0*largeur);
        text12.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text12, new Insets(0.0));

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText(reduction);
        text13.setWrappingWidth(200.0);
        text13.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text13, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox6.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        text16.setStrokeWidth(0.0);	
        text16.setText("Type d'abonnement :");	
        text16.setWrappingWidth(180.0*largeur);	
        text16.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(text16, new Insets(0.0));	
        
        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        text17.setStrokeWidth(0.0);	
        text17.setText(type);	
        text17.setWrappingWidth(200.0);	
        text17.setFont(new Font("System Bold Italic", 15.0*hauteur));	
        HBox.setMargin(text17, new Insets(0.0, 0.0, 0.0, 20.0*largeur));	
        hBox8.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox7.setPrefHeight(17.0*hauteur);
        hBox7.setPrefWidth(244.0*largeur);

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText("Prix :");
        text14.setWrappingWidth(180.0*largeur);
        text14.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text14, new Insets(0.0));

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText(prix + " €");
        text15.setWrappingWidth(200.0);
        text15.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text15, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox7.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

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
        		if(graphAC.estTactile())
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
        		if(graphAC.estTactile())
        			graphAC.choixPaiement();
        	}
        });

        hBox.getChildren().addAll(text18, text19);
        hBox0.getChildren().addAll(text0, text1);
        hBox1.getChildren().addAll(text2, text3);
        hBox2.getChildren().addAll(text4, text5, text6, text7);
        hBox4.getChildren().addAll(text8, text9);
        hBox5.getChildren().addAll(text10, text11);
        hBox6.getChildren().addAll(text12, text13);
        hBox7.getChildren().addAll(text14, text15);
        hBox8.getChildren().addAll(text16, text17);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox4, hBox5, hBox6, hBox8, hBox7);
        getChildren().addAll(rectangle, text, vBox, button, button0);
        
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