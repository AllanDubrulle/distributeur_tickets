package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FRecapAboAchat extends Ecran 
{    
	private FAboAchat fen;
	
    public FRecapAboAchat(FAboAchat fen) 
    {
        this.fen = fen;
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
        Button button = new Button();
        Button button0 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(54.0);
        text.setLayoutY(60.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un abonnement (r�capitulatif de commande)");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        vBox.setLayoutX(87.0);
        vBox.setLayoutY(86.0);
        vBox.setPrefHeight(169.0);
        vBox.setPrefWidth(490.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0);

        hBox0.setPrefHeight(12.0);
        hBox0.setPrefWidth(711.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        HBox.setMargin(text0, new Insets(0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(fen.getNom());
        text1.setWrappingWidth(200.0);
        text1.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text1, new Insets(0.0, 0.0, 0.0, 159.0));
        hBox0.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox1.setPrefHeight(12.0);
        hBox1.setPrefWidth(711.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Num�ro de registre national : ");
        HBox.setMargin(text2, new Insets(0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(fen.getNumRegNat());
        text3.setWrappingWidth(200.0);
        text3.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text3, new Insets(0.0, 0.0, 0.0, 5.0));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Gare de d�part :");
        HBox.setMargin(text4, new Insets(0.0, 70.0, 0.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(fen.getGareDepart());
        text5.setWrappingWidth(200.0);
        text5.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text5, new Insets(0.0, 0.0, 0.0, 25.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(31.0);
        hBox3.setPrefWidth(729.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Gare d'arriv�e :");
        HBox.setMargin(text6, new Insets(0.0, 77.0, 0.0, 0.0));

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(fen.getGareArrivee());
        text7.setWrappingWidth(200.0);
        text7.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text7, new Insets(0.0, 0.0, 0.0, 25.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox4.setPrefHeight(41.0);
        hBox4.setPrefWidth(725.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Validit� de l'abonnement :");
        HBox.setMargin(text8, new Insets(0.0, 31.0, 0.0, 0.0));

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText(fen.getValidite());
        text9.setWrappingWidth(200.0);
        text9.setFont(new Font("System Bold Italic", 15.0));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(17.0);
        hBox5.setPrefWidth(244.0);

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("Classe :");
        HBox.setMargin(text10, new Insets(0.0, 157.0, 0.0, 0.0));

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText(fen.getClasse());
        text11.setWrappingWidth(200.0);
        text11.setFont(new Font("System Bold Italic", 15.0));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox6.setPrefHeight(17.0);
        hBox6.setPrefWidth(244.0);

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("R�duction :");
        HBox.setMargin(text12, new Insets(0.0));

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText(fen.getReduction());
        text13.setWrappingWidth(200.0);
        text13.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text13, new Insets(0.0, 0.0, 0.0, 130.0));
        hBox6.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox7.setPrefHeight(17.0);
        hBox7.setPrefWidth(244.0);

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText("Prix :");
        HBox.setMargin(text14, new Insets(0.0));

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("(prix)");
        text15.setWrappingWidth(200.0);
        text15.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text15, new Insets(0.0, 0.0, 0.0, 170.0));
        hBox7.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        button.setLayoutX(23.0);
        button.setLayoutY(354.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Retour");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixRetour();
        	}
        });

        button0.setLayoutX(679.0);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(100.0);
        button0.setText("Paiement");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixPaiement();
        	}
        });

        hBox0.getChildren().addAll(text0, text1);
        hBox1.getChildren().addAll(text2, text3);
        hBox2.getChildren().addAll(text4, text5);
        hBox3.getChildren().addAll(text6, text7);
        hBox4.getChildren().addAll(text8, text9);
        hBox5.getChildren().addAll(text10, text11);
        hBox6.getChildren().addAll(text12, text13);
        hBox7.getChildren().addAll(text14, text15);
        vBox.getChildren().addAll(hBox0, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7);
        getChildren().addAll(rectangle, text, vBox, button, button0);
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