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
		System.out.println("bli");
		controleur.getEtatActuel().demarreSimulation();
	}
	
	public void choixValiderBillet() 
	{
		controleur.getEtatActuel().valideBillet();
	}
	
	public void choixAnnuler() 
	{
		controleur.getEtatActuel().annule();
	}
	public void choixPaiement() 
	{
		controleur.getEtatActuel().confirmeBillet();
	}
	public void choixPaiementParCarte() 
	{
		controleur.getEtatActuel().choixParCarte();
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
		
	}
	
	public void choixAchatAbo() 
	{

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
		
	}

	public void choixTaperCodeAbo() 
	{
		
	}

	public void choixValider() {
		// a retirer en fonction du choix final 
		
	}
}