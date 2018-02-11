import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class main extends Application {

    public static Stage primaryStage = new Stage();
    @Override
    public void start(Stage primaryStage) {
        primaryStage = main.primaryStage;
        FConfiguration fen = new FConfiguration();
        StackPane root = new StackPane();
        root.getChildren().add(fen);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de configuration");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
