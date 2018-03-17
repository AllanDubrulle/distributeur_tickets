package interfaceGraphique;
//pour test
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import stockage.ErreurDEncodage;
import javafx.scene.shape.*;

import java.util.Date;

import coeur.GraphiqueACoeurImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

class FAboAchat extends Ecran 
{
    private TextField textField, textField0, textField1, textField2;
    private RadioButton radioButton, radioButton0, radioButton1, radioButton2, radioButton3, radioButton4;
    private int pos = 0;
    private ChoiceBox<String> choiceBox, choiceBox0;
    
    public FAboAchat(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text text0 = new Text();
        textField = new TextField();
        HBox hBox1 = new HBox();
        Text text1 = new Text();
        textField0 = new TextField();
        HBox hBox2 = new HBox();
        Text text2 = new Text();
        textField1 = new TextField();
        HBox hBox3 = new HBox();
        Text text3 = new Text();
        textField2 = new TextField();
        HBox hBox4 = new HBox();
        Text text4 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        HBox hBox5 = new HBox();
        Text text5 = new Text();
        radioButton3 = new RadioButton();
        radioButton4 = new RadioButton();
        HBox hBox6 = new HBox();
        Text text6 = new Text();
        Button button = new Button();
        Button button0 = new Button();
        Text text7 = new Text();
        choiceBox = new ChoiceBox<String>();
        choiceBox0 = new ChoiceBox<String>();
        Text text10 = new Text();

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
        text.setLayoutX(54.0*largeur);
        text.setLayoutY(55.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un abonnement");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(60.0*largeur);
        vBox.setLayoutY(70.0*hauteur);
        vBox.setPrefHeight(219.0*hauteur);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        text0.setWrappingWidth(180*largeur);
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0));

