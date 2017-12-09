package Distributeur;

import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.layout.*;
import java.lang.*;
import javafx.scene.control.*;

public class FenetreConfigurationCodeGenere extends BorderPane {

    protected final Button button;
    protected final VBox vBox;
    protected final Text text;
    protected final Text text0;
    protected final RadioButton radioButton;
    protected final RadioButton radioButton0;
    protected final RadioButton radioButton1;
    protected final Text text1;
    protected final RadioButton radioButton2;
    protected final RadioButton radioButton3;
    protected final RadioButton radioButton4;
    protected final CheckBox checkBox;

    public FenetreConfigurationCodeGenere() {

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
        text0.setText("Clavier et �cran :");
        VBox.setMargin(text0, new Insets(0.0, 0.0, 5.0, 25.0));

        radioButton.setMnemonicParsing(false);
        radioButton.setSelected(true);
        radioButton.setText("Clavier et �cran tactile");
        VBox.setMargin(radioButton, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Clavier et �cran non tactile");
        VBox.setMargin(radioButton0, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton1.setMnemonicParsing(false);
        radioButton1.setText("Ecran tactile uniquement");
        VBox.setMargin(radioButton1, new Insets(0.0, 0.0, 15.0, 40.0));

        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Fentes � monnaie :");
        VBox.setMargin(text1, new Insets(0.0, 0.0, 5.0, 25.0));

        radioButton2.setMnemonicParsing(false);
        radioButton2.setSelected(true);
        radioButton2.setText("Fentes � pi�ces et � billets");
        VBox.setMargin(radioButton2, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton3.setMnemonicParsing(false);
        radioButton3.setText("Fente � pi�ce uniquement");
        VBox.setMargin(radioButton3, new Insets(0.0, 0.0, 5.0, 40.0));

        radioButton4.setMnemonicParsing(false);
        radioButton4.setText("Aucune fente");
        VBox.setMargin(radioButton4, new Insets(0.0, 0.0, 15.0, 40.0));

        checkBox.setMnemonicParsing(false);
        checkBox.setText("Scanneur de codes");
        VBox.setMargin(checkBox, new Insets(0.0, 0.0, 0.0, 25.0));
        BorderPane.setMargin(vBox, new Insets(30.0, 50.0, 0.0, 50.0));
        setCenter(vBox);

        vBox.getChildren().add(text);
        vBox.getChildren().add(text0);
        vBox.getChildren().add(radioButton);
        vBox.getChildren().add(radioButton0);
        vBox.getChildren().add(radioButton1);
        vBox.getChildren().add(text1);
        vBox.getChildren().add(radioButton2);
        vBox.getChildren().add(radioButton3);
        vBox.getChildren().add(radioButton4);
        vBox.getChildren().add(checkBox);

    }
	public static void main(String[] args){
            new FenetreConfigurationCodeGenere();
        }
}
