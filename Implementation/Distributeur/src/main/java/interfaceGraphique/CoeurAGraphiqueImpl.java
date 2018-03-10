package interfaceGraphique;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	private static CoeurAGraphiqueImpl instance;
	private Stage pStage = new Stage();
	private Stage pStage2 = new Stage();
	private FChoixParLiquide fLiquide;
	private FBillet fenBillet;
	private FAboRenouvScanne fenAboScanne;
	private FChoixAbo choixAbo;
	private FPass1 fenPass1;
	private FPass2 fenPass2;
	private FPass3 fenPass3;
	
	
	public Stage getStage() 
	{
		return pStage;
	}
	public Stage getStage2() 
	{
		return pStage2;
	}
	
	private CoeurAGraphiqueImpl(){}
	
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
		FenetreSimulation.getInstance().afficher(new FSimulationAcceuil(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherMenu() 
	{
		FenetreSimulation.getInstance().afficher(new FMenu(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherFin() 
	{
		FenetreSimulation.getInstance().afficher(new FFin(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherChoixBillet() 
	{
		this.fenBillet = new FBillet(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenBillet);
	}
	public void afficherChoixAchatAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FAboAchat(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixRenouvAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FAboRenouv1(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixPass() 
	{
		FenetreSimulation.getInstance().afficher(new FPassMenu(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixPassIllimite() 
	{
		this.fenPass1=new FPass1(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenPass1);
	}
	public void afficherChoixPass10Trajets() 
	{
		this.fenPass2=new FPass2(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenPass2);
	}
	public void afficherChoixPass10Trajets2Gares() 
	{
		this.fenPass3=new FPass3(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenPass3);
	}
	public void afficherChoixHoraire() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireMenu(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixItineraire() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireArEtDep(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixArrivee() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireArrivee(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixDepart() 
	{
		FenetreSimulation.getInstance().afficher(new FHoraireDepart(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherRecapBillet() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapBillet(fenBillet, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRecapAchatAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapAboAchat((FAboAchat)FenetreSimulation.getInstance().getEcran(), FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRecapRenouvAbo() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapAboRenouv((FAboRenouv2)FenetreSimulation.getInstance().getEcran(), FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRecapRenouvAboScanne() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapAboRenouvScanne(fenAboScanne, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRenouvScanne()
	{
		this.fenAboScanne = new FAboRenouvScanne(choixAbo, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenAboScanne);
	}
	public void afficherRecapPassIllimite() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapPass1(fenPass1, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRecapPass10Trajets() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapPass2(fenPass2, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRecapPass10Trajets2Gares() 
	{
		FenetreSimulation.getInstance().afficher(new FRecapPass3(fenPass3, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherResultatsHoraires() 
	{
		FenetreSimulation.getInstance().afficher(new FResultatsHoraires(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherNumAbo() 
	{
		StackPane root2 = new StackPane();
		this.choixAbo = new FChoixAbo();
		FChoixAbo fen = choixAbo;
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro d'abonnement");
		pStage.show();
	}
	public void afficherChoixTaperCode() 
	{
		FenetreSimulation.getInstance().afficher(new FAboRenouv2(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherPaiement() 
	{
		FenetreSimulation.getInstance().afficher(new FChoixPaiement(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixParLiquide() 
	{
		fLiquide = new FChoixParLiquide(fenBillet, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
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
		pStage.setTitle("Choix du numéro de carte");
		pStage.show();
	}
	public void afficherInsertionCarte() 
	{
		FenetreSimulation.getInstance().afficher(new FInsererCarte(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherAttentePIN() 
	{
		FenetreSimulation.getInstance().afficher(new FAttenteCodePIN(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}	
	public void afficherCodePINIncor() 
	{
		FenetreSimulation.getInstance().afficher(new FCodePINIncor(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRendreMonnaie() 
	{
		/*StackPane root2 = new StackPane();
		FRendreMonnaie fen = new FRendreMonnaie();
		Stage pStage3 = new Stage();
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage3.setResizable(false);
		pStage3.setScene(sc);
		pStage3.setTitle("Vider le bac de réception");
		pStage3.show();
		afficherRendu();*/
	}

	public void afficherImpression() 
	{
		FenetreSimulation.getInstance().afficher(new FImpression(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherViderBacRecep() 
	{
		FenetreSimulation.getInstance().afficher(new FBacReception(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void insererMonnaie(double i)
	{
		fLiquide.setMontantIntroduit(fLiquide.getMontantIntroduit() + i);
	}
	public void afficherBillet()
	{
		StackPane root2 = new StackPane();
		AfficherBillet billet = new AfficherBillet(fenBillet);
		Stage pStage4 = new Stage();
		Scene sc = new Scene(root2, 580,300);
		root2.getChildren().add(billet);
		pStage4.setResizable(false);
		pStage4.setScene(sc);
		pStage4.setTitle("Billet");
		pStage4.show();
	}
	public void afficherRecu()
	{
		StackPane root2 = new StackPane();
		AfficherRecu billet = new AfficherRecu(fLiquide, fenBillet);
		Stage pStage5 = new Stage();
		Scene sc = new Scene(root2, 250, 300);
		root2.getChildren().add(billet);
		pStage5.setResizable(false);
		pStage5.setScene(sc);
		pStage5.setTitle("Recu");
		pStage5.show();
	}
	public void afficherRendu()
	{
		StackPane root2 = new StackPane();
		AfficherRendu billet = new AfficherRendu(fLiquide, fenBillet);
		Stage pStage6 = new Stage();
		Scene sc = new Scene(root2, 250, 560);
		root2.getChildren().add(billet);
		pStage6.setResizable(false);
		pStage6.setScene(sc);
		pStage6.setTitle("Monnaie rendue");
		pStage6.show();
	}
	public void effacerPIN()
	{
		LecteurCarte.getInstance(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()).getField().clear();
	}
	public void afficherDemandeRecu()
	{
		FenetreSimulation.getInstance().afficher(new FDemandeRecu(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
		if (fLiquide != null)
			fLiquide.setMontantIntroduit(0);
		
	}
}