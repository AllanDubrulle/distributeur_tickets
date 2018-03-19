package coeur;

import java.sql.SQLException;
import java.util.Date;

import stockage.Composant;
import stockage.ErreurDEncodage;

public interface GraphiqueACoeur 
{	
	public void choixDemarrerSimul();
	public void choixAnnuler();
	public void choixRetourTitre();
	public void choixRetourRecherche();
	public void choixRetour();
	public void choixOk();
	public void choixOui();
	public void choixNon();
	public void choixRetourEcranPrinc();
	
	public void choixBillet();
	public void choixRenouvAbo();
	public void choixAchatAbo();
	public void choixPass();
	public void choixPassIllimite();
	public void choixPass10Trajets();
	public void choixPass10Tajets2Gares();
	public void choixHoraire();
	public void choixHoraireArrivee();
	public void choixHoraireDepart();
	public void choixHoraireItineraire();
	
	public void choixRechercheGD(String gareDepart, int heure, int minute) throws SQLException;
	public void choixRechercheGA(String gareArrivee, int heure, int minute) throws SQLException;
	public void choixRechercheGDEtGA(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException;
	
	public void choixValider();
	public void choixValiderRenouvAbo();
	public void choixValiderRenouvAboScanne();
	
	public void choixScannerCode();
	public void choixTaperCodeAbo();
	public void choixAnnulerScanner();
	public void choixValiderNumAbo();
	
	public void choix5eur();
	public void choix10eur();
	public void choix50eur();
	public void choix20eur();
	public void choix1ct();
	public void choix2cts();
	public void choix5cts();
	public void choix2eur();
	public void choix10cts();
	public void choix1eur();
	public void choix50cts();
	public void choix20cts();
	
	public void choixScanneurOK();
	public void choixScanneurInserer();
	
	public void choixPaiement();
	public void choixPaiementParCarte();
	public void choixPaiementLiquide();
	public void choixValiderNumCarte();
	public void infoBillet(Date dateValidite, int nbrBillet, int jour, String gareDepart, String gareArrivee, String type, String reduction, boolean allerRetour) throws ErreurDEncodage;
	public void infoAbo(int validite, String gareDepart, String gareArrivee, int classe, String reduction, String type, String nom, String registre) throws ErreurDEncodage;
	public void infoAboRen(int validite, String numAbo) throws ErreurDEncodage;
	
	public void viderCaisse();
	public void TombeEnPanne(Composant composant); // pas sur que ce soit la solution 
	public boolean existanceGare(String gare);
	public boolean existanceTrajet(String gareDepart, String gareArrivee);
	public String[] listeNumeroAbonnement();
}