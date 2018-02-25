package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FRecapAboRenouvScanne extends Ecran 
{
    private static FRecapAboRenouvScanne instance;

    private FRecapAboRenouvScanne() 
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
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        vBox.setLayoutX(76.0);
        vBox.setLayoutY(155.0);
        vBox.setPrefHeight(93.0);
        vBox.setPrefWidth(476.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0);

        hBox0.setPrefHeight(12.0);
        hBox0.setPrefWidth(711.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Numéro de l'abonnement : ");
        HBox.setMargin(text, new Insets(0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText(FAboRenouvScanne.getNumAbo());
        text0.setWrappingWidth(200.0);
        text0.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text0, new Insets(0.0, 0.0, 0.0, 20.0));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox1.setPrefHeight(41.0);
        hBox1.setPrefWidth(725.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Validité de l'abonnement :");
        HBox.setMargin(text1, new Insets(0.0, 31.0, 0.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(FAboRenouvScanne.getValidite());
        text2.setWrappingWidth(200.0);
        text2.setFont(new Font("System Bold Italic", 15.0));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox2.setPrefHeight(41.0);
        hBox2.setPrefWidth(725.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Prix :");
        HBox.setMargin(text3, new Insets(0.0, 31.0, 0.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("(prix)");
        text4.setWrappingWidth(200.0);
        text4.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text4, new Insets(0.0, 0.0, 0.0, 140.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        text5.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text5.setLayoutX(54.0);
        text5.setLayoutY(83.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Renouveler un abonnement (récapitulatif de commande)");
        text5.setUnderline(true);
        text5.setFont(new Font("System Bold", 22.0));

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

        hBox0.getChildren().addAll(text, text0);
        hBox1.getChildren().addAll(text1, text2);
        hBox2.getChildren().addAll(text3, text4);
        vBox.getChildren().addAll(hBox0, hBox1, hBox2);
        getChildren().addAll(rectangle, vBox, text5, button, button0);
    }

    public static FRecapAboRenouvScanne getInstance() 
    {
    	if (instance == null)
    		instance = new FRecapAboRenouvScanne();
    	return instance;
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