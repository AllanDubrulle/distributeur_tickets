package interfaceGraphique;

import java.sql.SQLException;
import java.time.LocalDateTime;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Classe FHoraireArEtDep
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FHoraireArEtDep extends Ecran 
{
	private TextField zoneTexte, zoneTexte0, zoneTexte1, zoneTexte2;
	private int pos = 0;
	private Text texte10;
	private Button bouton1;

    public FHoraireArEtDep(double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Text texte0 = new Text();
        Text texte1 = new Text();
        VBox vBox0 = new VBox();
        HBox hBox0 = new HBox();
        zoneTexte = new TextField();
        Text texte2 = new Text();
        zoneTexte0 = new TextField();
        HBox hBox1 = new HBox();
        zoneTexte1 = new TextField();
        Text texte3 = new Text();
        zoneTexte2 = new TextField();
        VBox vBox1 = new VBox();
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

        texte.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        texte.setLayoutX(44.0*largeur);
        texte.setLayoutY(58.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Verifier un horaire de train (itineraire)");
        texte.setUnderline(true);
        texte.setFont(new Font("System Bold", 22.0*hauteur));

        hBox.setLayoutX(60.0*largeur);
        hBox.setLayoutY(132.0*hauteur);
        hBox.setPrefHeight(102.0*hauteur);
        hBox.setPrefWidth(670.0*largeur);

        vBox.setPrefHeight(63.0*hauteur);
        vBox.setPrefWidth(188.0*largeur);

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setText("Itineraire :");
        texte0.setWrappingWidth(180.0*largeur);
        texte0.setFont(new Font(15.0*hauteur));
        VBox.setMargin(texte0, new Insets(30.0*hauteur, 0.0, 5.0*hauteur, 0.0));

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Heure de depart :");
        texte1.setWrappingWidth(180.0*largeur);
        texte1.setFont(new Font(15.0*hauteur));
        VBox.setMargin(texte1, new Insets(10.0*hauteur, 0.0, 0.0, 0.0));
        HBox.setMargin(vBox, new Insets(0.0, 0.0, 0.0, 20.0*largeur));

        vBox0.setPrefHeight(33.0*hauteur);
        vBox0.setPrefWidth(332.0*largeur);

        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(332.0*largeur);

        zoneTexte.setPrefWidth(150.0*largeur);
        zoneTexte.setPrefHeight(31.0*hauteur);
        zoneTexte.setFont(new Font(15.0*hauteur));

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("  a  ");
        texte2.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte2, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        zoneTexte0.setPrefWidth(150.0*largeur);
        zoneTexte0.setPrefHeight(31.0*hauteur);
        zoneTexte0.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox0, new Insets(21.0*hauteur, 0.0, 5.0*hauteur, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(332.0*largeur);

        zoneTexte1.setPrefHeight(31.0*hauteur);
        zoneTexte1.setPrefWidth(40.0*largeur);
        zoneTexte1.setFont(new Font(15.0*hauteur));

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText(" : ");
        texte3.setFont(new Font(15.0*hauteur));
        HBox.setMargin(texte3, new Insets(5.0*hauteur, 0.0, 0.0, 0.0));

        zoneTexte2.setPrefHeight(31.0*hauteur);
        zoneTexte2.setPrefWidth(40.0*largeur);
        zoneTexte2.setFont(new Font(15.0*hauteur));
        VBox.setMargin(hBox1, new Insets(0.0));

        vBox1.setPrefHeight(200.0*hauteur);
        vBox1.setPrefWidth(100.0*largeur);

        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(185.0*largeur);
        bouton.setText("Rechercher");
        bouton.setFont(new Font(15.0*hauteur));
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(bouton, new Insets(40.0*hauteur, 0.0, 0.0, 10.0*largeur));
        HBox.setMargin(vBox1, new Insets(0.0, 0.0, 0.0, 20.0*largeur));
        bouton.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        		{	try 
        			{
        				if (graphAC.existenceTrajet(zoneTexte.getText(),zoneTexte0.getText())) 
        				{	
        					if (Integer.parseInt(zoneTexte1.getText()) < 24 && Integer.parseInt(zoneTexte2.getText()) < 60)
        						graphAC.choixRechercheGDEtGA(zoneTexte.getText(),zoneTexte0.getText(), Integer.parseInt(zoneTexte1.getText()), Integer.parseInt(zoneTexte2.getText()));
        					else 
        						texte10.setText("L'heure saisie est incorrecte");
        				}
        				else
        					texte10.setText("Trajet/gare(s) inexistant(e)(s)");
        			}
        			catch (NumberFormatException | SQLException e)
        			{
        				texte10.setText("L'heure saisie est incorrecte");
        			}
        		}
        	}
        });
        
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(185.0*largeur);
        bouton1.setText("Heure courante");
        bouton1.setFont(new Font(15.0*hauteur));
        bouton1.setLayoutX(307.5*largeur);
        bouton1.setLayoutY(350.0*hauteur);
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        		{
        			LocalDateTime date = LocalDateTime.now();
        			zoneTexte1.setText(Integer.toString(date.getHour()));
        			if(date.getMinute() < 10)
        				zoneTexte2.setText("0"+ date.getMinute());
        			else
        				zoneTexte2.setText(Integer.toString(date.getMinute()));
        		}
        	}
        });
        
		texte10.setFont(new Font("System Bold", 15.0*hauteur));
		texte10.setWrappingWidth(250.0*largeur);
		texte10.setFill(javafx.scene.paint.Color.RED);
		texte10.setLayoutX(275.0*largeur);
		texte10.setLayoutY(324.0*hauteur);

        bouton0.setLayoutX(22.5*largeur);
        bouton0.setLayoutY(349.0*hauteur);
        bouton0.setMnemonicParsing(false);
        bouton0.setText("Annuler");
        bouton0.setFont(new Font(15.0*hauteur));
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixAnnuler();
        	}
        });

        if(graphAC.estTactile())
		{	
        	zoneTexte.setOnMouseClicked(e -> {pos = 0;});
        	zoneTexte0.setOnMouseClicked(e -> {pos = 1;});
        	zoneTexte1.setOnMouseClicked(e -> {pos = 2;});
        	zoneTexte2.setOnMouseClicked(e -> {pos = 3;});
		}
		
        vBox.getChildren().addAll(texte0, texte1);
        hBox0.getChildren().addAll(zoneTexte, texte2, zoneTexte0);
        hBox1.getChildren().addAll(zoneTexte1, texte3, zoneTexte2);
        vBox0.getChildren().addAll(hBox0, hBox1);
        vBox1.getChildren().add(bouton);
        hBox.getChildren().addAll(vBox, vBox0,vBox1);
        getChildren().addAll(rectangle, texte, hBox, bouton0, texte10, bouton1);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
    }
    
    public void actionClavier(String a) 
    {
    	if (pos == 0)
    		zoneTexte.setText(zoneTexte.getText() + a);
    	else if (pos == 1)
    		zoneTexte0.setText(zoneTexte0.getText() + a);
    }

	public void actionClavier(int a) 
	{
		if (pos == 2) 
		{
			String s = zoneTexte1.getText();
			if (s.length() == 1)
			{
				zoneTexte1.setText(s + a);
				actionSuivant();
				if (Integer.parseInt(zoneTexte1.getText()) > 23)
					zoneTexte1.setText("23");
			}
			zoneTexte1.setText(s + a);
		}
		else if (pos == 3) 
		{
			String s = zoneTexte2.getText();
			if (s.length() == 1)
			{
				zoneTexte2.setText(s + a);
				actionSuivant();
				if (Integer.parseInt(zoneTexte2.getText()) > 59)
					zoneTexte2.setText("59");
			}
			zoneTexte2.setText(s + a);
		}
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionSuivant() 
	{
		{
			if (pos == 4)
			{
				zoneTexte.requestFocus();
				pos = 0;
			}
			else
			{
				if (pos == 0)
					zoneTexte0.requestFocus();
				else if (pos == 1)
					zoneTexte1.requestFocus();
				else if (pos == 2)
					zoneTexte2.requestFocus();
				else 
					bouton1.requestFocus();
				pos ++;
			}
		}
	}

	public void actionEspace() 
	{
    	if (pos == 0)
    		zoneTexte.setText(zoneTexte.getText() + " ");
    	else if (pos == 1)
    		zoneTexte0.setText(zoneTexte0.getText() + " ");
    	else if (pos == 4)
    	{
    		LocalDateTime date = LocalDateTime.now();
    		zoneTexte1.setText(Integer.toString(date.getHour()));
			if(date.getMinute() < 10)
				zoneTexte2.setText("0"+ date.getMinute());
			else
				zoneTexte2.setText(Integer.toString(date.getMinute()));
    	}
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
		else
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
			graphAC.choixRechercheGDEtGA(zoneTexte.getText(),zoneTexte0.getText(), Integer.parseInt(zoneTexte1.getText()), Integer.parseInt(zoneTexte2.getText()));
		} 
		catch (NumberFormatException | SQLException e) 
		{
			texte10.setText("Les donnees saisies sont incorrectes");
		}
	}
}