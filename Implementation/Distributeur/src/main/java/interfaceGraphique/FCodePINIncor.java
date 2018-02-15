package interfaceGraphique;

import javafx.scene.shape.*;
import javafx.scene.text.*;

public class FCodePINIncor extends Fenetre {

    public Rectangle rectangle;
    public Text text;

    public static FCodePINIncor instance;
    
    private FCodePINIncor() {

        rectangle = new Rectangle();
        text = new Text();

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

        text.setLayoutX(297.0);
        text.setLayoutY(193.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Code PIN incorrect. Veuillez rééssayer.");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(205.841796875);
        text.setFont(new Font("System Italic", 18.0));

        getChildren().addAll(rectangle, text);
    }

    public static FCodePINIncor getInstance() {
    	if(instance == null)
    		instance = new FCodePINIncor();
    	return instance;
    }
}