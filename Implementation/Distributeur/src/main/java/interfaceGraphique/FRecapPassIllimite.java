package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FRecapPassIllimite extends Ecran 
{    
    public FRecapPassIllimite(String nom, int classe, String type, String reduction, int nbrJours, double prix, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text texte0 = new Text();
        Text texte1 = new Text();
        HBox hBox1 = new HBox();
        Text texte2 = new Text();
        Text texte3 = new Text();
        HBox hBox3 = new HBox();
        Text texte6 = new Text();
        Text texte7 = new Text();
        HBox hBox4 = new HBox();
        Text texte8 = new Text();
        Text texte9 = new Text();
        HBox hBox5 = new HBox();
        Text texte10 = new Text();
        Text texte11 = new Text();
        HBox hBox6 = new HBox();
        Text texte12 = new Text();
        Text texte13 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();

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

        texte.setFontSmoothingType(javafx.scene.texte.FontSmoothingType.LCD);
        texte.setLayoutX(32.0*largeur);
        texte.setLayoutY(62.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Achat d'un pass avec choix du nombre de jours (recapitulatif de commande)");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 20.0*hauteur));

        vBox.setLayoutX(86.0*largeur);
        vBox.setLayoutY(105.0*hauteur);
        vBox.setPrefHeight(207.0*hauteur);
        vBox.setPrefWidth(470.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Nom : ");
        texte0.setWrappingWidth(180.0*largeur);
        texte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte0, new Insets(0.0));

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText(nom.toUpperCase());
        texte1.setWrappingWidth(200.0*largeur);
        HBox.setMargin(texte1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        texte1.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0*largeur);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Type du pass :");
        texte2.setWrappingWidth(180.0*largeur);
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText(type);
        texte3.setWrappingWidth(200.0*largeur);
        texte3.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("Classe :");
        texte6.setWrappingWidth(180.0*largeur);
        texte6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte6, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(classe + "e classe");
        texte7.setWrappingWidth(200.0*largeur);
        texte7.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0*largeur);

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText("Reduction :");
        texte8.setWrappingWidth(180.0*largeur);
        texte8.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte8, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText(reduction);
        texte9.setWrappingWidth(200.0*largeur);
        texte9.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(12.0*hauteur);
        hBox5.setPrefWidth(711.0*largeur);

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText("Nombre de jours de validite : ");
        texte10.setWrappingWidth(180.0*largeur);
        texte10.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte10, new Insets(0.0));

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText(Integer.toString(nbrJours));
        texte11.setWrappingWidth(200.0*largeur);
        texte11.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte11, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setPrefHeight(12.0*hauteur);
        hBox6.setPrefWidth(711.0*largeur);

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText("Prix :");
        texte12.setWrappingWidth(180.0*largeur);
        texte12.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte12, new Insets(0.0));

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText(prix + " eur");
        texte13.setWrappingWidth(200.0*largeur);
        texte13.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte13, new Insets(0.0, 0.0, 0.0, 20.0*largeur));

        bouton.setLayoutX(23.0*largeur);
        bouton.setLayoutY(354.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(75.0*largeur);
        bouton.setText("Retour");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixRetourTitre();
        	}
        });

        bouton0.setLayoutX(679.0*largeur);
        bouton0.setLayoutY(354.0*hauteur);
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(100.0*largeur);
        bouton0.setText("Paiement");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixPaiement();
        	}
        });

        hBox0.getChildren().addAll(texte0, texte1);
        hBox1.getChildren().addAll(texte2, texte3);
        hBox3.getChildren().addAll(texte6, texte7);
        hBox4.getChildren().addAll(texte8, texte9);
        hBox5.getChildren().addAll(texte10, texte11);
        hBox6.getChildren().addAll(texte12, texte13);
        vBox.getChildren().addAll(hBox, hBox0, hBox3, hBox1, hBox4, hBox5, hBox6);
        getChildren().addAll(rectangle, texte, vBox, bouton, bouton0);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
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