package interfaceGraphique;

import java.sql.Date;
import java.time.LocalDate;

import coeur.GraphiqueACoeurImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import stockage.ErreurDEncodage;

class FBillet extends Ecran 
{
	private TextField textField, textField0, textField1, textField2, textField3, textField4;
	private RadioButton radioButton, radioButton0, radioButton1, radioButton2;
	private int pos = 0;
	private ChoiceBox<String> choiceBox, choiceBox0;
	private Text text10;
	private Button button1;

    public FBillet(double hauteur, double largeur) 
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
        Text text4 = new Text();
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
        text10 = new Text();
        choiceBox = new ChoiceBox<String>();
        choiceBox0 = new ChoiceBox<String>();
        button1 = new Button();
        

        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        vBox.setLayoutX(47.0*largeur);
        vBox.setLayoutY(103.5*hauteur);
        vBox.setPrefHeight(258.0*hauteur);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(17.0*hauteur);
        hBox.setPrefWidth(244.0*largeur);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        text.setWrappingWidth(180*largeur);
        text.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        textField3.setPrefWidth(200.0*largeur);
        textField3.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox0.setPrefHeight(17.0*hauteur);
        hBox0.setPrefWidth(244.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Gare d'arrivée :");
        text0.setWrappingWidth(180*largeur);
        text0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text0, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        textField4.setPrefWidth(200.0*largeur);
        textField4.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0*largeur);

