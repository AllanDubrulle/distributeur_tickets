package interfaceGraphique;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

/**
 * Classe FRecapBillet
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FRecapBillet extends Ecran 
{    
    public FRecapBillet(String gareDepart, String gareArrivee, boolean allerRetour, int classe, String type, String reduction, int nombre, LocalDate date, double prix, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text texte = new Text();
        Text texte0 = new Text();
        HBox hBox0 = new HBox();
        Text texte1 = new Text();
        Text texte2 = new Text();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        Text texte3 = new Text();
        Text texte4 = new Text();
        HBox hBox3 = new HBox();
        Text texte5 = new Text();
        Text texte6 = new Text();
        HBox hBox4 = new HBox();
        Text texte7 = new Text();
        Text texte8 = new Text();
        HBox hBox5 = new HBox();
        Text texte9 = new Text();
        Text texte10 = new Text();
        HBox hBox6 = new HBox();
        Text texte11 = new Text();
        Text texte12 = new Text();
        HBox hBox7 = new HBox();
        Text texte13 = new Text();
        Text texte14 = new Text();
        HBox hBox8 = new HBox();
        Text texte15 = new Text();
        Text texte16 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Text texte17 = new Text();

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

        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Gare de depart :");
        texte.setWrappingWidth(130*largeur);
        texte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText(gareDepart.toUpperCase());
        texte0.setWrappingWidth(200.0*largeur);
        texte0.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox0.setPrefHeight(17.0*hauteur);
        hBox0.setPrefWidth(244.0*largeur);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Gare d'arrivee :");
        texte1.setWrappingWidth(130*largeur);
        texte1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte1, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText(gareArrivee.toUpperCase());
        texte2.setWrappingWidth(200.0*largeur);
        texte2.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0*largeur);

        hBox2.setPrefHeight(41.0*hauteur);
        hBox2.setPrefWidth(725.0*largeur);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("Aller / Aller-retour :");
        texte3.setWrappingWidth(130*largeur);
        texte3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte3, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        if (allerRetour)
        {
        	texte4.setText("Aller-retour");
        }
        else
        {
        	texte4.setText("Aller simple");
        }
        texte4.setWrappingWidth(200.0*largeur);
        texte4.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText("Classe :");
        texte5.setWrappingWidth(130*largeur);
        texte5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte5, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText(classe + "e classe");
        
        texte6.setWrappingWidth(200.0*largeur);
        texte6.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0*largeur);

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText("Type de billet :");
        texte7.setWrappingWidth(130*largeur);
        texte7.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte7, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText(type);
        texte8.setWrappingWidth(200.0*largeur);
        texte8.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(0.0);
        hBox5.setPrefWidth(711.0*largeur);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText("Reduction :");
        texte9.setWrappingWidth(130*largeur);
        texte9.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte9, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText(reduction);
        texte10.setWrappingWidth(200.0*largeur);
        texte10.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setPrefHeight(12.0*hauteur);
        hBox6.setPrefWidth(711.0*largeur);

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText("Nombre de billet(s) : ");
        texte11.setWrappingWidth(130*largeur);
        texte11.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte11, new Insets(0.0, 35.0*largeur, 0.0, 0.0));

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText(Integer.toString(nombre));
        texte12.setWrappingWidth(200.0*largeur);
        texte12.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox6, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox7.setLayoutX(82.0*largeur);
        hBox7.setPrefHeight(33.0*hauteur);
        hBox7.setPrefWidth(711.0*largeur);

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText("Jour de depart :");
        texte13.setWrappingWidth(130*largeur);
        texte13.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte13, new Insets(0.0, 35.0*largeur, 0.0, 0.0));
        
        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        if(date.getMonthValue() == 10 || date.getMonthValue() == 11 || date.getMonthValue() == 12)
        	texte14.setText(date.getDayOfMonth() + "/" + String.valueOf(date.getMonthValue()) + "/" + String.valueOf(date.getYear()));
        else
        	texte14.setText(date.getDayOfMonth() + "/0" + String.valueOf(date.getMonthValue()) + "/" + String.valueOf(date.getYear()));
        texte14.setWrappingWidth(200.0*largeur);
        texte14.setFont(new Font("System Bold Italic", 15.0*hauteur));
        VBox.setMargin(hBox7, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox8.setPrefHeight(100.0*hauteur);
        hBox8.setPrefWidth(200.0*largeur);

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        texte15.setText("Prix :");
        texte15.setWrappingWidth(130*largeur);
        texte15.setFont(new Font(15.0*hauteur));

        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte16.setStrokeWidth(0.0);
        texte16.setText(prix + " eur");
        texte16.setWrappingWidth(200.0*largeur);
        texte16.setFont(new Font("System Bold Italic", 15.0*hauteur));
        HBox.setMargin(texte16, new Insets(0.0, 0.0, 0.0, 35.0*largeur));

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

        texte17.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte17.setLayoutX(31.0*largeur);
        texte17.setLayoutY(54.5*hauteur);
        texte17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte17.setStrokeWidth(0.0);
        texte17.setText("Achat d'un billet de train (recapitulatif de commande)");
        texte17.setUnderline(true);
        texte17.setFont(new Font("System Bold", 22.0*hauteur));

        hBox.getChildren().addAll(texte, texte0);
        hBox0.getChildren().addAll(texte1, texte2);
        hBox2.getChildren().addAll(texte3, texte4);
        hBox1.getChildren().addAll(hBox2);
        hBox3.getChildren().addAll(texte5, texte6);
        hBox4.getChildren().addAll(texte7, texte8);
        hBox5.getChildren().addAll(texte9, texte10);
        hBox6.getChildren().addAll(texte11, texte12);
        hBox7.getChildren().addAll(texte13, texte14);
        hBox8.getChildren().addAll(texte15, texte16);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox3, hBox4, hBox5, hBox6, hBox7, hBox8);
        getChildren().addAll(rectangle, vBox, bouton, bouton0, texte17);
        
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