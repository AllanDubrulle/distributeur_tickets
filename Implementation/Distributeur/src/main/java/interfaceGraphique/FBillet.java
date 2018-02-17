package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

class FBillet extends Ecran 
{
	private static FBillet instance;
	private static TextField textField, textField0, textField1, textField2, textField3, textField4, textField5, textField6;
	private static RadioButton radioButton, radioButton0, radioButton1, radioButton2;
	private static int pos = 0;

    private FBillet() 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text text = new Text();
        textField3 = new TextField();
        HBox hBox0 = new HBox();
        Text text0 = new Text();
        textField4 = new TextField();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        Text text1 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        HBox hBox3 = new HBox();
        Text text2 = new Text();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        HBox hBox4 = new HBox();
        Text text3 = new Text();
        textField5 = new TextField();
        Text text4 = new Text();
        textField6 = new TextField();
        HBox hBox5 = new HBox();
        Text text5 = new Text();
        textField = new TextField();
        HBox hBox6 = new HBox();
        Text text6 = new Text();
        textField0 = new TextField();
        Text text7 = new Text();
        textField1 = new TextField();
        Text text8 = new Text();
        textField2 = new TextField();
        Button button = new Button();
        Button button0 = new Button();
        Text text9 = new Text();

        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        vBox.setLayoutX(47.0);
        vBox.setLayoutY(83.5);
        vBox.setPrefHeight(258.0);
        vBox.setPrefWidth(711.0);

