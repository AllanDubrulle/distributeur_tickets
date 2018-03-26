package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.layout.*;

class Clavier extends Pane 
{		
	private Ecran fenetre;

	public Clavier(double hauteur, double largeur) 
	{
        Rectangle rectangle = new Rectangle();
        VBox boxVer = new VBox();
        HBox boxHor1 = new HBox();
        HBox boxHor2 = new HBox();
        HBox boxHor3 = new HBox();
        HBox boxHor4 = new HBox();
        HBox boxHor5 = new HBox();
        Button bouton1 = new Button();
        Button bouton2 = new Button();
        Button bouton3 = new Button();
        Button bouton4 = new Button();
        Button bouton5 = new Button();
        Button bouton6 = new Button();
        Button bouton7 = new Button();
        Button bouton8 = new Button();
        Button bouton9 = new Button();
        Button bouton10 = new Button();
        Button bouton11 = new Button();
        Button bouton12 = new Button();
        Button bouton13 = new Button();
        Button bouton14 = new Button();
        Button bouton15 = new Button();
        Button bouton16 = new Button();
        Button bouton17 = new Button();
        Button bouton18 = new Button();
        Button bouton19 = new Button();
        Button bouton20 = new Button();
        Button bouton21 = new Button();
        Button bouton22 = new Button();
        Button bouton23 = new Button();
        Button bouton24 = new Button();
        Button bouton25 = new Button();
        Button bouton26 = new Button();
        Button bouton27 = new Button();
        Button bouton28 = new Button();
        Button bouton29 = new Button();
        Button bouton30 = new Button();
        Button bouton31 = new Button();
        Button bouton32 = new Button();
        Button bouton33 = new Button();
        Button bouton34 = new Button();
        Button bouton35 = new Button();
        Button bouton36 = new Button();
        Button bouton37 = new Button();
        Button bouton38 = new Button();
        Button bouton39 = new Button();
        Button bouton40 = new Button();
        Button bouton41 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(215.0*hauteur);
        setPrefWidth(625.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle.setHeight(215.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(625.0*largeur);

        boxVer.setLayoutX(25.5*largeur);
        boxVer.setLayoutY(11.0*hauteur);
        boxVer.setPrefHeight(175.0*hauteur);
        boxVer.setPrefWidth(574.0*largeur);

        boxHor1.setPrefHeight(31.0*hauteur);
        boxHor1.setPrefWidth(506.0*largeur);

        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(50.0*largeur);
        bouton1.setText("1");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(1);
            }
        });

