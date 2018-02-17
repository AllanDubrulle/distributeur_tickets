package coeur;

import interfaceGraphique.CoeurAGraphiqueImpl;

public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{	
	private Controleur controleur;
	
	private static CoeurAGraphiqueImpl cAG = new CoeurAGraphiqueImpl();
	
	public void choixBillet() 
	{
		controleur.modifEtat(EtatChoixBillet.getInstance());
	}
	
	public void choixValidConfig() 
	{
		cAG.afficherSimulation();
	}
	
	public void choixDemarrerSimul() 
	{
		cAG.afficherAccueil();
	}
	
	public void choixValider() 
	{
		
	}
	
	public void choixAnnuler() 
	{
		
	}
	
	public void choixRechercheGD() 
	{
		
	}
	
	public void choixRechercheGA() 
	{
		
	}
	
	public void choixRechercheGDEtGA() 
	{
		
	}
	
	public void choixRenouvAbo() 
	{
		
	}
	
	public void choixAchatAbo() 
	{
		cAG.afficherChoixAchatAbo();
	}
	
	public void choixPass() 
	{
		
	}
	
	public void choixHoraire() 
	{
		
	}
	
	public void choixHoraireArrivee() 
	{
		
	}
	
	public void choixHoraireDepart() 
	{
		
	}
	
	public void choixHoraireItineraire() 
	{
		
	}

	public void choixPassIllimite() 
	{
		
	}

	public void choixPass10Trajets() 
	{
		
	}

	public void choixPass10Tajets2Gares() 
	{
		
	}

	public void choix5eur() 
	{
			
	}

	public void choix10eur() 
	{
			
	}

	public void choix50eur() 
	{
		
	}

	public void choix20eur() 
	{
		
	}

	public void choix1ct() 
	{
			
	}
	
	public void choix2cts() 
	{
		
	}

	public void choix5cts() 
	{
			
	}

	public void choix2eur() 
	{
			
	}

	public void choix10cts() 
	{
		
	}

	public void choix1eur() 
	{
			
	}

	public void choix50cts() 
	{
			
	}

	public void choix20cts() 
	{
		
	}

	public void choixScanneurOK() 
	{
		
	}

	public void choixScanneurInserer() 
	{
			
	}

	public void choixRetour() 
	{
		
	}

	public void choixPaiement() 
	{
		
	}

	public void choixOk() 
	{
		
	}

	public void choixOui() 
	{
		
	}

	public void choixNon() 
	{
		
	}

	public void choixRetourEcranPrinc() 
	{
		
	}

	public void choixPaiementParCarte() 
	{
		
	}

	public void choixPaiementLiquide() 
	{
		
	}

	public void choixChangerHeure() 
	{
		
	}

	public void choixScannerCode() 
	{
		
	}

	public void choixTaperCodeAbo() 
	{
		
	}
}