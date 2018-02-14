package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;

public class FSimulationAcceuil extends Fenetre {

    public Rectangle rectangle;
    public Button button;
    public Pane pane;
    public static FSimulationAcceuil instance;
    
    private FSimulationAcceuil() {

        rectangle = new Rectangle();
        button = new Button();
        pane = new Pane();
        

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(400.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#b2e5ff"));
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        button.setLayoutX(334.0);
        button.setLayoutY(175.0);
        button.setMnemonicParsing(false);
        button.setText("Démarrer");
        button.setFont(new Font(24.0));
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixDemarrerSimul();
            }
        });
        getChildren().addAll(rectangle, button);
    }
    
    public static FSimulationAcceuil getInstance() {
    	if (instance == null)
    		instance = new FSimulationAcceuil();
    	return instance;
    }
}