package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

class FHoraireDepart extends Ecran 
{
	private TextField textField, textField0, textField1;
	private int pos = 0;

    public FHoraireDepart() 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Text text0 = new Text();
        Text text1 = new Text();
        VBox vBox0 = new VBox();
        textField = new TextField();
        HBox hBox0 = new HBox();
        textField0 = new TextField();
        Text text2 = new Text();
        textField1 = new TextField();
        VBox vBox1 = new VBox();
        Button button = new Button();
        Button button0 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setLayoutX(44.0);
        text.setLayoutY(58.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Vérifier un horaire de train (départs)");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        hBox.setLayoutX(60.0);
        hBox.setLayoutY(158.0);
        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(670.0);

        vBox.setPrefHeight(135.0);
        vBox.setPrefWidth(188.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Départs dans une gare :");
        VBox.setMargin(text0, new Insets(20.0, 0.0, 5.0, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("     Heure :");
        VBox.setMargin(text1, new Insets(10.0, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox, new Insets(0.0, 0.0, 0.0, 20.0));

        vBox0.setPrefHeight(135.0);
        vBox0.setPrefWidth(332.0);

        textField.setPrefWidth(150.0);
        VBox.setMargin(textField, new Insets(11.0, 0.0, 5.0, 0.0));

        hBox0.setPrefHeight(100.0);
        hBox0.setPrefWidth(200.0);

        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(40.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(" : ");
        HBox.setMargin(text2, new Insets(5.0));

        textField1.setPrefHeight(31.0);
        textField1.setPrefWidth(40.0);

        vBox1.setPrefHeight(200.0);
        vBox1.setPrefWidth(100.0);

        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(185.0);
        button.setText("Rechercher");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixRechercheGD();
        	}
        });
        VBox.setMargin(button, new Insets(20.0, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox1, new Insets(0.0, 0.0, 0.0, 10.0));

        button0.setLayoutX(359.0);
        button0.setLayoutY(349.0);
        button0.setMnemonicParsing(false);
        button0.setText("Annuler");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		graphAC.choixAnnuler();
        	}
        });

        vBox.getChildren().addAll(text0, text1);
        hBox0.getChildren().addAll(textField0, text2, textField1);
        vBox0.getChildren().addAll(textField, hBox0);
        vBox1.getChildren().add(button);
        hBox.getChildren().addAll(vBox, vBox0, vBox1);
        getChildren().addAll(rectangle, text, hBox, button0);
    }	
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		textField.setText(textField.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 1) 
		{
			String s = textField0.getText();
			if (s.length() == 1)
			{
				textField0.setText(s + a);
				actionSuivant();
				if (Integer.parseInt(textField0.getText()) > 23)
					textField1.setText("23");
			}
			textField0.setText(s + a);
		}
		else if (pos == 2) 
		{
			String s = textField1.getText();
			if (s.length() == 1)
			{
				textField1.setText(s + a);
				actionSuivant();
				if (Integer.parseInt(textField1.getText()) > 59)
					textField1.setText("59");
			}
			textField1.setText(s + a);
		}
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		{
			if (pos == 2)
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
				pos ++;
			}
		}
	}

	public void actionEspace() 
	{
    	if (pos == 0)
    		textField.setText(textField.getText() + " ");
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
		else
		{
			String s = textField1.getText();
			if (s.length() > 0)
				textField1.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		graphAC.choixRechercheGD();
	}
}