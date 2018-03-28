package interfaceGraphique;

import coeur.Commande;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import stockage.BilletMonnaie;
import stockage.Piece;
import stockage.Rendu;
import stockage.imprimable.Billet;
import stockage.imprimable.Abonnement;
import stockage.imprimable.Pass;
import stockage.imprimable.TitreDeTransport;

public class CoeurAGraphiqueImpl implements CoeurAGraphique
{
	private static CoeurAGraphiqueImpl instance;
	private FChoixParLiquide fLiquide;
	private FBillet fenBillet;
	private FAboAchat fenAboAchat;
	private FAboRenouveler fenAboRenouv;
	private FChoixAbo choixAbo;
	private FPassIllimite fenPassIllimite;
	private FPass10Trajets fenPass10Trajets;
	private FPass10Trajets2Gares fenPass10Trajets2Gares;
	
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
	public void afficherMenu(boolean imprimante, boolean fentesOuLecteur) 
	{
		boolean possible = imprimante && fentesOuLecteur;
		FenetreSimulation.getInstance().afficher(new FMenu(possible, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherFin() 
	{
		FenetreSimulation.getInstance().afficher(new FFin(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	

	public void afficherChoixPass() 
	{
		FenetreSimulation.getInstance().afficher(new FPassMenu(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
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
		
	public void afficherResultatsHoraires(boolean imprimante, String[] tab) 
	{
		FenetreSimulation.getInstance().afficher(new FResultatsHoraires(imprimante, tab, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherNumAbo() 
	{
		StackPane root2 = new StackPane();
		Stage pStage = new Stage();
		this.choixAbo = new FChoixAbo(pStage,fenAboRenouv);
		FChoixAbo fen = choixAbo;
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro d'abonnement");
		pStage.show();
	}

	
	public void afficherPaiement(boolean fentes, boolean lecteur) 
	{
		FenetreSimulation.getInstance().afficher(new FChoixPaiement(fentes, lecteur, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherChoixParLiquide(double prix) 
	{
		fLiquide = new FChoixParLiquide(prix, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
		FenetreSimulation.getInstance().afficher(fLiquide);
	}
	public void afficherChoixParCarte() 
	{
		StackPane root2 = new StackPane();
		Stage pStage = new Stage();
		FChoixParCarte fen = new FChoixParCarte(pStage);
		Scene sc = new Scene(root2, 400,200);
		root2.getChildren().add(fen);
		pStage.setResizable(false);
		pStage.setScene(sc);
		pStage.setTitle("Choix du numéro de carte");
		pStage.show();
	}
	
	public void afficherImpressionHoraire(String[] tab)
	{
		StackPane root1 = new StackPane();
		AfficherHoraire afficheHoraire = new AfficherHoraire(tab);
		Stage stage1 = new Stage();
		Scene scene1 = new Scene(root1, 600,250);
		root1.getChildren().add(afficheHoraire);
		stage1.setResizable(false);
		stage1.setScene(scene1);
		stage1.setTitle("Horaire");
		stage1.show();
	}
	
	public void afficherInsertionCarte() 
	{
		FenetreSimulation.getInstance().afficher(new FInsererCarte(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherRetraitCarte()
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Carte ejectee.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherAttentePIN() 
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Veuillez entrer votre code PIN.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}	
	public void afficherCodePINIncor() 
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Code PIN incorrect. Veuillez reessayer.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void afficherSoldeInsuffisant() 
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Solde de la carte insuffisant. Ejection de la carte dans un instant.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherTropDeTentatives() 
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Code PIN incorrect. Veuillez recuperer votre carte.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherValidationPaiement() 
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Paiement effectue avec succes. Veuillez recuperer votre carte.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherImpression() 
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Impression en cours ...", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherPanne(String message)
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage(message, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherViderBacRecep() 
	{
		FenetreSimulation.getInstance().afficher(new FBacReception(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}

	public void afficherTitre(Commande commande, TitreDeTransport titre, double prix)
	{
		switch(commande)
		{
		case ACHATABO:
			Abonnement abonnement = (Abonnement) titre;
			StackPane root1 = new StackPane();
			AfficherAbo afficheAbo = new AfficherAbo(abonnement.getCodeBarre(), abonnement.getNom(), abonnement.getClasse().valeur(), abonnement.getGareDepart(), abonnement.getGareArrivee(), abonnement.getDateValidite(), abonnement.getDateExp(), abonnement.getReduction().toString(), abonnement.getType().toString(), prix );
			Stage stage1 = new Stage();
			Scene scene1 = new Scene(root1, 580,300);
			root1.getChildren().add(afficheAbo);
			stage1.setResizable(false);
			stage1.setScene(scene1);
			stage1.setTitle("Abonnement");
			stage1.show();
			break;
		case BILLET:
			Billet billet = (Billet) titre;
			StackPane root2 = new StackPane();
			AfficherBillet afficheBillet = new AfficherBillet(billet.getGareDepart(), billet.getGareArrivee(), billet.estAllerRetour(), billet.getClasse().valeur(), billet.getType().toString(), billet.getReduction().toString(), billet.getDateValidite(), prix );
			Stage stage2 = new Stage();
			Scene scene2 = new Scene(root2, 580,300);
			root2.getChildren().add(afficheBillet);
			stage2.setResizable(false);
			stage2.setScene(scene2);
			stage2.setTitle("Billet");
			stage2.show();
			break;
		case PASS10TRAJETS:
			Pass pass1 = (Pass) titre;
			StackPane root3 = new StackPane();
			AfficherPass10Trajets pass10Trajets = new AfficherPass10Trajets(pass1.getNom(), pass1.getClasse().valeur(), pass1.getReduction().toString(), pass1.getType().toString(), prix);
			Stage stage3 = new Stage();
			Scene scene3 = new Scene(root3, 580,350);
			root3.getChildren().add(pass10Trajets);
			stage3.setResizable(false);
			stage3.setScene(scene3);
			stage3.setTitle("Pass");
			stage3.show();
			break;
		case PASS10TRAJETS2GARES:
			Pass pass2 = (Pass) titre;
			StackPane root4 = new StackPane();
			AfficherPass10Trajets2Gares pass10Trajets2Gares = new AfficherPass10Trajets2Gares(pass2.getNom(), pass2.getGareDepart(), pass2.getGareArrivee(), pass2.getClasse().valeur(), pass2.getReduction().toString(), pass2.getType().toString(), prix);
			Stage stage4 = new Stage();
			Scene scene4 = new Scene(root4, 580,350);
			root4.getChildren().add(pass10Trajets2Gares);
			stage4.setResizable(false);
			stage4.setScene(scene4);
			stage4.setTitle("Pass");
			stage4.show();
			break;
		case PASSILLIMITE:
			Pass pass3 = (Pass) titre;
			StackPane root5 = new StackPane();
			AfficherPassIllimite passIllimite = new AfficherPassIllimite(pass3.getNom(), pass3.getClasse().valeur(), pass3.getReduction().toString(), pass3.getType().toString(), pass3.getNbrJours(), prix);
			Stage stage5 = new Stage();
			Scene scene5 = new Scene(root5, 580,265);
			root5.getChildren().add(passIllimite);
			stage5.setResizable(false);
			stage5.setScene(scene5);
			stage5.setTitle("Pass");
			stage5.show();
			break;
		case RENOUVELLEMENTABO:
			Abonnement abonnementRen = (Abonnement) titre;
			StackPane root6 = new StackPane();
			AfficherAbo afficheAboRen = new AfficherAbo(abonnementRen.getCodeBarre(), abonnementRen.getNom(), abonnementRen.getClasse().valeur(), abonnementRen.getGareDepart(), abonnementRen.getGareArrivee(), abonnementRen.getDateValidite(), abonnementRen.getDateExp(), abonnementRen.getReduction().toString(), abonnementRen.getType().toString(), prix );
			Stage stage6 = new Stage();
			Scene scene6 = new Scene(root6, 580,300);
			root6.getChildren().add(afficheAboRen);
			stage6.setResizable(false);
			stage6.setScene(scene6);
			stage6.setTitle("Abonnement");
			stage6.show();
			break;
		default:
			break;
		}
	}
	
	public void afficherRecu(double prix , double introduit , double rendu,String modePaiement)
	{
		StackPane root2 = new StackPane();
		AfficherRecu billet = new AfficherRecu(prix ,introduit ,rendu,modePaiement);
		Stage pStage5 = new Stage();
		Scene sc = new Scene(root2, 250, 270);
		root2.getChildren().add(billet);
		pStage5.setResizable(false);
		pStage5.setScene(sc);
		pStage5.setTitle("Recu");
		pStage5.show();
	}
	public void afficherRendu(Rendu monnaieRendu)
	{
		StackPane root2 = new StackPane();
		AfficherRendu billet = new AfficherRendu(monnaieRendu.getBillets().get(BilletMonnaie.B50),
				monnaieRendu.getBillets().get(BilletMonnaie.B20),
				monnaieRendu.getBillets().get(BilletMonnaie.B10),
				monnaieRendu.getBillets().get(BilletMonnaie.B5),
				monnaieRendu.getPieces().get(Piece.P200),
				monnaieRendu.getPieces().get(Piece.P100),
				monnaieRendu.getPieces().get(Piece.P50),
				monnaieRendu.getPieces().get(Piece.P20),
				monnaieRendu.getPieces().get(Piece.P10),
				monnaieRendu.getPieces().get(Piece.P5),
				monnaieRendu.getPieces().get(Piece.P2),
				monnaieRendu.getPieces().get(Piece.P1));
		Stage pStage6 = new Stage();
		Scene sc = new Scene(root2, 250, 385);
		root2.getChildren().add(billet);
		pStage6.setResizable(false);
		pStage6.setScene(sc);
		pStage6.setTitle("Monnaie rendue");
		pStage6.show();
	}
	public void afficherRendreMonnaieInseree()
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Probleme du monnayeur, veuillez recuperer votre monnaie.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherMessageDErreur()
	{
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Probleme technique. Veuillez prendre contact avec un technicien pour tout remboursement.", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void afficherDemandeRecu()
	{
		FenetreSimulation.getInstance().afficher(new FDemandeRecu(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
		
	}
	public void afficherRecapCommande(Commande commande,TitreDeTransport titre,double prix,int nbrTitre)
	{
		switch(commande)
		{
			case ACHATABO:
				Abonnement abonnement = (Abonnement) titre;
				FenetreSimulation.getInstance().afficher(new FRecapAboAchat(Integer.toString(abonnement.getCodeBarre()), abonnement.getNom(), abonnement.getRegNat(), 
						abonnement.getGareDepart(), abonnement.getGareArrivee(), abonnement.getValidite(), 	
						abonnement.getClasse().valeur(), abonnement.getReduction().toString(), abonnement.getType().toString(), prix, 	
						FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
			break;
			case BILLET:
				Billet billet = (Billet) titre;
				FenetreSimulation.getInstance().afficher(new FRecapBillet(billet.getGareDepart(), billet.getGareArrivee()
						, billet.estAllerRetour(), billet.getClasse().valeur(),
						billet.getType().toString(), billet.getReduction().toString(),
						nbrTitre, billet.getDateValidite(),
						prix , FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case PASS10TRAJETS:
				Pass pass1 = (Pass) titre;
				FenetreSimulation.getInstance().afficher(new FRecapPass10Trajets(pass1.getNom(), pass1.getClasse().valeur(), 
						pass1.getReduction().toString(), pass1.getType().toString(), prix, 
						FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case PASS10TRAJETS2GARES:
				Pass pass2 = (Pass) titre;
				FenetreSimulation.getInstance().afficher(new FRecapPass10Trajets2Gares(pass2.getNom(), pass2.getGareDepart(), 
						pass2.getGareArrivee(), pass2.getClasse().valeur(), pass2.getReduction().toString(), pass2.getType().toString(), prix, 
						FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case PASSILLIMITE:
				Pass pass3 = (Pass) titre;
				FenetreSimulation.getInstance().afficher(new FRecapPassIllimite(pass3.getNom(), pass3.getClasse().valeur(), 
						pass3.getType().toString(), pass3.getReduction().toString(), pass3.getNbrJours(), prix , 
						FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
			case RENOUVELLEMENTABO:
				Abonnement abonnementRen = (Abonnement) titre;
				FenetreSimulation.getInstance().afficher(new FRecapAboRenouveler(Integer.toString(abonnementRen.getCodeBarre()), abonnementRen.getNom(), abonnementRen.getRegNat(), 
						abonnementRen.getGareDepart(), abonnementRen.getGareArrivee(), abonnementRen.getValidite(), 	
						abonnementRen.getClasse().valeur(), abonnementRen.getReduction().toString(), abonnementRen.getType().toString(), prix, 	
						FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
				break;
		}
	}
	public void afficherChoixCommande(boolean scanneur, Commande commande)
	{
		switch(commande)
		{
			case ACHATABO:
				this.fenAboAchat = new FAboAchat(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenAboAchat);
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
				this.fenPass10Trajets2Gares=new FPass10Trajets2Gares(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenPass10Trajets2Gares);
				break;
			case PASSILLIMITE:
				this.fenPassIllimite=new FPassIllimite(FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenPassIllimite);
				break;
			case RENOUVELLEMENTABO:
				this.fenAboRenouv = new FAboRenouveler(scanneur, FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg());
				FenetreSimulation.getInstance().afficher(fenAboRenouv);
				break;
		}

	}

	public void actualiserMontant(double restant, double introduit)
	{
		fLiquide.actualiserMontant(restant, introduit);
		
	}

	public void carteNonBloquee()
	{
		FenetreSimulation.getInstance().carteNonBloquee();
	}

	public void carteBloquee() 
	{
		FenetreSimulation.getInstance().carteBloquee();
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Carte bloquee", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void lecteurEnPanne()
	{
		FenetreSimulation.getInstance().lecteurEnPanne();
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Lecteur en panne", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	public void lecteurPasEnPanne()
	{
		FenetreSimulation.getInstance().lecteurPasEnPanne();
	}
	
	public void fenteBilletEnPanne()
	{
		FenetreSimulation.getInstance().fenteBilletEnPanne();
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Fente a billet en panne", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void fenteBilletPasEnPanne()
	{
		FenetreSimulation.getInstance().fenteBilletPasEnPanne();
	}
	public void fentePieceEnPanne()
	{
		FenetreSimulation.getInstance().fentePieceEnPanne();
		FenetreSimulation.getInstance().afficher(new FAfficherMessage("Fente a piece en panne", FenetreSimulation.getInstance().getRapportHaut(), FenetreSimulation.getInstance().getRapportLarg()));
	}
	
	public void fentePiecePasEnPanne()
	{
		FenetreSimulation.getInstance().fentePiecePasEnPanne();
	}

	public void imprimanteEnPanne()
	{
		FenetreSimulation.getInstance().imprimanteEnPanne();
	}
	
	public void imprimantePasEnPanne()
	{
		FenetreSimulation.getInstance().imprimantePasEnPanne();
	}
	
	public void scanneurEnPanne()
	{
		FenetreSimulation.getInstance().scanneurEnPanne();
	}
	
	public void scanneurPasEnPanne()
	{
		FenetreSimulation.getInstance().scanneurPasEnPanne();
	}
}