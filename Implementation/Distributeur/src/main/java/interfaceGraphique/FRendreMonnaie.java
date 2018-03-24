package interfaceGraphique;

import coeur.GraphiqueACoeurImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;

class FRendreMonnaie extends Pane
{    
    public FRendreMonnaie() 
    {
        Text text = new Text();
        Button button = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(200.0);
        setPrefWidth(400.0);

        text.setLayoutX(90.0);
        text.setLayoutY(66.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Veuillez récuperer l'argent dans le bac de réception.");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(220.841796875);
        text.setFont(new Font("System Italic", 18.0));

        button.setLayoutX(163.0);
        button.setLayoutY(147.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Ok");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	GraphiqueACoeurImpl.getInstance().choixOk();
            }
        });

        getChildren().addAll(text, button);
        
        button.setFocusTraversable(false);
    }
}