package interfaceGraphique;

import javafx.scene.text.*;
import javafx.stage.Stage;
import stockage.ErreurDEncodage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

class FChoixParCarte extends Ecran 
{
    private static TextField champDeTexte;
    private Stage stage;
    
    public FChoixParCarte(Stage stage) 
    {
    	this.stage = stage;
        Button button = new Button();
        champDeTexte = new TextField();
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
					graphAC.infoCarte(champDeTexte.getText());
	        		graphAC.choixValider();
	        		stage.close();
				} 
        		catch (ErreurDEncodage e) 
        		{
					texte2.setText("Le numéro de carte saisi est incorrect");
				}
        	}
        });

        texte2.setFont(new Font("System Bold", 15.0));
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
		texte2.setWrappingWidth(300.0);
		texte2.setFill(javafx.scene.paint.Color.RED);
		texte2.setLayoutX(50.0);
		texte2.setLayoutY(145.0);

        champDeTexte.setLayoutX(100.0);
        champDeTexte.setLayoutY(85.0);
        champDeTexte.setPrefWidth(200.0);

        texte1.setLayoutX(20.0);
        texte1.setLayoutY(30.0);
        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("Choisissez un numéro de carte :");
        texte1.setFont(new Font("System Bold", 15.0));

        getChildren().addAll(button, champDeTexte, texte1, texte2);
    }

	public void actionClavier(int a) 
	{
		champDeTexte.setText(champDeTexte.getText() + a);
	}

	public void actionRetour() 
	{
		graphAC.choixAnnuler();
	}

	public void actionEffacer() 
	{
		if (champDeTexte.getText().length() > 0)
			champDeTexte.setText(champDeTexte.getText().substring(0, champDeTexte.getText().length()-1));
	}
	
	public void actionEntrer() 
	{
		graphAC.choixValider();
	}
}