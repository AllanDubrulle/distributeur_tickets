package interfaceGraphique;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class FResultatsHoraires extends Fenetre {

    public Rectangle rectangle;
    public HBox hBox;
    public VBox vBox;
    public Text text;
    public Text text0;
    public Text text1;
    public Text text2;
    public Text text3;
    public Text text4;
    public VBox vBox0;
    public Text text5;
    public Text text6;
    public Text text7;
    public Text text8;
    public Text text9;
    public Text text10;
    public VBox vBox1;
    public Text text11;
    public Text text12;
    public Text text13;
    public Text text14;
    public Text text15;
    public Text text16;
    public Text text17;
    public Button button;
    public Button button0;
    
    public static FResultatsHoraires instance;

    private FResultatsHoraires() {

        rectangle = new Rectangle();
        hBox = new HBox();
        vBox = new VBox();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        vBox0 = new VBox();
        text5 = new Text();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
        text10 = new Text();
        vBox1 = new VBox();
        text11 = new Text();
        text12 = new Text();
        text13 = new Text();
        text14 = new Text();
        text15 = new Text();
        text16 = new Text();
        text17 = new Text();
        button = new Button();
        button0 = new Button();

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

        hBox.setLayoutX(166.0);
        hBox.setLayoutY(111.0);
        hBox.setPrefHeight(189.0);
        hBox.setPrefWidth(425.0);

        vBox.setPrefHeight(200.0);
        vBox.setPrefWidth(100.0);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Gare de départ :");
        text.setUnderline(true);
        text.setFont(new Font("System Italic", 18.0));
        VBox.setMargin(text, new Insets(0.0, 0.0, 20.0, 0.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("(gare depart 1)");
        text0.setWrappingWidth(98.3056640625);

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("(gare depart 2)");
        VBox.setMargin(text1, new Insets(10.0, 0.0, 10.0, 0.0));

        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("(gare depart 3)");

        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("(gare depart 4)");
        VBox.setMargin(text3, new Insets(10.0, 0.0, 10.0, 0.0));

        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("(gare depart 5)");
        vBox.setOpaqueInsets(new Insets(0.0));
        HBox.setMargin(vBox, new Insets(0.0, 75.0, 0.0, 0.0));

        vBox0.setPrefHeight(200.0);
        vBox0.setPrefWidth(100.0);

        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Gare d'arrivée :");
        text5.setUnderline(true);
        text5.setFont(new Font("System Italic", 18.0));
        VBox.setMargin(text5, new Insets(0.0, 0.0, 20.0, 0.0));

        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("(gare arrivee 1)");

        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("(gare arrivee 2)");
        VBox.setMargin(text7, new Insets(10.0, 0.0, 10.0, 0.0));

        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("(gare arrivee 3)");

        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("(gare arrivee 4)");
        VBox.setMargin(text9, new Insets(10.0, 0.0, 10.0, 0.0));

        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("(gare arrivee 5)");
        vBox0.setPadding(new Insets(0.0, 75.0, 0.0, 0.0));

        vBox1.setPrefHeight(200.0);
        vBox1.setPrefWidth(100.0);

        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Heure :");
        text11.setUnderline(true);
        text11.setFont(new Font("System Italic", 18.0));
        VBox.setMargin(text11, new Insets(0.0, 0.0, 20.0, 0.0));

        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("(heure 1)");

        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("(heure 2)");
        VBox.setMargin(text13, new Insets(10.0, 0.0, 10.0, 0.0));

        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText("(heure 3)");

        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("(heure 4)");
        VBox.setMargin(text15, new Insets(10.0, 0.0, 10.0, 0.0));

        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setText("(heure 5)");

        text17.setLayoutX(35.0);
        text17.setLayoutY(69.0);
        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText("Résultats de votre recherche");
        text17.setFont(new Font("System Bold", 24.0));

        button.setLayoutX(50.0);
        button.setLayoutY(340.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(31.0);
        button.setPrefWidth(200.0);
        button.setText("Changer l'heure");
        button.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixChangerHeure();
        	}
        });

        button0.setLayoutX(550.0);
        button0.setLayoutY(340.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(200.0);
        button0.setText("Retour à l'écran principal");
        button.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent event) {
        		graphAC.choixRetourEcranPrinc();
        	}
        });

        vBox.getChildren().addAll(text, text0, text1, text2, text3, text4);
        vBox0.getChildren().addAll(text5, text6, text7, text8, text9, text10);
        vBox1.getChildren().addAll(text11, text12, text13, text14, text15, text16);
        hBox.getChildren().addAll(vBox, vBox0, vBox1);
        getChildren().addAll(rectangle, hBox, text17, button, button0);

    }

    public static FResultatsHoraires getInstance() {
    	if (instance == null)
    		instance = new FResultatsHoraires();
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