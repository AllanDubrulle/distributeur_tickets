package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import stockage.ErreurDEncodage;

public class FAboRenouveler extends Ecran 
{
	private TextField textField;
	private RadioButton radioButton, radioButton0, radioButton1, radioButton2;
	private Text text10;
	
	public FAboRenouveler(double hauteur, double largeur)
	{
		Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text text = new Text();
        textField = new TextField();
        HBox hBox1 = new HBox();
        Text text0 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        Text text1 = new Text();
        Button button = new Button();
        Button button0 = new Button();
        text10 = new Text();
        Button button1 = new Button();

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

        vBox.setLayoutX(54.0*largeur);
        vBox.setLayoutY(156.0*hauteur);
        vBox.setPrefHeight(0.0);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Numéro de l'abonnement : ");
        text.setWrappingWidth(180*largeur);
        text.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text, new Insets(0.0));

        textField.setPrefHeight(31.0*hauteur);
        textField.setPrefWidth(250.0*largeur);
        textField.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));
        
        button1.setLayoutX(520.0*largeur);
        button1.setLayoutY(155.0*hauteur);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(120.0*largeur);
        button1.setText("Scanner code");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixScannerCode();
            }
        });

        hBox1.setPrefHeight(41.0*hauteur);
        hBox1.setPrefWidth(725.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Validité de l'abonnement :");
        text0.setWrappingWidth(180*largeur);
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("1 mois");
        radioButton.setFont(new Font(15.0*hauteur));

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
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);
        radioButton1.setToggleGroup(t1);
        radioButton2.setToggleGroup(t1);
        radioButton.setSelected(true);

        text1.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text1.setLayoutX(54.0*largeur);
        text1.setLayoutY(83.0*hauteur);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Renouveler un abonnement");
        text1.setUnderline(true);
        text1.setFont(new Font("System Bold", 22.0*hauteur));

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

        button0.setLayoutX(703.0*largeur);
        button0.setLayoutY(354.0*hauteur);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0*hauteur);
        button0.setPrefWidth(75.0*largeur);
        button0.setText("Valider");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	try 
            	{
            		int verifAbo = Integer.parseInt(textField.getText());
					graphAC.infoAboRen(getValidite(), String.valueOf(verifAbo));
	            	graphAC.choixValider();
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
		text10.setLayoutY(304.0*hauteur);
		
		textField.setOnMouseClicked(e -> {pos = 0;});
		radioButton.setOnMouseClicked(e -> {pos = 1;});
		radioButton0.setOnMouseClicked(e -> {pos = 1;});
		radioButton1.setOnMouseClicked(e -> {pos = 1;});
		radioButton2.setOnMouseClicked(e -> {pos = 1;});
        
        hBox0.getChildren().addAll(text, textField);
        hBox1.getChildren().addAll(text0, radioButton, radioButton0, radioButton1, radioButton2);
        vBox.getChildren().addAll(hBox, hBox0, hBox1);
        getChildren().addAll(rectangle, vBox, text1, button, button0, text10, button1);
    }

	public void actionClavier(int a) 
	{
		if (pos == 0)
		{
			String s = textField.getText();
			textField.setText(s + a);
		}
		else
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
		
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if (pos == 1)
		{
			textField.requestFocus();
			pos = 0;
		}
		else
		{
			radioButton.requestFocus();
			pos ++;
		}
	}

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = textField.getText();
			if (s.length()>0)
				textField.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		try 
    	{
    		int verifAbo = Integer.parseInt(textField.getText());
			graphAC.infoAboRen(getValidite(), String.valueOf(verifAbo));
        	graphAC.choixValider();
		} 
    	catch (NumberFormatException | ErreurDEncodage e) 
    	{
    		text10.setText("Les données saisies sont incorrectes");		
		}
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
	public void setNumAbo(String numAbo)
	{
		textField.setText(numAbo);
	}
}
