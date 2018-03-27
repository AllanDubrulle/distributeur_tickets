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
	public FRecapAboAchat(String numero, String nom, String registre, String gareDepart, String gareArrivee, int validite, int classe, String reduction, String type, double prix, double hauteur, double largeur)
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
        HBox hBox2 = new HBox();
        Text texte4 = new Text();
        Text texte5 = new Text();
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
        HBox hBox7 = new HBox();
        Text texte14 = new Text();
        Text texte15 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
        HBox hBox8 = new HBox();	
        Text texte16 = new Text();	
        Text texte17 = new Text();
        Text texte18 = new Text();
        Text texte19 = new Text();

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
        
        texte.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte.setLayoutX(54.0*largeur);
        texte.setLayoutY(60.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Achat d'un abonnement (recapitulatif de commande)");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(87.0*largeur);
        vBox.setLayoutY(86.0*hauteur);
        vBox.setPrefHeight(169.0*hauteur);
        vBox.setPrefWidth(490.0*largeur);

        hBox.setPrefHeight(12.0*hauteur);
        hBox.setPrefWidth(711.0*largeur);
        
        texte18.setText("Numero de l'abonnement :");
        texte18.setWrappingWidth(180.0*largeur);
        texte18.setFont(new Font(15.0*hauteur));
        
        texte19.setText(numero);
        texte19.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte19, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

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
        texte1.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(12.0*hauteur);
        hBox1.setPrefWidth(711.0*largeur);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Numero de registre national : ");
        texte2.setWrappingWidth(180.0*largeur);
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(0.0));

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText(registre);
        texte3.setWrappingWidth(200.0*largeur);
        texte3.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte3, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Itineraire :");
        texte4.setWrappingWidth(180.0*largeur);
        texte4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte4, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText(gareDepart.toUpperCase());
        texte5.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte5, new Insets(0.0, 0.0, 0.0, 0.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("    -    ");
        texte6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte6, new Insets(0.0, 20.0*largeur, 0.0, 20.0*largeur));

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(gareArrivee.toUpperCase());
        texte7.setFont(new Font("System Bold Italic", 15.0*hauteur));

        hBox4.setPrefHeight(41.0*hauteur);
        hBox4.setPrefWidth(725.0*largeur);

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText("Validite de l'abonnement :");
        texte8.setWrappingWidth(180.0*largeur);
        texte8.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte8, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText(validite + " mois");
        texte9.setWrappingWidth(200.0*largeur);
        texte9.setFont(new Font("System Bold Italic", 15.0*hauteur));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(17.0*hauteur);
        hBox5.setPrefWidth(244.0*largeur);

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText("Classe :");
        texte10.setWrappingWidth(180.0*largeur);
        texte10.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte10, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText(classe + "e classe");
        texte11.setWrappingWidth(200.0*largeur);
        texte11.setFont(new Font("System Bold Italic", 15.0*hauteur));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setPrefHeight(17.0*hauteur);
        hBox6.setPrefWidth(244.0);

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText("Reduction :");
        texte12.setWrappingWidth(180.0*largeur);
        texte12.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte12, new Insets(0.0));

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText(reduction);
        texte13.setWrappingWidth(200.0);
        texte13.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte13, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox6.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        texte16.setStrokeWidth(0.0);	
        texte16.setText("Type d'abonnement :");	
        texte16.setWrappingWidth(180.0*largeur);	
        texte16.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(texte16, new Insets(0.0));	
        
        texte17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        texte17.setStrokeWidth(0.0);	
        texte17.setText(type);	
        texte17.setWrappingWidth(200.0);	
        texte17.setFont(new Font("System Bold Italic", 15.0*hauteur));	
        HBox.setMargin(texte17, new Insets(0.0, 0.0, 0.0, 20.0*largeur));	
        hBox8.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox7.setPrefHeight(17.0*hauteur);
        hBox7.setPrefWidth(244.0*largeur);

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setText("Prix :");
        texte14.setWrappingWidth(180.0*largeur);
        texte14.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte14, new Insets(0.0));

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        texte15.setText(prix + " eur");
        texte15.setWrappingWidth(200.0);
        texte15.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte15, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox7.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

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

        hBox.getChildren().addAll(texte18, texte19);
        hBox0.getChildren().addAll(texte0, texte1);
        hBox1.getChildren().addAll(texte2, texte3);
        hBox2.getChildren().addAll(texte4, texte5, texte6, texte7);
        hBox4.getChildren().addAll(texte8, texte9);
        hBox5.getChildren().addAll(texte10, texte11);
        hBox6.getChildren().addAll(texte12, texte13);
        hBox7.getChildren().addAll(texte14, texte15);
        hBox8.getChildren().addAll(texte16, texte17);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox4, hBox5, hBox6, hBox8, hBox7);
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