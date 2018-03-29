package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;

/**
 * Classe FChoixPaiement
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FChoixPaiement extends Ecran 
{
	private Text texte10;
	
    public FChoixPaiement(boolean fentes, boolean lecteur, double hauteur, double largeur) 
    {
    	texte10 = new Text();
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Button bouton1 = new Button();

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
        texte.setText("Choisissez un mode de paiement :");
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        bouton.setLayoutX(150.0*largeur);
        bouton.setLayoutY(170.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(175.0*largeur);
        bouton.setText("Paiement liquide");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setFont(new Font(17.0*hauteur));
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            	{
            		if(graphAC.fentePresente())
            			graphAC.choixPaiementLiquide();
            		else
            			texte10.setText("Le distributeur ne possede pas de fentes");
            	}
            }
        });

        bouton0.setLayoutX(475.0*largeur);
        bouton0.setLayoutY(170.0*hauteur);
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(175.0*largeur);
        bouton0.setText("Paiement par carte");
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setFont(new Font(17.0*hauteur));
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixPaiementParCarte();
            }
        });

        bouton1.setLayoutX(362.5*largeur);
        bouton1.setLayoutY(333.0*hauteur);
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(75.0*largeur);
        bouton1.setText("Annuler");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixAnnuler();
            }
        });
        
        texte10.setFont(new Font("System Bold", 15.0*hauteur));
		texte10.setWrappingWidth(250.0*largeur);
		texte10.setFill(javafx.scene.paint.Color.RED);
		texte10.setLayoutX(175.0*largeur);
		texte10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
		texte10.setLayoutY(300.0*hauteur);

		if (!lecteur)
			bouton0.setDisable(true);
		if (!fentes)
			bouton.setDisable(true);
		
        bouton1.setFocusTraversable(false);
		
        getChildren().addAll(rectangle, texte, bouton, bouton0, texte10, bouton1);
    }

	public void actionClavier(int a) 
	{
		if (a == 1)
		{
       		if(graphAC.fentePresente())
       			graphAC.choixPaiementLiquide();
       		else
       			texte10.setText("Le distributeur ne possede pas de fente");
		}
		if (a == 2)
			graphAC.choixPaiementParCarte();
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}
}