        textField.setPrefHeight(31.0*hauteur);
        textField.setPrefWidth(300.0*largeur);
        textField.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0*hauteur, 20*largeur));

        hBox1.setPrefHeight(12.0*hauteur);
        hBox1.setPrefWidth(711.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setWrappingWidth(180*largeur);
        text1.setText("Numéro de registre national : ");
        text1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0));

        textField0.setPrefHeight(31.0*hauteur);
        textField0.setPrefWidth(300.0*largeur);
        textField0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField0, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Gare de départ :");
        text2.setWrappingWidth(180*largeur);
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0, 0.0*largeur, 0.0, 0.0));

        textField1.setPrefWidth(300.0*largeur);
        textField1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Gare d'arrivée :");
        text3.setWrappingWidth(180*largeur);
        text3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        textField2.setPrefWidth(300.0*largeur);
        textField2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField2, new Insets(0.0, 0.0, 0.0, 0.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox4.setPrefHeight(41.0*hauteur);
        hBox4.setPrefWidth(725.0*largeur);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Validité de l'abonnement :");
        text4.setWrappingWidth(180*largeur);
        text4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text4, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1 mois");
        radioButton.setFont(new Font(15.0*hauteur));
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("3 mois");
        radioButton0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton0, new Insets(0.0, 15.0*largeur, 0.0, 65.0*largeur));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("6 mois");
        radioButton1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton1, new Insets(0.0, 15.0*largeur, 0.0, 50.0*largeur));

        radioButton2.setMnemonicParsing(false);
        radioButton2.setText("12 mois");
        radioButton2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton2, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);
        radioButton1.setToggleGroup(t1);
        radioButton2.setToggleGroup(t1);

        hBox5.setPrefHeight(17.0*hauteur);
        hBox5.setPrefWidth(244.0*largeur);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Classe :");
        text5.setWrappingWidth(180*largeur);
        text5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text5, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton3.setMnemonicParsing(false);
        radioButton3.setText("1e classe");
        radioButton3.setFont(new Font(15.0*hauteur));
        radioButton3.setSelected(true);

        radioButton4.setMnemonicParsing(false);
        radioButton4.setText("2e classe");
        radioButton4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton3.setToggleGroup(t2);
        radioButton4.setToggleGroup(t2);

        hBox6.setPrefHeight(17.0*hauteur);
        hBox6.setPrefWidth(244.0*largeur);

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Type d'abonnement :");
        text7.setWrappingWidth(180*largeur);
        text7.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text7, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        choiceBox0.setPrefWidth(125.0*largeur);
        choiceBox0.setPrefHeight(30.0*hauteur);
        choiceBox0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));
        
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Réduction :");
        text6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text6, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        choiceBox.setPrefWidth(225.0*largeur);
        choiceBox.setPrefHeight(30.0*hauteur);
        choiceBox.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(choiceBox, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox6.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        button.setLayoutX(23.0*largeur);
        button.setLayoutY(354.0*hauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*hauteur);
        button.setPrefWidth(75.0*largeur);
        button.setText("Annuler");
        button.setFont(new Font(15.0*hauteur));
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixAnnuler();
            }
        });

        button0.setLayoutX(702.5*largeur);
        button0.setLayoutY(354.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(75.0*largeur);
        button0.setText("Valider");
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
        		try
        		{
        			graphAC.InfoAbo(new Date(118, 2, 17), new Date(118, 2 + getValidite() ,17), textField1.getText(), textField2.getText(), getClasse(), choiceBox.getValue(), choiceBox0.getValue(),  "1010", textField.getText(), textField0.getText());
        			graphAC.choixValider();
        		}
        		catch (NumberFormatException | ErreurDEncodage e)
            	{
            		text10.setText("Les données saisies sont incorrectes");
            		text10.setFont(new Font("System Bold", 15.0*hauteur));
            		text10.setWrappingWidth(250.0*largeur);
            		text10.setFill(javafx.scene.paint.Color.RED);
            		text10.setLayoutX(275.0*largeur);
            		text10.setLayoutY(384.0*hauteur);
            	}
            }
        });

        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, textField0);
        hBox2.getChildren().addAll(text2, textField1);
        hBox3.getChildren().addAll(text3, textField2);
        hBox4.getChildren().addAll(text4, radioButton, radioButton0, radioButton1, radioButton2);
        hBox5.getChildren().addAll(text5, radioButton3, radioButton4);
        hBox6.getChildren().addAll(text7, choiceBox0, text6, choiceBox);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);
        getChildren().addAll(rectangle, text, vBox, button, button0, text10);
    }
    
    public void actionClavier(String a) 
    {
    	String s;
    	if (pos == 0) 
    	{
    		s = textField.getText();
    		textField.setText(s + a);
    	}
    	else if(pos == 2) 
    	{
    		s = textField1.getText();
    		textField1.setText(s + a);
    	}
    	else if(pos == 3) 
    	{
    		s = textField2.getText();
    		textField2.setText(s + a);
    	}
    }

	public void actionClavier(int a) 
	{
		if (pos == 1)
		{
			String s = textField0.getText();
			textField0.setText(s + a);
    		if (s.length() == 10)
    			actionSuivant();
		}
		if (pos == 4) 
		{
			if (a == 1)
	    		radioButton.setSelected(true);
			else if (a == 2)
	    		radioButton0.setSelected(true);
			else if (a == 3)
	    		radioButton1.setSelected(true);
			else if (a == 4) 
	    		radioButton2.setSelected(true);
		}
		else if (pos == 5) 
		{
			if (a == 1) 
	    		radioButton3.setSelected(true);
			else if (a == 2) 
	    		radioButton4.setSelected(true);
		}
		else if (pos == 6)
		{
			if (a < GraphiqueACoeurImpl.getInstance().getTypes().length)
				choiceBox0.setValue(GraphiqueACoeurImpl.getInstance().getTypes()[a]);
		}
		else if (pos == 7)
		{
			if (a < GraphiqueACoeurImpl.getInstance().getReductions().length)
				choiceBox.setValue(GraphiqueACoeurImpl.getInstance().getReductions()[a]);
		}
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if(pos == 7) 
		{
			pos = 0;
			textField.requestFocus();
		}
		else 
		{
			if (pos == 0)
				textField0.requestFocus();
			else if (pos == 1)
				textField1.requestFocus();
			else if (pos == 2)
				textField2.requestFocus();
			else if (pos == 3)
				radioButton.requestFocus();
			else if (pos == 4)
				radioButton3.requestFocus();
			else if (pos == 5)
				choiceBox0.requestFocus();
			else
				choiceBox.requestFocus();
			pos++;
		}
	}

	public void actionEspace() 
	{
		String s;
    	if (pos == 0) 
    	{
    		s = textField.getText();
    		textField.setText(s + " ");
    	}
    	else if(pos == 1) 
    	{
    		s = textField0.getText();
    		textField0.setText(s + " ");
    	}
    	else if(pos == 2) 
    	{
    		s = textField1.getText();
    		textField1.setText(s + " ");
    	}
    	else if(pos == 3) 
    	{
    		s = textField2.getText();
    		textField2.setText(s + " ");
    	}
	}

	public void actionEffacer() 
	{
		String s;
    	if (pos == 0) 
    	{
    		s = textField.getText();
    		if (s.length()>0)
    			textField.setText(s.substring(0, s.length()-1));
    	}
    	else if(pos == 1) 
    	{
    		s = textField0.getText();
    		if (s.length()>0)
    			textField0.setText(s.substring(0, s.length()-1));
    	}
    	else if(pos == 2) 
    	{
    		s = textField1.getText();
    		if (s.length()>0)
    			textField1.setText(s.substring(0, s.length()-1));
    	}
    	else if(pos == 3) 
    	{
    		s = textField2.getText();
    		if (s.length()>0)
    			textField2.setText(s.substring(0, s.length()-1));
    	}
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValider();
	}
	
	public String getNom()
	{
		return textField.getText();
	}
	
	public String getNumRegNat()
	{
		return textField0.getText();
	}
	
	public String getGareDepart()
	{
		return textField1.getText();
	}
	
	public String getGareArrivee()
	{
		return textField2.getText();
	}
	
	public int getValidite()
	{
		if (radioButton.isSelected())
			return 1;
		else if (radioButton0.isSelected())
			return 3;
		else if (radioButton1.isSelected())
			return 6;
		else
			return 12;
	}
	
	public int getClasse()
	{
		if (radioButton3.isSelected())
			return 1;
		else
			return 2;
	}
	
	public String getReduction()
	{
		return choiceBox.getValue();
	}
	public String getType()
	{
		return choiceBox0.getValue();
	}
	public String getPrix()
	{
		return "10000";
	}
}