package interfaceGraphique;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

public class LecteurCarte extends ComposantVisible {

	public LecteurCarte(boolean enMarche) {
		super(enMarche);
	}

	public LecteurCarte() {
        Rectangle rectangle = new Rectangle();
        VBox vBox = new VBox();
        PasswordField passwordField = new PasswordField();
        HBox hBox = new HBox();
        Button button = new Button();
        Button button0 = new Button();
        Button button1 = new Button();
        HBox hBox0 = new HBox();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        HBox hBox1 = new HBox();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        HBox hBox2 = new HBox();
        Button button8 = new Button();
        Button button9 = new Button();
        Button button10 = new Button();
        Button button11 = new Button();

        setPrefHeight(250.0);
        setPrefWidth(200.0);

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#0000007d"));
        rectangle.setHeight(250.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(200.0);

        vBox.setPrefHeight(250.0);
        vBox.setPrefWidth(200.0);

        VBox.setMargin(passwordField, new Insets(10.0, 20.0, 10.0, 20.0));

        hBox.setPrefHeight(37.0);
        hBox.setPrefWidth(110.0);

        button.setMnemonicParsing(false);
        button.setText("1");
        HBox.setMargin(button, new Insets(0.0));

        button0.setMnemonicParsing(false);
        button0.setText("2");
        HBox.setMargin(button0, new Insets(0.0, 10.0, 0.0, 10.0));

        button1.setMnemonicParsing(false);
        button1.setText("3");
        HBox.setMargin(button1, new Insets(0.0));
        VBox.setMargin(hBox, new Insets(0.0, 0.0, 0.0, 45.0));

        hBox0.setPrefHeight(39.0);
        hBox0.setPrefWidth(205.0);

        button2.setMnemonicParsing(false);
        button2.setText("4");
        HBox.setMargin(button2, new Insets(0.0, 0.0, 0.0, 17.0));

        button3.setMnemonicParsing(false);
        button3.setText("5");
        HBox.setMargin(button3, new Insets(0.0, 10.0, 0.0, 10.0));

        button4.setMnemonicParsing(false);
        button4.setText("6");
        VBox.setMargin(hBox0, new Insets(0.0, 0.0, 0.0, 28.0));

        hBox1.setPrefHeight(40.0);
        hBox1.setPrefWidth(205.0);

        button5.setMnemonicParsing(false);
        button5.setText("7");
        HBox.setMargin(button5, new Insets(0.0, 0.0, 0.0, 17.0));

        button6.setMnemonicParsing(false);
        button6.setText("8");
        HBox.setMargin(button6, new Insets(0.0, 10.0, 0.0, 10.0));

        button7.setMnemonicParsing(false);
        button7.setText("9");
        VBox.setMargin(hBox1, new Insets(0.0, 0.0, 0.0, 28.0));

        hBox2.setPrefHeight(40.0);
        hBox2.setPrefWidth(205.0);

        button8.setMnemonicParsing(false);
        button8.setText("EFF.");

        button9.setMnemonicParsing(false);
        button9.setText("0");
        HBox.setMargin(button9, new Insets(0.0, 10.0, 0.0, 10.0));

        button10.setMnemonicParsing(false);
        button10.setText("OK");
        HBox.setMargin(button10, new Insets(0.0));
        VBox.setMargin(hBox2, new Insets(0.0, 0.0, 0.0, 28.0));

        button11.setMnemonicParsing(false);
        button11.setText("Insérer carte");
        VBox.setMargin(button11, new Insets(0.0, 0.0, 0.0, 47.0));

        hBox.getChildren().addAll(button, button0, button1);
        hBox0.getChildren().addAll(button2, button3, button4);
        hBox1.getChildren().addAll(button5, button6, button7);
        hBox2.getChildren().addAll(button8, button9, button10);
        vBox.getChildren().addAll(passwordField, hBox, hBox0, hBox1, hBox2, button11);
        getChildren().addAll(rectangle, vBox);
    }
}
