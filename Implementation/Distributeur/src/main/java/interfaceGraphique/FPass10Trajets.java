package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import stockage.ErreurDEncodage;
import javafx.scene.shape.*;
import coeur.GraphiqueACoeurImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

public class FPass10Trajets extends Ecran 
{
    private TextField textField;
    private RadioButton radioButton, radioButton0;
    private int pos = 0;
    private ChoiceBox<String> choiceBox, choiceBox0;
    private Text text10;

    public FPass10Trajets(double hauteur, double largeur) 
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
        Button button = new Button();
        Button button0 = new Button();
        choiceBox = new ChoiceBox<String>();	
        choiceBox0 = new ChoiceBox<String>();	
        Text text3 = new Text();
        text10 = new Text();

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
        text.setLayoutY(86.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Achat d'un pass dix trajets sans gares prédéfinies");
        text.setUnderline(true);
        text.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(78.0*largeur);
        vBox.setLayoutY(129.0*hauteur);
        vBox.setPrefHeight(150.0*hauteur);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Nom : ");
        text0.setWrappingWidth(150.0*largeur);
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0));

        textField.setPrefHeight(31.0*hauteur);
        textField.setPrefWidth(300.0*largeur);
        textField.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));
        VBox.setMargin(hBox0, new Insets(0.0));

        hBox1.setPrefHeight(17.0*hauteur);
        hBox1.setPrefWidth(244.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Classe :");
        text1.setWrappingWidth(150.0*largeur);
        text1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1e classe");
        radioButton.setFont(new Font(15.0*hauteur));
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("2e classe");
        radioButton0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton0, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        ToggleGroup t = new ToggleGroup();
        radioButton.setToggleGroup(t);
        radioButton0.setToggleGroup(t);
        
        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);
        
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        text3.setStrokeWidth(0.0);	
        text3.setText("Type du pass :");	
        text3.setWrappingWidth(150.0*largeur);	
        text3.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(text3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));	
        
        choiceBox0.setPrefWidth(125.0*largeur);	
        choiceBox0.setPrefHeight(30.0*hauteur);	
        choiceBox0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));	
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Réduction :");
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        choiceBox.setPrefWidth(225.0*largeur);
        choiceBox.setPrefHeight(31.0*hauteur);
        choiceBox.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(choiceBox, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        button.setLayoutX(22.5*largeur);
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
            		if (verifierNom(textField.getText().trim()))
            		{
    					graphAC.infoPass10Trajets(textField.getText(), getClasse(), choiceBox.getValue(), choiceBox0.getValue());
    	            	graphAC.choixValider();
            		}
            		else 
            		{
            			text10.setText("Les données saisies sont incorrectes");
            		}
				} 
            	catch (NumberFormatException | ErreurDEncodage e) 
            	{
            		text10.setText("Les données saisies sont incorrectes");
				}
            }
        });

		text10.setFont(new Font("System Bold", 15.0*hauteur));
		text10.setWrappingWidth(250.0*largeur);
		text10.setFill(javafx.scene.paint.Color.RED);
		text10.setLayoutX(275.0*largeur);
		text10.setLayoutY(364.0*hauteur);
		
		textField.setOnMouseClicked(e -> {pos = 0;});
		radioButton.setOnMouseClicked(e -> {pos = 1;});
		radioButton0.setOnMouseClicked(e -> {pos = 1;});
		choiceBox0.setOnMouseClicked(e -> {pos = 2;});
		choiceBox.setOnMouseClicked(e -> {pos = 3;});
		
        hBox0.getChildren().addAll(text0, textField);
        hBox1.getChildren().addAll(text1, radioButton, radioButton0);
        hBox2.getChildren().addAll(text3, choiceBox0, text2, choiceBox);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2);
        getChildren().addAll(rectangle, text, vBox, button, button0, text10);
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
			if (a == 1)
				radioButton.setSelected(true);
			else if (a == 2)
				radioButton0.setSelected(true);
		}
		else if (pos == 2)	
		{	
			if (a < GraphiqueACoeurImpl.getInstance().getTypes().length)	
				choiceBox0.setValue(GraphiqueACoeurImpl.getInstance().getTypes()[a]);	
		}	
		else if (pos == 3)	
		{	
			if (a < GraphiqueACoeurImpl.getInstance().getReductions().length)	
				choiceBox.setValue(GraphiqueACoeurImpl.getInstance().getReductions()[a]);	
		}
	}

	public void actionRetour() 
	{
		try 
    	{
    		if (verifierNom(textField.getText().trim()))
    		{
				graphAC.infoPass10Trajets(textField.getText(), getClasse(), choiceBox.getValue(), choiceBox0.getValue());
            	graphAC.choixValider();
    		}
    		else 
    		{
    			text10.setText("Les données saisies sont incorrectes");
    		}
		} 
    	catch (NumberFormatException | ErreurDEncodage e) 
    	{
    		text10.setText("Les données saisies sont incorrectes");
		}
	}

	public void actionSuivant() 
	{
		if (pos == 3)
		{
			textField.requestFocus();
			pos = 0;
		}
		else
		{
			if (pos == 0)
				radioButton.requestFocus();
			else if (pos == 1)
				choiceBox0.requestFocus();
			else if (pos == 2)
				choiceBox.requestFocus();
			pos++;
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
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValider();
	}
	
	private int getClasse()
	{
		if (radioButton.isSelected())
			return 1;
		else 
			return 2;
	}
}