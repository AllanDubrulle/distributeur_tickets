package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.shape.*;

class FentePiece extends ComposantVisible
{
	private static FentePiece instance;
	private Button button, button0, button1, button2, button3, button4, button5, button6;
	
	public FentePiece(boolean enMarche) 
	{
		super(enMarche);
	}
	
	private FentePiece() 
	{
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(170.0);
        setPrefWidth(230.0);

        circle.setFill(javafx.scene.paint.Color.valueOf("#48556199"));
        circle.setLayoutX(115.0);
        circle.setLayoutY(85.0);
        circle.setRadius(37.0);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setHeight(50.0);
        rectangle.setLayoutX(111.0);
        rectangle.setLayoutY(60.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(9.0);

        button.setLayoutX(15.0);
        button.setLayoutY(25.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(60.0);
        button.setText("1 ct ");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix1ct();
            }
        });

        button0.setLayoutX(85.0);
        button0.setLayoutY(5.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(60.0);
        button0.setText("2 cts");
        button0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button0.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix2cts();
            }
        });

        button1.setLayoutX(155.0);
        button1.setLayoutY(25.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(60.0);
        button1.setText("5 cts");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix5cts();
            }
        });
        
        button2.setLayoutX(5.0);
        button2.setLayoutY(69.5);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(60.0);
        button2.setText("2 €");
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix2eur();
            }
        });

        button3.setLayoutX(165.0);
        button3.setLayoutY(69.5);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(31.0);
        button3.setPrefWidth(60.0);
        button3.setText("10 cts");
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button3.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix10cts();
            }
        });

        button4.setLayoutX(15.0);
        button4.setLayoutY(114.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(31.0);
        button4.setPrefWidth(60.0);
        button4.setText("1 €");
        button4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button4.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix1eur();
            }
        });

        button5.setLayoutX(85.0);
        button5.setLayoutY(134.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(31.0);
        button5.setPrefWidth(60.0);
        button5.setText("50 cts");
        button5.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button5.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix50cts();
            }
        });

        button6.setLayoutX(155.0);
        button6.setLayoutY(114.0);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(31.0);
        button6.setPrefWidth(60.0);
        button6.setText("20 cts");
        button6.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button6.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
            	graphAC.choix20cts();
            }
        });
        
        getChildren().addAll(circle, rectangle, button, button0, button1, button2, button3, button4, button5, button6);
    }

	public static FentePiece getInstance() 
	{
    	if (instance == null)
    		instance = new FentePiece();
    	return instance;
    }
	
	public Button getButton(int i)
	{
		if (i == 0)
			return button;
		else if (i == 1)
			return button0;
		else if (i == 2)
			return button1;
		else if (i == 3)
			return button2;
		else if (i == 4)
			return button3;
		else if (i == 5)
			return button4;
		else if (i == 6)
			return button5;
		else
			return button6;
	}
}