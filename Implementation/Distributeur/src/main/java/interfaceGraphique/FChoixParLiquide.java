package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class FChoixParLiquide extends Fenetre {

    public Rectangle rectangle;
    public Text text;
    public Button button;
    public VBox vBox;
    public HBox hBox;
    public Text text0;
    public Text text1;
    public HBox hBox0;
    public Text text2;
    public Text text3;
    public HBox hBox1;
    public Text text4;
    public Text text5;
    
    public static FChoixParLiquide instance;

    private FChoixParLiquide() {

        rectangle = new Rectangle();
        text = new Text();
        button = new Button();
        vBox = new VBox();
        hBox = new HBox();
        text0 = new Text();
        text1 = new Text();
        hBox0 = new HBox();
        text2 = new Text();
        text3 = new Text();
        hBox1 = new HBox();
        text4 = new Text();
        text5 = new Text();

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

        text.setLayoutX(60.0);
        text.setLayoutY(75.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Veuillez introduire l'argent");
        text.setFont(new Font("System Bold", 22.0));

        button.setLayoutX(362.5);
        button.setLayoutY(333.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(75.0);
        button.setText("Annuler");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	graphAC.choixAnnuler();
            }});

        vBox.setLayoutX(113.0);
        vBox.setLayoutY(148.0);
        vBox.setPrefHeight(40.0);
        vBox.setPrefWidth(295.0);

        hBox.setPrefHeight(0.0);
        hBox.setPrefWidth(100.0);

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Montant à payer :");
        HBox.setMargin(text0, new Insets(0.0, 50.0, 0.0, 0.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("(montant à payer)");

        hBox0.setPrefHeight(0.0);
        hBox0.setPrefWidth(100.0);

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Montant introduit :");
        HBox.setMargin(text2, new Insets(0.0, 43.0, 0.0, 0.0));

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("(montant introduit)");
        VBox.setMargin(hBox0, new Insets(20.0, 0.0, 20.0, 0.0));

        hBox1.setPrefHeight(0.0);
        hBox1.setPrefWidth(100.0);

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Montant restant :");
        HBox.setMargin(text4, new Insets(0.0, 53.0, 0.0, 0.0));

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("(montant restant)");

        hBox.getChildren().addAll(text0, text1);
        hBox0.getChildren().addAll(text2, text3);
        hBox1.getChildren().addAll(text4, text5);
        vBox.getChildren().addAll(hBox, hBox0, hBox1);
        getChildren().addAll(rectangle, text, button, vBox);
        /*est-ce qu'on peut annuler ?*/
    }
    
    public static FChoixParLiquide getInstance() {
    	if(instance == null)
    		instance = new FChoixParLiquide();
    	return instance;
    }
}