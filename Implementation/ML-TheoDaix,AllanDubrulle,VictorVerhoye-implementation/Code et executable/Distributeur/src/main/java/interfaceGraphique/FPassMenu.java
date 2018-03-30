package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

/**
 * Classe FPassMenu
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FPassMenu extends Ecran 
{
    public FPassMenu(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        Text texte0 = new Text();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Button bouton1 = new Button();
        VBox vBox0 = new VBox();
        Text texte1 = new Text();
        Text texte2 = new Text();
        Text texte3 = new Text();
        Button bouton2 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        texte.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte.setLayoutX(44.0*largeur);
        texte.setLayoutY(55.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Achat d'un pass");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        texte0.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte0.setLayoutX(81.0*largeur);
        texte0.setLayoutY(133.0*hauteur);
        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Selectionner un type de pass :");
        texte0.setFont(new Font(18.0*hauteur));

        hBox.setLayoutX(56.0*largeur);
        hBox.setLayoutY(175.0*hauteur);
        hBox.setPrefHeight(96.0*hauteur);
        hBox.setPrefWidth(729.0*largeur);

        vBox.setPrefHeight(139.0*hauteur);
        vBox.setPrefWidth(172.0*largeur);

        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(185.0*largeur);
        bouton.setText("Pass illimite");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixPassIllimite();
            }
        });

        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(237.0*largeur);
        bouton0.setText("Pass 10 trajets");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixPass10Trajets();
            }
        });

        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(192.0*largeur);
        bouton1.setText("Pass 10 trajets 2 gares");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton1, new Insets(20.0*hauteur, 0.0, 0.0, 0.0));
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixPass10Tajets2Gares();
            }
        });
        
        vBox0.setPrefHeight(125.0*hauteur);
        vBox0.setPrefWidth(531.0*largeur);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText(":      Permet de voyager librement pendant un certain nombre de jours");
        texte1.setFont(new Font(15.0*hauteur));
        VBox.setMargin(texte1, new Insets(5.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText(":      Permet d'effectuer 10 trajets sans gares predefinies");
        texte2.setFont(new Font(15.0*hauteur));
        VBox.setMargin(texte2, new Insets(20.0*hauteur, 0.0, 20.0*hauteur, 0.0));

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText(":      Permet d'effectuer 10 trajets entre les gares d'arrivee et de depart predefinies");
        texte3.setFont(new Font(15.0*hauteur));
        VBox.setMargin(texte3, new Insets(12.0*hauteur, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox0, new Insets(0.0, 0.0, 0.0, 20.0*largeur));

        bouton2.setLayoutX(385.0*largeur);
        bouton2.setLayoutY(344.0*hauteur);
        bouton2.setMnemonicParsing(false);
        bouton2.setText("Annuler");
        bouton2.setFont(new Font(15.0*hauteur));
        bouton2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixAnnuler();
            }
        });

        vBox.getChildren().addAll(bouton, bouton0, bouton1);
        vBox0.getChildren().addAll(texte1, texte2, texte3);
        hBox.getChildren().addAll(vBox, vBox0);
        getChildren().addAll(rectangle, texte, texte0, hBox, bouton2);

        bouton2.setFocusTraversable(false);
    }

	public void actionClavier(int a) 
	{
		if (a == 1)
			graphAC.choixPassIllimite();
		else if (a == 2)
			graphAC.choixPass10Trajets();
		else if (a == 3)
			graphAC.choixPass10Tajets2Gares();
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}
}