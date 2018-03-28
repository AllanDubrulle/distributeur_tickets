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

class FAboAchat extends Ecran 
{
    private TextField zoneTexte, zoneTexte0, zoneTexte1, zoneTexte2;
    private RadioButton boutonChoix, boutonChoix0, boutonChoix1, boutonChoix2, boutonChoix3, boutonChoix4;
    private int pos = 0;
	private ChoiceBox<String> menuDeroulant, menuDeroulant0;
	private Text texte10;
    
    public FAboAchat(double hauteur, double largeur) 
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
        zoneTexte2 = new TextField();
        HBox hBox4 = new HBox();
        Text texte4 = new Text();
        boutonChoix = new RadioButton();
        boutonChoix0 = new RadioButton();
        boutonChoix1 = new RadioButton();
        boutonChoix2 = new RadioButton();
        HBox hBox5 = new HBox();
        Text texte5 = new Text();
        boutonChoix3 = new RadioButton();
        boutonChoix4 = new RadioButton();
        HBox hBox6 = new HBox();
        Text texte6 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
		Text texte7 = new Text();	
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
        texte.setLayoutX(54.0*largeur);
        texte.setLayoutY(55.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Achat d'un abonnement");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        vBox.setLayoutX(60.0*largeur);
        vBox.setLayoutY(70.0*hauteur);
        vBox.setPrefHeight(219.0*hauteur);
        vBox.setPrefWidth(711.0*largeur);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(711.0*largeur);

        hBox0.setPrefHeight(12.0*hauteur);
        hBox0.setPrefWidth(711.0*largeur);

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Nom : ");
        texte0.setWrappingWidth(180*largeur);
        texte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte0, new Insets(0.0));

