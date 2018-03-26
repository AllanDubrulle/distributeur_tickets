package interfaceGraphique;

import java.text.NumberFormat;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FChoixParLiquide extends Ecran 
{
    private Text text1, text3, text5;

    public FChoixParLiquide(double prix, double hauteur, double largeur) 
    {
    	NumberFormat nf = NumberFormat.getInstance();
    	nf.setMaximumFractionDigits(2);
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        Button button = new Button();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text text0 = new Text();
        text1 = new Text();
        HBox hBox0 = new HBox();
        Text text2 = new Text();
        text3 = new Text();
        HBox hBox1 = new HBox();
        Text text4 = new Text();
        text5 = new Text();

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

        text.setLayoutX(60.0*largeur);
        text.setLayoutY(75.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Veuillez introduire l'argent");
        text.setFont(new Font("System Bold", 22.0*hauteur));

        button.setLayoutX(362.5*largeur);
        button.setLayoutY(333.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(75.0*largeur);
        button.setText("Annuler");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixAnnuler();
            }
        });

        vBox.setLayoutX(113.0*largeur);
        vBox.setLayoutY(148.0*hauteur);
        vBox.setPrefHeight(40.0*hauteur);
        vBox.setPrefWidth(295.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(100.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Montant à payer :");
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0, 50.0*largeur, 0.0, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setFont(new Font(15.0*hauteur));
        text1.setText(nf.format(prix) + " €");
        
        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(100.0*hauteur);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Montant introduit :");
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0, 43.0*largeur, 0.0, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("0.0 €");
        VBox.setMargin(hBox0, new Insets(20.0*hauteur, 0.0, 20.0*hauteur, 0.0));
        text3.setFont(new Font(15.0*hauteur));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(100.0*largeur);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Montant restant :");
        text4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text4, new Insets(0.0, 53.0*largeur, 0.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(nf.format(prix) + " €");
        text5.setFont(new Font(15.0*hauteur));

        hBox.getChildren().addAll(text0, text1);
        hBox0.getChildren().addAll(text2, text3);
        hBox1.getChildren().addAll(text4, text5);
        vBox.getChildren().addAll(hBox, hBox0, hBox1);
        getChildren().addAll(rectangle, text, button, vBox);
    }

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}
	
	public void actualiserMontant(double restant , double introduit)
	{
    	NumberFormat nf = NumberFormat.getInstance();
		text3.setText(nf.format(introduit) + " €");
        text5.setText(nf.format(restant) + " €");
	}
}