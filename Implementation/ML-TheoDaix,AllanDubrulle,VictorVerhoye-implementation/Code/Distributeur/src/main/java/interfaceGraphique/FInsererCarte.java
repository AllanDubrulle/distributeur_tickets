package interfaceGraphique;

import javafx.scene.text.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.shape.*;

/**
 * Classe FInsererCarte
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FInsererCarte extends Ecran 
{
    public FInsererCarte(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        Button bouton = new Button();

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

        texte.setLayoutX(284.0*largeur);
        texte.setLayoutY(193.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Veuillez inserer votre carte");
        texte.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte.setWrappingWidth(231.5*largeur);
        texte.setFont(new Font("System Italic", 18.0*hauteur));
        
        bouton.setText("Retour");
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(75.0*largeur);
        bouton.setLayoutX(362.5*largeur);
        bouton.setLayoutY(339*hauteur);
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixRetour();
        	}
        });

        getChildren().addAll(rectangle, texte, bouton);
        
        bouton.setFocusTraversable(false);
    }

	public void actionRetour() 
	{
		graphAC.choixRetour();
	}
}