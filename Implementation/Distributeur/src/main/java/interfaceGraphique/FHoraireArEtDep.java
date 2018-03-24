package interfaceGraphique;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FHoraireArEtDep extends Ecran 
{
	private TextField textField, textField0, textField1, textField2;
	private int pos = 0;
	private Text text10;
	private Button button1;

    public FHoraireArEtDep(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Text text0 = new Text();
        Text text1 = new Text();
        VBox vBox0 = new VBox();
        HBox hBox0 = new HBox();
        textField = new TextField();
        Text text2 = new Text();
        textField0 = new TextField();
        HBox hBox1 = new HBox();
        textField1 = new TextField();
        Text text3 = new Text();
        textField2 = new TextField();
        VBox vBox1 = new VBox();
        Button button = new Button();
        Button button0 = new Button();
        text10 = new Text();
        button1 = new Button();

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

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(44.0*largeur);
        text.setLayoutY(58.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Vérifier un horaire de train (itinéraire)");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        hBox.setLayoutX(60.0*largeur);
        hBox.setLayoutY(132.0*hauteur);
        hBox.setPrefHeight(102.0*hauteur);
        hBox.setPrefWidth(670.0*largeur);

        vBox.setPrefHeight(63.0*hauteur);
        vBox.setPrefWidth(188.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Itinéraire :");
        text0.setWrappingWidth(180.0*largeur);
        text0.setFont(new Font(15.0*hauteur));
        VBox.setMargin(text0, new Insets(30.0*hauteur, 0.0, 5.0*hauteur, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Heure de départ :");
        text1.setWrappingWidth(180.0*largeur);
        text1.setFont(new Font(15.0*hauteur));
        VBox.setMargin(text1, new Insets(10.0*hauteur, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox, new Insets(0.0, 0.0, 0.0, 20.0*largeur));

        vBox0.setPrefHeight(33.0*hauteur);
        vBox0.setPrefWidth(332.0*largeur);

        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(332.0*largeur);

        textField.setPrefWidth(150.0*largeur);
        textField.setPrefHeight(31.0*hauteur);
        textField.setFont(new Font(15.0*hauteur));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("  à  ");
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        textField0.setPrefWidth(150.0*largeur);
        textField0.setPrefHeight(31.0*hauteur);
        textField0.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(21.0*hauteur, 0.0, 5.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(332.0*largeur);

        textField1.setPrefHeight(31.0*hauteur);
        textField1.setPrefWidth(40.0*largeur);
        textField1.setFont(new Font(15.0*hauteur));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(" : ");
        text3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text3, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        textField2.setPrefHeight(31.0*hauteur);
        textField2.setPrefWidth(40.0*largeur);
        textField2.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox1, new Insets(0.0));

        vBox1.setPrefHeight(200.0*hauteur);
        vBox1.setPrefWidth(100.0*largeur);

        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(185.0*largeur);
        button.setText("Rechercher");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(button, new Insets(40.0*hauteur, 0.0, 0.0, 10.0*largeur));
        HBox.setMargin(vBox1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        button.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		try 
        		{
        			if (graphAC.existanceTrajet(textField.getText(),textField0.getText()) && Integer.parseInt(textField1.getText()) < 24 && Integer.parseInt(textField2.getText()) < 60)
        				graphAC.choixRechercheGDEtGA(textField.getText(),textField0.getText(), Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
        			else 
        				text10.setText("Les données saisies sont incorrectes");
        		}
        		catch (NumberFormatException | SQLException e)
        		{
        			text10.setText("Les données saisies sont incorrectes");
        		}
        	}
        });
        
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(185.0*largeur);
        button1.setText("Heure courrante");
        button1.setFont(new Font(15.0*hauteur));
        button1.setLayoutX(307.5*largeur);
        button1.setLayoutY(350.0*hauteur);
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		DateFormat format = new SimpleDateFormat("yyyy/MM/dd  HH:mm");
        		Date date = new Date();
        		format.format(date);
        		int heure = date.getHours();
        		int minute = date.getMinutes();
        		if(Integer.toString(heure).length() == 1)
        			textField1.setText("0" + heure);
        		else
        			textField1.setText(Integer.toString(heure));
        		if(Integer.toString(minute).length() == 1)
        			textField2.setText("0" + minute);
        		else
        			textField2.setText(Integer.toString(minute));
        	}
        });
        
		text10.setFont(new Font("System Bold", 15.0*hauteur));
		text10.setWrappingWidth(250.0*largeur);
		text10.setFill(javafx.scene.paint.Color.RED);
		text10.setLayoutX(275.0*largeur);
		text10.setLayoutY(324.0*hauteur);

        button0.setLayoutX(22.5*largeur);
        button0.setLayoutY(349.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setText("Annuler");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixAnnuler();
        	}
        });

		textField.setOnMouseClicked(e -> {pos = 0;});
		textField0.setOnMouseClicked(e -> {pos = 1;});
		textField1.setOnMouseClicked(e -> {pos = 2;});
		textField2.setOnMouseClicked(e -> {pos = 3;});

        vBox.getChildren().addAll(text0, text1);
        hBox0.getChildren().addAll(textField, text2, textField0);
        hBox1.getChildren().addAll(textField1, text3, textField2);
        vBox0.getChildren().addAll(hBox0, hBox1);
        vBox1.getChildren().add(button);
        hBox.getChildren().addAll(vBox, vBox0,vBox1);
        getChildren().addAll(rectangle, text, hBox, button0, text10, button1);
        
        button.setFocusTraversable(false);
        button0.setFocusTraversable(false);
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		textField.setText(textField.getText() + a);
    	else if (pos == 1)
    		textField0.setText(textField0.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 2) 
		{
			String s = textField1.getText();
			if (s.length() == 1)
			{
				textField1.setText(s + a);
				actionSuivant();
				if (Integer.parseInt(textField1.getText()) > 23)
					textField1.setText("23");
			}
			textField1.setText(s + a);
		}
		else if (pos == 3) 
		{
			String s = textField2.getText();
			if (s.length() == 1)
			{
				textField2.setText(s + a);
				actionSuivant();
				if (Integer.parseInt(textField2.getText()) > 59)
					textField2.setText("59");
			}
			textField2.setText(s + a);
		}
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		{
			if (pos == 4)
			{
				textField.requestFocus();
				pos = 0;
			}
			else
			{
				if (pos == 0)
					textField0.requestFocus();
				else if (pos == 1)
					textField1.requestFocus();
				else if (pos == 2)
					textField2.requestFocus();
				else 
					button1.requestFocus();
				pos ++;
			}
		}
	}

	public void actionEspace() 
	{
    	if (pos == 0)
    		textField.setText(textField.getText() + " ");
    	else if (pos == 1)
    		textField0.setText(textField0.getText() + " ");
    	else if (pos == 4)
    	{
    		DateFormat format = new SimpleDateFormat("yyyy/MM/dd  HH:mm");
    		Date date = new Date();
    		format.format(date);
    		int heure = date.getHours();
    		int minute = date.getMinutes();
    		if(Integer.toString(heure).length() == 1)
    			textField1.setText("0" + heure);
    		else
    			textField1.setText(Integer.toString(heure));
    		if(Integer.toString(minute).length() == 1)
    			textField2.setText("0" + minute);
    		else
    			textField2.setText(Integer.toString(minute));
    	}
    }

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = textField.getText();
			if (s.length() > 0)
				textField.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 1)
		{
			String s = textField0.getText();
			if (s.length() > 0)
				textField0.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 2)
		{
			String s = textField1.getText();
			if (s.length() > 0)
				textField1.setText(s.substring(0, s.length()-1));
		}
		else
		{
			String s = textField2.getText();
			if (s.length() > 0)
				textField2.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		try 
		{
			graphAC.choixRechercheGDEtGA(textField.getText(),textField0.getText(), Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
		} 
		catch (NumberFormatException | SQLException e) 
		{
			text10.setText("Les données saisies sont incorrectes");
		}
	}
}