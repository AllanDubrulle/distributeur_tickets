package coeur;

public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{	
	private Controleur controleur = Controleur.getInstance();
	private static GraphiqueACoeurImpl instance;
	
	private GraphiqueACoeurImpl() 
	{
	
	}
	
	public static GraphiqueACoeurImpl getInstance()
	{
		if(instance==null)
		{
			instance = new GraphiqueACoeurImpl();
		}
		return instance;
		
	}	
	
	public void choixBillet() 
	{
		controleur.getEtatActuel().choixBillet();
	}
	
	public void choixDemarrerSimul() 
	{
		controleur.getEtatActuel().demarreSimulation();
	}
	
	public void choixAnnuler() 
	{
		controleur.getEtatActuel().annule();
	}
	public void choixPaiement() 
	{
		controleur.getEtatActuel().confirme();
	}
	public void choixPaiementParCarte() 
	{
		controleur.getEtatActuel().choixParCarte();
	}
	public void choixAnnulerChoixCarte()
	{
		controleur.getEtatActuel().choixAnnulerParCarte();
	}
	
	public void choixPaiementLiquide() 
	{
		controleur.getEtatActuel().choixEnLiquide();
	}
	public void choixRetourEcranPrinc() 
	{
		controleur.getEtatActuel().retourMenuPrincipal();
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
		controleur.getEtatActuel().choixRenouvAbo();
	}
	
	public void choixAchatAbo() 
	{
		controleur.getEtatActuel().choixAchatAbo();
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
		controleur.getEtatActuel().retour();
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


	public void choixChangerHeure() 
	{
		
	}

	public void choixScannerCode() 
	{
		controleur.getEtatActuel().scanneCode();
	}
	
	public void choixTaperCode()
	{
		
	}
	
	public void choixAnnulerScanner() 
	{
		controleur.getEtatActuel().choixAnnulerScanner();
	}

	public void choixTaperCodeAbo() 
	{
		controleur.getEtatActuel().choixTaperCode();	
	}
	
	public void choixValiderBillet() 
	{
		controleur.getEtatActuel().valideBillet();
	}
	
	public void choixValiderAchatAbo() 
	{
		controleur.getEtatActuel().valideAchatAbo();
	}

	public void choixValiderRenouvAbo() 
	{
		controleur.getEtatActuel().valideRenouvAbo();
	}

	public void choixValiderNumAbo() 
	{
		controleur.getEtatActuel().valideNumAbo();
	}

	public void choixValiderNumCarte() 
	{
		controleur.getEtatActuel().choixCarte();
	}

	public void choixValiderPassIllimite() 
	{
		controleur.getEtatActuel().validePassIllimite();
	}

	public void choixValiderPass10Trajets() 
	{
		controleur.getEtatActuel().validePass10Trajets();
	}

	public void choixValiderPass10Trajets2Gares() 
	{
		controleur.getEtatActuel().validePass10Trajets2Gares();
	}
}