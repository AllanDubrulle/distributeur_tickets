package interfaceGraphique;

import coeur.GraphiqueACoeur;
import coeur.GraphiqueACoeurImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.layout.*;

class LecteurCarte extends Pane 
{
	private PasswordField champDeMDP;
	private Button bouton, bouton0, bouton1, bouton2, bouton3, bouton4, bouton5, bouton6, bouton7, bouton8, bouton9, bouton10, bouton11;
	private GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();
	
	private Ecran fenetre;

	public LecteurCarte(double hauteur, double largeur) 
	{
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        champDeMDP = new PasswordField();
        HBox hBox = new HBox();
        bouton = new Button();
        bouton0 = new Button();
        bouton1 = new Button();
        HBox hBox0 = new HBox();
        bouton2 = new Button();
        bouton3 = new Button();
        bouton4 = new Button();
        HBox hBox1 = new HBox();
        bouton5 = new Button();
        bouton6 = new Button();
        bouton7 = new Button();
        HBox hBox2 = new HBox();
        bouton8 = new Button();
        bouton9 = new Button();
        bouton10 = new Button();
        bouton11 = new Button();

        setPrefHeight(250.0*hauteur);
        setPrefWidth(200.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle.setHeight(260.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0*largeur);

        vBox.setPrefHeight(250.0*hauteur);
        vBox.setPrefWidth(200.0*largeur);

        VBox.setMargin(champDeMDP, new Insets(10.0*hauteur, 20.0*largeur, 10.0*hauteur, 20.0*largeur));
        champDeMDP.setFont(new Font(15.0*hauteur));
        

        hBox.setPrefHeight(37.0*hauteur);
        hBox.setPrefWidth(110.0*largeur);
        
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(29.0*largeur);
        bouton.setText("1");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton, new Insets(0.0));
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(1);
            }
        });

        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(29.0*largeur);
        bouton0.setText("2");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton0, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(2);
            }
        });

        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(29.0*largeur);
        bouton1.setText("3");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton1, new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 2.0*hauteur, 45.0*largeur));
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(3);
            }
        });

        hBox0.setPrefHeight(39.0*hauteur);
        hBox0.setPrefWidth(205.0*largeur);

        bouton2.setMnemonicParsing(false);
        bouton2.setPrefHeight(31.0*hauteur);
        bouton2.setPrefWidth(29.0*largeur);
        bouton2.setText("4");
        bouton2.setFont(new Font(15.0*hauteur));
        bouton2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton2, new Insets(0.0, 0.0, 0.0, 17.0*largeur));
        bouton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(4);
            }
        });

        bouton3.setMnemonicParsing(false);
        bouton3.setPrefHeight(31.0*hauteur);
        bouton3.setPrefWidth(29.0*largeur);
        bouton3.setText("5");
        bouton3.setFont(new Font(15.0*hauteur));
        bouton3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton3, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        bouton3.setOnAction(new EventHandler<ActionEvent>()
        {
            
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(5);
            }
        });

        bouton4.setMnemonicParsing(false);
        bouton4.setPrefHeight(31.0*hauteur);
        bouton4.setPrefWidth(29.0*largeur);
        bouton4.setText("6");
        bouton4.setFont(new Font(15.0*hauteur));
        bouton4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox0, new Insets(2.0*hauteur, 0.0, 2.0*hauteur, 28.0*largeur));
        bouton4.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(6);
            }
        });

        hBox1.setPrefHeight(40.0*hauteur);
        hBox1.setPrefWidth(205.0*largeur);

        bouton5.setMnemonicParsing(false);
        bouton5.setPrefHeight(31.0*hauteur);
        bouton5.setPrefWidth(29.0*largeur);
        bouton5.setText("7");
        bouton5.setFont(new Font(15.0*hauteur));
        bouton5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton5, new Insets(0.0, 0.0, 0.0, 17.0*largeur));
        bouton5.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(7);
            }
        });

        bouton6.setMnemonicParsing(false);
        bouton6.setPrefHeight(31.0*hauteur);
        bouton6.setPrefWidth(29.0*largeur);
        bouton6.setText("8");
        bouton6.setFont(new Font(15.0*hauteur));
        bouton6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton6, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        bouton6.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(8);
            }
        });

        bouton7.setMnemonicParsing(false);
        bouton7.setPrefHeight(31.0*hauteur);
        bouton7.setPrefWidth(29.0*largeur);
        bouton7.setText("9");
        bouton7.setFont(new Font(15.0*hauteur));
        bouton7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 0.0, 28.0*largeur));
        bouton7.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(9);
            }
        });

        hBox2.setPrefHeight(40.0*hauteur);
        hBox2.setPrefWidth(205.0*largeur);

        bouton8.setMnemonicParsing(false);
        bouton8.setPrefHeight(31.0*hauteur);
        bouton8.setPrefWidth(46.0*largeur);
        bouton8.setText("EFF.");
        bouton8.setFont(new Font(15.0*hauteur));
        bouton8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton8.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteurEff();
            }
        });

        bouton9.setMnemonicParsing(false);
        bouton9.setPrefHeight(31.0*hauteur);
        bouton9.setPrefWidth(29.0*largeur);
        bouton9.setText("0");
        bouton9.setFont(new Font(15.0*hauteur));
        bouton9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton9, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        bouton9.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionLecteur(0);
            }
        });

        bouton10.setMnemonicParsing(false);
        bouton10.setPrefHeight(31.0*hauteur);
        bouton10.setPrefWidth(41.0*largeur);
        bouton10.setText("OK");
        bouton10.setFont(new Font(15.0*hauteur));
        bouton10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton10, new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(2.0*hauteur, 0.0, 2.0*hauteur, 28.0*largeur));
        bouton10.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event)
            {
            	try
            	{
            		graphAC.choixLecteurOK(Integer.parseInt(champDeMDP.getText()));
            	}
            	catch(NumberFormatException e) {}  // catch vide ??
            }
        });

        bouton11.setMnemonicParsing(false);
        bouton11.setPrefHeight(31.0*hauteur);
        bouton11.setPrefWidth(140.0*largeur);
        bouton11.setText("Insérer/Retirer carte");
        bouton11.setFont(new Font(15.0*hauteur));
        bouton11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton11, new Insets(0.0, 0.0, 0.0, 26.0*largeur));
        bouton11.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixLecteurInsererRetirer();
            }
        });
        champDeMDP.setDisable(true);
        champDeMDP.setOnMousePressed(e -> {champDeMDP.clear();});
        
        hBox.getChildren().addAll(bouton, bouton0, bouton1);
        hBox0.getChildren().addAll(bouton2, bouton3, bouton4);
        hBox1.getChildren().addAll(bouton5, bouton6, bouton7);
        hBox2.getChildren().addAll(bouton8, bouton9, bouton10);
        vBox.getChildren().addAll(champDeMDP, hBox, hBox0, hBox1, hBox2, bouton11);
        getChildren().addAll(rectangle, vBox);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
        bouton1.setFocusTraversable(false);
        bouton2.setFocusTraversable(false);
        bouton3.setFocusTraversable(false);
        bouton4.setFocusTraversable(false);
        bouton5.setFocusTraversable(false);
        bouton6.setFocusTraversable(false);
        bouton7.setFocusTraversable(false);
        bouton8.setFocusTraversable(false);
        bouton9.setFocusTraversable(false);
        bouton10.setFocusTraversable(false);
        bouton11.setFocusTraversable(false);
        champDeMDP.setFocusTraversable(false);
    }
	
	public Button getBouton(int i)
	{
		if (i == 0)
			return bouton;
		else if (i == 1)
			return bouton0;
		else if (i == 2)
			return bouton1;
		else if (i == 3)
			return bouton2;
		else if (i == 4)
			return bouton3;
		else if (i == 5)
			return bouton4;
		else if (i == 6)
			return bouton5;
		else if (i == 7)
			return bouton6;
		else if (i == 8)
			return bouton7;
		else if (i == 9)
			return bouton8;
		else if (i == 10)
			return bouton9;
		else if (i == 11)
			return bouton10;
		else
			return bouton11;
	}
	
	public PasswordField getMDP()
	{
		return champDeMDP;
	}
	
	public void setFenetre(Ecran fen)
	{
		fenetre = fen;
	}
}