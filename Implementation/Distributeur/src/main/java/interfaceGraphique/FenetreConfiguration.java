package interfaceGraphique;

import Main.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class FenetreConfiguration extends Pane 
{ 
    private static FenetreConfiguration instance;
    private RadioButton radioButton, radioButton0, radioButton1, radioButton2, radioButton3, radioButton4;
    private CheckBox checkBox;
    private TextField textField, textField0;
    private double tVoulueHauteur = 450;
    private double tVoulueLargeur = 600;
    private double rapportHauteur = tVoulueHauteur/450;
    private double rapportLargeur = tVoulueLargeur/600;

    private FenetreConfiguration() 
    {
        VBox vBox = new VBox();
        Text text = new Text();
        Text text0 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        Text text1 = new Text();
        radioButton2 = new RadioButton();
        radioButton3 = new RadioButton();
        radioButton4 = new RadioButton();
        checkBox = new CheckBox();
        HBox hBox = new HBox();
        Text text2 = new Text();
        Text text3 = new Text();
        textField = new TextField();
        textField0 = new TextField();
        Button button = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*rapportHauteur);
        setPrefWidth(600.0*rapportLargeur);

        vBox.setLayoutX(50.0*rapportLargeur);
        vBox.setLayoutY(10.0*rapportHauteur);
        vBox.setPrefHeight(328.0*rapportHauteur);
        vBox.setPrefWidth(516.0*rapportLargeur);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez vos composants optionnels :");
        text.setFont(new Font("System Bold", 18.0*rapportHauteur));
        VBox.setMargin(text, new Insets(0.0, 0.0, 25.0*rapportHauteur, 0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Clavier et écran :");
        text0.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(text0, new Insets(0.0, 0.0, 5.0*rapportHauteur, 25.0*rapportLargeur));

        radioButton.setMnemonicParsing(false);
        radioButton.setSelected(true);
        radioButton.setText("Clavier et écran tactile");
        radioButton.setFont(new Font(15.0*rapportHauteur));
        radioButton.setSelected(true);
        VBox.setMargin(radioButton, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Clavier et écran non tactile");
        radioButton0.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(radioButton0, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("Ecran tactile uniquement");
        radioButton1.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(radioButton1, new Insets(0.0, 0.0, 15.0*rapportHauteur, 40.0*rapportLargeur));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);
        radioButton1.setToggleGroup(t1);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Fentes à monnaie :");
        text1.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(text1, new Insets(0.0, 0.0, 5.0*rapportHauteur, 25.0*rapportLargeur));

        radioButton2.setMnemonicParsing(false);
        radioButton2.setSelected(true);
        radioButton2.setText("Fentes à pièces et à billets");
        radioButton2.setFont(new Font(15.0*rapportHauteur));
        radioButton2.setSelected(true);
        VBox.setMargin(radioButton2, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        radioButton3.setMnemonicParsing(false);
        radioButton3.setText("Fente à pièce uniquement");
        radioButton3.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(radioButton3, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        radioButton4.setMnemonicParsing(false);
        radioButton4.setText("Aucune fente");
        radioButton4.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(radioButton4, new Insets(0.0, 0.0, 15.0*rapportHauteur, 40.0*rapportLargeur));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton2.setToggleGroup(t2);
        radioButton3.setToggleGroup(t2);
        radioButton4.setToggleGroup(t2);

        checkBox.setMnemonicParsing(false);
        checkBox.setText("Scanneur de codes");
        checkBox.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(checkBox, new Insets(0.0, 0.0, 0.0, 25.0*rapportLargeur));
        
        text2.setText("Dimensions de la fenêtre de simulation :     ");
        text3.setText("  x  ");
        text2.setFont(new Font(15.0*rapportHauteur));
        text3.setFont(new Font(15.0*rapportHauteur));
        hBox.getChildren().addAll(text2, textField, text3, textField0);
        VBox.setMargin(hBox, new Insets(15.0*rapportHauteur, 0.0, 15.0*rapportHauteur, 0.0));

        button.setLayoutX(515.0*rapportLargeur);
        button.setLayoutY(369.0*rapportHauteur);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0*rapportHauteur);
        button.setPrefWidth(75.0*rapportLargeur);
        button.setFont(new Font(15.0*rapportHauteur));
        button.setText("Valider");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	StackPane root = new StackPane();
            	Stage stage = new Stage();
            	FenetreSimulation.getInstance().setParametre();
            	root.getChildren().add(FenetreSimulation.getInstance());
                Scene scene = new Scene(root, FenetreSimulation.getInstance().getRapportLarg()*1300, FenetreSimulation.getInstance().getRapportHaut()*800);
                scene.setFill(javafx.scene.paint.Color.WHITE);
                stage.setResizable(false);
                stage.setScene(scene);
                stage.setTitle("Fenêtre de simulation");
                stage.show();
                Main.getStage().close();
            }
        });

        vBox.getChildren().addAll(text, text0, radioButton, radioButton0, radioButton1, text1, radioButton2, radioButton3, radioButton4, checkBox, hBox);
        getChildren().addAll(vBox, button);
    }
    
    public static FenetreConfiguration getInstance() 
    {
    	if (instance == null)
    		instance = new FenetreConfiguration();
    	return instance;
    }
    
    public boolean ecranEtClavier()
    {
    	if (radioButton.isSelected())
    		return true;
    	return false;
    }
    
    public boolean clavierEtNonEcran()
    {
    	if (radioButton0.isSelected())
    		return true;
    	return false;
    }
    
    public boolean ecranEtNonClavier()
    {
    	if (radioButton1.isSelected())
    		return true;
    	return false;
    }
    
    public boolean deuxFentes()
    {
    	if (radioButton2.isSelected())
    		return true;
    	return false;
    }
    
    public boolean fentePiece()
    {
    	if (radioButton3.isSelected())
    		return true;
    	return false;
    }
    
    public boolean aucuneFente()
    {
    	if (radioButton4.isSelected())
    		return true;
    	return false;
    }
    
    public boolean scanneur()
    {
    	if (checkBox.isSelected())
    		return true;
    	return false;
    }

	public double getRapportLarg() 
	{
		return rapportLargeur;
	}
	public double getRapportHaut() 
	{
		return rapportHauteur;
	}
	
	public double getHauteur()
	{
		if (textField0.getText().length() == 0 || Double.valueOf(textField0.getText()) < 720)
		{
			textField0.setText("720");
		}
		return Double.valueOf(textField0.getText());
	}
	public double getLargeur()
	{
		if (textField.getText().length() == 0 || Double.valueOf(textField.getText()) < 1280)
		{
			textField.setText("1280");
		}
		return Double.valueOf(textField.getText());
	}
}