package interfaceGraphique;

import java.text.NumberFormat;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

/**
 * Classe FChoixParLiquide
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FChoixParLiquide extends Ecran 
{
    private Text texte1, texte3, texte5;

    public FChoixParLiquide(double prix, double hauteur, double largeur) 
    {
    	NumberFormat formatNombre = NumberFormat.getInstance();
    	formatNombre.setMaximumFractionDigits(2);
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        Button bouton = new Button();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text texte0 = new Text();
        texte1 = new Text();
        HBox hBox0 = new HBox();
        Text texte2 = new Text();
        texte3 = new Text();
        HBox hBox1 = new HBox();
        Text texte4 = new Text();
        texte5 = new Text();

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

        texte.setLayoutX(60.0*largeur);
        texte.setLayoutY(75.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Veuillez introduire l'argent");
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        bouton.setLayoutX(362.5*largeur);
        bouton.setLayoutY(333.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(75.0*largeur);
        bouton.setText("Annuler");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
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

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Montant a payer :");
        texte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte0, new Insets(0.0, 50.0*largeur, 0.0, 0.0));

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setFont(new Font(15.0*hauteur));
        texte1.setText(formatNombre.format(prix) + " eur");
        
        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(100.0*hauteur);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Montant introduit :");
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(0.0, 43.0*largeur, 0.0, 0.0));

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("0.0 eur");
        VBox.setMargin(hBox0, new Insets(20.0*hauteur, 0.0, 20.0*hauteur, 0.0));
        texte3.setFont(new Font(15.0*hauteur));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(100.0*largeur);

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Montant restant :");
        texte4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte4, new Insets(0.0, 53.0*largeur, 0.0, 0.0));

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText(formatNombre.format(prix) + " eur");
        texte5.setFont(new Font(15.0*hauteur));

        hBox.getChildren().addAll(texte0, texte1);
        hBox0.getChildren().addAll(texte2, texte3);
        hBox1.getChildren().addAll(texte4, texte5);
        vBox.getChildren().addAll(hBox, hBox0, hBox1);
        getChildren().addAll(rectangle, texte, bouton, vBox);
    }

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}
	
	public void actualiserMontant(double restant , double introduit)
	{
    	NumberFormat formatNombre = NumberFormat.getInstance();
		texte3.setText(formatNombre.format(introduit) + " eur");
        texte5.setText(formatNombre.format(restant) + " eur");
	}
}