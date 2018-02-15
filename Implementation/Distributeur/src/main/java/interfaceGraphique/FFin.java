package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class FFin extends Fenetre {
    
    private static FFin instance;

    private FFin() {

        Rectangle rectangle = new Rectangle();
        Button button = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(800.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0);

        button.setLayoutX(287.0);
        button.setLayoutY(181.0);
        button.setMnemonicParsing(false);
        button.setText("Revenir à l'écran principal");
        button.setFont(new Font(18.0));
        button.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
            	graphAC.choixRetourEcranPrinc();
            }});

        getChildren().addAll(rectangle, button);
    }

    public static FFin getInstance() {
    	if(instance == null)
    		instance = new FFin();
    	return instance;
    }
    
	public void actionClavier(String a) {}

	public void actionClavier(int a) {}

	public void actionRetour() {}

	public void actionSuivant() {}

	public void actionEspace() {}

	public void actionEffacer() {}
	
	public void actionEntrer() {}
}