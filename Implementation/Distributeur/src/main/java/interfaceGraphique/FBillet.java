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

/**
 * Classe FBillet
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FBillet extends Ecran 
{
	private TextField zoneTexte, zoneTexte0, zoneTexte1, zoneTexte2, zoneTexte3, zoneTexte4;
	private RadioButton choixBouton, choixBouton0, choixBouton1, choixBouton2;
	private int pos = 0;
	private ChoiceBox<String> menuDeroulant, menuDeroulant0;
	private Text texte10;
	private Button bouton1;

    public FBillet(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        Text texte = new Text();
        zoneTexte3 = new TextField();
        HBox hBox0 = new HBox();
        Text texte0 = new Text();
        zoneTexte4 = new TextField();
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        Text texte1 = new Text();
        choixBouton = new RadioButton();
        choixBouton0 = new RadioButton();
        HBox hBox3 = new HBox();
        Text texte2 = new Text();
        choixBouton1 = new RadioButton();
        choixBouton2 = new RadioButton();
        HBox hBox4 = new HBox();
        Text texte3 = new Text();
        Text texte4 = new Text();
        HBox hBox5 = new HBox();
        Text texte5 = new Text();
        zoneTexte = new TextField();
        HBox hBox6 = new HBox();
        Text texte6 = new Text();
        zoneTexte0 = new TextField();
        Text texte7 = new Text();
        zoneTexte1 = new TextField();
        Text texte8 = new Text();
        zoneTexte2 = new TextField();
        Button bouton = new Button();
        Button bouton0 = new Button();
        Text texte9 = new Text();
        texte10 = new Text();
        menuDeroulant = new ChoiceBox<String>();
        menuDeroulant0 = new ChoiceBox<String>();
        bouton1 = new Button();
        

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

        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Gare de depart :");
        texte.setWrappingWidth(180*largeur);
        texte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        zoneTexte3.setPrefWidth(200.0*largeur);
        zoneTexte3.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox0.setPrefHeight(17.0*hauteur);
        hBox0.setPrefWidth(244.0*largeur);

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Gare d'arrivee :");
        texte0.setWrappingWidth(180*largeur);
        texte0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte0, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        zoneTexte4.setPrefWidth(200.0*largeur);
        zoneTexte4.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(711.0*largeur);

        hBox2.setPrefHeight(41.0*hauteur);
        hBox2.setPrefWidth(725.0*largeur);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Aller/ Aller-retour :");
        texte1.setWrappingWidth(180*largeur);
        texte1.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte1, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        choixBouton.setMnemonicParsing(false);
        choixBouton.setText("Aller");
        choixBouton.setFont(new Font(15.0*hauteur));
        choixBouton.setSelected(true);

        choixBouton0.setMnemonicParsing(false);
        choixBouton0.setText("Aller-retour");
        choixBouton0.setFont(new Font(15.0*hauteur));
        HBox.setMargin(choixBouton0, new Insets(0.0, 0.0, 0.0, 53.0*largeur));
        HBox.setMargin(hBox2, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t1 = new ToggleGroup();
        choixBouton.setToggleGroup(t1);
        choixBouton0.setToggleGroup(t1);

        hBox3.setPrefHeight(17.0*hauteur);
        hBox3.setPrefWidth(244.0*largeur);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Classe :");
        texte2.setWrappingWidth(180*largeur);
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        choixBouton1.setMnemonicParsing(false);
        choixBouton1.setText("1e classe");
        choixBouton1.setFont(new Font(15.0*hauteur));
        choixBouton1.setSelected(true);

        choixBouton2.setMnemonicParsing(false);
        choixBouton2.setText("2e classe");
        choixBouton2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(choixBouton2, new Insets(0.0, 0.0, 0.0, 50.0*largeur));
        VBox.setMargin(hBox3, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));
        
        ToggleGroup t2 = new ToggleGroup();
        choixBouton2.setToggleGroup(t2);
        choixBouton1.setToggleGroup(t2);

        hBox4.setPrefHeight(17.0*hauteur);
        hBox4.setPrefWidth(244.0);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText("Type de billet :");
        texte3.setWrappingWidth(180*largeur);
        texte3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte3, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        menuDeroulant0.setPrefWidth(125.0*largeur);
        menuDeroulant0.setPrefHeight(30.0*hauteur);
        menuDeroulant0.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getTypes()));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Reduction :");
        texte4.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte4, new Insets(0.0, 0.0, 0.0, 50.0*largeur));

        menuDeroulant.setPrefWidth(225.0*largeur);
        menuDeroulant.setPrefHeight(30.0*hauteur);
        menuDeroulant.setItems(FXCollections.observableArrayList(GraphiqueACoeurImpl.getInstance().getReductions()));
        HBox.setMargin(menuDeroulant, new Insets(0.0, 0.0, 0.0, 25.0*largeur));
        VBox.setMargin(hBox4, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox5.setPrefHeight(12.0*hauteur);
        hBox5.setPrefWidth(711.0*largeur);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText("Nombre de billet(s) : ");
        texte5.setWrappingWidth(180*largeur);
        texte5.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte5, new Insets(0.0));

        zoneTexte.setPrefHeight(31.0*hauteur);
        zoneTexte.setPrefWidth(40.0*largeur);
        zoneTexte.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte, new Insets(0.0, 75.0*largeur, 0.0, 20.0*largeur));
        VBox.setMargin(hBox5, new Insets(0.0, 0.0, 10.0*hauteur, 0.0));

        hBox6.setLayoutX(82.0*largeur);
        hBox6.setPrefHeight(33.0*hauteur);
        hBox6.setPrefWidth(400.0*largeur);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("Jour de depart :");
        texte6.setWrappingWidth(180*largeur);
        texte6.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte6, new Insets(0.0, 20.0*largeur, 0.0, 0.0));

        zoneTexte0.setPrefHeight(31.0*hauteur);
        zoneTexte0.setPrefWidth(35.0*largeur);
        zoneTexte0.setFont(new Font(15.0*hauteur));

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(" / ");
        texte7.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte7, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        zoneTexte1.setPrefHeight(31.0*hauteur);
        zoneTexte1.setPrefWidth(35.0*largeur);
        zoneTexte1.setFont(new Font(15.0*hauteur));

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText(" / ");
        texte8.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte8, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        zoneTexte2.setPrefHeight(31.0*hauteur);
        zoneTexte2.setPrefWidth(55.0*largeur);
        zoneTexte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(zoneTexte2, new Insets(0.0, 0.0, 0.0, 0.0));

        bouton.setLayoutX(22.5*largeur);
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
        
        bouton1.setLayoutX(450.0*largeur);
        bouton1.setLayoutY(354.0*hauteur);
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(150.0*largeur);
        bouton1.setText("Depart aujourd'hui");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	if(graphAC.estTactile())
            	{	
            		LocalDate date = LocalDate.now();
            		if(Integer.toString(date.getDayOfMonth()).length() == 1)
            			zoneTexte0.setText("0" + date.getDayOfMonth());
            		else
            			zoneTexte0.setText(Integer.toString(date.getDayOfMonth()));
            		if(Integer.toString(date.getMonth().getValue()).length() == 1)
            			zoneTexte1.setText("0" + date.getMonthValue());
            		else
            			zoneTexte1.setText(Integer.toString(date.getMonth().getValue()));
            		zoneTexte2.setText(Integer.toString(date.getYear()));
            	}
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
            			int nbrBillet = Integer.parseInt(zoneTexte.getText());
            			int jour = Integer.parseInt(zoneTexte0.getText());
            			int mois = Integer.parseInt(zoneTexte1.getText());
            			int annee = Integer.parseInt(zoneTexte2.getText());
            			if (nbrBillet == 0 || nbrBillet >= 100)
            				throw new ErreurDEncodage("Nombre de billet invalide");
            			if (verifierDate(jour, mois, annee))
            			{
            				Date date = new Date(0,0,0);
            				date.setYear(annee-1900);
            				date.setDate(jour);
            				date.setMonth(mois-1);
            				graphAC.infoBillet(date,nbrBillet, getClasse(),zoneTexte3.getText().trim(),zoneTexte4.getText().trim(),
            						menuDeroulant0.getValue(), menuDeroulant.getValue() ,choixBouton1.isSelected());
            				graphAC.choixValider();
            			}
            			else
            			{
            				texte10.setText("La date saisie est incorrecte");
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

        texte9.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte9.setLayoutX(31.0*largeur);
        texte9.setLayoutY(58.5*hauteur);
        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText("Achat d'un billet de train");
        texte9.setUnderline(true);
        texte9.setFont(new Font("System Bold", 22.0*hauteur));
        
        texte10.setFont(new Font("System Bold", 15.0*hauteur));
		texte10.setWrappingWidth(250.0*largeur);
		texte10.setFill(javafx.scene.paint.Color.RED);
		texte10.setLayoutX(175.0*largeur);
		texte10.setLayoutY(364.0*hauteur);
		
        hBox.getChildren().addAll(texte, zoneTexte3);
        hBox0.getChildren().addAll(texte0, zoneTexte4);
        hBox2.getChildren().addAll(texte1, choixBouton, choixBouton0);
        hBox1.getChildren().add(hBox2);
        hBox3.getChildren().addAll(texte2, choixBouton1, choixBouton2);
        hBox4.getChildren().addAll(texte3, menuDeroulant0, texte4, menuDeroulant);
        hBox6.getChildren().addAll(texte6, zoneTexte0, texte7, zoneTexte1, texte8, zoneTexte2);
        hBox5.getChildren().addAll(texte5, zoneTexte, hBox6);
        vBox.getChildren().addAll(hBox, hBox0, hBox1, hBox3, hBox4, hBox5);
        getChildren().addAll(rectangle, vBox, bouton, bouton0, texte9, texte10, bouton1);
    
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
        
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		zoneTexte3.setText(zoneTexte3.getText() + a);
    	else if (pos == 1)
    		zoneTexte4.setText(zoneTexte4.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 2)
		{
			if (a == 1)
				choixBouton.setSelected(true);
			else if (a == 2)
				choixBouton0.setSelected(true);
		}
		else if (pos == 3)
		{
			if (a == 1)
				choixBouton1.setSelected(true);
			else if (a == 2)
				choixBouton2.setSelected(true);
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
		
		else if (pos == 6)
		{
			String s = zoneTexte.getText();
			if (s.length() == 2)
			{
				actionSuivant();
				if (Integer.parseInt(zoneTexte.getText()) == 0)
					zoneTexte.setText(" 1");
			}
			else
				zoneTexte.setText(s + a);
		}
		else if (pos == 7)
		{
			String s = zoneTexte0.getText();
			if (s.length() == 1)
			{
				zoneTexte0.setText(s + a);
				actionSuivant();
				if(Integer.parseInt(zoneTexte0.getText()) > 31)
					zoneTexte0.setText("31");
				if(Integer.parseInt(zoneTexte0.getText()) == 0)
					zoneTexte0.setText("01");
			}
			else if (s.length() < 2)
				zoneTexte0.setText(s + a);
		}
		else if (pos == 8)
		{
			String s = zoneTexte1.getText();
			if (s.length() == 1)
			{
				zoneTexte1.setText(s + a);
				s = zoneTexte1.getText();
				actionSuivant();
				if(Integer.parseInt(s) > 12)
					zoneTexte1.setText("12");
				if(Integer.parseInt(s) == 4 || Integer.parseInt(s) == 6 || Integer.parseInt(s) == 9 || Integer.parseInt(s) == 11)
					if(Integer.parseInt(zoneTexte0.getText()) > 30)
						zoneTexte0.setText("30");
				if(Integer.parseInt(s) == 2)
					if(Integer.parseInt(s)>29)
						zoneTexte0.setText("29");
				if(Integer.parseInt(zoneTexte1.getText()) == 0)
					zoneTexte1.setText("01");
			}
			else if (s.length() < 2)
				zoneTexte1.setText(s + a);
		}
		else if (pos == 9)
		{
			String s = zoneTexte2.getText();
			if (s.length() == 3)
			{
				zoneTexte2.setText(s + a);
				s = zoneTexte2.getText();
				actionSuivant();
				if(Integer.parseInt(s) > 2099)
					zoneTexte2.setText("2099");
				if(Integer.parseInt(s) < 2018)
					zoneTexte2.setText("2018");
				if(Integer.parseInt(zoneTexte1.getText()) == 2 && Integer.parseInt(zoneTexte2.getText())%4 != 0)
					if(Integer.parseInt(zoneTexte0.getText()) > 28)
						zoneTexte0.setText("28");
				if(Integer.parseInt(zoneTexte1.getText()) == 2 && Integer.parseInt(zoneTexte2.getText())%4 == 0)
					if(Integer.parseInt(zoneTexte0.getText()) > 29)
						zoneTexte0.setText("29");
			}
			else if (s.length() < 4)
				zoneTexte2.setText(s + a);
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
			zoneTexte3.requestFocus();
			pos = 0;
		}
		else
		{
			if (pos == 0)
				zoneTexte4.requestFocus();
			else if (pos == 1)
				choixBouton.requestFocus();
			else if (pos == 2)
				choixBouton1.requestFocus();
			else if (pos == 3)
				menuDeroulant0.requestFocus();
			else if (pos == 4)
				menuDeroulant.requestFocus();
			else if (pos == 5)
				zoneTexte.requestFocus();
			else if (pos == 6)
				zoneTexte0.requestFocus();
			else if (pos == 7)
				zoneTexte1.requestFocus();
			else if (pos == 8)
				zoneTexte2.requestFocus();
			else
				bouton1.requestFocus();
			pos ++;
		}
	}

	public void actionEspace() 
	{
		if (pos == 0)
			zoneTexte3.setText(zoneTexte3.getText() + " ");
		else if (pos == 1)
			zoneTexte4.setText(zoneTexte4.getText() + " ");
		if (pos == 10)
		{
			LocalDate date = LocalDate.now();
           	if(Integer.toString(date.getDayOfMonth()).length() == 1)
           		zoneTexte0.setText("0" + date.getDayOfMonth());
           	else
           		zoneTexte0.setText(Integer.toString(date.getDayOfMonth()));
           	if(Integer.toString(date.getMonth().getValue()).length() == 1)
           		zoneTexte1.setText("0" + date.getMonthValue());
           	else
           		zoneTexte1.setText(Integer.toString(date.getMonth().getValue()));
           	zoneTexte2.setText(Integer.toString(date.getYear()));
		}
	}

	public void actionEffacer() 
	{
		if (pos == 0)
		{
			String s = zoneTexte3.getText();
			if (s.length() > 0)
				zoneTexte3.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 1)
		{
			String s = zoneTexte4.getText();
			if (s.length() > 0)
				zoneTexte4.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 6) 
		{
			String s = zoneTexte.getText();
			if (s.length() > 0)
				zoneTexte.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 7)
		{
			String s = zoneTexte0.getText();
			if (s.length() > 0)
				zoneTexte0.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 8)
		{
			String s = zoneTexte1.getText();
			if (s.length() > 0)
				zoneTexte1.setText(s.substring(0, s.length()-1));
		}
		else if (pos == 9)
		{
			String s = zoneTexte2.getText();
			if (s.length() > 0)
				zoneTexte2.setText(s.substring(0, s.length()-1));
		}
	}
	
	public void actionEntrer() 
	{
		try
    	{
    		int nbrBillet = Integer.parseInt(zoneTexte.getText());
    		int jour = Integer.parseInt(zoneTexte0.getText());
    		int mois = Integer.parseInt(zoneTexte1.getText());
    		int annee = Integer.parseInt(zoneTexte2.getText());
            Date date = new Date(0,0,0);
            date.setYear(annee-1900);
            date.setDate(jour);
            date.setMonth(mois-1);
            if (verifierDate(jour, mois, annee))
            {
            	graphAC.infoBillet(date,nbrBillet, getClasse(),zoneTexte3.getText().trim(),zoneTexte4.getText().trim(),menuDeroulant0.getValue(), menuDeroulant.getValue() ,choixBouton1.isSelected());
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
	
	/**
	 * 	Permet de retourner la classe choisie
	 * 	@return classe 1 s'il s'agit de la 1e classe, 2 s'il s'agit de la seconde
	 */
	private int getClasse()
	{
		if (choixBouton1.isSelected())
			return 1;
		else
			return 2;
	}
	
	public void mettreToutAJour()
	{
		if (graphAC.estTactile())
		{
			zoneTexte3.setOnMouseClicked(e -> pos = 0);
			zoneTexte4.setOnMouseClicked(e -> pos = 1);
			choixBouton.setOnMouseClicked(e -> pos = 2);
			choixBouton0.setOnMouseClicked(e -> pos = 2);
			choixBouton1.setOnMouseClicked(e -> pos = 3);
			choixBouton2.setOnMouseClicked(e -> pos = 3);
			menuDeroulant0.setOnMouseClicked(e -> pos = 4);
			menuDeroulant.setOnMouseClicked(e -> pos = 5);
			zoneTexte.setOnMouseClicked(e -> pos = 6);
			zoneTexte1.setOnMouseClicked(e -> pos = 7);
			zoneTexte2.setOnMouseClicked(e -> pos = 8);
			zoneTexte3.setOnMouseClicked(e -> pos = 9);
		}
	}
}