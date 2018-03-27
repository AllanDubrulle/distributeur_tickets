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

class FPassIllimite extends Ecran 
{
    private TextField zoneTexte, zoneTexte0;
    private RadioButton boutonChoix, boutonChoix1;
    private int pos = 0;
    private ChoiceBox<String> meuDeroulant, meuDeroulant0;
    private Text texte10;
    
    public FPassIllimite(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text texte0 = new Text();
        zoneTexte = new TextField();
        HBox hBox3 = new HBox();
        Text texte3 = new Text();
        boutonChoix = new RadioButton();
        boutonChoix1 = new RadioButton();
        HBox hBox4 = new HBox();
        Text texte4 = new Text();
        HBox hBox5 = new HBox();
        Text texte5 = new Text();
        zoneTexte0 = new TextField();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Text texte6 = new Text();	
        meuDeroulant = new ChoiceBox<String>();	
        meuDeroulant0 = new ChoiceBox<String>();
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
        texte.setLayoutX(44.0*largeur);
        texte.setLayoutY(63.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Achat d'un pass avec choix du nombre de jours");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(78.0*largeur);
        vBox.setLayoutY(98.0*hauteur);
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
        boutonChoix.setSelected(true);
        boutonChoix.setFont(new Font(15.0*hauteur));

        boutonChoix1.setMnemonicParsing(false);
        boutonChoix1.setText("2e classe");
        boutonChoix1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(boutonChoix1, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t = new ToggleGroup();
        boutonChoix.setToggleGroup(t);
        boutonChoix1.setToggleGroup(t);

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0);

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Reduction :");
        texte4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        meuDeroulant.setPrefWidth(225.0*largeur);
        meuDeroulant.setPrefHeight(31.0*hauteur);
        meuDeroulant.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(meuDeroulant, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        texte6.setStrokeWidth(0.0);	
        texte6.setText("Type du pass :");	
        texte6.setWrappingWidth(180.0*largeur);	
        texte6.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(texte5, new Insets(0.0));	
        
        meuDeroulant0.setPrefWidth(125.0*largeur);	
        meuDeroulant0.setPrefHeight(31.0*hauteur);	
        meuDeroulant0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));	
        HBox.setMargin(meuDeroulant0, new Insets(0.0, 0.0, 0.0, 20.0*largeur));	
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(12.0*hauteur);
        hBox5.setPrefWidth(711.0*largeur);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText("Nombre de jours de validite : ");
        texte5.setWrappingWidth(180.0*largeur);
        texte5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte5, new Insets(0.0));

        zoneTexte0.setPrefHeight(31.0*hauteur);
        zoneTexte0.setPrefWidth(85.0*largeur);
        zoneTexte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte0, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

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

        bouton0.setLayoutX(702.5*largeur);
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
            			if (Integer.parseInt(zoneTexte0.getText()) == 0 || Integer.parseInt(zoneTexte0.getText()) >= 100)
            				throw new ErreurDEncodage("Erreur nombre de jours de validite");
            			if (verifierNom(zoneTexte.getText().trim()))
            			{
            				graphAC.infoPassIllimite(zoneTexte.getText(), getClasse(), meuDeroulant.getValue(), meuDeroulant0.getValue(), Integer.parseInt(zoneTexte0.getText()));
            				graphAC.choixValider();
            			}
            			else
            			{
            				texte10.setText("Le nom saisi est incorrect");
            			}
            		} 
            		catch (NumberFormatException e) 
            		{
            			texte10.setText("Les donnees saisies sont incorrectes");
            		}
            		catch (ErreurDEncodage e)
            		{
            			texte10.setText(e.getMessage());
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
        hBox3.getChildren().addAll(texte3, boutonChoix, boutonChoix1);
        hBox4.getChildren().addAll(texte6, meuDeroulant0, texte4, meuDeroulant);
        hBox5.getChildren().addAll(texte5, zoneTexte0);
        vBox.getChildren().addAll(hBox, hBox0, hBox3, hBox4, hBox5);
        getChildren().addAll(rectangle, texte, vBox, bouton, bouton0, texte10);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		zoneTexte.setText(zoneTexte.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 1)
		{
			if (a == 1)
				boutonChoix.setSelected(true);
			else if (a == 2)
				boutonChoix1.setSelected(true);
		}
		else if (pos == 2)
		{
			if (a < GraphiqueACoeurImpl.getInstance().getTypes().length)
				meuDeroulant0.setValue(GraphiqueACoeurImpl.getInstance().getTypes()[a]);
		}
		else if (pos == 3)
		{
			if (a < GraphiqueACoeurImpl.getInstance().getReductions().length)
				meuDeroulant.setValue(GraphiqueACoeurImpl.getInstance().getReductions()[a]);
		}
    	else if (pos == 4)
    		zoneTexte0.setText(zoneTexte0.getText() + a);
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if (pos == 4)
		{
			pos = 0;
			zoneTexte.requestFocus();
		}
		else
		{
			if (pos == 0)
				boutonChoix.requestFocus();
			else if (pos == 1)
				meuDeroulant0.requestFocus();
			else if (pos == 2)	
				meuDeroulant.requestFocus();
			else
				zoneTexte0.requestFocus();
			pos ++;
		}
	}

	public void actionEspace() 
	{
    	if (pos == 0)
    		zoneTexte.setText(zoneTexte.getText() + " ");
    }

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = zoneTexte.getText();
			if (s.length() > 0)
				zoneTexte.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 4)
		{
			String s = zoneTexte0.getText();
			if (s.length() > 0)
				zoneTexte0.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		try 
    	{
    		if (verifierNom(zoneTexte.getText().trim()))
			{
    			graphAC.infoPassIllimite(zoneTexte.getText(), getClasse(), meuDeroulant.getValue(), meuDeroulant0.getValue(), Integer.parseInt(zoneTexte0.getText()));
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
			boutonChoix.setOnMouseClicked(e -> {pos = 1;});
			boutonChoix1.setOnMouseClicked(e -> {pos = 1;});
			meuDeroulant0.setOnMouseClicked(e -> {pos = 2;});
			meuDeroulant.setOnMouseClicked(e -> {pos = 2;});
			zoneTexte0.setOnMouseClicked(e -> {pos = 3;});
		}
	}
}