package Main;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class Main extends Application 
{	
	private static Stage primaryStage = new Stage();
	
	public void start(Stage stage)
	{
		StackPane root = new StackPane();
		Rectangle2D screen = Screen.getPrimary().getVisualBounds();
        root.getChildren().add(FenetreConfiguration.getInstance());
        Scene scene = new Scene(root, screen.getWidth(), screen.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de configuration");
        primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public static Stage getStage()
	{
		return primaryStage;
	}
}