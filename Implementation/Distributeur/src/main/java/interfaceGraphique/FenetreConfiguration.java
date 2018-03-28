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
    private RadioButton boutonChoix, boutonChoix0, boutonChoix1, boutonChoix2, boutonChoix3, boutonChoix4;
    private CheckBox boutonACocher;
    private TextField zoneTexte, zoneTexte0;
    private double tVoulueHauteur = 450;
    private double tVoulueLargeur = 600;
    private double rapportHauteur = tVoulueHauteur/450;
    private double rapportLargeur = tVoulueLargeur/600;

    private FenetreConfiguration() 
    {
        VBox vBox = new VBox();
        Text texte = new Text();
        Text texte0 = new Text();
        boutonChoix = new RadioButton();
       boutonChoix0 = new RadioButton();
        boutonChoix1 = new RadioButton();
        Text texte1 = new Text();
        boutonChoix2 = new RadioButton();
        boutonChoix3 = new RadioButton();
        boutonChoix4 = new RadioButton();
        boutonACocher = new CheckBox();
        HBox hBox = new HBox();
        Text texte2 = new Text();
        Text texte3 = new Text();
        zoneTexte = new TextField();
        zoneTexte0 = new TextField();
        Button bouton = new Button();
        Text texte4 = new Text();

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

        texte.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Choisissez vos composants optionnels :");
        texte.setFont(new Font("System Bold", 18.0*rapportHauteur));
        VBox.setMargin(texte, new Insets(0.0, 0.0, 25.0*rapportHauteur, 0.0));

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Clavier et ecran :");
        texte0.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(texte0, new Insets(0.0, 0.0, 5.0*rapportHauteur, 25.0*rapportLargeur));

        boutonChoix.setMnemonicParsing(false);
        boutonChoix.setSelected(true);
        boutonChoix.setText("Clavier et ecran tactile");
        boutonChoix.setFont(new Font(15.0*rapportHauteur));
        boutonChoix.setSelected(true);
        VBox.setMargin(boutonChoix, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        boutonChoix0.setMnemonicParsing(false);
        boutonChoix0.setText("Clavier et ecran non tactile");
        boutonChoix0.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(boutonChoix0, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        boutonChoix1.setMnemonicParsing(false);
        boutonChoix1.setText("Ecran tactile uniquement");
        boutonChoix1.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(boutonChoix1, new Insets(0.0, 0.0, 15.0*rapportHauteur, 40.0*rapportLargeur));
        
        ToggleGroup t1 = new ToggleGroup();
        boutonChoix.setToggleGroup(t1);
        boutonChoix0.setToggleGroup(t1);
        boutonChoix1.setToggleGroup(t1);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Fentes a monnaie :");
        texte1.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(texte1, new Insets(0.0, 0.0, 5.0*rapportHauteur, 25.0*rapportLargeur));

        boutonChoix2.setMnemonicParsing(false);
        boutonChoix2.setSelected(true);
        boutonChoix2.setText("Fentes a pieces et a billets");
        boutonChoix2.setFont(new Font(15.0*rapportHauteur));
        boutonChoix2.setSelected(true);
        VBox.setMargin(boutonChoix2, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        boutonChoix3.setMnemonicParsing(false);
        boutonChoix3.setText("Fente a piece uniquement");
        boutonChoix3.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(boutonChoix3, new Insets(0.0, 0.0, 5.0*rapportHauteur, 40.0*rapportLargeur));

        boutonChoix4.setMnemonicParsing(false);
        boutonChoix4.setText("Aucune fente");
        boutonChoix4.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(boutonChoix4, new Insets(0.0, 0.0, 15.0*rapportHauteur, 40.0*rapportLargeur));
        
        ToggleGroup t2 = new ToggleGroup();
        boutonChoix2.setToggleGroup(t2);
        boutonChoix3.setToggleGroup(t2);
        boutonChoix4.setToggleGroup(t2);

        boutonACocher.setMnemonicParsing(false);
        boutonACocher.setText("Scanneur de codes");
        boutonACocher.setFont(new Font(15.0*rapportHauteur));
        VBox.setMargin(boutonACocher, new Insets(0.0, 0.0, 0.0, 25.0*rapportLargeur));
        
        texte2.setText("Dimensions de la fenetre de simulation :     ");
        texte3.setText("  x  ");
        texte2.setFont(new Font(15.0*rapportHauteur));
        texte3.setFont(new Font(15.0*rapportHauteur));
        hBox.getChildren().addAll(texte2, zoneTexte, texte3, zoneTexte0);
        VBox.setMargin(hBox, new Insets(15.0*rapportHauteur, 0.0, 15.0*rapportHauteur, 0.0));

        bouton.setLayoutX(515.0*rapportLargeur);
        bouton.setLayoutY(369.0*rapportHauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*rapportHauteur);
        bouton.setPrefWidth(75.0*rapportLargeur);
        bouton.setFont(new Font(15.0*rapportHauteur));
        bouton.setText("Valider");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
                try
            	{
                	StackPane root = new StackPane();
                	Stage stage = new Stage();
                	FenetreSimulation.getInstance().setParametre();
                	root.getChildren().add(FenetreSimulation.getInstance());
                    Scene scene = new Scene(root, FenetreSimulation.getInstance().getRapportLarg()*1350, FenetreSimulation.getInstance().getRapportHaut()*850);
                    scene.setFill(javafx.scene.paint.Color.WHITE);
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.setTitle("Fenetre de simulation");
                    stage.show();
                    Main.getStage().close();
            	}
            	catch (NumberFormatException e)
            	{
            		texte4.setText("Les donnees saisies sont incorrectes");
            		texte4.setFont(new Font("System Bold", 15.0*rapportHauteur));
            		texte4.setWrappingWidth(260.0*rapportLargeur);
            		texte4.setFill(javafx.scene.paint.Color.RED);
            		texte4.setLayoutX(175.0*rapportLargeur);
            		texte4.setLayoutY(379.0*rapportHauteur);
            	}
            }
        });

        vBox.getChildren().addAll(texte, texte0, boutonChoix, boutonChoix0, boutonChoix1, texte1, boutonChoix2, boutonChoix3, boutonChoix4, boutonACocher, hBox);
        getChildren().addAll(vBox, bouton, texte4);
    }
    
    public static FenetreConfiguration getInstance() 
    {
    	if (instance == null)
    		instance = new FenetreConfiguration();
    	return instance;
    }
    
    public boolean ecranEtClavier()
    {
    	if (boutonChoix.isSelected())
    		return true;
    	return false;
    }
    
    public boolean clavierEtNonEcran()
    {
    	if (boutonChoix0.isSelected())
    		return true;
    	return false;
    }
    
    public boolean ecranEtNonClavier()
    {
    	if (boutonChoix1.isSelected())
    		return true;
    	return false;
    }
    
    public boolean deuxFentes()
    {
    	if (boutonChoix2.isSelected())
    		return true;
    	return false;
    }
    
    public boolean fentePiece()
    {
    	if (boutonChoix3.isSelected())
    		return true;
    	return false;
    }
    
    public boolean aucuneFente()
    {
    	if (boutonChoix4.isSelected())
    		return true;
    	return false;
    }
    
    public boolean scanneur()
    {
    	if (boutonACocher.isSelected())
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
		if (zoneTexte0.getText().equals("")||Double.valueOf(zoneTexte0.getText()) < 360)
		{
			zoneTexte0.setText("720");
		}
		return Double.valueOf(zoneTexte0.getText());
	}
	public double getLargeur()
	{
		if (zoneTexte.getText().equals("")||Double.valueOf(zoneTexte.getText()) < 640)
		{
			zoneTexte.setText("1280");
		}
		return Double.valueOf(zoneTexte.getText());
	}
}