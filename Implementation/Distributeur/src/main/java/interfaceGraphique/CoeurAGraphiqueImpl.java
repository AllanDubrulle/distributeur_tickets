package interfaceGraphique;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
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
		FenetreSimulation.getInstance().afficher(new FSimulationAcceuil());
	}
	public void afficherMenu() 
	{
		FenetreSimulation.getInstance().afficher(new FMenu());
	}
	public void afficherFin() 
	{
		FenetreSimulation.getInstance().afficher(new FFin());
	}
	
	public void afficherChoixBillet() 
	{
		FenetreSimulation.getInstance().afficher(new FBillet());
	}
	public void afficherChoixAchatAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FAboAchat());
	}
	public void afficherChoixRenouvAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FAboRenouv1());
	}
	public void afficherChoixPass() 
	{
		FenetreSimulation.getInstance().afficher(new FPassMenu());
	}
	public void afficherChoixPassIllimite() 
	{
		FenetreSimulation.getInstance().afficher(new FPass1());
	}
	public void afficherChoixPass10Trajets() 
	{
		FenetreSimulation.getInstance().afficher(new FPass2());
	}
	public void afficherChoixPass10Trajets2Gares() 
	{
		FenetreSimulation.getInstance().afficher(new FPass3());
	}
	public void afficherChoixHoraire() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireMenu());
	}
	public void afficherChoixItineraire() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireArEtDep());
	}
	public void afficherChoixArrivee() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireArrivee());
	}
	public void afficherChoixDepart() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireDepart());
	}
	
	public void afficherRecapBillet() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapBillet());
	}
	public void afficherRecapAchatAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapAboAchat((FAboAchat)FenetreSimulation.getInstance().getEcran()));
		//peut g�n�rer un probl�me !!!! 
	}
	public void afficherRecapRenouvAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapAboRenouv((FAboRenouv2)FenetreSimulation.getInstance().getEcran()));
		//peut g�n�rer un probl�me !!!! 
	}
	public void afficherRecapRenouvAboScanne() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapAboRenouvScanne());
	}
	public void afficherRenouvScanne()
	{
		FenetreSimulation.getInstance().afficher(new FAboRenouvScanne());
	}
	public void afficherRecapPassIllimite() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapPass1());
	}
	public void afficherRecapPass10Trajets() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapPass2());
	}
	public void afficherRecapPass10Trajets2Gares() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapPass3());
	}
	
	public void afficherResultatsHoraires() 
	{
		FenetreSimulation.getInstance().afficher(new FResultatsHoraires());
	}
	
	public void afficherNumAbo() 
	{
		StackPane root2 = new StackPane();
		FChoixAbo fen = new FChoixAbo();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du num�ro d'abonnement");
		pStage.show();
	}
	public void afficherChoixTaperCode() 
	{
		FenetreSimulation.getInstance().afficher(new FAboRenouv2());
	}
	
	public void afficherPaiement() 
	{
		FenetreSimulation.getInstance().afficher(new FChoixPaiement());
	}
	public void afficherChoixParLiquide() 
	{
		fLiquide = new FChoixParLiquide();
		FenetreSimulation.getInstance().afficher(fLiquide);
	}
	public void afficherChoixParCarte() 
	{
		StackPane root2 = new StackPane();
		FChoixParCarte fen = new FChoixParCarte();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du num�ro de carte");
		pStage.show();
	}
	public void afficherInsertionCarte() 
	{
		FenetreSimulation.getInstance().afficher(new FInsererCarte());
	}
	public void afficherAttentePIN() 
	{
		FenetreSimulation.getInstance().afficher(new FAttenteCodePIN());
	}	
	public void afficherCodePINIncor() 
	{
		FenetreSimulation.getInstance().afficher(new FCodePINIncor());
	}
	public void afficherValidationPaiement() 
	{
		FenetreSimulation.getInstance().afficher(new FPaiementOk());
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
		pStage3.setTitle("Vider le bac de r�ception");
		pStage3.show();
	}

	public void afficherImpression() 
	{
		FenetreSimulation.getInstance().afficher(new FImpression());
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
		pStage2.setTitle("Vider le bac de r�ception");
		pStage2.show();
	}
	public void insererMonnaie(double i)
	{
		fLiquide.setMontantIntroduit(fLiquide.getMontantIntroduit() + i);
	}
}