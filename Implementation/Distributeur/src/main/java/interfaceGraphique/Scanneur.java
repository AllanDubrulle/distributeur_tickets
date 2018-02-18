package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

class Scanneur extends ComposantVisible 
{
	private static Scanneur instance;

	public Scanneur(boolean enMarche) 
	{
		super(enMarche);
	}
	
	private Scanneur()
	{
		Rectangle rectangle = new Rectangle();
		Button button = new Button();
		VBox vBox = new VBox();
    
		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(80.0);
		setPrefWidth(210.0);
    
		rectangle.setArcHeight(25.0);
		rectangle.setArcWidth(25.0);
		rectangle.setHeight(70.0);
		rectangle.setLayoutX(0.0);
		rectangle.setLayoutY(0.0);
		rectangle.setStroke(javafx.scene.paint.Color.BLACK);
		rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
		rectangle.setWidth(200.0);
		
		button.setMnemonicParsing(false);
        button.setText("Scanner code");
        button.setPrefWidth(200.0);
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	;
            }
        });
		
        VBox.setMargin(rectangle, new Insets(0.0, 0.0, 5.0, 0.0));
        
		vBox.getChildren().addAll(rectangle, button);
		getChildren().add(vBox);
	}

	public static Scanneur getInstance() 
	{
		if (instance == null)
			instance = new Scanneur();
		return instance;
	}
}