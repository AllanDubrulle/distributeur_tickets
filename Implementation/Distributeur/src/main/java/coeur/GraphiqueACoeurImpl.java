package coeur;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import stockage.BDDTitre;
import stockage.Composant;
import stockage.ErreurDEncodage;
import stockage.imprimable.TypePass;

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
	public void choixRetourTitre() 
	{
		controleur.getEtatActuel().retourTitre();
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
	public void choixHoraire() //pour afficher menu trois horaires
	{
		controleur.getEtatActuel().choixHoraire();
	}
	public void choixHoraireArrivee() //afficher menu recherche arrivee
	{
		controleur.getEtatActuel().choixArrivees();
	}
	public void choixHoraireDepart() //afficher menu recherche depart
	{
		controleur.getEtatActuel().choixDeparts();
	}
	public void choixHoraireItineraire() //afficher menu itineraire depart arrivee
	{
		controleur.getEtatActuel().choixItineraire();
	}

	public void choixRechercheGD(String gareDepart, int heure, int minute) throws SQLException 
	{
		controleur.getEtatActuel().valideRechercheGD(gareDepart, heure, minute);
	}
	public void choixRechercheGA(String gareArrivee, int heure, int minute) throws SQLException 
	{
		controleur.getEtatActuel().valideRechercheGA(gareArrivee, heure, minute);
	}
	public void choixRechercheGDEtGA(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException 
	{
		controleur.getEtatActuel().valideRecherche(gareDepart, gareArrivee, heure, minute);
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

	public void choixLecteurOK(int PIN) 
	{
		if(PIN != 0)
			controleur.getEtatActuel().validePIN(PIN);
	}
	public void choixLecteurInsererRetirer() 
	{
		controleur.getEtatActuel().choixInsererRetirerCarte();
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
	
	
	public void infoCarte(String numero) throws ErreurDEncodage
	{
		if (Controleur.getInstance().getCoeurAStockage().existenceCarte(numero))
		{
			Controleur.getInstance().getCoeurAStockage().creerCarte(numero);
		}
		else
		{
			throw new ErreurDEncodage("carteNonExistente");
		}
	}
	
	public void choixValider()
	{
		controleur.getEtatActuel().valider();
	}

	
	public void infoBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart,String gareArrivee,String typeBillet,
			String reduction, boolean allerRetour) throws ErreurDEncodage
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee))
		{
			Controleur.getInstance().getCoeurAStockage().creerBillet(dateValidite,nbrBillet,classe, gareDepart, gareArrivee, typeBillet, reduction, allerRetour);
		}
		else
		{
			throw new ErreurDEncodage("gareInexistante"	);
		}
		
	}
	public void infoAbo(int validite, String gareDepart, String gareArrivee, int classe,
			String reduction, String type, String nom, String registre) throws ErreurDEncodage 
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee))	
		{	
			Controleur.getInstance().getCoeurAStockage().creerAbonnement(validite, gareDepart, gareArrivee, classe, reduction, type, nom, registre);	
		}	
		else	
		{	
			throw new ErreurDEncodage("gareInexistante"	);	
		}	
	}
	
	public void infoAboRen(int validite, String numAbo) throws ErreurDEncodage
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceAbo(numAbo))
		{
			Controleur.getInstance().getCoeurAStockage().modifierAbo(validite, numAbo);
		}
		else 
		{
			throw new ErreurDEncodage("abonnementInexistant");
		}
	}
	
	public void infoPassIllimite(String nom, int classe, String reduction, String type, int nbrJours) throws ErreurDEncodage
	{
		try 
		{
			Controleur.getInstance().getCoeurAStockage().creerPassIllimite(nom, classe, reduction, type, nbrJours, TypePass.PASSILLIMITE.toString());
		}
		catch (ErreurDEncodage e) 
		{
			throw new ErreurDEncodage("probleme");
		}			
	}
	
	public void infoPass10Trajets(String nom, int classe, String reduction, String type) throws ErreurDEncodage
	{
		try 
		{
			Controleur.getInstance().getCoeurAStockage().creerPass10Trajets(nom, classe, reduction, type, TypePass.PASS10TRAJETS.toString());
		}
		catch (ErreurDEncodage e) 
		{
			throw new ErreurDEncodage("probleme");
		}			
	}
	
	public void infoPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type) throws ErreurDEncodage
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee))	
		{
			Controleur.getInstance().getCoeurAStockage().creerPass10Trajets2Gares(nom, gareDepart, gareArrivee, classe, reduction, type, TypePass.PASS10TRAJETS2GARES.toString());
		}
		else 
		{
			throw new ErreurDEncodage("probleme");
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

	public void viderCaisse()
	{
		Controleur.getInstance().getCoeurAStockage().viderCaisse();		
	}

	
	public void TombeEnPanne(Composant composant)
	{
		Controleur.getInstance().getEtatActuel().tombeEnPanne(composant);
	}
	
	public boolean existanceGare(String gare) 
	{
		return Controleur.getInstance().getCoeurAStockage().existenceGare(gare);
	}

	public boolean existanceTrajet(String gareDepart, String gareArrivee) 
	{
		return Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee);
	}

	public ArrayList<String> listeNumeroAbonnement() // wtf a modifier 
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		ArrayList<String> res = bTitre.listeDesAbonnements();
		return res;
	}
	public void apres5secondes()
	{
		controleur.getEtatActuel().apres5sec();
	}
	
	public void apres15secondes()
	{
		controleur.getEtatActuel().apres15sec();
	}
	
	public void apres5secondesOk()
	{
		controleur.getEtatActuel().apres5secOk();
	}
}