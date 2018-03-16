package coeur;

import java.util.Date;

import stockage.ErreurDEncodage;

public interface GraphiqueACoeur 
{	
	public void choixDemarrerSimul();
	public void choixAnnuler();
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
	
	public void choixRechercheGD();
	public void choixRechercheGA();
	public void choixRechercheGDEtGA();
	public void choixChangerHeure();
	
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
	public void InfoBillet(Date dateValidite, int nbrBillet, int jour, String gareDepart,String gareArrivee,String typeBillet,
			String reduction, boolean allerRetour) throws ErreurDEncodage;
}