        zoneTexte.setPrefHeight(31.0*hauteur);
        zoneTexte.setPrefWidth(300.0*largeur);
        zoneTexte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte, new Insets(0.0, 0.0, 10.0*hauteur, 20*largeur));

        hBox1.setPrefHeight(12.0*hauteur);
        hBox1.setPrefWidth(711.0*largeur);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setWrappingWidth(180*largeur);
        texte1.setText("Numero de registre national : ");
        texte1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte1, new Insets(0.0));

        zoneTexte0.setPrefHeight(31.0*hauteur);
        zoneTexte0.setPrefWidth(300.0*largeur);
        zoneTexte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte0, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));

        hBox2.setPrefHeight(17.0*hauteur);
        hBox2.setPrefWidth(244.0*largeur);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Gare de depart :");
        texte2.setWrappingWidth(180*largeur);
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(0.0, 0.0*largeur, 0.0, 0.0));

        zoneTexte1.setPrefWidth(300.0*largeur);
        zoneTexte1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        hBox2.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("Gare d'arrivee :");
        texte3.setWrappingWidth(180*largeur);
        texte3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        zoneTexte2.setPrefWidth(300.0*largeur);
        zoneTexte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte2, new Insets(0.0, 0.0, 0.0, 0.0));
        hBox3.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox4.setPrefHeight(41.0*hauteur);
        hBox4.setPrefWidth(725.0*largeur);

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Validite de l'abonnement :");
        texte4.setWrappingWidth(180*largeur);
        texte4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte4, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        boutonChoix.setMnemonicParsing(false);
        boutonChoix.setText("1 mois");
        boutonChoix.setFont(new Font(15.0*hauteur));
        boutonChoix.setSelected(true);

        boutonChoix0.setMnemonicParsing(false);
        boutonChoix0.setText("3 mois");
        boutonChoix0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(boutonChoix0, new Insets(0.0, 15.0*largeur, 0.0, 65.0*largeur));

        boutonChoix1.setMnemonicParsing(false);
        boutonChoix1.setText("6 mois");
        boutonChoix1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(boutonChoix1, new Insets(0.0, 15.0*largeur, 0.0, 50.0*largeur));

        boutonChoix2.setMnemonicParsing(false);
        boutonChoix2.setText("12 mois");
        boutonChoix2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(boutonChoix2, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox4.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        boutonChoix.setToggleGroup(t1);
        boutonChoix0.setToggleGroup(t1);
        boutonChoix1.setToggleGroup(t1);
        boutonChoix2.setToggleGroup(t1);

        hBox5.setPrefHeight(17.0*hauteur);
        hBox5.setPrefWidth(244.0*largeur);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText("Classe :");
        texte5.setWrappingWidth(180*largeur);
        texte5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte5, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        boutonChoix3.setMnemonicParsing(false);
        boutonChoix3.setText("1e classe");
        boutonChoix3.setFont(new Font(15.0*hauteur));
        boutonChoix3.setSelected(true);

        boutonChoix4.setMnemonicParsing(false);
        boutonChoix4.setText("2e classe");
        boutonChoix4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(boutonChoix4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        hBox5.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        boutonChoix3.setToggleGroup(t2);
        boutonChoix4.setToggleGroup(t2);

        hBox6.setPrefHeight(17.0*hauteur);
        hBox6.setPrefWidth(244.0*largeur);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("Reduction :");
        texte6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte6, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        menuDeroulant.setPrefWidth(225.0*largeur);	
        menuDeroulant.setPrefHeight(30.0*hauteur);	
        menuDeroulant.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(menuDeroulant, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        
        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);	
        texte7.setStrokeWidth(0.0);	
        texte7.setText("Type d'abonnement :");	
        texte7.setWrappingWidth(180*largeur);	
        texte7.setFont(new Font(15.0*hauteur));	
        HBox.setMargin(texte7, new Insets(0.0, 20.0*largeur, 0.0, 0.0));
        
        menuDeroulant0.setPrefWidth(125.0*largeur);	
        menuDeroulant0.setPrefHeight(30.0*hauteur);	
        menuDeroulant0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));

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
            			if (zoneTexte0.getText().trim().length() == 11 && verifierNom(zoneTexte.getText().trim()))
            			{	
            				graphAC.infoAbo(getValidite(), zoneTexte1.getText().trim(), zoneTexte2.getText().trim(), getClasse(), menuDeroulant.getValue(), menuDeroulant0.getValue(), zoneTexte.getText(), zoneTexte0.getText().trim());
            				graphAC.choixValider();	
            			}
            			else 
            			{
            				texte10.setText("Le nom saisi est incorrect");
            			}
            		}	
            		catch (NumberFormatException e)	
            		{	
            			texte10.setText("Le numero de registre national saisi est incorrect");
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
		texte10.setLayoutY(384.0*hauteur);
		
        hBox0.getChildren().addAll(texte0, zoneTexte);
        hBox1.getChildren().addAll(texte1, zoneTexte0);
        hBox2.getChildren().addAll(texte2, zoneTexte1);
        hBox3.getChildren().addAll(texte3, zoneTexte2);
        hBox4.getChildren().addAll(texte4, boutonChoix, boutonChoix0, boutonChoix1, boutonChoix2);
        hBox5.getChildren().addAll(texte5, boutonChoix3, boutonChoix4);
        hBox6.getChildren().addAll(texte7, menuDeroulant0, texte6, menuDeroulant);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);
        getChildren().addAll(rectangle, texte, vBox, bouton, bouton0, texte10);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
    }
    
    public void actionClavier(String a) 
    {
    	String s;
    	if (pos == 0) 
    	{
    		s = zoneTexte.getText();
    		zoneTexte.setText(s + a);
    	}
    	else if(pos == 2) 
    	{
    		s = zoneTexte1.getText();
    		zoneTexte1.setText(s + a);
    	}
    	else if(pos == 3) 
    	{
    		s = zoneTexte2.getText();
    		zoneTexte2.setText(s + a);
    	}
    }

	public void actionClavier(int a) 
	{
		if (pos == 1)
		{
			String s = zoneTexte0.getText();
			zoneTexte0.setText(s + a);
			if (s.length() == 10)
				actionSuivant();
		}
		if (pos == 4) 
		{
			if (a == 1)
	    		boutonChoix.setSelected(true);
			else if (a == 2)
	    		boutonChoix0.setSelected(true);
			else if (a == 3)
	    		boutonChoix1.setSelected(true);
			else if (a == 4) 
	    		boutonChoix2.setSelected(true);
		}
		else if (pos == 5) 
		{
			if (a == 1) 
	    		boutonChoix3.setSelected(true);
			else if (a == 2) 
	    		boutonChoix4.setSelected(true);
		}
		else if (pos == 6)	
		{	
			if (a < GraphiqueACoeurImpl.getInstance().getTypes().length)	
				menuDeroulant0.setValue(GraphiqueACoeurImpl.getInstance().getTypes()[a]);	
		}	
		else if (pos == 7)	
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
		if(pos == 7) 
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
				zoneTexte2.requestFocus();
			else if (pos == 3)
				boutonChoix.requestFocus();
			else if (pos == 4)
				boutonChoix3.requestFocus();
			else if (pos == 5)
				menuDeroulant0.requestFocus();
			else
				menuDeroulant.requestFocus();
			pos++;
		}
	}

	public void actionEspace() 
	{
		String s;
    	if (pos == 0) 
    	{
    		s = zoneTexte.getText();
    		zoneTexte.setText(s + " ");
    	}
    	else if(pos == 1) 
    	{
    		s = zoneTexte0.getText();
    		zoneTexte0.setText(s + " ");
    	}
    	else if(pos == 2) 
    	{
    		s = zoneTexte1.getText();
    		zoneTexte1.setText(s + " ");
    	}
    	else if(pos == 3) 
    	{
    		s = zoneTexte2.getText();
    		zoneTexte2.setText(s + " ");
    	}
	}

	public void actionEffacer() 
	{
		String s;
    	if (pos == 0) 
    	{
    		s = zoneTexte.getText();
    		if (s.length()>0)
    			zoneTexte.setText(s.substring(0, s.length()-1));
    	}
    	else if(pos == 1) 
    	{
    		s = zoneTexte0.getText();
    		if (s.length()>0)
    			zoneTexte0.setText(s.substring(0, s.length()-1));
    	}
    	else if(pos == 2) 
    	{
    		s = zoneTexte1.getText();
    		if (s.length()>0)
    			zoneTexte1.setText(s.substring(0, s.length()-1));
    	}
    	else if(pos == 3) 
    	{
    		s = zoneTexte2.getText();
    		if (s.length()>0)
    			zoneTexte2.setText(s.substring(0, s.length()-1));
    	}
	}
	
	public void actionEntrer() 
	{
		try
		{	
			if (zoneTexte0.getText().trim().length() == 11 && verifierNom(zoneTexte.getText().trim()))
			{	
				graphAC.infoAbo(getValidite(), zoneTexte1.getText().trim(), zoneTexte2.getText().trim(), getClasse(), menuDeroulant.getValue(), menuDeroulant0.getValue(), zoneTexte.getText(), zoneTexte0.getText().trim());
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
	
	private int getValidite()
	{
		if (boutonChoix.isSelected())
			return 1;
		else if (boutonChoix0.isSelected())
			return 3;
		else if (boutonChoix1.isSelected())
			return 6;
		else
			return 12;
	}
	
	private int getClasse()
	{
		if (boutonChoix3.isSelected())
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
			zoneTexte2.setOnMouseClicked(e -> {pos = 3;});
			boutonChoix.setOnMouseClicked(e -> {pos = 4;});
			boutonChoix0.setOnMouseClicked(e -> {pos = 4;});
			boutonChoix1.setOnMouseClicked(e -> {pos = 4;});
			boutonChoix2.setOnMouseClicked(e -> {pos = 4;});
			boutonChoix3.setOnMouseClicked(e -> {pos = 5;});
			boutonChoix4.setOnMouseClicked(e -> {pos = 5;});
			menuDeroulant0.setOnMouseClicked(e -> {pos = 6;});
			menuDeroulant.setOnMouseClicked(e -> {pos = 7;});
		}
	}
}