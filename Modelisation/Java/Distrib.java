package Distributeur;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Distrib extends Application {
    
    public static Stage primaryStage = new Stage();
    @Override
    public void start(Stage primaryStage) {
        primaryStage = this.primaryStage;
        FenetreConfigurationCG fen = new FenetreConfigurationCG();
        FenetreSimulationNewBase fen1 = new FenetreSimulationNewBase();
        StackPane root = new StackPane();
        StackPane root1 = new StackPane();
        root1.setStyle("-fx-background-color: white;");
        root.getChildren().add(fen);
        root1.getChildren().add(fen1);
        
        Scene scene = new Scene(root, 600, 400);
        Scene scene1 = new Scene(root1, 1300, 800);
        
        //primaryStage.setTitle("Fenêtre de simulation");
        primaryStage.setTitle("Fenêtre de configuration");
        primaryStage.setScene(scene);
        //primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