        hBox2.setPrefHeight(41.0*hauteur);
        hBox2.setPrefWidth(725.0*largeur);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Aller/ Aller-retour :");
        text1.setWrappingWidth(180*largeur);
        text1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text1, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setText("Aller");
        radioButton.setFont(new Font(15.0*hauteur));
        radioButton.setSelected(true);

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Aller-retour");
        radioButton0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton0, new Insets(0.0, 0.0, 0.0, 53.0*largeur));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Classe :");
        text2.setWrappingWidth(180*largeur);
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("1e classe");
        radioButton1.setFont(new Font(15.0*hauteur));
        radioButton1.setSelected(true);

        radioButton2.setMnemonicParsing(false);
        radioButton2.setText("2e classe");
        radioButton2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(radioButton2, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton2.setToggleGroup(t2);
        radioButton1.setToggleGroup(t2);

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0);

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Type de billet :");
        text3.setWrappingWidth(180*largeur);
        text3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        choiceBox0.setPrefWidth(125.0*largeur);
        choiceBox0.setPrefHeight(30.0*hauteur);
        choiceBox0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Réduction :");
        text4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        choiceBox.setPrefWidth(225.0*largeur);
        choiceBox.setPrefHeight(30.0*hauteur);
        choiceBox.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(choiceBox, new Insets(0.0, 0.0, 0.0, 25.0*largeur));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(12.0*hauteur);
        hBox5.setPrefWidth(711.0*largeur);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Nombre de billet(s) : ");
        text5.setWrappingWidth(180*largeur);
        text5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text5, new Insets(0.0));

        textField.setPrefHeight(31.0*hauteur);
        textField.setPrefWidth(40.0*largeur);
        textField.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField, new Insets(0.0, 75.0*largeur, 0.0, 20.0*largeur));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setLayoutX(82.0*largeur);
        hBox6.setPrefHeight(33.0*hauteur);
        hBox6.setPrefWidth(400.0*largeur);

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Jour de départ :");
        text6.setWrappingWidth(180*largeur);
        text6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text6, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        textField0.setPrefHeight(31.0*hauteur);
        textField0.setPrefWidth(35.0*largeur);
        textField0.setFont(new Font(15.0*hauteur));

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(" / ");
        text7.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text7, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        textField1.setPrefHeight(31.0*hauteur);
        textField1.setPrefWidth(35.0*largeur);
        textField1.setFont(new Font(15.0*hauteur));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(" / ");
        text8.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text8, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        textField2.setPrefHeight(31.0*hauteur);
        textField2.setPrefWidth(55.0*largeur);
        textField2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(textField2, new Insets(0.0, 0.0, 0.0, 0.0));

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
        
        button1.setLayoutX(450.0*largeur);
        button1.setLayoutY(354.0*hauteur);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0*hauteur);
        button1.setPrefWidth(150.0*largeur);
        button1.setText("Départ aujourd'hui");
        button1.setFont(new Font(15.0*hauteur));
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	LocalDate date = LocalDate.now();
            	if(Integer.toString(date.getDayOfMonth()).length() == 1)
            		textField0.setText("0" + date.getDayOfMonth());
            	else
            		textField0.setText(Integer.toString(date.getDayOfMonth()));
            	if(Integer.toString(date.getMonth().getValue()).length() == 1)
            		textField1.setText("0" + date.getMonthValue());
            	else
            		textField1.setText(Integer.toString(date.getMonth().getValue()));
            	textField2.setText(Integer.toString(date.getYear()));
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
            		int nbrBillet = Integer.parseInt(textField.getText());
            		int jour = Integer.parseInt(textField0.getText());
            		int mois = Integer.parseInt(textField1.getText());
            		int annee = Integer.parseInt(textField2.getText());
                    if (nbrBillet == 0 || nbrBillet >= 100)
                    	throw new ErreurDEncodage("Nombre de billet invalide");
                    if (verifierDate(jour, mois, annee))
                    {
                    	Date date = new Date(0,0,0);
                        date.setYear(annee-1900);
                        date.setDate(jour);
                        date.setMonth(mois-1);
                    	graphAC.infoBillet(date,nbrBillet, getClasse(),textField3.getText().trim(),textField4.getText().trim(),choiceBox0.getValue(), choiceBox.getValue() ,radioButton1.isSelected());
                    	graphAC.choixValider();
                    }
                    else
                    {
                		text10.setText("La date saisie est incorrecte");
                    }
            	}
            	catch (NumberFormatException e)
            	{
            		text10.setText("Les données saisies sont incorrectes");
            	}
            	catch (ErreurDEncodage e)
            	{
            		text10.setText(e.getMessage());
            	}
            	
            }
        });

        text9.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text9.setLayoutX(31.0*largeur);
        text9.setLayoutY(58.5*hauteur);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Achat d'un billet de train");
        text9.setUnderline(true);
        text9.setFont(new Font("System Bold", 22.0*hauteur));
        
        text10.setFont(new Font("System Bold", 15.0*hauteur));
		text10.setWrappingWidth(250.0*largeur);
		text10.setFill(javafx.scene.paint.Color.RED);
		text10.setLayoutX(175.0*largeur);
		text10.setLayoutY(364.0*hauteur);

		textField3.setOnMouseClicked(e -> {pos = 0;});
		textField4.setOnMouseClicked(e -> {pos = 1;});
		radioButton.setOnMouseClicked(e -> {pos = 2;});
		radioButton0.setOnMouseClicked(e -> {pos = 2;});
		radioButton1.setOnMouseClicked(e -> {pos = 3;});
		radioButton2.setOnMouseClicked(e -> {pos = 3;});
		choiceBox0.setOnMouseClicked(e -> {pos = 4;});
		choiceBox.setOnMouseClicked(e -> {pos = 5;});
		textField.setOnMouseClicked(e -> {pos = 6;});
		textField0.setOnMouseClicked(e -> {pos = 7;});
		textField1.setOnMouseClicked(e -> {pos = 8;});
		textField2.setOnMouseClicked(e -> {pos = 9;});

        hBox.getChildren().addAll(text, textField3);
        hBox0.getChildren().addAll(text0, textField4);
        hBox2.getChildren().addAll(text1, radioButton, radioButton0);
        hBox1.getChildren().add(hBox2);
        hBox3.getChildren().addAll(text2, radioButton1, radioButton2);
        hBox4.getChildren().addAll(text3, choiceBox0, text4, choiceBox);
        hBox6.getChildren().addAll(text6, textField0, text7, textField1, text8, textField2);
        hBox5.getChildren().addAll(text5, textField, hBox6);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox3, hBox4, hBox5);
        getChildren().addAll(rectangle, vBox, button, button0, text9, text10, button1);
    
        button.setFocusTraversable(false);
        button0.setFocusTraversable(false);
        
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		textField3.setText(textField3.getText() + a);
    	else if (pos == 1)
    		textField4.setText(textField4.getText() + a);
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
		else if (pos == 4)
		{
			if (a < GraphiqueACoeurImpl.getInstance().getTypes().length)
				choiceBox0.setValue(GraphiqueACoeurImpl.getInstance().getTypes()[a]);
		}
		else if (pos == 5)
		{
			if (a < GraphiqueACoeurImpl.getInstance().getReductions().length)
				choiceBox.setValue(GraphiqueACoeurImpl.getInstance().getReductions()[a]);
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
					if(Integer.parseInt(textField0.getText()) > 28)
						textField0.setText("28");
				if(Integer.parseInt(textField1.getText()) == 2 && Integer.parseInt(textField2.getText())%4 == 0)
					if(Integer.parseInt(textField0.getText()) > 29)
						textField0.setText("29");
			}
			else if (s.length() < 4)
				textField2.setText(s + a);
		}				
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if (pos == 10)
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
				choiceBox0.requestFocus();
			else if (pos == 4)
				choiceBox.requestFocus();
			else if (pos == 5)
				textField.requestFocus();
			else if (pos == 6)
				textField0.requestFocus();
			else if (pos == 7)
				textField1.requestFocus();
			else if (pos == 8)
				textField2.requestFocus();
			else
				button1.requestFocus();
			pos ++;
		}
	}

	public void actionEspace() 
	{
		if (pos == 0)
			textField3.setText(textField3.getText() + " ");
		else if (pos == 1)
			textField4.setText(textField4.getText() + " ");
		if (pos == 10)
		{
			LocalDate date = LocalDate.now();
           	if(Integer.toString(date.getDayOfMonth()).length() == 1)
           		textField0.setText("0" + date.getDayOfMonth());
           	else
           		textField0.setText(Integer.toString(date.getDayOfMonth()));
           	if(Integer.toString(date.getMonth().getValue()).length() == 1)
           		textField1.setText("0" + date.getMonthValue());
           	else
           		textField1.setText(Integer.toString(date.getMonth().getValue()));
           	textField2.setText(Integer.toString(date.getYear()));
		}
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
		try
    	{
    		int nbrBillet = Integer.parseInt(textField.getText());
    		int jour = Integer.parseInt(textField0.getText());
    		int mois = Integer.parseInt(textField1.getText());
    		int annee = Integer.parseInt(textField2.getText());
            Date date = new Date(0,0,0);
            date.setYear(annee-1900);
            date.setDate(jour);
            date.setMonth(mois-1);
            if (verifierDate(jour, mois, annee))
            {
            	graphAC.infoBillet(date,nbrBillet, getClasse(),textField3.getText().trim(),textField4.getText().trim(),choiceBox0.getValue(), choiceBox.getValue() ,radioButton1.isSelected());
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
	
	private int getClasse()
	{
		if (radioButton1.isSelected())
			return 1;
		else
			return 2;
	}
}