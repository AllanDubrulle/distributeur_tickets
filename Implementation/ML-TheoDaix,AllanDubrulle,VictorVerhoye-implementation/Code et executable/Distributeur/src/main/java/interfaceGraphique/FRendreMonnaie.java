package interfaceGraphique;

import coeur.GraphiqueACoeurImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;

/**
 * Classe FRendreMonnaie
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FRendreMonnaie extends Pane
{    
    public FRendreMonnaie() 
    {
        Text texte = new Text();
        Button bouton = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        texte.setLayoutX(90.0);
        texte.setLayoutY(66.0);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText("Veuillez recuperer l'argent dans le bac de reception.");
        texte.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte.setWrappingWidth(220.841796875);
        texte.setFont(new Font("System Italic", 18.0));

        bouton.setLayoutX(163.0);
        bouton.setLayoutY(147.0);
        bouton.setMnemonicParsing(false);
        bouton.setPrefHeight(31.0);
        bouton.setPrefWidth(75.0);
        bouton.setText("Ok");
        bouton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        bouton.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	GraphiqueACoeurImpl.getInstance().choixOk();
            }
        });

        getChildren().addAll(texte, bouton);
        
        bouton.setFocusTraversable(false);
    }
}