        bouton2.setMnemonicParsing(false);
        bouton2.setPrefHeight(31.0*hauteur);
        bouton2.setPrefWidth(50.0*largeur);
        bouton2.setText("2");
        bouton2.setFont(new Font(15.0*hauteur));
        bouton2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton2, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(2);
            }
        });

        bouton3.setMnemonicParsing(false);
        bouton3.setPrefHeight(31.0*hauteur);
        bouton3.setPrefWidth(50.0*largeur);
        bouton3.setText("3");
        bouton3.setFont(new Font(15.0*hauteur));
        bouton3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(3);
            }
        });

        bouton4.setMnemonicParsing(false);
        bouton4.setPrefHeight(31.0*hauteur);
        bouton4.setPrefWidth(50.0*largeur);
        bouton4.setText("4");
        bouton4.setFont(new Font(15.0*hauteur));
        bouton4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton4, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton4.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(4);
            }
        });

        bouton5.setMnemonicParsing(false);
        bouton5.setPrefHeight(31.0*hauteur);
        bouton5.setPrefWidth(50.0*largeur);
        bouton5.setText("5");
        bouton5.setFont(new Font(15.0*hauteur));
        bouton5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton5.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(5);
            }
        });

        bouton6.setMnemonicParsing(false);
        bouton6.setPrefHeight(31.0*hauteur);
        bouton6.setPrefWidth(50.0*largeur);
        bouton6.setText("6");
        bouton6.setFont(new Font(15.0*hauteur));
        bouton6.setFont(new Font(15.0*hauteur));
        bouton6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton6, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton6.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(6);
            }
        });

        bouton7.setMnemonicParsing(false);
        bouton7.setPrefHeight(31.0*hauteur);
        bouton7.setPrefWidth(50.0*largeur);
        bouton7.setText("7");
        bouton7.setFont(new Font(15.0*hauteur));
        bouton7.setFont(new Font(15.0*hauteur));
        bouton7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton7.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(7);
            }
        });

        bouton8.setMnemonicParsing(false);
        bouton8.setPrefHeight(31.0*hauteur);
        bouton8.setPrefWidth(50.0*largeur);
        bouton8.setText("8");
        bouton8.setFont(new Font(15.0*hauteur));
        bouton8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton8, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton8.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(8);
            }
        });

        bouton9.setMnemonicParsing(false);
        bouton9.setPrefHeight(31.0*hauteur);
        bouton9.setPrefWidth(50.0*largeur);
        bouton9.setText("9");
        bouton9.setFont(new Font(15.0*hauteur));
        bouton9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton9.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(9);
            }
        });

        bouton10.setMnemonicParsing(false);
        bouton10.setPrefHeight(31.0*hauteur);
        bouton10.setPrefWidth(50.0*largeur);
        bouton10.setText("0");
        bouton10.setFont(new Font(15.0*hauteur));
        bouton10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton10, new Insets(0.0, 0.0, 0.0, 8.0*largeur));
        VBox.setMargin(boxHor1, new Insets(0.0));
        bouton10.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(0);
            }
        });

        boxHor2.setPrefHeight(0.0*hauteur);
        boxHor2.setPrefWidth(973.0*largeur);

        bouton11.setMinWidth(USE_PREF_SIZE);
        bouton11.setMnemonicParsing(false);
        bouton11.setPrefHeight(31.0*hauteur);
        bouton11.setPrefWidth(50.0*largeur);
        bouton11.setText("A");
        bouton11.setFont(new Font(15.0*hauteur));
        bouton11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton11, new Insets(0.0));
        bouton11.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("A");
            }
        });

        bouton12.setMinWidth(USE_PREF_SIZE);
        bouton12.setMnemonicParsing(false);
        bouton12.setPrefHeight(31.0*hauteur);
        bouton12.setPrefWidth(50.0*largeur);
        bouton12.setText("Z");
        bouton12.setFont(new Font(15.0*hauteur));
        bouton12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton12, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton12.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("Z");
            }
        });

        bouton13.setMnemonicParsing(false);
        bouton13.setPrefHeight(31.0*hauteur);
        bouton13.setPrefWidth(50.0*largeur);
        bouton13.setText("E");
        bouton13.setFont(new Font(15.0*hauteur));
        bouton13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton13.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("E");
            }
        });

        bouton14.setMnemonicParsing(false);
        bouton14.setPrefHeight(31.0*hauteur);
        bouton14.setPrefWidth(50.0*largeur);
        bouton14.setText("R");
        bouton14.setFont(new Font(15.0*hauteur));
        bouton14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton14, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton14.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event){
            	fenetre.actionClavier("R");
            }
        });

        bouton15.setMnemonicParsing(false);
        bouton15.setPrefHeight(31.0*hauteur);
        bouton15.setPrefWidth(50.0*largeur);
        bouton15.setText("T");
        bouton15.setFont(new Font(15.0*hauteur));
        bouton15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton15.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("T");
            }
        });

        bouton16.setMnemonicParsing(false);
        bouton16.setPrefHeight(31.0*hauteur);
        bouton16.setPrefWidth(50.0*largeur);
        bouton16.setText("Y");
        bouton16.setFont(new Font(15.0*hauteur));
        bouton16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton16, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton16.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("Y");
            }
        });

        bouton17.setMnemonicParsing(false);
        bouton17.setPrefHeight(31.0*hauteur);
        bouton17.setPrefWidth(50.0*largeur);
        bouton17.setText("U");
        bouton17.setFont(new Font(15.0*hauteur));
        bouton17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton17, new Insets(0.0, 8.0*largeur, 0.0, 0.0));
        bouton17.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("U");
            }
        });

        bouton18.setMnemonicParsing(false);
        bouton18.setPrefHeight(31.0*hauteur);
        bouton18.setPrefWidth(50.0*largeur);
        bouton18.setText("I");
        bouton18.setFont(new Font(15.0*hauteur));
        bouton18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton18, new Insets(0.0));
        bouton18.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("I");
            }
        });

        bouton19.setMnemonicParsing(false);
        bouton19.setPrefHeight(31.0*hauteur);
        bouton19.setPrefWidth(50.0*largeur);
        bouton19.setText("O");
        bouton19.setFont(new Font(15.0*hauteur));
        bouton19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton19, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton19.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("O");
            }
        });

        bouton20.setMnemonicParsing(false);
        bouton20.setPrefHeight(31.0*hauteur);
        bouton20.setPrefWidth(50.0*largeur);
        bouton20.setText("P");
        bouton20.setFont(new Font(15.0*hauteur));
        bouton20.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(boxHor2, new Insets(5.0*largeur, 0.0, 0.0, 0.0));
        bouton20.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("P");
            }
        });

        boxHor3.setPrefHeight(0.0*hauteur);
        boxHor3.setPrefWidth(973.0*largeur);

        bouton21.setMnemonicParsing(false);
        bouton21.setPrefHeight(31.0*hauteur);
        bouton21.setPrefWidth(50.0*largeur);
        bouton21.setText("Q");
        bouton21.setFont(new Font(15.0*hauteur));
        bouton21.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton21.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("Q");
            }
        });

        bouton22.setMnemonicParsing(false);
        bouton22.setPrefHeight(31.0*hauteur);
        bouton22.setPrefWidth(50.0*largeur);
        bouton22.setText("S");
        bouton22.setFont(new Font(15.0*hauteur));
        bouton22.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton22, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton22.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("S");
            }
        });

        bouton23.setMnemonicParsing(false);
        bouton23.setPrefHeight(31.0*hauteur);
        bouton23.setPrefWidth(50.0*largeur);
        bouton23.setText("D");
        bouton23.setFont(new Font(15.0*hauteur));
        bouton23.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton23.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("D");
            }
        });

        bouton24.setMnemonicParsing(false);
        bouton24.setPrefHeight(31.0*hauteur);
        bouton24.setPrefWidth(50.0*largeur);
        bouton24.setText("F");
        bouton24.setFont(new Font(15.0*hauteur));
        bouton24.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton24, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton24.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("F");
            }
        });

        bouton25.setMnemonicParsing(false);
        bouton25.setPrefHeight(31.0*hauteur);
        bouton25.setPrefWidth(50.0*largeur);
        bouton25.setText("G");
        bouton25.setFont(new Font(15.0*hauteur));
        bouton25.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton25.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("G");
            }
        });

        bouton26.setMnemonicParsing(false);
        bouton26.setPrefHeight(31.0*hauteur);
        bouton26.setPrefWidth(50.0*largeur);
        bouton26.setText("H");
        bouton26.setFont(new Font(15.0*hauteur));
        bouton26.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton26, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton26.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("H");
            }
        });

        bouton27.setMnemonicParsing(false);
        bouton27.setPrefHeight(31.0*hauteur);
        bouton27.setPrefWidth(50.0*largeur);
        bouton27.setText("J");
        bouton27.setFont(new Font(15.0*hauteur));
        bouton27.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton27.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("J");
            }
        });

        bouton28.setMnemonicParsing(false);
        bouton28.setPrefHeight(31.0*hauteur);
        bouton28.setPrefWidth(50.0*largeur);
        bouton28.setText("K");
        bouton28.setFont(new Font(15.0*hauteur));
        bouton28.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton28, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton28.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("K");
            }
        });

        bouton29.setMnemonicParsing(false);
        bouton29.setPrefHeight(31.0*hauteur);
        bouton29.setPrefWidth(50.0*largeur);
        bouton29.setText("L");
        bouton29.setFont(new Font(15.0*hauteur));
        bouton29.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton29.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("L");
            }
        });

        bouton30.setMnemonicParsing(false);
        bouton30.setPrefHeight(31.0*hauteur);
        bouton30.setPrefWidth(50.0*largeur);
        bouton30.setText("M");
        bouton30.setFont(new Font(15.0*hauteur));
        bouton30.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton30, new Insets(0.0, 0.0, 0.0, 8.0*largeur));
        VBox.setMargin(boxHor3, new Insets(5.0*largeur, 0.0, 0.0, 0.0));
        bouton30.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("M");
            }
        });

        boxHor4.setPrefHeight(31.0*hauteur);
        boxHor4.setPrefWidth(526.0*largeur);

        bouton31.setMnemonicParsing(false);
        bouton31.setPrefHeight(31.0*hauteur);
        bouton31.setPrefWidth(50.0*largeur);
        bouton31.setText("W");
        bouton31.setFont(new Font(15.0*hauteur));
        bouton31.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton31.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("W");
            }
        });

        bouton32.setMnemonicParsing(false);
        bouton32.setPrefHeight(31.0*hauteur);
        bouton32.setPrefWidth(50.0*largeur);
        bouton32.setText("X");
        bouton32.setFont(new Font(15.0*hauteur));
        bouton32.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton32, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton32.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("X");
            }
        });

        bouton33.setMnemonicParsing(false);
        bouton33.setPrefHeight(31.0*hauteur);
        bouton33.setPrefWidth(50.0*largeur);
        bouton33.setText("C");
        bouton33.setFont(new Font(15.0*hauteur));
        bouton33.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton33.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("C");
            }
        });

        bouton34.setMnemonicParsing(false);
        bouton34.setPrefHeight(31.0*hauteur);
        bouton34.setPrefWidth(50.0*largeur);
        bouton34.setText("V");
        bouton34.setFont(new Font(15.0*hauteur));
        bouton34.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton34, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton34.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("V");
            }
        });

        bouton35.setMnemonicParsing(false);
        bouton35.setPrefHeight(31.0*hauteur);
        bouton35.setPrefWidth(50.0*largeur);
        bouton35.setText("B");
        bouton35.setFont(new Font(15.0*hauteur));
        bouton35.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton35.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("B");
            }
        });

        bouton36.setMnemonicParsing(false);
        bouton36.setPrefHeight(31.0*hauteur);
        bouton36.setPrefWidth(50.0*largeur);
        bouton36.setText("N");
        bouton36.setFont(new Font(15.0*hauteur));
        bouton36.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton36, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton36.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("N");
            }
        });

        bouton37.setMnemonicParsing(false);
        bouton37.setPrefHeight(31.0*hauteur);
        bouton37.setPrefWidth(96.0*largeur);
        bouton37.setText("EFFACER");
        bouton37.setFont(new Font(15.0*hauteur));
        bouton37.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton37.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton37, new Insets(0.0, 8.0*largeur, 0.0, 0.0));
        bouton37.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionEffacer();
            }
        });

        bouton38.setMnemonicParsing(false);
        bouton38.setPrefHeight(31.0*hauteur);
        bouton38.setPrefWidth(96.0*largeur);
        bouton38.setText("SUIVANT");
        bouton38.setFont(new Font(15.0*hauteur));
        bouton38.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(boxHor4, new Insets(5.0*hauteur, 0.0, 0.0, 15.0*largeur));
        bouton38.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionSuivant();
            }
        });

        boxHor5.setLayoutX(10.0*largeur);
        boxHor5.setPrefHeight(1.0*hauteur);
        boxHor5.setPrefWidth(973.0*largeur);

        bouton39.setMnemonicParsing(false);
        bouton39.setPrefHeight(31.0*hauteur);
        bouton39.setPrefWidth(80.0*largeur);
        bouton39.setText("RETOUR");
        bouton39.setFont(new Font(15.0*hauteur));
        bouton39.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton39.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionRetour();
            }
        });

        bouton40.setMnemonicParsing(false);
        bouton40.setPrefHeight(31.0*hauteur);
        bouton40.setPrefWidth(398.0*largeur);
        bouton40.setText("ESPACE");
        bouton40.setFont(new Font(15.0*hauteur));
        bouton40.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(bouton40, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        bouton40.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionEspace();
            }
        });

        bouton41.setMnemonicParsing(false);
        bouton41.setPrefHeight(31.0*hauteur);
        bouton41.setPrefWidth(80.0*largeur);
        bouton41.setText("ENTRER");
        bouton41.setFont(new Font(15.0*hauteur));
        bouton41.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(boxHor5, new Insets(5.0*largeur, 0.0, 0.0, 0.0));
        bouton41.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionEntrer();
            }
        });

        boxHor1.getChildren().addAll(bouton1, bouton2, bouton3, bouton4, bouton5, bouton6, bouton7, bouton8, bouton9, bouton10);
        boxHor2.getChildren().addAll(bouton11, bouton12, bouton13, bouton14, bouton15, bouton16, bouton17, bouton18, bouton19, bouton20);
        boxHor3.getChildren().addAll(bouton21, bouton22, bouton23, bouton24, bouton25, bouton26, bouton27, bouton28, bouton29, bouton30);
        boxHor4.getChildren().addAll(bouton31, bouton32, bouton33, bouton34, bouton35, bouton36, bouton37, bouton38);
        boxHor5.getChildren().addAll(bouton39, bouton40, bouton41);
        boxVer.getChildren().addAll(boxHor1, boxHor2, boxHor3, boxHor4, boxHor5);
        getChildren().addAll(rectangle, boxVer);
        
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
        bouton12.setFocusTraversable(false);
        bouton13.setFocusTraversable(false);
        bouton14.setFocusTraversable(false);
        bouton15.setFocusTraversable(false);
        bouton16.setFocusTraversable(false);
        bouton17.setFocusTraversable(false);
        bouton18.setFocusTraversable(false);
        bouton19.setFocusTraversable(false);
        bouton20.setFocusTraversable(false);
        bouton21.setFocusTraversable(false);
        bouton22.setFocusTraversable(false);
        bouton23.setFocusTraversable(false);
        bouton24.setFocusTraversable(false);
        bouton25.setFocusTraversable(false);
        bouton26.setFocusTraversable(false);
        bouton27.setFocusTraversable(false);
        bouton28.setFocusTraversable(false);
        bouton29.setFocusTraversable(false);
        bouton30.setFocusTraversable(false);
        bouton31.setFocusTraversable(false);
        bouton32.setFocusTraversable(false);
        bouton33.setFocusTraversable(false);
        bouton34.setFocusTraversable(false);
        bouton35.setFocusTraversable(false);
        bouton36.setFocusTraversable(false);
        bouton37.setFocusTraversable(false);
        bouton38.setFocusTraversable(false);
        bouton39.setFocusTraversable(false);
        bouton40.setFocusTraversable(false);
        bouton41.setFocusTraversable(false);
    }
	
	public void setFenetre(Ecran fen)
	{
		fenetre = fen;
	}
}