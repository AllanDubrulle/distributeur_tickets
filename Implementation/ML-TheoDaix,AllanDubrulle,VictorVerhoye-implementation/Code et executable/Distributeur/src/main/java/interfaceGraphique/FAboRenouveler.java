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

/**
 * Classe FAboRenouveler
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FAboRenouveler extends Ecran 
{
	private TextField zoneTexte;
	private RadioButton boutonChoix, boutonChoix0, boutonChoix1, boutonChoix2;
	private Text texte10;
	private Button bouton1;
	
	public FAboRenouveler(boolean scanneur, double hauteur, double largeur)
	{
		Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        HBox hBox0 = new HBox();
        Text texte = new Text();
        zoneTexte = new TextField();
        HBox hBox1 = new HBox();
        Text texte0 = new Text();
        boutonChoix = new RadioButton();
        boutonChoix0 = new RadioButton();
        boutonChoix1 = new RadioButton();
        boutonChoix2 = new RadioButton();
        Text texte1 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
        texte10 = new Text();
        bouton1 = new Button();

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

        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Numero de l'abonnement : ");
        texte.setWrappingWidth(180*largeur);
        texte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte, new Insets(0.0));

        zoneTexte.setPrefHeight(31.0*hauteur);
        zoneTexte.setPrefWidth(250.0*largeur);
        zoneTexte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte, new Insets(0.0, 0.0, 10.0*hauteur, 20.0*largeur));
        
        bouton1.setLayoutX(520.0*largeur);
        bouton1.setLayoutY(155.0*hauteur);
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(120.0*largeur);
        bouton1.setText("Scanner code");
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            	{
            		if(graphAC.codeScanneurDispo())
            		{
            			graphAC.choixScannerCode();
            			texte10.setText("");
            		}
            		else
            			texte10.setText("Cet appareil n'est pas equipe d'un scanneur");
            	}   	
            }
        });

        hBox1.setPrefHeight(41.0*hauteur);
        hBox1.setPrefWidth(725.0*largeur);

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Validite de l'abonnement :");
        texte0.setWrappingWidth(180*largeur);
        texte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte0, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        boutonChoix.setMnemonicParsing(false);
        boutonChoix.setText("1 mois");
        boutonChoix.setFont(new Font(15.0*hauteur));

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
        hBox1.setPadding(new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        boutonChoix.setToggleGroup(t1);
        boutonChoix0.setToggleGroup(t1);
        boutonChoix1.setToggleGroup(t1);
        boutonChoix2.setToggleGroup(t1);
        boutonChoix.setSelected(true);

        texte1.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte1.setLayoutX(54.0*largeur);
        texte1.setLayoutY(83.0*hauteur);
        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Renouveler un abonnement");
        texte1.setUnderline(true);
        texte1.setFont(new Font("System Bold", 22.0*hauteur));

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
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            	{
            		try 
            		{
            			int verifAbo = Integer.parseInt(zoneTexte.getText());
            			graphAC.infoAboRen(getValidite(), String.valueOf(verifAbo));
            			graphAC.choixValider();
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
		texte10.setWrappingWidth(280.0*largeur);	
		texte10.setFill(javafx.scene.paint.Color.RED);	
		texte10.setLayoutX(260.0*largeur);	
		texte10.setLayoutY(304.0*hauteur);
        
		if (!scanneur)
			bouton1.setDisable(true);
		
        hBox0.getChildren().addAll(texte, zoneTexte);
        hBox1.getChildren().addAll(texte0, boutonChoix, boutonChoix0, boutonChoix1, boutonChoix2);
        vBox.getChildren().addAll(hBox, hBox0, hBox1);
        getChildren().addAll(rectangle, vBox, texte1, bouton, bouton0, texte10, bouton1);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
    }

	public void actionClavier(int a) 
	{
		if (pos == 0)
		{
			String s = zoneTexte.getText();
			zoneTexte.setText(s + a);
		}
		else
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
		
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		if (pos == 2)
		{
			zoneTexte.requestFocus();
			pos = 0;
		}
		else
		{
			if (pos == 0)
				boutonChoix.requestFocus();
			else
				bouton1.requestFocus();
			pos ++;
		}
	}
	
	public void actionEspace()
	{
		if (pos == 2)
			graphAC.choixScannerCode();
	}

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = zoneTexte.getText();
			if (s.length()>0)
				zoneTexte.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		try 
    	{
    		int verifAbo = Integer.parseInt(zoneTexte.getText());
			graphAC.infoAboRen(getValidite(), String.valueOf(verifAbo));
        	graphAC.choixValider();
		} 
    	catch (NumberFormatException | ErreurDEncodage e) 
    	{
    		texte10.setText("Les donnees saisies sont incorrectes");		
		}
	}
	
	/**
	 * 	Permet de retourner le nombre de mois de la validite
	 * 	@return validite le nombre de mois de la validite
	 */
	public int getValidite()
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
	
	/**
	 * 	Permet de remplir la zone de texte avec le numero d'abonnement scanne (choisi dans
	 * 	l'autre fenetre)
	 * 	@param numAbo le numero d'abonnement a mettre dans la zone de texte
	 */
	public void setNumAbo(String numAbo)
	{
		zoneTexte.setText(numAbo);
	}
	
	public void mettreToutAJour()
	{
		if(graphAC.estTactile())
		{
			zoneTexte.setOnMouseClicked(e -> {pos = 0;});
			boutonChoix.setOnMouseClicked(e -> {pos = 1;});
			boutonChoix0.setOnMouseClicked(e -> {pos = 1;});
			boutonChoix1.setOnMouseClicked(e -> {pos = 1;});
			boutonChoix2.setOnMouseClicked(e -> {pos = 1;});
		}
	}
}
