package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FDemandeRecu extends Ecran 
{    
    public FDemandeRecu(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
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

        texte.setLayoutX(60.0*largeur);
        texte.setLayoutY(100.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Souhaitez-vous un recu ?");
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        bouton.setLayoutX(575.0*largeur);
        bouton.setLayoutY(200.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(75.0*largeur);
        bouton.setText("Non");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixNon();
            }
        });

        bouton0.setLayoutX(150.0*largeur);
        bouton0.setLayoutY(200.0*hauteur);
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(75.0*largeur);
        bouton0.setText("Oui");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixOui();
            }
        });

        getChildren().addAll(rectangle, texte, bouton, bouton0);
    }

	public void actionClavier(int a) 
	{
		if (a == 1)
			graphAC.choixOui();
		else if (a == 2)
			graphAC.choixNon();
	}
}