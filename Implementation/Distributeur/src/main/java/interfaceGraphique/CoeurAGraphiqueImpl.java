package interfaceGraphique;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import interfaceGraphique.*;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	private Base fenetre;
	private FConfiguration fenetreConfig;
	public static Stage primaryStage = new Stage();
	public static Fenetre fen;
	public void afficherChoixBillet() {
        fen = new FBillet();
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
	public void afficherConfiguration() {
        fenetreConfig = new FConfiguration();
        StackPane root = new StackPane();
        root.getChildren().add(fenetreConfig);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de configuration");
        primaryStage.show();
	}

	public void afficherSimulation() {
		fenetre = new Base();
        StackPane root = new StackPane();
        root.getChildren().add(fenetre);
        Scene scene = new Scene(root, 1300, 800);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenêtre de simulation");
        primaryStage.show();
	}
	public void afficherAcceuil() {
		 fen = new FSimulationAcceuil();
         FSimulation.fenetre = fen;
         fenetre.getChildren().setAll(fen);
	}
	
}