        hBox.setPrefHeight(17.0);
        hBox.setPrefWidth(244.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        HBox.setMargin(text, new Insets(0.0, 70.0, 0.0, 0.0));

        textField3.setPrefWidth(200.0);
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox0.setPrefHeight(17.0);
        hBox0.setPrefWidth(244.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Gare d'arrivée :");
        HBox.setMargin(text0, new Insets(0.0, 77.0, 0.0, 0.0));

        textField4.setPrefWidth(200.0);
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0, 0.0));
        textField4.setOnKeyPressed(null);

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0);

        hBox2.setPrefHeight(41.0);
        hBox2.setPrefWidth(725.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Aller/ Aller-retour :");
        HBox.setMargin(text1, new Insets(0.0, 52.0, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("Aller");
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Aller-retour");
        HBox.setMargin(radioButton0, new Insets(0.0, 0.0, 0.0, 53.0));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);

        hBox3.setPrefHeight(17.0);
        hBox3.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Classe :");
        HBox.setMargin(text2, new Insets(0.0, 127.0, 0.0, 0.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("1e classe");
        radioButton1.setSelected(true);

        radioButton2.setMnemonicParsing(false);
        radioButton2.setText("2e classe");
        HBox.setMargin(radioButton2, new Insets(0.0, 0.0, 0.0, 50.0));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton2.setToggleGroup(t2);
        radioButton1.setToggleGroup(t2);

        hBox4.setPrefHeight(17.0);
        hBox4.setPrefWidth(244.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Type de billet :");
        HBox.setMargin(text3, new Insets(0.0, 77.0, 0.0, 0.0));

        textField5.setPrefWidth(150.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        HBox.setMargin(text4, new Insets(0.0, 0.0, 0.0, 70.0));

        textField6.setPrefWidth(150.0);
        HBox.setMargin(textField6, new Insets(0.0, 0.0, 0.0, 50.0));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox5.setPrefHeight(12.0);
        hBox5.setPrefWidth(711.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Nombre de billet(s) : ");
        HBox.setMargin(text5, new Insets(0.0));

        textField.setPrefHeight(31.0);
        textField.setPrefWidth(40.0);
        HBox.setMargin(textField, new Insets(0.0, 0.0, 0.0, 32.0));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0, 0.0));

        hBox6.setLayoutX(82.0);
        hBox6.setPrefHeight(33.0);
        hBox6.setPrefWidth(711.0);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Jour de départ :");
        HBox.setMargin(text6, new Insets(0.0, 70.0, 0.0, 0.0));

        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(35.0);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(" / ");
        HBox.setMargin(text7, new Insets(5.0, 0.0, 0.0, 0.0));

        textField1.setPrefHeight(31.0);
        textField1.setPrefWidth(35.0);

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(" / ");
        HBox.setMargin(text8, new Insets(5.0, 0.0, 0.0, 0.0));

        textField2.setPrefHeight(31.0);
        textField2.setPrefWidth(55.0);
        HBox.setMargin(textField2, new Insets(0.0, 50.0, 0.0, 0.0));

        button.setLayoutX(22.5);
        button.setLayoutY(354.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Annuler");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixAnnuler();
            }
        });

        button0.setLayoutX(702.5);
        button0.setLayoutY(354.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(75.0);
        button0.setText("Valider");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixValider();
            }
        });

        text9.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text9.setLayoutX(31.0);
        text9.setLayoutY(58.5);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Achat d'un billet de train");
        text9.setUnderline(true);
        text9.setFont(new Font("System Bold", 22.0));

        hBox.getChildren().addAll(text, textField3);
        hBox0.getChildren().addAll(text0, textField4);
        hBox2.getChildren().addAll(text1, radioButton, radioButton0);
        hBox1.getChildren().add(hBox2);
        hBox3.getChildren().addAll(text2, radioButton1, radioButton2);
        hBox4.getChildren().addAll(text3, textField5, text4, textField6);
        hBox5.getChildren().addAll(text5, textField);
        hBox6.getChildren().addAll(text6, textField0, text7, textField1, text8, textField2);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox3, hBox4, hBox5, hBox6);
        getChildren().addAll(rectangle, vBox, button, button0, text9);
    }

    public static FBillet getInstance() 
    {
    	if (instance == null)
    		instance = new FBillet();
    	return instance;
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		textField3.setText(textField3.getText() + a);
    	else if (pos == 1)
    		textField4.setText(textField4.getText() + a);
    	else if (pos == 4)
    		textField5.setText(textField5.getText() + a);
    	else if (pos == 5)
    		textField6.setText(textField6.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 2)
		{
			if (a == 1)
				radioButton.setSelected(true);
			else if (a == 2)
				radioButton0.setSelected(true);
		}
		else if (pos == 3)
		{
			if (a == 1)
				radioButton1.setSelected(true);
			else if (a == 2)
				radioButton2.setSelected(true);
		}
		else if (pos == 6)
		{
			String s = textField.getText();
			if (s.length() == 2)
			{
				actionSuivant();
				if (Integer.parseInt(textField.getText()) == 0)
					textField.setText(" 1");
			}
			else
				textField.setText(s + a);
		}
		else if (pos == 7)
		{
			String s = textField0.getText();
			if (s.length() == 1)
			{
				textField0.setText(s + a);
				actionSuivant();
				if(Integer.parseInt(textField0.getText()) > 31)
					textField0.setText("31");
				if(Integer.parseInt(textField0.getText()) == 0)
					textField0.setText("01");
			}
			else if (s.length() < 2)
				textField0.setText(s + a);
		}
		else if (pos == 8)
		{
			String s = textField1.getText();
			if (s.length() == 1)
			{
				textField1.setText(s + a);
				s = textField1.getText();
				actionSuivant();
				if(Integer.parseInt(s) > 12)
					textField1.setText("12");
				if(Integer.parseInt(s) == 4 || Integer.parseInt(s) == 6 || Integer.parseInt(s) == 9 || Integer.parseInt(s) == 11)
					if(Integer.parseInt(textField0.getText()) > 30)
						textField0.setText("30");
				if(Integer.parseInt(s) == 2)
					if(Integer.parseInt(s)>29)
						textField0.setText("29");
				if(Integer.parseInt(textField1.getText()) == 0)
					textField1.setText("01");
			}
			else if (s.length() < 2)
				textField1.setText(s + a);
		}
		else if (pos == 9)
		{
			String s = textField2.getText();
			if (s.length() == 3)
			{
				textField2.setText(s + a);
				s = textField2.getText();
				actionSuivant();
				if(Integer.parseInt(s) > 2099)
					textField2.setText("2099");
				if(Integer.parseInt(s) < 2018)
					textField2.setText("2018");
				if(Integer.parseInt(textField1.getText()) == 2 && Integer.parseInt(textField2.getText())%4 != 0)
					if(Integer.parseInt(textField0.getText())>28)
						textField0.setText("28");
			}
			else if (s.length() < 4)
				textField2.setText(s + a);
		}
	}

	public void actionRetour() 
	{
		graphAC.choixRetour();
	}

	public void actionSuivant() 
	{
		if (pos == 9)
		{
			textField3.requestFocus();
			pos = 0;
		}
		else
		{
			if (pos == 0)
				textField4.requestFocus();
			else if (pos == 1)
				radioButton.requestFocus();
			else if (pos == 2)
				radioButton1.requestFocus();
			else if (pos == 3)
				textField5.requestFocus();
			else if (pos == 4)
				textField6.requestFocus();
			else if (pos == 5)
				textField.requestFocus();
			else if (pos == 6)
				textField0.requestFocus();
			else if (pos == 7)
				textField1.requestFocus();
			else
				textField2.requestFocus();
			pos ++;
		}
	}

	public void actionEspace() 
	{
		if (pos == 0)
			textField3.setText(textField3.getText() + " ");
		else if (pos == 1)
			textField4.setText(textField4.getText() + " ");
		else if (pos == 4)
			textField5.setText(textField5.getText() + " ");
		else if (pos == 5)
			textField6.setText(textField6.getText() + " ");
		
	}

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = textField3.getText();
			if (s.length() > 0)
				textField3.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 1)
		{
			String s = textField4.getText();
			if (s.length() > 0)
				textField4.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 4)
		{
			String s = textField5.getText();
			if (s.length() > 0)
				textField5.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 5)
		{
			String s = textField6.getText();
			if (s.length() > 0)
				textField6.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 6) 
		{
			String s = textField.getText();
			if (s.length() > 0)
				textField.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 7)
		{
			String s = textField0.getText();
			if (s.length() > 0)
				textField0.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 8)
		{
			String s = textField1.getText();
			if (s.length() > 0)
				textField1.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 9)
		{
			String s = textField2.getText();
			if (s.length() > 0)
				textField2.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValider();
	}
}