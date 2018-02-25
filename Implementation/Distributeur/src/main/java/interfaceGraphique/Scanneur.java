package interfaceGraphique;

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
		
		getChildren().add(rectangle);
	}

	public static Scanneur getInstance() 
	{
		if (instance == null)
			instance = new Scanneur();
		return instance;
	}
}