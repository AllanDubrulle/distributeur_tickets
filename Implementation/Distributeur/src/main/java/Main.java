import javafx.application.Application;
import javafx.stage.Stage;
import interfaceGraphique.*;

class Main extends Application 
{	
	public void start(Stage stage) {
		CoeurAGraphiqueImpl cAG = new CoeurAGraphiqueImpl();
		cAG.afficherConfiguration();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}