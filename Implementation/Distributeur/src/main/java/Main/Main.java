package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class Main extends Application 
{	
	private static Stage primaryStage = new Stage();
	
	public void start(Stage stage)
	{
		StackPane root = new StackPane();
        root.getChildren().add(FenetreConfiguration.getInstance());
        Scene scene = new Scene(root, 1300, 800);
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