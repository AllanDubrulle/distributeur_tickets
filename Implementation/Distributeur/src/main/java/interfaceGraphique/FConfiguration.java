package interfaceGraphique;

import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import coeur.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FConfiguration extends BorderPane {
    
    public static Stage stage = new Stage();
    public Button button;
    public VBox vBox;
    public Text text;
    public Text text0;
    public RadioButton radioButton;
    public RadioButton radioButton0;
    public RadioButton radioButton1;
    public Text text1;
    public RadioButton radioButton2;
    public RadioButton radioButton3;
    public RadioButton radioButton4;
    public CheckBox checkBox;
    public GraphiqueACoeurImpl graphAC = new GraphiqueACoeurImpl();

    public FConfiguration() {

        button = new Button();
        vBox = new VBox();
        text = new Text();
        text0 = new Text();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        radioButton1 = new RadioButton();
        text1 = new Text();
        radioButton2 = new RadioButton();
        radioButton3 = new RadioButton();
        radioButton4 = new RadioButton();
        checkBox = new CheckBox();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(button, javafx.geometry.Pos.BOTTOM_RIGHT);
        button.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        button.setMnemonicParsing(false);
        button.setText("Valider");
        BorderPane.setMargin(button, new Insets(0.0, 10.0, 10.0, 0.0));
        setBottom(button);
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                graphAC.choixValidConfig();
            }
        });

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(328.0);
        vBox.setPrefWidth(516.0);

        text.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choisissez vos composants optionnels :");
        VBox.setMargin(text, new Insets(0.0, 0.0, 25.0, 0.0));
        text.setFont(new Font("System Bold", 18.0));

        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Clavier et écran :");
        VBox.setMargin(text0, new Insets(0.0, 0.0, 5.0, 25.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setSelected(true);
        radioButton.setText("Clavier et écran tactile");
        VBox.setMargin(radioButton, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Clavier et écran non tactile");
        VBox.setMargin(radioButton0, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("Ecran tactile uniquement");
        VBox.setMargin(radioButton1, new Insets(0.0, 0.0, 15.0, 40.0));

        ToggleGroup t1 = new ToggleGroup();
        radioButton.setToggleGroup(t1);
        radioButton0.setToggleGroup(t1);
        radioButton1.setToggleGroup(t1);
        
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Fentes à  monnaie :");
        VBox.setMargin(text1, new Insets(0.0, 0.0, 5.0, 25.0));

        radioButton2.setMnemonicParsing(true);
        radioButton2.setSelected(true);
        radioButton2.setText("Fentes à  pièces et à  billets");
        VBox.setMargin(radioButton2, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton3.setMnemonicParsing(true);
        radioButton3.setText("Fente à  pièce uniquement");
        VBox.setMargin(radioButton3, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton4.setMnemonicParsing(true);
        radioButton4.setText("Aucune fente");
        VBox.setMargin(radioButton4, new Insets(0.0, 0.0, 15.0, 40.0));

        ToggleGroup t2 = new ToggleGroup();
        radioButton2.setToggleGroup(t2);
        radioButton3.setToggleGroup(t2);
        radioButton4.setToggleGroup(t2);
        
        checkBox.setMnemonicParsing(false);
        checkBox.setText("Scanneur de codes");
        VBox.setMargin(checkBox, new Insets(0.0, 0.0, 0.0, 25.0));
        BorderPane.setMargin(vBox, new Insets(30.0, 50.0, 0.0, 50.0));
        setCenter(vBox);

        vBox.getChildren().addAll(text, text0, radioButton, radioButton0, radioButton1, text1, radioButton2, radioButton3, radioButton4, checkBox);

    }
}
