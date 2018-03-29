package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

/**
 * Classe FResultatsHoraires
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FResultatsHoraires extends Ecran 
{
	private Button bouton1;
	
    public FResultatsHoraires(boolean imprimante, String[] tab, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        HBox hBox = new HBox();
        VBox vBox = new VBox();
        Text texte = new Text();
        Text texte0 = new Text();
        Text texte1 = new Text();
        Text texte2 = new Text();
        Text texte3 = new Text();
        Text texte4 = new Text();
        VBox vBox0 = new VBox();
        Text texte5 = new Text();
        Text texte6 = new Text();
        Text texte7 = new Text();
        Text texte8 = new Text();
        Text texte9 = new Text();
        Text texte10 = new Text();
        VBox vBox1 = new VBox();
        Text texte11 = new Text();
        Text texte12 = new Text();
        Text texte13 = new Text();
        Text texte14 = new Text();
        Text texte15 = new Text();
        Text texte16 = new Text();
        Text texte17 = new Text();
        VBox vBox2 = new VBox();
        Text texte18 = new Text();
        Text texte19 = new Text();
        Text texte20 = new Text();
        Text texte21 = new Text();
        Text texte22 = new Text();
        Text texte23 = new Text();
        Button bouton = new Button();
        Button bouton0 = new Button();
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

        hBox.setLayoutX(67.5*largeur);
        hBox.setLayoutY(111.0*hauteur);
        hBox.setPrefHeight(189.0*hauteur);
        hBox.setPrefWidth(425.0*largeur);

        vBox.setPrefHeight(200.0*hauteur);
        vBox.setPrefWidth(100.0*largeur);

        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Gare de depart :");
        texte.setWrappingWidth(115.0*largeur);
        texte.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte.setUnderline(true);
        texte.setFont(new Font("System Italic", 18.0*hauteur));
        VBox.setMargin(texte, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        texte0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte0.setStrokeWidth(0.0);
        texte0.setWrappingWidth(100.0*largeur);
        texte0.setText(tab[0]);
        texte0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte0.setWrappingWidth(98.5*largeur);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setWrappingWidth(100.0*largeur);
        texte1.setText(tab[6]);
        texte1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte1, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setWrappingWidth(100.0*largeur);
        texte2.setText(tab[12]);
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setWrappingWidth(100.0*largeur);
        texte3.setText(tab[18]);
        texte3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte3, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setWrappingWidth(100.0*largeur);
        texte4.setText(tab[24]);
        texte4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        vBox.setOpaqueInsets(new Insets(0.0));
        HBox.setMargin(vBox, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);
        HBox.setMargin(vBox0, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText("Gare d'arrivee :");
        texte5.setWrappingWidth(110.0*largeur);
        texte5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte5.setUnderline(true);
        texte5.setFont(new Font("System Italic", 18.0*hauteur));
        VBox.setMargin(texte5, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setWrappingWidth(100.0*largeur);
        texte6.setText(tab[1]);
        texte6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setWrappingWidth(100.0*largeur);
        texte7.setText(tab[7]);
        texte7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte7, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setWrappingWidth(100.0*largeur);
        texte8.setText(tab[13]);
        texte8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setWrappingWidth(100.0*largeur);
        texte9.setText(tab[19]);
        texte9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte9, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setWrappingWidth(100.0*largeur);
        texte10.setText(tab[25]);
        texte10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        vBox1.setPrefHeight(200.0*hauteur);
        vBox1.setPrefWidth(120.0*largeur);
        HBox.setMargin(vBox1, new Insets(0.0, 75.0*largeur, 0.0, 0.0));

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText("Heure de depart :");
        texte11.setWrappingWidth(120.0*largeur);
        texte11.setUnderline(true);
        texte11.setFont(new Font("System Italic", 18.0*hauteur));
        texte11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte11, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setWrappingWidth(100.0*largeur);
        if (tab[2] != null)
        {
        	if (tab[3].length() == 1)
        		texte12.setText(tab[2]+":0"+tab[3]);
        	else
        		texte12.setText(tab[2]+":"+tab[3]);
        }
        texte12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setWrappingWidth(100.0*largeur);
        if (tab[8] != null)
        {
        	if (tab[9].length() == 1)
        		texte13.setText(tab[8]+":0"+tab[9]);
        	else
        		texte13.setText(tab[8]+":"+tab[9]);
        }
        texte13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte13, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setWrappingWidth(100.0*largeur);
        if (tab[14] != null)
        {
        	if (tab[15].length() == 1)
        		texte14.setText(tab[14]+":0"+tab[15]);
        	else
        		texte14.setText(tab[14]+":"+tab[15]);
        }
        texte14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        texte15.setWrappingWidth(100.0*largeur);
        if (tab[20] != null)
        {
        	if (tab[21].length() == 1)
        		texte15.setText(tab[20]+":0"+tab[21]);
        	else
        		texte15.setText(tab[20]+":"+tab[21]);
        }
        texte15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte15, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte16.setStrokeWidth(0.0);
        texte16.setWrappingWidth(100.0*largeur);
        if (tab[26] != null)
        {
        	if (tab[27].length() == 1)
        		texte16.setText(tab[26]+":0"+tab[27]);
        	else
        		texte16.setText(tab[26]+":"+tab[27]);
        }
        texte16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        
        texte23.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte23.setStrokeWidth(0.0);
        texte23.setText("Heure d'arrivee :");
        texte23.setWrappingWidth(120.0*largeur);
        texte23.setUnderline(true);
        texte23.setFont(new Font("System Italic", 18.0*hauteur));
        texte23.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte23, new Insets(0.0, 0.0, 20.0*hauteur, 0.0));

        vBox2.setPrefHeight(200.0*hauteur);
        vBox2.setPrefWidth(120.0*largeur);
        
        texte18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte18.setStrokeWidth(0.0);
        texte18.setWrappingWidth(100.0*largeur);
        if (tab[4] != null)
        {
        	if (tab[5].length() == 1)
        		texte18.setText(tab[4]+":0"+tab[5]);
        	else
        		texte18.setText(tab[4]+":"+tab[5]);
        }
        texte18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte19.setStrokeWidth(0.0);
        texte19.setWrappingWidth(100.0*largeur);
        if (tab[10] != null)
        {
        	if (tab[11].length() == 1)
        		texte19.setText(tab[10]+":0"+tab[11]);
        	else
        		texte19.setText(tab[10]+":"+tab[11]);
        }
        texte19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte19, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte20.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte20.setStrokeWidth(0.0);
        texte20.setWrappingWidth(100.0*largeur);
        if (tab[16] != null)
        {
        	if (tab[17].length() == 1)
        		texte20.setText(tab[16]+":0"+tab[17]);
        	else
        		texte20.setText(tab[16]+":"+tab[17]);
        }
        texte20.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte21.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte21.setStrokeWidth(0.0);
        texte21.setWrappingWidth(100.0*largeur);
        if (tab[22] != null)
        {
        	if (tab[23].length() == 1)
        		texte21.setText(tab[22]+":0"+tab[23]);
        	else
        		texte21.setText(tab[22]+":"+tab[23]);
        }
        texte21.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        VBox.setMargin(texte21, new Insets(10.0*hauteur, 0.0, 10.0*hauteur, 0.0));

        texte22.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte22.setStrokeWidth(0.0);
        texte22.setWrappingWidth(100.0*largeur);
        if (tab[28] != null)
        {
        	if (tab[29].length() == 1)
        		texte22.setText(tab[28]+":0"+tab[29]);
        	else
        		texte22.setText(tab[28]+":"+tab[29]);
        }
        texte22.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        texte17.setLayoutX(35.0*largeur);
        texte17.setLayoutY(69.0*hauteur);
        texte17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte17.setStrokeWidth(0.0);
        texte17.setText("Resultats de votre recherche");
        texte17.setFont(new Font("System Bold", 24.0*hauteur));

        bouton.setLayoutX(50.0*largeur);
        bouton.setLayoutY(340.0*hauteur);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0*hauteur);
        bouton.setPrefWidth(200.0*largeur);
        bouton.setText("Changer l'heure");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixRetour();
        	}
        });

        bouton0.setLayoutX(550.0*largeur);
        bouton0.setLayoutY(340.0*hauteur);
        bouton0.setMnemonicParsing(false);
        bouton0.setPrefHeight(31.0*hauteur);
        bouton0.setPrefWidth(200.0*largeur);
        bouton0.setText("Retour a l'ecran principal");
        bouton0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton0.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixRetourEcranPrinc();
        	}
        });
        
        bouton1.setLayoutX(300.0*largeur);
        bouton1.setLayoutY(340.0*hauteur);
        bouton1.setMnemonicParsing(false);
        bouton1.setPrefHeight(31.0*hauteur);
        bouton1.setPrefWidth(200.0*largeur);
        bouton1.setText("Imprimer horaire");
        bouton1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton1.setOnAction(new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent event) 
        	{
        		if(graphAC.estTactile())
        			graphAC.choixImprimerHoraire();
        	}
        });

        vBox.getChildren().addAll(texte, texte0, texte1, texte2, texte3, texte4);
        vBox0.getChildren().addAll(texte5, texte6, texte7, texte8, texte9, texte10);
        vBox1.getChildren().addAll(texte11, texte12, texte13, texte14, texte15, texte16);
        vBox2.getChildren().addAll(texte23, texte18, texte19, texte20, texte21, texte22);
        hBox.getChildren().addAll(vBox, vBox0, vBox1, vBox2);
        getChildren().addAll(rectangle, hBox, texte17, bouton, bouton0, bouton1);
        
        if(!imprimante)
        	bouton1.setDisable(true);
        
        bouton.setFocusTraversable(false);
        bouton0.setFocusTraversable(false);
        bouton1.setFocusTraversable(false);
    }

	public void actionRetour() 
	{
		graphAC.choixRetour();
	}
	
	public void actionEntrer()
	{
		graphAC.choixRetourEcranPrinc();
	}
	
	public void actionEspace()
	{
		graphAC.choixImprimerHoraire();
	}
}