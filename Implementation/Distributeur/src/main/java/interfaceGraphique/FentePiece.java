package interfaceGraphique;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;

/**
 * Classe FentePiece (permet de representer la fente a billet sur l'interface graphqiue)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FentePiece extends Pane
{
	private Button bouton, bouton0, bouton1, bouton2, bouton3, bouton4, bouton5, bouton6;
	private GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();

	/**
	 * 	Constructeur de FentePiece
	 * 	@param hauteur l'indice de multiplication de hauteur (pour un affichage optimal)
	 * 	@param largeur l'indice de multiplication de largeur (pour un affichage optimal)
	 */
	public FentePiece(double hauteur, double largeur) 
	{
        Circle cercle = new Circle();
        Rectangle rectangle = new Rectangle();
        bouton = new Button();
        bouton0 = new Button();
        bouton1 = new Button();
        bouton2 = new Button();
        bouton3 = new Button();
        bouton4 = new Button();
        bouton5 = new Button();
        bouton6 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(170.0*hauteur);
        setPrefWidth(230.0*largeur);

        cercle.setFill(javafx.scene.paint.Color.valueOf("#48556199"));
        cercle.setLayoutX(112.5*largeur);
        cercle.setLayoutY(85.0*hauteur);
        cercle.setRadius(37.0*hauteur);
        cercle.setStroke(javafx.scene.paint.Color.BLACK);
        cercle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setHeight(50.0*hauteur);
        rectangle.setLayoutX(108.5*largeur);
        rectangle.setLayoutY(60.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(9.0*largeur);

        bouton.setLayoutX(15.0*largeur);
        bouton.setLayoutY(25.0*hauteur);
        bouton.setFont(new Font(14.5*hauteur));
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(55.0*largeur);
        bouton.setText("1 ct ");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix1ct();
            }
        });

        bouton0.setLayoutX(85.0*largeur);
        bouton0.setLayoutY(5.0*hauteur);
        bouton0.setFont(new Font(14.5*hauteur));
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(55.0*largeur);
        bouton0.setText("2 cts");
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix2cts();
            }
        });

        bouton1.setLayoutX(155.0*largeur);
        bouton1.setLayoutY(25.0*hauteur);
        bouton1.setFont(new Font(14.5*hauteur));
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(55.0*largeur);
        bouton1.setText("5 cts");
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix5cts();
            }
        });
        
        bouton2.setLayoutX(5.0*largeur);
        bouton2.setLayoutY(69.5*hauteur);
        bouton2.setFont(new Font(14.5*hauteur));
        bouton2.setMnemonicParsing(false);
        bouton2.setPrefHeight(31.0*hauteur);
        bouton2.setPrefWidth(55.0*largeur);
        bouton2.setText("2 eur");
        bouton2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix2eur();
            }
        });

        bouton3.setLayoutX(165.0*largeur);
        bouton3.setLayoutY(69.5*hauteur);
        bouton3.setFont(new Font(14.5*hauteur));
        bouton3.setMnemonicParsing(false);
        bouton3.setPrefHeight(31.0*hauteur);
        bouton3.setPrefWidth(55.0*largeur);
        bouton3.setText("10 cts");
        bouton3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix10cts();
            }
        });

        bouton4.setLayoutX(15.0*largeur);
        bouton4.setLayoutY(114.0*hauteur);
        bouton4.setFont(new Font(14.5*hauteur));
        bouton4.setMnemonicParsing(false);
        bouton4.setPrefHeight(31.0*hauteur);
        bouton4.setPrefWidth(55.0*largeur);
        bouton4.setText("1 eur");
        bouton4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton4.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix1eur();
            }
        });

        bouton5.setLayoutX(85.0*largeur);
        bouton5.setLayoutY(134.0*hauteur);
        bouton5.setFont(new Font(14.5*hauteur));
        bouton5.setMnemonicParsing(false);
        bouton5.setPrefHeight(31.0*hauteur);
        bouton5.setPrefWidth(55.0*largeur);
        bouton5.setText("50 cts");
        bouton5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton5.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix50cts();
            }
        });

        bouton6.setLayoutX(155.0*largeur);
        bouton6.setLayoutY(114.0*hauteur);
        bouton6.setFont(new Font(14.5*hauteur));
        bouton6.setMnemonicParsing(false);
        bouton6.setPrefHeight(31.0*hauteur);
        bouton6.setPrefWidth(55.0*largeur);
        bouton6.setText("20 cts");
        bouton6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton6.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix20cts();
            }
        });
        
        getChildren().addAll(cercle, rectangle, bouton, bouton0, bouton1, bouton2, bouton3, bouton4, bouton5, bouton6);
    
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
        bouton1.setFocusTraversable(false);
        bouton2.setFocusTraversable(false);
        bouton3.setFocusTraversable(false);
        bouton4.setFocusTraversable(false);
        bouton5.setFocusTraversable(false);
        bouton6.setFocusTraversable(false);
	}
}