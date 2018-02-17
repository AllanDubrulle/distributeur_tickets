package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FRecapPass2 extends Ecran 
{    
    private static FRecapPass2 instance;

    private FRecapPass2() 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        VBox vBox = new VBox();
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
        text.setLayoutY(86.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass dix trajets sans gares prédéfinies (récapitulatif de commande)");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 20.0));

        vBox.setLayoutX(78.0);
        vBox.setLayoutY(129.0);
        vBox.setPrefHeight(150.0);
        vBox.setPrefWidth(711.0);

        hBox0.setPrefHeight(12.0);
        hBox0.setPrefWidth(711.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        HBox.setMargin(text0, new Insets(0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("(nom)");
        text1.setWrappingWidth(200.0);
        HBox.setMargin(text1, new Insets(0.0, 0.0, 0.0, 129.0));
        text1.setFont(new Font("System Bold Italic", 15.0));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox1.setPrefHeight(17.0);
        hBox1.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Classe :");
        HBox.setMargin(text2, new Insets(0.0, 126.0, 0.0, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("(classe)");
        text3.setWrappingWidth(200.0);
        text3.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text3, new Insets(0.0));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        HBox.setMargin(text4, new Insets(0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("(reduction)");
        text5.setWrappingWidth(200.0);
        text5.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text5, new Insets(0.0, 0.0, 0.0, 100.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Prix :");
        HBox.setMargin(text6, new Insets(0.0));

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("(prix)");
        text7.setWrappingWidth(200.0);
        text7.setFont(new Font("System Bold Italic", 15.0));
        HBox.setMargin(text7, new Insets(0.0, 0.0, 0.0, 140.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

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

        hBox0.getChildren().addAll(text0, text1);
        hBox1.getChildren().addAll(text2, text3);
        hBox2.getChildren().addAll(text4, text5);
        hBox3.getChildren().addAll(text6, text7);
        vBox.getChildren().addAll(hBox0, hBox1, hBox2, hBox3);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }

    public static FRecapPass2 getInstance() 
    {
    	if (instance == null)
    		instance = new FRecapPass2();
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