package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;

class FAboRenouvScanne extends Ecran 
{
    private RadioButton radioButton, radioButton0, radioButton1, radioButton2;
    private Text text2;
    
    public FAboRenouvScanne(FChoixAbo fenAbo, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text text = new Text();
        text2 = new Text();
        HBox hBox1 = new HBox();
        Text text0 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        radioButton2 = new RadioButton();
        Text text1 = new Text();
        Button button = new Button();
        Button button0 = new Button();

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
        text.setText("Num�ro de l'abonnement : ");
        text.setWrappingWidth(180*largeur);
        text.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text, new Insets(0.0));
        
        text2.setText(fenAbo.getNumAbo());
        text2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(text2, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

        hBox1.setPrefHeight(41.0*hauteur);
        hBox1.setPrefWidth(725.0*largeur);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Validit� de l'abonnement :");
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
        button0.setFont(new Font(15.0*hauteur));
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choixValiderRenouvAboScanne();
            }
        });

        hBox0.getChildren().addAll(text, text2);
        hBox1.getChildren().addAll(text0, radioButton, radioButton0, radioButton1, radioButton2);
        vBox.getChildren().addAll(hBox, hBox0, hBox1);
        getChildren().addAll(rectangle, vBox, text1, button, button0);
    }
    
    public void actionClavier(String a) {}

	public void actionClavier(int a) 
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

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() 
	{
		graphAC.choixValiderRenouvAboScanne();
	}
	
	public String getNumAbo()
	{
		return text2.getText();
	}
	
	public String getValidite()
	{
		if (radioButton.isSelected())
			return "1 mois";
		else if (radioButton0.isSelected())
			return "3 mois";
		else if (radioButton1.isSelected())
			return "6 mois";
		else
			return "12 mois";
	}
}