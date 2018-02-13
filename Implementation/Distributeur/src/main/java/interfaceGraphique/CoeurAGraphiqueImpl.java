package interfaceGraphique;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	public Base fenetreSim = new Base();
	private FConfiguration fenetreConfig = new FConfiguration();
	public static Stage primaryStage = new Stage();
	public StackPane root = new StackPane();
	public static Fenetre fen;
	public void afficherChoixBillet() {
		fenetreSim.afficher(new FBillet());
	}
	
	public void afficherCreationBillet() {
		
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
	public void afficherConfiguration() {
        root.getChildren().add(fenetreConfig);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de configuration");
        primaryStage.show();
	}
	public void afficherSimulation() {
		Stage stage = new Stage();
        root.getChildren().add(fenetreSim);
        Scene scene = new Scene(root, 1300, 800);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Fenêtre de simulation");
        stage.show();
        primaryStage.close();
	}
	public void afficherAcceuil() {
		fenetreSim.afficher(new FMenu());
	}
	
}
