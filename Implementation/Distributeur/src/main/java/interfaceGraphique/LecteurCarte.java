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
	private PasswordField passwordField;
	private Button button, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
	private GraphiqueACoeur graphAC = GraphiqueACoeurImpl.getInstance();

	public LecteurCarte(double hauteur, double largeur) 
	{
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        passwordField = new PasswordField();
        HBox hBox = new HBox();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        HBox hBox0 = new HBox();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        HBox hBox1 = new HBox();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        HBox hBox2 = new HBox();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
        button11 = new Button();

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

        VBox.setMargin(passwordField, new Insets(10.0*hauteur, 20.0*largeur, 10.0*hauteur, 20.0*largeur));
        passwordField.setFont(new Font(15.0*hauteur));
        

        hBox.setPrefHeight(37.0*hauteur);
        hBox.setPrefWidth(110.0*largeur);
        
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(29.0*largeur);
        button.setText("1");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button, new Insets(0.0));
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(1);
            }
        });

        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(29.0*largeur);
        button0.setText("2");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button0, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(2);
            }
        });

        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(29.0*largeur);
        button1.setText("3");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button1, new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 2.0*hauteur, 45.0*largeur));
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(3);
            }
        });

        hBox0.setPrefHeight(39.0*hauteur);
        hBox0.setPrefWidth(205.0*largeur);

        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0*hauteur);
        button2.setPrefWidth(29.0*largeur);
        button2.setText("4");
        button2.setFont(new Font(15.0*hauteur));
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button2, new Insets(0.0, 0.0, 0.0, 17.0*largeur));
        button2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(4);
            }
        });

        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0*hauteur);
        button3.setPrefWidth(29.0*largeur);
        button3.setText("5");
        button3.setFont(new Font(15.0*hauteur));
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button3, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        button3.setOnAction(new EventHandler<ActionEvent>()
        {
            
            public void handle(ActionEvent event)
            {
            	actionLecteur(5);
            }
        });

        button4.setMnemonicParsing(false);
        button4.setPrefHeight(31.0*hauteur);
        button4.setPrefWidth(29.0*largeur);
        button4.setText("6");
        button4.setFont(new Font(15.0*hauteur));
        button4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox0, new Insets(2.0*hauteur, 0.0, 2.0*hauteur, 28.0*largeur));
        button4.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(6);
            }
        });

        hBox1.setPrefHeight(40.0*hauteur);
        hBox1.setPrefWidth(205.0*largeur);

        button5.setMnemonicParsing(false);
        button5.setPrefHeight(31.0*hauteur);
        button5.setPrefWidth(29.0*largeur);
        button5.setText("7");
        button5.setFont(new Font(15.0*hauteur));
        button5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button5, new Insets(0.0, 0.0, 0.0, 17.0*largeur));
        button5.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(7);
            }
        });

        button6.setMnemonicParsing(false);
        button6.setPrefHeight(31.0*hauteur);
        button6.setPrefWidth(29.0*largeur);
        button6.setText("8");
        button6.setFont(new Font(15.0*hauteur));
        button6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button6, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        button6.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(8);
            }
        });

        button7.setMnemonicParsing(false);
        button7.setPrefHeight(31.0*hauteur);
        button7.setPrefWidth(29.0*largeur);
        button7.setText("9");
        button7.setFont(new Font(15.0*hauteur));
        button7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 0.0, 28.0*largeur));
        button7.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(9);
            }
        });

        hBox2.setPrefHeight(40.0*hauteur);
        hBox2.setPrefWidth(205.0*largeur);

        button8.setMnemonicParsing(false);
        button8.setPrefHeight(31.0*hauteur);
        button8.setPrefWidth(46.0*largeur);
        button8.setText("EFF.");
        button8.setFont(new Font(15.0*hauteur));
        button8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button8.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteurEff();
            }
        });

        button9.setMnemonicParsing(false);
        button9.setPrefHeight(31.0*hauteur);
        button9.setPrefWidth(29.0*largeur);
        button9.setText("0");
        button9.setFont(new Font(15.0*hauteur));
        button9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button9, new Insets(0.0, 10.0*largeur, 0.0, 10.0*largeur));
        button9.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	actionLecteur(0);
            }
        });

        button10.setMnemonicParsing(false);
        button10.setPrefHeight(31.0*hauteur);
        button10.setPrefWidth(41.0*largeur);
        button10.setText("OK");
        button10.setFont(new Font(15.0*hauteur));
        button10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(button10, new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(2.0*hauteur, 0.0, 2.0*hauteur, 28.0*largeur));
        button10.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event)
            {
            	try
            	{
            		graphAC.choixLecteurOK(Integer.parseInt(passwordField.getText()));
            	}
            	catch(NumberFormatException e) {}
            }
        });

        button11.setMnemonicParsing(false);
        button11.setPrefHeight(31.0*hauteur);
        button11.setPrefWidth(140.0*largeur);
        button11.setText("Insérer/Retirer carte");
        button11.setFont(new Font(15.0*hauteur));
        button11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button11, new Insets(0.0, 0.0, 0.0, 26.0*largeur));
        button11.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixLecteurInsererRetirer();
            }
        });
        
        hBox.getChildren().addAll(button, button0, button1);
        hBox0.getChildren().addAll(button2, button3, button4);
        hBox1.getChildren().addAll(button5, button6, button7);
        hBox2.getChildren().addAll(button8, button9, button10);
        vBox.getChildren().addAll(passwordField, hBox, hBox0, hBox1, hBox2, button11);
        getChildren().addAll(rectangle, vBox);
    }
	
	public void actionLecteur(int a) 
	{
		if (passwordField.getText().length() < 4)
			passwordField.setText(passwordField.getText() + a);
	}
	
	public void actionLecteurEff() 
	{
		if (passwordField.getText().length() > 0)
			passwordField.setText(passwordField.getText().substring(0, passwordField.getText().length()-1));
	}
	
	public Button getButton(int i)
	{
		if (i == 0)
			return button;
		else if (i == 1)
			return button0;
		else if (i == 2)
			return button1;
		else if (i == 3)
			return button2;
		else if (i == 4)
			return button3;
		else if (i == 5)
			return button4;
		else if (i == 6)
			return button5;
		else if (i == 7)
			return button6;
		else if (i == 8)
			return button7;
		else if (i == 9)
			return button8;
		else if (i == 10)
			return button9;
		else if (i == 11)
			return button10;
		else
			return button11;
	}
	
	public PasswordField getField()
	{
		return passwordField;
	}
}