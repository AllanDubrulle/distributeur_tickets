package coeur;

import java.util.Date;

import stockage.ErreurDEncodage;

public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{	
	private Controleur controleur = Controleur.getInstance();
	private static GraphiqueACoeurImpl instance;
	
	private GraphiqueACoeurImpl() {}
	
	public static GraphiqueACoeurImpl getInstance()
	{
		if(instance==null)
		{
			instance = new GraphiqueACoeurImpl();
		}
		return instance;
	}	
	
	public void choixDemarrerSimul() 
	{
		controleur.getEtatActuel().demarreSimulation();
	}
	public void choixAnnuler() 
	{
		controleur.getEtatActuel().annule();
	}
	public void choixRetour() 
	{
		controleur.getEtatActuel().retour();
	}
	public void choixOk() 
	{
		controleur.getEtatActuel().choixOk();
	}
	public void choixOui() 
	{
		controleur.getEtatActuel().choixOui();
	}
	public void choixNon() 
	{
		controleur.getEtatActuel().choixNon();
	}
	public void choixRetourEcranPrinc() 
	{
		controleur.getEtatActuel().retourMenuPrincipal();
	}
	
	public void choixBillet() 
	{
		controleur.getEtatActuel().choixBillet();
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
		controleur.getEtatActuel().choixPass();
	}
	public void choixPassIllimite() 
	{
		controleur.getEtatActuel().choixPassIllimite();	
	}
	public void choixPass10Trajets() 
	{
		controleur.getEtatActuel().choixPass10Trajets();
	}
	public void choixPass10Tajets2Gares() 
	{
		controleur.getEtatActuel().choixPass10Trajets2Gares();
	}
	public void choixHoraire() 
	{
		controleur.getEtatActuel().choixHoraire();
	}
	public void choixHoraireArrivee() 
	{
		controleur.getEtatActuel().choixArrivees();
	}
	public void choixHoraireDepart() 
	{
		controleur.getEtatActuel().choixDeparts();
	}
	public void choixHoraireItineraire() 
	{
		controleur.getEtatActuel().choixItineraire();
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
	public void choixChangerHeure() 
	{
		
	}
	
	
	public void choixValiderRenouvAbo() 
	{
		controleur.getEtatActuel().valideRenouvAbo();
	}
	public void choixValiderRenouvAboScanne() 
	{
		controleur.getEtatActuel().valideRenouvAboScanne();
	}

	public void choixScannerCode() 
	{
		controleur.getEtatActuel().scanneCode();
	}
	
	public void choixAnnulerScanner() 
	{
		controleur.getEtatActuel().choixAnnulerScanner();
	}
	public void choixTaperCodeAbo() 
	{
		controleur.getEtatActuel().choixTaperCode();	
	}
	public void choixValiderNumAbo() 
	{
		controleur.getEtatActuel().valideNumAbo();
	}
	public void choixValiderNumAboScanne() 
	{
		controleur.getEtatActuel().valideNumAboScanne();
	}
	
	public void choix5eur() 
	{
		controleur.getEtatActuel().inserer(500);
	}
	public void choix10eur() 
	{
		controleur.getEtatActuel().inserer(1000);
	}
	public void choix50eur() 
	{
		controleur.getEtatActuel().inserer(5000);
	}
	public void choix20eur() 
	{
		controleur.getEtatActuel().inserer(2000);
	}
	public void choix1ct() 
	{
		controleur.getEtatActuel().inserer(1);
	}
	public void choix2cts() 
	{
		controleur.getEtatActuel().inserer(2);
	}
	public void choix5cts() 
	{
		controleur.getEtatActuel().inserer(5);
	}
	public void choix2eur() 
	{
		controleur.getEtatActuel().inserer(200);
	}
	public void choix10cts() 
	{
		controleur.getEtatActuel().inserer(10);
	}
	public void choix1eur() 
	{
		controleur.getEtatActuel().inserer(100);
	}
	public void choix50cts() 
	{
		controleur.getEtatActuel().inserer(50);
	}
	public void choix20cts() 
	{
		controleur.getEtatActuel().inserer(20);
	}

	public void choixScanneurOK() 
	{
		controleur.getEtatActuel().choixPINOk();
	}
	public void choixScanneurInserer() 
	{
		controleur.getEtatActuel().choixInsererCarte();
	}
	
	public void choixPaiement() 
	{
		controleur.getEtatActuel().confirme();
	}
	public void choixPaiementParCarte() 
	{
		controleur.getEtatActuel().choixParCarte();
	}
	public void choixPaiementLiquide() 
	{
		controleur.getEtatActuel().choixEnLiquide();
	}
	public void choixValiderNumCarte() 
	{
		controleur.getEtatActuel().choixCarte("1235");     //valeur par défaut pour test
	}
	public void choixValider()
	{
		controleur.getEtatActuel().valider();
	}

	
	public void InfoBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart,String gareArrivee,String typeBillet,
			String reduction, boolean allerRetour) throws ErreurDEncodage
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee))
		{
			Controleur.getInstance().getCoeurAStockage().creerBillet(dateValidite,nbrBillet,classe, gareDepart, gareArrivee, typeBillet,
						reduction, allerRetour);
		}
		else
		{
			throw new ErreurDEncodage("gareInexistante"	);
		}
		
	}
	public void InfoAbo(Date dateValidite, Date dateExpiration, String gareDepart, String gareArrivee, int classe, String reduction, String type, String codeBarre, String nom, String registre) throws ErreurDEncodage
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee))
		{
			Controleur.getInstance().getCoeurAStockage().creerAbonnement(dateValidite, dateExpiration, gareDepart, gareArrivee, classe, reduction, type, codeBarre, nom, registre);
		}
		else
		{
			throw new ErreurDEncodage("gareInexistante"	);
		}
	}
	public String[] getReductions()
	{
		return Controleur.getInstance().getCoeurAStockage().getListeReduction();
	}
	public String[] getTypes()
	{
		return Controleur.getInstance().getCoeurAStockage().getListeType();
	}
	
}