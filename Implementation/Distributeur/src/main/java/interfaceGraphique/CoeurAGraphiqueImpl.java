package interfaceGraphique;

import coeur.Commande;
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
	private FPassIllimite fenPassIllimite;
	private FPass10Trajets fenPass10Trajets;
	private FPass10Trajets2Gares fen10Trajets2Gares;
	
	
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
		this.fenPassIllimite=new FPassIllimite(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenPassIllimite);
	}
	public void afficherChoixPass10Trajets() 
	{
		this.fenPass10Trajets=new FPass10Trajets(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fenPass10Trajets);
	}
	public void afficherChoixPass10Trajets2Gares() 
	{
		this.fen10Trajets2Gares=new FPass10Trajets2Gares(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fen10Trajets2Gares);
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
		pStage.setTitle("Choix du num�ro d'abonnement");
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
		pStage.setTitle("Choix du num�ro de carte");
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
		pStage3.setTitle("Vider le bac de r�ception");
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
	public void afficherTitre(Commande commande)
	{
		if (commande == Commande.BILLET)
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
	public void afficherRecapCommande(Commande commande)
	{
		switch(commande)
		{
			case ACHATABO:
				FenetreSimulation.getInstance().afficher(new FRecapAboAchat((FAboAchat)FenetreSimulation.getInstance().getEcran(), FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case BILLET:
				FenetreSimulation.getInstance().afficher(new FRecapBillet(fenBillet, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case PASS10TRAJETS:
				FenetreSimulation.getInstance().afficher(new FRecapPass10Trajets(fenPass10Trajets, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case PASS10TRAJETS2GARES:
				FenetreSimulation.getInstance().afficher(new FRecapPass10Trajets2Gares(fen10Trajets2Gares, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case PASSILLIMITE:
				FenetreSimulation.getInstance().afficher(new FRecapPassIllimite(fenPassIllimite, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case REVOUVELLEMENTABO:
				FenetreSimulation.getInstance().afficher(new FRecapAboRenouv((FAboRenouv2)FenetreSimulation.getInstance().getEcran(), FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
		}
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
	public void afficherChoixCommande(Commande commande)
	{
		switch(commande)
		{
			case ACHATABO:
				FenetreSimulation.getInstance().afficher(new FAboAchat(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case BILLET:
				this.fenBillet = new FBillet(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenBillet);
				break;
			case PASS10TRAJETS:
				this.fenPass10Trajets=new FPass10Trajets(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenPass10Trajets);
				break;
			case PASS10TRAJETS2GARES:
				this.fen10Trajets2Gares=new FPass10Trajets2Gares(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fen10Trajets2Gares);
				break;
			case PASSILLIMITE:
				this.fenPassIllimite=new FPassIllimite(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenPassIllimite);
				break;
			case REVOUVELLEMENTABO:
				FenetreSimulation.getInstance().afficher(new FAboRenouv1(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
		}
		
	}
}