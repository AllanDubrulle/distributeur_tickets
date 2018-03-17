package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import coeur.GraphiqueACoeurImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

class FPassIllimite extends Ecran 
{
    private TextField textField, textField0, textField1, textField2;
    private RadioButton radioButton, radioButton1;
    private int pos = 0;
    private ChoiceBox<String> choiceBox, choiceBox0;
    
    public FPassIllimite(double hauteur, double largeur) 
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
        textField1 = new TextField();
        HBox hBox2 = new HBox();
        Text text2 = new Text();
        textField2 = new TextField();
        HBox hBox3 = new HBox();
        Text text3 = new Text();
        radioButton = new RadioButton();
        radioButton1 = new RadioButton();
        HBox hBox4 = new HBox();
        Text text4 = new Text();
        HBox hBox5 = new HBox();
        Text text5 = new Text();
        textField0 = new TextField();
        Button button = new Button();
        Button button0 = new Button();
        Text text6 = new Text();	
        choiceBox = new ChoiceBox<String>();	
        choiceBox0 = new ChoiceBox<String>();

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
        text.setLayoutY(63.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass avec choix du nombre de jours");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(78.0*largeur);
        vBox.setLayoutY(98.0*hauteur);
        vBox.setPrefHeight(150.0*hauteur);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        text0.setWrappingWidth(180.0*largeur);
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0));

        textField.setPrefHeight(31.0*hauteur);
        textField.setPrefWidth(300.0*largeur);
        textField.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

        hBox1.setPrefHeight(17.0*hauteur);
        hBox1.setPrefWidth(244.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Gare de départ :");
        text1.setWrappingWidth(180.0*largeur);
        text1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        textField1.setPrefWidth(300.0*largeur);
        textField1.setPrefHeight(31.0*hauteur);
        textField1.setFont(new Font(15.0*hauteur));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Gare d'arrivée :");
        text2.setWrappingWidth(180.0*largeur);
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        textField2.setPrefWidth(300.0*largeur);
        textField2.setPrefHeight(31.0*hauteur);
        textField2.setFont(new Font(15.0*hauteur));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Classe :");
        text3.setWrappingWidth(180.0*largeur);
        text3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1e classe");
        radioButton.setSelected(true);
        radioButton.setFont(new Font(15.0*hauteur));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("2e classe");
        radioButton1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton1, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t = new ToggleGroup();
        radioButton.setToggleGroup(t);
        radioButton1.setToggleGroup(t);

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        text4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        choiceBox.setPrefWidth(225.0*largeur);
        choiceBox.setPrefHeight(31.0*hauteur);
        choiceBox.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(choiceBox, new Insets(0.0, 0.0, 0.0, 132.0*largeur));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        text6.setStrokeWidth(0.0);	
        text6.setText("Type du pass :");	
        text6.setWrappingWidth(180.0*largeur);	
        text6.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(text5, new Insets(0.0));	
        
        choiceBox0.setPrefWidth(125.0*largeur);	
        choiceBox0.setPrefHeight(31.0*hauteur);	
        choiceBox0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));	
        HBox.setMargin(choiceBox0, new Insets(0.0, 0.0, 0.0, 20.0*largeur));	
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(12.0*hauteur);
        hBox5.setPrefWidth(711.0*largeur);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Nombre de jours de validité : ");
        text5.setWrappingWidth(180.0*largeur);
        text5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text5, new Insets(0.0));

        textField0.setPrefHeight(31.0*hauteur);
        textField0.setPrefWidth(85.0*largeur);
        textField0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField0, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

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
            	graphAC.choixValider();
            }
        });

        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, textField1);
        hBox2.getChildren().addAll(text2, textField2);
        hBox3.getChildren().addAll(text3, radioButton, radioButton1);
        hBox4.getChildren().addAll(text6, choiceBox0, text4, choiceBox);
        hBox5.getChildren().addAll(text5, textField0);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4, hBox5);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		textField.setText(textField.getText() + a);
    	else if (pos == 1)
    		textField1.setText(textField1.getText() + a);
    	else if (pos == 2)
    		textField2.setText(textField2.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 6)
		{
			if (a == 1)
				radioButton.setSelected(true);
			else if (a == 2)
				radioButton1.setSelected(true);
		}
    	else if (pos == 5)
    		textField0.setText(textField0.getText() + a);
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if (pos == 5)
		{
			pos = 0;
			textField.requestFocus();
		}
		else
		{
			if (pos == 0)
				textField1.requestFocus();
			else if (pos == 1)
				textField2.requestFocus();
			else if (pos == 2)
				radioButton.requestFocus();
			else if (pos == 3)
				choiceBox0.requestFocus();
			else if (pos == 4)	
				choiceBox.requestFocus();
			else
				textField0.requestFocus();
			pos ++;
		}
	}

	public void actionEspace() 
	{
    	if (pos == 0)
    		textField.setText(textField.getText() + " ");
    	else if (pos == 1)
    		textField1.setText(textField1.getText() + " ");
    	else if (pos == 2)
    		textField2.setText(textField2.getText() + " ");
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
			String s = textField1.getText();
			if (s.length() > 0)
				textField1.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 2)
		{
			String s = textField2.getText();
			if (s.length() > 0)
				textField2.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 5)
		{
			String s = textField0.getText();
			if (s.length() > 0)
				textField0.setText(s.substring(0, s.length()-1));
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
	
	public String getDepart()
	{
		return textField1.getText();
	}
	
	public String getArrivee()
	{
		return textField2.getText();
	}
	
	public String getClasse()
	{
		if (radioButton.isSelected())
			return "1e classe";
		else
			return "2e classe";
	}
	
	public String getReduction()
	{
		return choiceBox.getValue();
	}	
	public String getType()	
	{	
		return choiceBox0.getValue();
	}
	public String getNbrJours()
	{
		return textField0.getText();
	}
}