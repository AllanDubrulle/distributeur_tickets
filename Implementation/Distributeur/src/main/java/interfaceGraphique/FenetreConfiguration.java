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

public class FenetreConfiguration extends Ecran 
{ 
    private static FenetreConfiguration instance;
    private RadioButton radioButton, radioButton0, radioButton1, radioButton2, radioButton3, radioButton4;
    private CheckBox checkBox;

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
        Button button = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        vBox.setLayoutX(50.0);
        vBox.setLayoutY(30.0);
        vBox.setPrefHeight(328.0);
        vBox.setPrefWidth(516.0);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez vos composants optionnels :");
        text.setFont(new Font("System Bold", 18.0));
        VBox.setMargin(text, new Insets(0.0, 0.0, 25.0, 0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Clavier et écran :");
        VBox.setMargin(text0, new Insets(0.0, 0.0, 5.0, 25.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setSelected(true);
        radioButton.setText("Clavier et écran tactile");
        radioButton.setSelected(true);
        VBox.setMargin(radioButton, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Clavier et écran non tactile");
        VBox.setMargin(radioButton0, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("Ecran tactile uniquement");
        VBox.setMargin(radioButton1, new Insets(0.0, 0.0, 15.0, 40.0));
        
        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);
        radioButton1.setToggleGroup(t1);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Fentes à monnaie :");
        VBox.setMargin(text1, new Insets(0.0, 0.0, 5.0, 25.0));

        radioButton2.setMnemonicParsing(false);
        radioButton2.setSelected(true);
        radioButton2.setText("Fentes à pièces et à billets");
        radioButton2.setSelected(true);
        VBox.setMargin(radioButton2, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton3.setMnemonicParsing(false);
        radioButton3.setText("Fente à pièce uniquement");
        VBox.setMargin(radioButton3, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton4.setMnemonicParsing(false);
        radioButton4.setText("Aucune fente");
        VBox.setMargin(radioButton4, new Insets(0.0, 0.0, 15.0, 40.0));
        
        ToggleGroup t2 = new ToggleGroup();
        radioButton2.setToggleGroup(t2);
        radioButton3.setToggleGroup(t2);
        radioButton4.setToggleGroup(t2);

        checkBox.setMnemonicParsing(false);
        checkBox.setText("Scanneur de codes");
        VBox.setMargin(checkBox, new Insets(0.0, 0.0, 0.0, 25.0));

        button.setLayoutX(515.0);
        button.setLayoutY(359.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
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

        vBox.getChildren().addAll(text, text0, radioButton, radioButton0, radioButton1, text1, radioButton2, radioButton3, radioButton4, checkBox);
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
    
	public void actionClavier(String a) {}

	public void actionClavier(int a) {}

	public void actionRetour() {}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}