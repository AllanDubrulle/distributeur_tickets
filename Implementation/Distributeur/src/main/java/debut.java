import javafx.application.Application;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class debut extends Application {
	
    public void start(Stage primaryStage) {
    	CoeurAGraphiqueImpl coeurAGraph = new CoeurAGraphiqueImpl();
    	coeurAGraph.afficherConfiguration();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
