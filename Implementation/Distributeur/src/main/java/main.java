import javafx.application.Application;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class main extends Application {
    @Override
    public void start(Stage primaryStage) {
        CoeurAGraphiqueImpl.afficherConfiguration();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
