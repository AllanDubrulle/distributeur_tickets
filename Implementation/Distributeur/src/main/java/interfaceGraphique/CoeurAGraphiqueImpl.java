package interfaceGraphique;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	private static FenetreSimulation fenetreSim = FenetreSimulation.getInstance();
	private static CoeurAGraphiqueImpl instance;
	private Stage pStage = new Stage();
	
	public Stage getStage() 
	{
		return pStage;
	}
	
	private CoeurAGraphiqueImpl()
	{
		
	}
	
	public static CoeurAGraphiqueImpl getInstance()
	{
		if(instance==null)
		{
			instance = new CoeurAGraphiqueImpl();
		}
		return instance;
		
	}	
	
	public void afficherAccueil() 
	{
		fenetreSim.afficher(FMenu.getInstance());
	}
	public void afficherFin() 
	{
		fenetreSim.afficher(FFin.getInstance());
	}
	
	public void afficherChoixBillet() 
	{
		fenetreSim.afficher(FBillet.getInstance());
	}
	public void afficherChoixAchatAbo() 
	{
		fenetreSim.afficher(FAboAchat.getInstance());
	}
	public void afficherChoixRenouvAbo() 
	{
		fenetreSim.afficher(FAboRenouv1.getInstance());
	}
	public void afficherChoixPass() 
	{
		fenetreSim.afficher(FPassMenu.getInstance());
	}
	public void afficherChoixPassIllimite() 
	{
		fenetreSim.afficher(FPass1.getInstance());
	}
	public void afficherChoixPass10Trajets() 
	{
		fenetreSim.afficher(FPass2.getInstance());
	}
	public void afficherChoixPass10Trajets2Gares() 
	{
		fenetreSim.afficher(FPass3.getInstance());
	}
	public void afficherChoixHoraire() 
	{
		fenetreSim.afficher(FHoraireMenu.getInstance());
	}
	public void afficherChoixItineraire() 
	{
		fenetreSim.afficher(FHoraireArEtDep.getInstance());
	}
	public void afficherChoixArrivee() 
	{
		fenetreSim.afficher(FHoraireArrivee.getInstance());
	}
	public void afficherChoixDepart() 
	{
		fenetreSim.afficher(FHoraireDepart.getInstance());
	}
	
	public void afficherRecapBillet() 
	{
		fenetreSim.afficher(FRecapBillet.getInstance());
	}
	public void afficherRecapAchatAbo() 
	{
		fenetreSim.afficher(FRecapAboAchat.getInstance());
	}
	public void afficherRecapRenouvAbo() 
	{
		fenetreSim.afficher(FRecapAboRenouv.getInstance());
	}
	public void afficherRecapPassIllimite() 
	{
		fenetreSim.afficher(FRecapPass1.getInstance());
	}
	public void afficherRecapPass10Trajets() 
	{
		fenetreSim.afficher(FRecapPass2.getInstance());
	}
	public void afficherRecapPass10Trajets2Gares() 
	{
		fenetreSim.afficher(FRecapPass3.getInstance());
	}
	
	public void afficherResultatsHoraires() 
	{
		fenetreSim.afficher(FResultatsHoraires.getInstance());
	}
	
	public void afficherNumAbo() 
	{
		StackPane root2 = new StackPane();
		FChoixAbo fen = FChoixAbo.getInstance();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro d'abonnement");
		pStage.show();
	}
	public void afficherChoixTaperCode() 
	{
		fenetreSim.afficher(FAboRenouv2.getInstance());
	}
	
	public void afficherPaiement() 
	{
		fenetreSim.afficher(FChoixPaiement.getInstance());
	}
	public void afficherChoixParLiquide() 
	{
		fenetreSim.afficher(FChoixParLiquide.getInstance());
	}
	public void afficherChoixParCarte() 
	{
		StackPane root2 = new StackPane();
		FChoixParCarte fen = FChoixParCarte.getInstance();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro de carte");
		pStage.show();
	}
	public void afficherAttentePIN() 
	{
		fenetreSim.afficher(FAttenteCodePIN.getInstance());
	}	
	public void afficherCodePINIncor() 
	{
		fenetreSim.afficher(FCodePINIncor.getInstance());
	}
	public void afficherValidationPaiement() 
	{
		fenetreSim.afficher(FPaiementOk.getInstance());
	}
	public void afficherRendreMonnaie() 
	{
		fenetreSim.afficher(FRendreMonnaie.getInstance());
	}

	public void afficherImpression() 
	{
		fenetreSim.afficher(FImpression.getInstance());
	}
	public void afficherViderBacRecep() 
	{
		StackPane root2 = new StackPane();
		FBacReception fen = FBacReception.getInstance();
		Stage pStage = new Stage();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Vider le bac de réception");
		pStage.show();
	}
	
}