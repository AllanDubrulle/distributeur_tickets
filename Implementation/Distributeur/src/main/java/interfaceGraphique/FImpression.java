package interfaceGraphique;

import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.shape.*;

public class FImpression extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public ProgressBar progressBar;

    public static FImpression instance;
    
    private FImpression() {

        rectangle = new Rectangle();
        text = new Text();
        progressBar = new ProgressBar();

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

        text.setLayoutX(284.0);
        text.setLayoutY(144.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Impression en cours ...");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(231.841796875);
        text.setFont(new Font("System Italic", 18.0));

        progressBar.setLayoutX(284.0);
        progressBar.setLayoutY(200.0);
        progressBar.setPrefHeight(23.0);
        progressBar.setPrefWidth(232.0);
        progressBar.setProgress(0.0);

        getChildren().addAll(rectangle, text, progressBar);
    }

    public static FImpression getInstance() {
    	if(instance == null)
    		instance = new FImpression();
    	return instance;
    }
}