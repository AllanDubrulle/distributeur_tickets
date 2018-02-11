package interfaceGraphique;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	public static Stage primaryStage = new Stage();
	public static Fenetre fen;
	public void afficherChoixBillet() {
        FBillet fen = new FBillet();
        FSimulation.fenetre = fen;
	}
	
	public void afficherCreationBillet() {
		// TODO Auto-generated method stub
		
	}

	public void afficherPaiement() {
		// TODO Auto-generated method stub
		
	}

	public void afficherParCarte() {
		// TODO Auto-generated method stub
		
	}

	public void afficherAttentePIN() {
		// TODO Auto-generated method stub
		
	}

	public void afficherValidationPaiement() {
		// TODO Auto-generated method stub
		
	}
	public void afficherMenuPrincipal() {
		
	}
	public static void afficherConfiguration() {
        FConfiguration fen = new FConfiguration();
        StackPane root = new StackPane();
        root.getChildren().add(fen);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de configuration");
        primaryStage.show();
	}

	public static void afficherSimulation() {
		Base fen = new Base();
        StackPane root = new StackPane();
        root.getChildren().add(fen);
        Scene scene = new Scene(root, 1300, 800);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de simulation");
        primaryStage.show();
	}
	
}
