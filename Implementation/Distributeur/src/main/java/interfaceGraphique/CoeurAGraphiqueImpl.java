package interfaceGraphique;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	private static FenetreSimulation fenetreSim = FenetreSimulation.getInstance();
	private static CoeurAGraphiqueImpl instance;
	private Stage pStage = new Stage();
	private Stage pStage2 = new Stage();
	private Stage pStage3 = new Stage();
	private FChoixParLiquide fLiquide;
	
	public Stage getStage() 
	{
		return pStage;
	}
	public Stage getStage2() 
	{
		return pStage2;
	}
	public Stage getStage3() 
	{
		return pStage3;
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
		fenetreSim.afficher(new FSimulationAcceuil());
	}
	public void afficherMenu() 
	{
		fenetreSim.afficher(new FMenu());
	}
	public void afficherFin() 
	{
		fenetreSim.afficher(new FFin());
	}
	
	public void afficherChoixBillet() 
	{
		fenetreSim.afficher(new FBillet());
	}
	public void afficherChoixAchatAbo() 
	{
		fenetreSim.afficher(new FAboAchat());
	}
	public void afficherChoixRenouvAbo() 
	{
		fenetreSim.afficher(new FAboRenouv1());
	}
	public void afficherChoixPass() 
	{
		fenetreSim.afficher(new FPassMenu());
	}
	public void afficherChoixPassIllimite() 
	{
		fenetreSim.afficher(new FPass1());
	}
	public void afficherChoixPass10Trajets() 
	{
		fenetreSim.afficher(new FPass2());
	}
	public void afficherChoixPass10Trajets2Gares() 
	{
		fenetreSim.afficher(new FPass3());
	}
	public void afficherChoixHoraire() 
	{
		fenetreSim.afficher(new FHoraireMenu());
	}
	public void afficherChoixItineraire() 
	{
		fenetreSim.afficher(new FHoraireArEtDep());
	}
	public void afficherChoixArrivee() 
	{
		fenetreSim.afficher(new FHoraireArrivee());
	}
	public void afficherChoixDepart() 
	{
		fenetreSim.afficher(new FHoraireDepart());
	}
	
	public void afficherRecapBillet() 
	{
		fenetreSim.afficher(new FRecapBillet());
	}
	public void afficherRecapAchatAbo() 
	{
		fenetreSim.afficher(new FRecapAboAchat());
	}
	public void afficherRecapRenouvAbo() 
	{
		fenetreSim.afficher(new FRecapAboRenouv());
	}
	public void afficherRecapRenouvAboScanne() 
	{
		fenetreSim.afficher(new FRecapAboRenouvScanne());
	}
	public void afficherRenouvScanne()
	{
		fenetreSim.afficher(new FAboRenouvScanne());
	}
	public void afficherRecapPassIllimite() 
	{
		fenetreSim.afficher(new FRecapPass1());
	}
	public void afficherRecapPass10Trajets() 
	{
		fenetreSim.afficher(new FRecapPass2());
	}
	public void afficherRecapPass10Trajets2Gares() 
	{
		fenetreSim.afficher(new FRecapPass3());
	}
	
	public void afficherResultatsHoraires() 
	{
		fenetreSim.afficher(new FResultatsHoraires());
	}
	
	public void afficherNumAbo() 
	{
		StackPane root2 = new StackPane();
		FChoixAbo fen = new FChoixAbo();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro d'abonnement");
		pStage.show();
	}
	public void afficherChoixTaperCode() 
	{
		fenetreSim.afficher(new FAboRenouv2());
	}
	
	public void afficherPaiement() 
	{
		fenetreSim.afficher(new FChoixPaiement());
	}
	public void afficherChoixParLiquide() 
	{
		fLiquide = new FChoixParLiquide();
		fenetreSim.afficher(fLiquide);
	}
	public void afficherChoixParCarte() 
	{
		StackPane root2 = new StackPane();
		FChoixParCarte fen = new FChoixParCarte();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro de carte");
		pStage.show();
	}
	public void afficherInsertionCarte() 
	{
		fenetreSim.afficher(new FInsererCarte());
	}
	public void afficherAttentePIN() 
	{
		fenetreSim.afficher(new FAttenteCodePIN());
	}	
	public void afficherCodePINIncor() 
	{
		fenetreSim.afficher(new FCodePINIncor());
	}
	public void afficherValidationPaiement() 
	{
		fenetreSim.afficher(new FPaiementOk());
		if (fLiquide != null)
			fLiquide.setMontantIntroduit(0);
	}
	public void afficherRendreMonnaie() 
	{
		StackPane root2 = new StackPane();
		FRendreMonnaie fen = new FRendreMonnaie();
		pStage3 = new Stage();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage3.setResizable(false);
		pStage3.setScene(sc);
		pStage3.setTitle("Vider le bac de réception");
		pStage3.show();
	}

	public void afficherImpression() 
	{
		fenetreSim.afficher(new FImpression());
	}
	public void afficherViderBacRecep() 
	{
		StackPane root2 = new StackPane();
		FBacReception fen = new FBacReception();
		pStage2 = new Stage();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage2.setResizable(false);
		pStage2.setScene(sc);
		pStage2.setTitle("Vider le bac de réception");
		pStage2.show();
	}
	public void insererMonnaie(double i)
	{
		fLiquide.setMontantIntroduit(fLiquide.getMontantIntroduit() + i);
	}
}