package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

class FPass2 extends Ecran 
{
    private TextField textField, textField1;
    private RadioButton radioButton, radioButton0;
    private int pos = 0;

    public FPass2() 
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
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        HBox hBox2 = new HBox();
        Text text2 = new Text();
        textField1 = new TextField();
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
        text.setLayoutX(54.0);
        text.setLayoutY(86.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass dix trajets sans gares prédéfinies");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0));

        vBox.setLayoutX(78.0);
        vBox.setLayoutY(129.0);
        vBox.setPrefHeight(150.0);
        vBox.setPrefWidth(711.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0);

        hBox0.setPrefHeight(12.0);
        hBox0.setPrefWidth(711.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        HBox.setMargin(text0, new Insets(0.0));

        textField.setPrefHeight(31.0);
        textField.setPrefWidth(248.0);
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0, 129.0));
        VBox.setMargin(hBox0, new Insets(0.0));

        hBox1.setPrefHeight(17.0);
        hBox1.setPrefWidth(244.0);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Classe :");
        HBox.setMargin(text1, new Insets(0.0, 127.0, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1e classe");
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("2e classe");
        HBox.setMargin(radioButton0, new Insets(0.0, 0.0, 0.0, 50.0));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

        ToggleGroup t = new ToggleGroup();
        radioButton.setToggleGroup(t);
        radioButton0.setToggleGroup(t);
        
        hBox2.setPrefHeight(17.0);
        hBox2.setPrefWidth(244.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Réduction :");
        HBox.setMargin(text2, new Insets(0.0));

        textField1.setPrefWidth(300.0);
        HBox.setMargin(textField1, new Insets(0.0, 0.0, 0.0, 100.0));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0, 0.0));

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
            	graphAC.choixValiderPass10Trajets();
            }
        });

        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, radioButton, radioButton0);
        hBox2.getChildren().addAll(text2, textField1);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2);
        getChildren().addAll(rectangle, text, vBox, button, button0);
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		textField.setText(textField.getText() + a);
    	else if (pos == 2)
    		textField1.setText(textField.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 1)
		{	
			if (a == 1)
				radioButton.setSelected(true);
			else if (a == 2)
				radioButton0.setSelected(true);
		}
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if (pos == 2)
		{
			textField.requestFocus();
			pos = 0;
		}
		else
		{
			if (pos == 0)
				radioButton.requestFocus();
			else if (pos == 1)
				textField1.requestFocus();
			pos++;
		}
	}

	public void actionEspace() 
	{
		if (pos == 0)
			textField.setText(textField.getText() + " ");
		if (pos == 2)
			textField.setText(textField.getText() + " ");
	}

	public void actionEffacer() 
	{
		if (pos == 1)
		{
			String s = textField.getText();
			if (s.length() > 0)
				textField.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 2)
		{
			String s = textField1.getText();
			if (s.length() > 0)
				textField1.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValiderPass10Trajets();
	}
	
	public String getNom()
	{
		return textField.getText();
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
		return textField1.getText();
	}
}