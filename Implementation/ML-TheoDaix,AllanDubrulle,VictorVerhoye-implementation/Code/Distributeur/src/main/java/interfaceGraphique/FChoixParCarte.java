package interfaceGraphique;

import javafx.scene.text.*;
import javafx.stage.Stage;
import stockage.ErreurDEncodage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

/**
 * Classe FChoixParCarte (permet de choisir le numero de carte bancaire pour effectuer le paiement)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FChoixParCarte extends Ecran 
{
    private static TextField zoneTexte;

    
    public FChoixParCarte(Stage scene) 
    {
        Button button = new Button();
        zoneTexte = new TextField();
        Text texte1 = new Text();
        Text texte2 = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        button.setLayoutX(167.5);
        button.setLayoutY(160.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Valider");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle(ActionEvent event) 
        	{
        		try 
        		{
					graphAC.infoCarte(zoneTexte.getText());
	        		graphAC.choixValider();
	        		scene.close();
				} 
        		catch (ErreurDEncodage e) 
        		{
					texte2.setText(e.getMessage());
				}
        	}
        });

        texte2.setFont(new Font("System Bold", 15.0));
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
		texte2.setWrappingWidth(300.0);
		texte2.setFill(javafx.scene.paint.Color.RED);
		texte2.setLayoutX(50.0);
		texte2.setLayoutY(145.0);

        zoneTexte.setLayoutX(100.0);
        zoneTexte.setLayoutY(85.0);
        zoneTexte.setPrefWidth(200.0);

        texte1.setLayoutX(20.0);
        texte1.setLayoutY(30.0);
        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Choisissez un numero de carte :");
        texte1.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, zoneTexte, texte1, texte2);
    }
}