package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

/**
 * Classe AfficherHoraire (permet d'afficher l'horaire imprime)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class AfficherHoraire extends Pane 
{
	/**
	 * 	Constructeur de AfficherHoraire
	 * 	@param horaire un tableau contenant l'horaire imprime
	 */
    public AfficherHoraire(String[] horaire) 
    {
        HBox boxHor = new HBox();
        VBox boxVer1 = new VBox();
        VBox boxVer2 = new VBox();
        VBox boxVer3 = new VBox();
        VBox boxVer4 = new VBox();
        VBox boxVer5 = new VBox();
        Text texte1 = new Text();
        Text texte2 = new Text();
        Text texte3 = new Text();
        Text texte4 = new Text();
        Text texte5 = new Text();
        Text texte6 = new Text();
        Text texte7 = new Text();
        Text texte8 = new Text();
        Text texte9 = new Text();
        Text texte10 = new Text();
        Text texte11 = new Text();
        Text texte12 = new Text();
        Text texte13 = new Text();
        Text texte14 = new Text();
        Text texte15 = new Text();
        Text texte16 = new Text();
        Text texte17 = new Text();
        Text texte18 = new Text();
        Text texte19 = new Text();
        Text texte20 = new Text();
        Text texte21 = new Text();
        Text texte22 = new Text();
        Text texte23 = new Text();
        Text texte24 = new Text();
        Text texte25 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(600.0);

        boxVer1.setPrefHeight(250.0);
        boxVer1.setPrefWidth(600.0);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("VERIFICATION D'HORAIRE");
        texte1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte1.setUnderline(true);
        texte1.setWrappingWidth(300.0);
        texte1.setFont(new Font("System Bold Italic", 21.0));
        VBox.setMargin(texte1, new Insets(15.0, 0.0, 15.0, 150.0));

        boxHor.setPrefHeight(160.0);
        boxHor.setPrefWidth(600.0);

        boxVer2.setPrefHeight(160.0);
        boxVer2.setPrefWidth(150.0);

        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText("Gare de depart :");
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte2.setUnderline(true);
        texte2.setWrappingWidth(150.0);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        texte3.setText(horaire[0]);
        texte3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte3.setWrappingWidth(150.0);
        VBox.setMargin(texte3, new Insets(10.0, 0.0, 5.0, 0.0));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText(horaire[6]);
        texte4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte4.setWrappingWidth(150.0);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText(horaire[12]);
        texte5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte5.setWrappingWidth(150.0);
        VBox.setMargin(texte5, new Insets(5.0, 0.0, 5.0, 0.0));

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText(horaire[18]);
        texte6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte6.setWrappingWidth(150.0);

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(horaire[24]);
        texte7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte7.setWrappingWidth(150.0);
        VBox.setMargin(texte7, new Insets(5.0, 0.0, 0.0, 0.0));

        boxVer3.setPrefHeight(160.0);
        boxVer3.setPrefWidth(150.0);

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText("Gare d'arrivee :");
        texte8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte8.setUnderline(true);
        texte8.setWrappingWidth(150.0);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText(horaire[1]);
        texte9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte9.setWrappingWidth(150.0);
        VBox.setMargin(texte9, new Insets(10.0, 0.0, 5.0, 0.0));

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText(horaire[7]);
        texte10.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte10.setWrappingWidth(150.0);

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        texte11.setText(horaire[13]);
        texte11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte11.setWrappingWidth(150.0);
        VBox.setMargin(texte11, new Insets(5.0, 0.0, 5.0, 0.0));

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText(horaire[19]);
        texte12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte12.setWrappingWidth(150.0);

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText(horaire[25]);
        texte13.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte13.setWrappingWidth(150.0);
        VBox.setMargin(texte13, new Insets(5.0, 0.0, 0.0, 0.0));

        boxVer4.setPrefHeight(160.0);
        boxVer4.setPrefWidth(150.0);

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setText("Heure de depart :");
        texte14.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte14.setUnderline(true);
        texte14.setWrappingWidth(150.0);

        texte15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte15.setStrokeWidth(0.0);
        if (horaire[2] != null)
        {
        	if (horaire[3].length() == 1)
        		texte15.setText(horaire[2]+":0"+horaire[3]);
        	else
        		texte15.setText(horaire[2]+":"+horaire[3]);
        }
        texte15.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte15.setWrappingWidth(150.0);
        VBox.setMargin(texte15, new Insets(10.0, 0.0, 5.0, 0.0));

        texte16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte16.setStrokeWidth(0.0);
        if (horaire[8] != null)
        {
        	if (horaire[9].length() == 1)
        		texte16.setText(horaire[8]+":0"+horaire[9]);
        	else
        		texte16.setText(horaire[8]+":"+horaire[9]);
        }
        texte16.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte16.setWrappingWidth(150.0);

        texte17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte17.setStrokeWidth(0.0);
        if (horaire[14] != null)
        {
        	if (horaire[15].length() == 1)
        		texte17.setText(horaire[14]+":0"+horaire[15]);
        	else
        		texte17.setText(horaire[14]+":"+horaire[15]);
        }
        texte17.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte17.setWrappingWidth(150.0);
        VBox.setMargin(texte17, new Insets(5.0, 0.0, 5.0, 0.0));

        texte18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte18.setStrokeWidth(0.0);
        if (horaire[20] != null)
        {
        	if (horaire[21].length() == 1)
        		texte18.setText(horaire[20]+":0"+horaire[21]);
        	else
        		texte18.setText(horaire[20]+":"+horaire[21]);
        }
        texte18.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte18.setWrappingWidth(150.0);

        texte19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte19.setStrokeWidth(0.0);
        if (horaire[26] != null)
        {
        	if (horaire[27].length() == 1)
        		texte19.setText(horaire[26]+":0"+horaire[27]);
        	else
        		texte19.setText(horaire[26]+":"+horaire[27]);
        }
        texte19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte19.setWrappingWidth(150.0);
        VBox.setMargin(texte19, new Insets(5.0, 0.0, 0.0, 0.0));

        boxVer5.setPrefHeight(160.0);
        boxVer5.setPrefWidth(150.0);

        texte20.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte20.setStrokeWidth(0.0);
        texte20.setText("Heure d'arrivee :");
        texte20.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte20.setUnderline(true);
        texte20.setWrappingWidth(150.0);

        texte21.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte21.setStrokeWidth(0.0);
        if (horaire[4] != null)
        {
        	if (horaire[5].length() == 1)
        		texte21.setText(horaire[4]+":0"+horaire[5]);
        	else
        		texte21.setText(horaire[4]+":"+horaire[5]);
        }
        texte21.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte21.setWrappingWidth(150.0);
        VBox.setMargin(texte21, new Insets(10.0, 0.0, 5.0, 0.0));

        texte22.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte22.setStrokeWidth(0.0);
        if (horaire[10] != null)
        {
        	if (horaire[11].length() == 1)
        		texte22.setText(horaire[10]+":0"+horaire[11]);
        	else
        		texte22.setText(horaire[10]+":"+horaire[11]);
        }
        texte22.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte22.setWrappingWidth(150.0);

        texte23.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte23.setStrokeWidth(0.0);
        if (horaire[16] != null)
        {
        	if (horaire[17].length() == 1)
        		texte23.setText(horaire[16]+":0"+horaire[17]);
        	else
        		texte23.setText(horaire[16]+":"+horaire[17]);
        }
        texte23.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte23.setWrappingWidth(150.0);
        VBox.setMargin(texte23, new Insets(5.0, 0.0, 5.0, 0.0));

        texte24.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte24.setStrokeWidth(0.0);
        if (horaire[22] != null)
        {
        	if (horaire[23].length() == 1)
        		texte24.setText(horaire[22]+":0"+horaire[23]);
        	else
        		texte24.setText(horaire[22]+":"+horaire[23]);
        }
        texte24.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte24.setWrappingWidth(150.0);

        texte25.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte25.setStrokeWidth(0.0);
        if (horaire[28] != null)
        {
        	if (horaire[29].length() == 1)
        		texte25.setText(horaire[28]+":0"+horaire[29]);
        	else
        		texte25.setText(horaire[28]+":"+horaire[29]);
        }
        texte25.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte25.setWrappingWidth(150.0);
        VBox.setMargin(texte25, new Insets(5.0, 0.0, 0.0, 0.0));
        VBox.setMargin(boxHor, new Insets(0.0));

        boxVer2.getChildren().addAll(texte2, texte3, texte4, texte5, texte6, texte7);
        boxVer3.getChildren().addAll(texte8, texte9, texte10, texte11, texte12, texte13);
        boxVer4.getChildren().addAll(texte14, texte15, texte16, texte17, texte18, texte19);
        boxVer5.getChildren().addAll(texte20, texte21, texte22, texte23, texte24, texte25);
        boxHor.getChildren().addAll(boxVer2, boxVer3, boxVer4, boxVer5);
        boxVer1.getChildren().addAll(texte1, boxHor);
        getChildren().add(boxVer1);

    }
}