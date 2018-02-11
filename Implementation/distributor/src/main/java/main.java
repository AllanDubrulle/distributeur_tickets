import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application {

    public static Stage primaryStage = new Stage();
    @Override
    public void start(Stage primaryStage) {
        primaryStage = DistributeurTest.primaryStage;
        Base fen = new Base();
        StackPane root = new StackPane();
        root.getChildren().add(fen);
        Scene scene = new Scene(root, 1300, 800);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de simulation");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
