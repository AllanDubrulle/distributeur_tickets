package interfaceGraphique;

import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

public class FenteBillet extends ComposantVisible {

	public FenteBillet(boolean enMarche) {
		super(enMarche);
	}
	
	public FenteBillet() {
        Rectangle rectangle = new Rectangle();
        Button button = new Button();
        Button button0 = new Button();
        Button button1 = new Button();
        Button button2 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(60.0);
        setPrefWidth(232.5);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(7.0);
        rectangle.setLayoutX(18.7);
        rectangle.setLayoutY(5.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0);

        button.setLayoutX(5.0);
        button.setLayoutY(24.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(50.0);
        button.setText("5 �");

        button0.setLayoutX(62.5);
        button0.setLayoutY(24.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(50.0);
        button0.setText("10 �");

        button1.setLayoutX(177.5);
        button1.setLayoutY(24.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(50.0);
        button1.setText("50 �");

        button2.setLayoutX(120.0);
        button2.setLayoutY(24.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(50.0);
        button2.setText("20 �");

        getChildren().addAll(rectangle, button, button0, button1, button2);
    }
}
