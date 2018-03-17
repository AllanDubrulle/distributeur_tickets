package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FRecapAboRenouv extends Ecran 
{
	public FRecapAboRenouv(FAboRenouv2 fen, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text text = new Text();
        Text text0 = new Text();
        HBox hBox1 = new HBox();
        Text text1 = new Text();
        Text text2 = new Text();
        HBox hBox2 = new HBox();
        Text text3 = new Text();
        Text text4 = new Text();
        Text text5 = new Text();
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

        vBox.setLayoutX(76.0*largeur);
        vBox.setLayoutY(155.0*hauteur);
        vBox.setPrefHeight(93.0*hauteur);
        vBox.setPrefWidth(476.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Numéro de l'abonnement : ");
        text.setWrappingWidth(180.0*largeur);
        text.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text, new Insets(0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(fen.getNumAbo());
        text0.setWrappingWidth(200.0*largeur);
        text0.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(41.0*hauteur);
        hBox1.setPrefWidth(725.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Validité de l'abonnement :");
        text1.setWrappingWidth(180.0*largeur);
        text1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(fen.getValidite());
        text2.setWrappingWidth(200.0*largeur);
        text2.setFont(new Font("System Bold Italic", 15.0*hauteur));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox2.setPrefHeight(41.0*hauteur);
        hBox2.setPrefWidth(725.0*largeur);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Prix :");
        text3.setWrappingWidth(180.0*largeur);
        text3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("(prix)");
        text4.setWrappingWidth(200.0*largeur);
        text4.setFont(new Font("System Bold Italic", 15.0*hauteur));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        text5.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text5.setLayoutX(54.0*largeur);
        text5.setLayoutY(83.0*hauteur);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Renouveler un abonnement (récapitulatif de commande)");
        text5.setUnderline(true);
        text5.setFont(new Font("System Bold", 22.0*hauteur));

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
        		graphAC.choixRetour();
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

        hBox0.getChildren().addAll(text, text0);
        hBox1.getChildren().addAll(text1, text2);
        hBox2.getChildren().addAll(text3, text4);
        vBox.getChildren().addAll(hBox0, hBox1, hBox2);
        getChildren().addAll(rectangle, vBox, text5, button, button0);
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
		graphAC.choixPaiement();
	}
}