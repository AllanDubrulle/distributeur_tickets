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

/**
 * Classe FPass10Trajets2Gares
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FPass10Trajets2Gares extends Ecran 
{
    private TextField zoneTexte, zoneTexte0, zoneTexte1;
    private RadioButton boutonChoix, boutonChoix0;
    private ChoiceBox<String> menuDeroulant, menuDeroulant0;
    private Text texte10;

    public FPass10Trajets2Gares(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text texte0 = new Text();
        zoneTexte = new TextField();
        HBox hBox1 = new HBox();
        Text texte1 = new Text();
        zoneTexte0 = new TextField();
        HBox hBox2 = new HBox();
        Text texte2 = new Text();
        zoneTexte1 = new TextField();
        HBox hBox3 = new HBox();
        Text texte3 = new Text();
        boutonChoix = new RadioButton();
        boutonChoix0 = new RadioButton();
        HBox hBox4 = new HBox();
        Text texte4 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Text texte5 = new Text();
        menuDeroulant = new ChoiceBox<String>();	
        menuDeroulant0 = new ChoiceBox<String>();
        texte10 = new Text();

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

        texte.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte.setLayoutX(24.0*largeur);
        texte.setLayoutY(64.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Achat d'un pass dix trajets entre deux gares predefinies");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(53.0*largeur);
        vBox.setLayoutY(109.0*hauteur);
        vBox.setPrefHeight(150.0*hauteur);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Nom : ");
        texte0.setWrappingWidth(180.0*largeur);
        texte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte0, new Insets(0.0));

        zoneTexte.setPrefHeight(31.0*hauteur);
        zoneTexte.setPrefWidth(300.0*largeur);
        zoneTexte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

        hBox1.setPrefHeight(17.0*hauteur);
        hBox1.setPrefWidth(244.0*largeur);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Gare de depart :");
        texte1.setWrappingWidth(180.0*largeur);
        texte1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte1, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        zoneTexte0.setPrefWidth(300.0*largeur);
        zoneTexte0.setPrefHeight(31.0*hauteur);
        zoneTexte0.setFont(new Font(15.0*hauteur));
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Gare d'arrivee :");
        texte2.setWrappingWidth(180.0*largeur);
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        zoneTexte1.setPrefWidth(300.0*largeur);
        zoneTexte1.setPrefHeight(31.0*hauteur);
        zoneTexte1.setFont(new Font(15.0*hauteur));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("Classe :");
        texte3.setWrappingWidth(180.0*largeur);
        texte3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        boutonChoix.setMnemonicParsing(false);
        boutonChoix.setText("1e classe");
        boutonChoix.setFont(new Font(15.0*hauteur));
        boutonChoix.setSelected(true);

        boutonChoix0.setMnemonicParsing(false);
        boutonChoix0.setText("2e classe");
        boutonChoix0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(boutonChoix0, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t = new ToggleGroup();
        boutonChoix.setToggleGroup(t);
        boutonChoix0.setToggleGroup(t);

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0*largeur);

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Reduction :");
        texte4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        
        menuDeroulant.setPrefWidth(225.0*largeur);	
        menuDeroulant.setPrefHeight(30.0*hauteur);
        menuDeroulant.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(menuDeroulant, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        
        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        texte5.setStrokeWidth(0.0);	
        texte5.setText("Type du pass :");	
        texte5.setWrappingWidth(180.0*largeur);	
        texte5.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(texte5, new Insets(0.0));	
        
        menuDeroulant0.setPrefWidth(125.0*largeur);	
        menuDeroulant0.setPrefHeight(30.0*hauteur);	
        menuDeroulant0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));	
        HBox.setMargin(menuDeroulant0, new Insets(0.0, 0.0, 0.0, 20.0*largeur));	
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        bouton.setLayoutX(23.0*largeur);
        bouton.setLayoutY(354.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(75.0*largeur);
        bouton.setText("Annuler");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            		graphAC.choixAnnuler();
            }
        });

        bouton0.setLayoutX(703.0*largeur);
        bouton0.setLayoutY(354.0*hauteur);
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(75.0*largeur);
        bouton0.setText("Valider");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle(ActionEvent event)
            {
        		if(graphAC.estTactile())
            	{
        			try 
        			{
        				if (verifierNom(zoneTexte.getText().trim()))
        				{
        					graphAC.infoPass10Trajets2Gares(zoneTexte.getText(), zoneTexte0.getText(), zoneTexte1.getText(), getClasse(), menuDeroulant.getValue(), menuDeroulant0.getValue());
        					graphAC.choixValider();
        				}
        				else
        				{
        					texte10.setText("Les donnees saisies sont incorrectes");
        				}
        			}
        			catch (NumberFormatException | ErreurDEncodage e) 
        			{
        				texte10.setText("Les donnees saisies sont incorrectes");
        			}
            	}
        	}
        });

		texte10.setFont(new Font("System Bold", 15.0*hauteur));
		texte10.setWrappingWidth(250.0*largeur);
		texte10.setFill(javafx.scene.paint.Color.RED);
		texte10.setLayoutX(275.0*largeur);
		texte10.setLayoutY(364.0*hauteur);

        hBox0.getChildren().addAll(texte0, zoneTexte);
        hBox1.getChildren().addAll(texte1, zoneTexte0);
        hBox2.getChildren().addAll(texte2, zoneTexte1);
        hBox3.getChildren().addAll(texte3, boutonChoix, boutonChoix0);
        hBox4.getChildren().addAll(texte5, menuDeroulant0, texte4, menuDeroulant);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4);
        getChildren().addAll(rectangle, texte, vBox, bouton, bouton0, texte10);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		zoneTexte.setText(zoneTexte.getText() + a);
    	else if (pos == 1)
    		zoneTexte0.setText(zoneTexte0.getText() + a);
    	else if (pos == 2)
    		zoneTexte1.setText(zoneTexte1.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 3)
		{
			if (a == 1)
				boutonChoix.setSelected(true);
			else if (a == 2)
				boutonChoix0.setSelected(true);
		}
		else if (pos == 4)	
		{	
			if (a < GraphiqueACoeurImpl.getInstance().getTypes().length)	
				menuDeroulant0.setValue(GraphiqueACoeurImpl.getInstance().getTypes()[a]);	
		}	
		else if (pos == 5)	
		{	
			if (a < GraphiqueACoeurImpl.getInstance().getReductions().length)	
				menuDeroulant.setValue(GraphiqueACoeurImpl.getInstance().getReductions()[a]);	
		}
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
			zoneTexte.requestFocus();
		}
		else
		{
			if (pos == 0)
				zoneTexte0.requestFocus();
			else if (pos == 1)
				zoneTexte1.requestFocus();
			else if (pos == 2)
				boutonChoix.requestFocus();
			else if (pos == 3)
				menuDeroulant0.requestFocus();
			else if (pos == 4)	
				menuDeroulant.requestFocus();
			else
				zoneTexte.requestFocus();
			pos ++;
		}
	}

	public void actionEspace() 
	{
    	if (pos == 0)
    		zoneTexte.setText(zoneTexte.getText() + " ");
    	else if (pos == 1)
    		zoneTexte0.setText(zoneTexte0.getText() + " ");
    	else if (pos == 2)
    		zoneTexte1.setText(zoneTexte1.getText() + " ");
    }

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = zoneTexte.getText();
			if (s.length() > 0)
				zoneTexte.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 1)
		{
			String s = zoneTexte0.getText();
			if (s.length() > 0)
				zoneTexte0.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 2)
		{
			String s = zoneTexte1.getText();
			if (s.length() > 0)
				zoneTexte1.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValider();
	}
	
	/**
	 * 	Permet de retourner la classe choisie
	 * 	@return classe 1 s'il s'agit de la 1e classe, 2 s'il s'agit de la seconde
	 */
	private int getClasse()
	{
		if (boutonChoix.isSelected())
			return 1;
		else
			return 2;
	}
	
	public void mettreToutAJour()
	{
		if(graphAC.estTactile())
		{
			zoneTexte.setOnMouseClicked(e -> {pos = 0;});
			zoneTexte0.setOnMouseClicked(e -> {pos = 1;});
			zoneTexte1.setOnMouseClicked(e -> {pos = 2;});
			boutonChoix.setOnMouseClicked(e -> {pos = 3;});
			boutonChoix0.setOnMouseClicked(e -> {pos = 3;});
			menuDeroulant0.setOnMouseClicked(e -> {pos = 4;});
			menuDeroulant.setOnMouseClicked(e -> {pos = 5;});
		}
	}
}