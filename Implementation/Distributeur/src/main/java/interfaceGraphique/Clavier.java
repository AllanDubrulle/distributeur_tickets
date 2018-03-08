package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.layout.*;

class Clavier extends ComposantVisible 
{	
	private static Clavier instance;	
	private Ecran fenetre;
	
	public Clavier(boolean enMarche) 
	{
		super(enMarche);
	}
	
	private Clavier(double hauteur, double largeur) 
	{
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Button button = new Button();
        Button button0 = new Button();
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        HBox hBox0 = new HBox();
        Button button9 = new Button();
        Button button10 = new Button();
        Button button11 = new Button();
        Button button12 = new Button();
        Button button13 = new Button();
        Button button14 = new Button();
        Button button15 = new Button();
        Button button16 = new Button();
        Button button17 = new Button();
        Button button18 = new Button();
        HBox hBox1 = new HBox();
        Button button19 = new Button();
        Button button110 = new Button();
        Button button111 = new Button();
        Button button112 = new Button();
        Button button113 = new Button();
        Button button114 = new Button();
        Button button115 = new Button();
        Button button116 = new Button();
        Button button117 = new Button();
        Button button118 = new Button();
        HBox hBox2 = new HBox();
        Button button119 = new Button();
        Button button1110 = new Button();
        Button button1111 = new Button();
        Button button1112 = new Button();
        Button button1113 = new Button();
        Button button1114 = new Button();
        Button button1115 = new Button();
        Button button1116 = new Button();
        HBox hBox3 = new HBox();
        Button button1117 = new Button();
        Button button1118 = new Button();
        Button button1119 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(210.0*hauteur);
        setPrefWidth(625.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle.setHeight(210.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(625.0*largeur);

        vBox.setLayoutX(25.5*largeur);
        vBox.setLayoutY(11.0*hauteur);
        vBox.setPrefHeight(175.0*hauteur);
        vBox.setPrefWidth(574.0*largeur);

        hBox.setPrefHeight(31.0*hauteur);
        hBox.setPrefWidth(506.0*largeur);

        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(50.0*largeur);
        button.setText("1");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(1);
            }
        });

        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(50.0*largeur);
        button0.setText("2");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button0, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(2);
            }
        });

        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(50.0*largeur);
        button1.setText("3");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(3);
            }
        });

        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0*hauteur);
        button2.setPrefWidth(50.0*largeur);
        button2.setText("4");
        button2.setFont(new Font(15.0*hauteur));
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button2, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(4);
            }
        });

        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0*hauteur);
        button3.setPrefWidth(50.0*largeur);
        button3.setText("5");
        button3.setFont(new Font(15.0*hauteur));
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(5);
            }
        });

        button4.setMnemonicParsing(false);
        button4.setPrefHeight(31.0*hauteur);
        button4.setPrefWidth(50.0*largeur);
        button4.setText("6");
        button4.setFont(new Font(15.0*hauteur));
        button4.setFont(new Font(15.0*hauteur));
        button4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button4, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button4.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(6);
            }
        });

        button5.setMnemonicParsing(false);
        button5.setPrefHeight(31.0*hauteur);
        button5.setPrefWidth(50.0*largeur);
        button5.setText("7");
        button5.setFont(new Font(15.0*hauteur));
        button5.setFont(new Font(15.0*hauteur));
        button5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button5.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(7);
            }
        });

        button6.setMnemonicParsing(false);
        button6.setPrefHeight(31.0*hauteur);
        button6.setPrefWidth(50.0*largeur);
        button6.setText("8");
        button6.setFont(new Font(15.0*hauteur));
        button6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button6, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button6.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(8);
            }
        });

        button7.setMnemonicParsing(false);
        button7.setPrefHeight(31.0*hauteur);
        button7.setPrefWidth(50.0*largeur);
        button7.setText("9");
        button7.setFont(new Font(15.0*hauteur));
        button7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button7.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(9);
            }
        });

        button8.setMnemonicParsing(false);
        button8.setPrefHeight(31.0*hauteur);
        button8.setPrefWidth(50.0*largeur);
        button8.setText("0");
        button8.setFont(new Font(15.0*hauteur));
        button8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button8, new Insets(0.0, 0.0, 0.0, 8.0*largeur));
        VBox.setMargin(hBox, new Insets(0.0));
        button8.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier(0);
            }
        });

        hBox0.setPrefHeight(0.0*hauteur);
        hBox0.setPrefWidth(973.0*largeur);

        button9.setMinWidth(USE_PREF_SIZE);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(31.0*hauteur);
        button9.setPrefWidth(50.0*largeur);
        button9.setText("A");
        button9.setFont(new Font(15.0*hauteur));
        button9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button9, new Insets(0.0));
        button9.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("A");
            }
        });

        button10.setMinWidth(USE_PREF_SIZE);
        button10.setMnemonicParsing(false);
        button10.setPrefHeight(31.0*hauteur);
        button10.setPrefWidth(50.0*largeur);
        button10.setText("Z");
        button10.setFont(new Font(15.0*hauteur));
        button10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button10, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button10.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("Z");
            }
        });

        button11.setMnemonicParsing(false);
        button11.setPrefHeight(31.0*hauteur);
        button11.setPrefWidth(50.0*largeur);
        button11.setText("E");
        button11.setFont(new Font(15.0*hauteur));
        button11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button11.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("E");
            }
        });

        button12.setMnemonicParsing(false);
        button12.setPrefHeight(31.0*hauteur);
        button12.setPrefWidth(50.0*largeur);
        button12.setText("R");
        button12.setFont(new Font(15.0*hauteur));
        button12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button12, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button12.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event){
            	fenetre.actionClavier("R");
            }
        });

        button13.setMnemonicParsing(false);
        button13.setPrefHeight(31.0*hauteur);
        button13.setPrefWidth(50.0*largeur);
        button13.setText("T");
        button13.setFont(new Font(15.0*hauteur));
        button13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button13.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("T");
            }
        });

        button14.setMnemonicParsing(false);
        button14.setPrefHeight(31.0*hauteur);
        button14.setPrefWidth(50.0*largeur);
        button14.setText("Y");
        button14.setFont(new Font(15.0*hauteur));
        button14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button14, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button14.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("Y");
            }
        });

        button15.setMnemonicParsing(false);
        button15.setPrefHeight(31.0*hauteur);
        button15.setPrefWidth(50.0*largeur);
        button15.setText("U");
        button15.setFont(new Font(15.0*hauteur));
        button15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button15, new Insets(0.0, 8.0*largeur, 0.0, 0.0));
        button15.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("U");
            }
        });

        button16.setMnemonicParsing(false);
        button16.setPrefHeight(31.0*hauteur);
        button16.setPrefWidth(50.0*largeur);
        button16.setText("I");
        button16.setFont(new Font(15.0*hauteur));
        button16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button16, new Insets(0.0));
        button16.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("I");
            }
        });

        button17.setMnemonicParsing(false);
        button17.setPrefHeight(31.0*hauteur);
        button17.setPrefWidth(50.0*largeur);
        button17.setText("O");
        button17.setFont(new Font(15.0*hauteur));
        button17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button17, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button17.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("O");
            }
        });

        button18.setMnemonicParsing(false);
        button18.setPrefHeight(31.0*hauteur);
        button18.setPrefWidth(50.0*largeur);
        button18.setText("P");
        button18.setFont(new Font(15.0*hauteur));
        button18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox0, new Insets(5.0*largeur, 0.0, 0.0, 0.0));
        button18.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("P");
            }
        });

        hBox1.setPrefHeight(0.0*hauteur);
        hBox1.setPrefWidth(973.0*largeur);

        button19.setMnemonicParsing(false);
        button19.setPrefHeight(31.0*hauteur);
        button19.setPrefWidth(50.0*largeur);
        button19.setText("Q");
        button19.setFont(new Font(15.0*hauteur));
        button19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button19.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("Q");
            }
        });

        button110.setMnemonicParsing(false);
        button110.setPrefHeight(31.0*hauteur);
        button110.setPrefWidth(50.0*largeur);
        button110.setText("S");
        button110.setFont(new Font(15.0*hauteur));
        button110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button110, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button110.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("S");
            }
        });

        button111.setMnemonicParsing(false);
        button111.setPrefHeight(31.0*hauteur);
        button111.setPrefWidth(50.0*largeur);
        button111.setText("D");
        button111.setFont(new Font(15.0*hauteur));
        button111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button111.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("D");
            }
        });

        button112.setMnemonicParsing(false);
        button112.setPrefHeight(31.0*hauteur);
        button112.setPrefWidth(50.0*largeur);
        button112.setText("F");
        button112.setFont(new Font(15.0*hauteur));
        button112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button112, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button112.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("F");
            }
        });

        button113.setMnemonicParsing(false);
        button113.setPrefHeight(31.0*hauteur);
        button113.setPrefWidth(50.0*largeur);
        button113.setText("G");
        button113.setFont(new Font(15.0*hauteur));
        button113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button113.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("G");
            }
        });

        button114.setMnemonicParsing(false);
        button114.setPrefHeight(31.0*hauteur);
        button114.setPrefWidth(50.0*largeur);
        button114.setText("H");
        button114.setFont(new Font(15.0*hauteur));
        button114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button114, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button114.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("H");
            }
        });

        button115.setMnemonicParsing(false);
        button115.setPrefHeight(31.0*hauteur);
        button115.setPrefWidth(50.0*largeur);
        button115.setText("J");
        button115.setFont(new Font(15.0*hauteur));
        button115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button115.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("J");
            }
        });

        button116.setMnemonicParsing(false);
        button116.setPrefHeight(31.0*hauteur);
        button116.setPrefWidth(50.0*largeur);
        button116.setText("K");
        button116.setFont(new Font(15.0*hauteur));
        button116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button116, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button116.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("K");
            }
        });

        button117.setMnemonicParsing(false);
        button117.setPrefHeight(31.0*hauteur);
        button117.setPrefWidth(50.0*largeur);
        button117.setText("L");
        button117.setFont(new Font(15.0*hauteur));
        button117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button117.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("L");
            }
        });

        button118.setMnemonicParsing(false);
        button118.setPrefHeight(31.0*hauteur);
        button118.setPrefWidth(50.0*largeur);
        button118.setText("M");
        button118.setFont(new Font(15.0*hauteur));
        button118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button118, new Insets(0.0, 0.0, 0.0, 8.0*largeur));
        VBox.setMargin(hBox1, new Insets(5.0*largeur, 0.0, 0.0, 0.0));
        button118.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("M");
            }
        });

        hBox2.setPrefHeight(31.0*hauteur);
        hBox2.setPrefWidth(526.0*largeur);

        button119.setMnemonicParsing(false);
        button119.setPrefHeight(31.0*hauteur);
        button119.setPrefWidth(50.0*largeur);
        button119.setText("W");
        button119.setFont(new Font(15.0*hauteur));
        button119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button119.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("W");
            }
        });

        button1110.setMnemonicParsing(false);
        button1110.setPrefHeight(31.0*hauteur);
        button1110.setPrefWidth(50.0*largeur);
        button1110.setText("X");
        button1110.setFont(new Font(15.0*hauteur));
        button1110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1110, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button1110.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("X");
            }
        });

        button1111.setMnemonicParsing(false);
        button1111.setPrefHeight(31.0*hauteur);
        button1111.setPrefWidth(50.0*largeur);
        button1111.setText("C");
        button1111.setFont(new Font(15.0*hauteur));
        button1111.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1111.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("C");
            }
        });

        button1112.setMnemonicParsing(false);
        button1112.setPrefHeight(31.0*hauteur);
        button1112.setPrefWidth(50.0*largeur);
        button1112.setText("V");
        button1112.setFont(new Font(15.0*hauteur));
        button1112.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1112, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button1112.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("V");
            }
        });

        button1113.setMnemonicParsing(false);
        button1113.setPrefHeight(31.0*hauteur);
        button1113.setPrefWidth(50.0*largeur);
        button1113.setText("B");
        button1113.setFont(new Font(15.0*hauteur));
        button1113.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1113.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("B");
            }
        });

        button1114.setMnemonicParsing(false);
        button1114.setPrefHeight(31.0*hauteur);
        button1114.setPrefWidth(50.0*largeur);
        button1114.setText("N");
        button1114.setFont(new Font(15.0*hauteur));
        button1114.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1114, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button1114.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionClavier("N");
            }
        });

        button1115.setMnemonicParsing(false);
        button1115.setPrefHeight(31.0*hauteur);
        button1115.setPrefWidth(96.0*largeur);
        button1115.setText("EFFACER");
        button1115.setFont(new Font(15.0*hauteur));
        button1115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1115.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1115, new Insets(0.0, 8.0*largeur, 0.0, 0.0));
        button1115.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionEffacer();
            }
        });

        button1116.setMnemonicParsing(false);
        button1116.setPrefHeight(31.0*hauteur);
        button1116.setPrefWidth(96.0*largeur);
        button1116.setText("SUIVANT");
        button1116.setFont(new Font(15.0*hauteur));
        button1116.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox2, new Insets(5.0*hauteur, 0.0, 0.0, 15.0*largeur));
        button1116.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionSuivant();
            }
        });

        hBox3.setLayoutX(10.0*largeur);
        hBox3.setPrefHeight(1.0*hauteur);
        hBox3.setPrefWidth(973.0*largeur);

        button1117.setMnemonicParsing(false);
        button1117.setPrefHeight(31.0*hauteur);
        button1117.setPrefWidth(80.0*largeur);
        button1117.setText("RETOUR");
        button1117.setFont(new Font(15.0*hauteur));
        button1117.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1117.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionRetour();
            }
        });

        button1118.setMnemonicParsing(false);
        button1118.setPrefHeight(31.0*hauteur);
        button1118.setPrefWidth(398.0*largeur);
        button1118.setText("ESPACE");
        button1118.setFont(new Font(15.0*hauteur));
        button1118.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1118, new Insets(0.0, 8.0*largeur, 0.0, 8.0*largeur));
        button1118.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionEspace();
            }
        });

        button1119.setMnemonicParsing(false);
        button1119.setPrefHeight(31.0*hauteur);
        button1119.setPrefWidth(80.0*largeur);
        button1119.setText("ENTRER");
        button1119.setFont(new Font(15.0*hauteur));
        button1119.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox3, new Insets(5.0*largeur, 0.0, 0.0, 0.0));
        button1119.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	fenetre.actionEntrer();
            }
        });

        hBox.getChildren().addAll(button, button0, button1, button2, button3, button4, button5, button6, button7, button8);
        hBox0.getChildren().addAll(button9, button10, button11, button12, button13, button14, button15, button16, button17, button18);
        hBox1.getChildren().addAll(button19, button110, button111, button112, button113, button114, button115, button116, button117, button118);
        hBox2.getChildren().addAll(button119, button1110, button1111, button1112, button1113, button1114, button1115, button1116);
        hBox3.getChildren().addAll(button1117, button1118, button1119);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3);
        getChildren().addAll(rectangle, vBox);
    }

	public static Clavier getInstance(double hauteur, double largeur) 
	{
    	if (instance == null)
    		instance = new Clavier(hauteur, largeur);
    	return instance;
    }
	
	public void setFenetre(Ecran fen)
	{
		fenetre = fen;
	}
}