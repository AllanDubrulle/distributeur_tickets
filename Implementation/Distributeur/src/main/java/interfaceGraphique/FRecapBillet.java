package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FRecapBillet extends Ecran 
{    
    public FRecapBillet() 
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

        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        vBox.setLayoutX(80.0);
        vBox.setLayoutY(78.0);
        vBox.setPrefHeight(258.0);
        vBox.setPrefWidth(377.0);

        hBox.setPrefHeight(17.0);
        hBox.setPrefWidth(244.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        HBox.setMargin(text, new Insets(0.0, 70.0, 0.0, 0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(FBillet.getGareDepart());
        text0.setWrappingWidth(200.0);
        text0.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox0.setPrefHeight(17.0);
        hBox0.setPrefWidth(244.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Gare d'arrivée :");
        HBox.setMargin(text1, new Insets(0.0, 77.0, 0.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(FBillet.getGareArrivee());
        text2.setWrappingWidth(200.0);
        text2.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0);

        hBox2.setPrefHeight(41.0);
        hBox2.setPrefWidth(725.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Aller / Aller-retour :");
        HBox.setMargin(text3, new Insets(0.0, 47.0, 0.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText(FBillet.getAllerRetour());
        text4.setWrappingWidth(200.0);
        text4.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Classe :");
        HBox.setMargin(text5, new Insets(0.0, 127.0, 0.0, 0.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText(FBillet.getClasse());
        text6.setWrappingWidth(200.0);
        text6.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox4.setPrefHeight(17.0);
        hBox4.setPrefWidth(244.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Type de billet :");
        HBox.setMargin(text7, new Insets(0.0, 77.0, 0.0, 0.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(FBillet.getType());
        text8.setWrappingWidth(200.0);
        text8.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(711.0);

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Réduction :");
        HBox.setMargin(text9, new Insets(0.0, 100.0, 0.0, 0.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText(FBillet.getReduction());
        text10.setWrappingWidth(200.0);
        text10.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox6.setPrefHeight(12.0);
        hBox6.setPrefWidth(711.0);

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Nombre de billet(s) : ");
        HBox.setMargin(text11, new Insets(0.0, 35.0, 0.0, 0.0));

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        String s = FBillet.getNombre();
        if (s.equals("01"))
        	text12.setText(" 1");
        else
        	text12.setText(s);
        text12.setWrappingWidth(200.0);
        text12.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox6, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox7.setLayoutX(82.0);
        hBox7.setPrefHeight(33.0);
        hBox7.setPrefWidth(711.0);

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("Jour de départ :");
        HBox.setMargin(text13, new Insets(0.0, 70.0, 0.0, 0.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText(FBillet.getDate());
        text14.setWrappingWidth(200.0);
        text14.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox7, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox8.setPrefHeight(100.0);
        hBox8.setPrefWidth(200.0);

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("Prix :");

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setText(String.valueOf(Double.valueOf(FBillet.getPrix())/100) + " €");
        text16.setWrappingWidth(200.0);
        text16.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text16, new Insets(0.0, 0.0, 0.0, 140.0));

        button.setLayoutX(22.5);
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

        text17.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text17.setLayoutX(31.0);
        text17.setLayoutY(54.5);
        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText("Achat d'un billet de train (récapitulatif de commande)");
        text17.setUnderline(true);
        text17.setFont(new Font("System Bold", 22.0));

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