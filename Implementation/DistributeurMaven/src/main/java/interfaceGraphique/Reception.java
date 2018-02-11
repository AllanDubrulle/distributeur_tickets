package interfaceGraphique;

import javafx.scene.shape.*;

public class Reception extends ComposantVisible {

	public Reception(boolean enMarche) {
		super(enMarche);
	}
	
	public Reception(){
        Rectangle rectangle = new Rectangle();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(50.0);
        setPrefWidth(1010.0);
        
        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(40.0);
        rectangle.setLayoutX(5.0);
        rectangle.setLayoutY(5.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(1000.0);
        
        getChildren().add(rectangle);
    }
}
