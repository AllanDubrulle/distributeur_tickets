package coeur;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import stockage.Composant;
import stockage.ErreurDEncodage;
import stockage.imprimable.TypePass;

/**
 * Classe GraphiqueACoeurImpl (permet a l'interface graphique de communiquer avec le coeur)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class GraphiqueACoeurImpl implements GraphiqueACoeur 
{	
	private Controleur controleur = Controleur.getInstance();
	private static GraphiqueACoeurImpl instance;
	
	/**
	 * 	Constructeur de GraphiqueACoeurImpl
	 */
	private GraphiqueACoeurImpl() {}
	
	/**
	 *	Permet de recupererer l'instance unique de GraphiqueACoeurImpl (Singleton Design Pattern)
	 *	@return instance l'instance de GraphiqueACoeurImpl
	 */
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
	
	public void choixValider()
	{
		controleur.getEtatActuel().valider();
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

	public void choixRechercheGD(String gareArrivee, int heure, int minute) throws SQLException 
	{
		controleur.getEtatActuel().valideRechercheGD(gareArrivee, heure, minute);
	}
	
	public void choixRechercheGA(String gareDepart, int heure, int minute) throws SQLException 
	{
		controleur.getEtatActuel().valideRechercheGA(gareDepart, heure, minute);
	}
	
	public void choixRechercheGDEtGA(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException 
	{
		controleur.getEtatActuel().valideRechercheItineraire(gareDepart, gareArrivee, heure, minute);
	}
	
	public void choixImprimerHoraire()
	{
		controleur.getEtatActuel().choixImpressionHoraire();
	}

	public void choixScannerCode() 
	{
		controleur.getEtatActuel().scanneCode();
	}
	
	public void choixValiderNumAbo() 
	{
		controleur.getEtatActuel().valideNumAbo();
	}
	
	public void choix5eur() 
	{
		controleur.getEtatActuel().inserer(500);
	}
	
	public void choix10eur() 
	{
		controleur.getEtatActuel().inserer(1000);
	}
	
	public void choix20eur() 
	{
		controleur.getEtatActuel().inserer(2000);
	}
	
	public void choix50eur() 
	{
		controleur.getEtatActuel().inserer(5000);
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
	
	public void choix10cts() 
	{
		controleur.getEtatActuel().inserer(10);
	}
	
	public void choix20cts() 
	{
		controleur.getEtatActuel().inserer(20);
	}
	
	public void choix50cts() 
	{
		controleur.getEtatActuel().inserer(50);
	}
	
	public void choix1eur() 
	{
		controleur.getEtatActuel().inserer(100);
	}
	
	public void choix2eur() 
	{
		controleur.getEtatActuel().inserer(200);
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
	
	public void infoCarte(String numero) throws ErreurDEncodage
	{
		if (Controleur.getInstance().getCoeurAStockage().existenceCarte(numero))
		{
			Controleur.getInstance().getCoeurAStockage().creerCarte(numero);
		}
		else
		{
			throw new ErreurDEncodage("Carte innexistante");
		}
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
	
	public void infoBillet(LocalDate dateValidite, int nbrBillet, int classe, String gareDepart,String gareArrivee,String typeBillet,
			String reduction, boolean allerRetour) throws ErreurDEncodage
	{
		if(Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee))
		{
			Controleur.getInstance().getCoeurAStockage().creerBillet(dateValidite,nbrBillet,classe, gareDepart, gareArrivee, typeBillet, reduction, allerRetour);
		}
		else
		{
			throw new ErreurDEncodage("Trajet/gare(s) inexistant(e)(s)");
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
			throw new ErreurDEncodage("Trajet/gare(s) inexistant(e)(s)"	);	
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
			throw new ErreurDEncodage("Abonnement innexistant");
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
			throw new ErreurDEncodage("Probleme");
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
			throw new ErreurDEncodage("Probleme");
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
			throw new ErreurDEncodage("Probleme");
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
	
	public boolean existenceGare(String gare) 
	{
		return Controleur.getInstance().getCoeurAStockage().existenceGare(gare);
	}

	public boolean existenceTrajet(String gareDepart, String gareArrivee) 
	{
		return Controleur.getInstance().getCoeurAStockage().existenceTrajet(gareDepart, gareArrivee);
	}

	public ArrayList<String> listeNumeroAbonnement()
	{
		return Controleur.getInstance().getCoeurAStockage().getListeAbonnement();
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

	public boolean estTactile()
	{
		return controleur.getTactile();
	}
	
	public void mettreTactile(boolean tactile)
	{
		controleur.setTactile(tactile);
	}
	
	public void setFentes(boolean fenteBillet, boolean fentePiece)
	{
		controleur.setFentes(fenteBillet, fentePiece);
	}
	
	public void setScanneur(boolean present)
	{
		controleur.setScanneur(present);
	}
	
	public void choixRetirerFentes() 
	{
		Controleur.getInstance().getEtatActuel().retirerFentes();
	}
	
	public void actualiserPanne(Composant composant)
	{
		Controleur.getInstance().getEtatActuel().actualiserPanne(composant);
	}
	
	public void bloquerCarte()
	{
		Controleur.getInstance().getEtatActuel().bloquerCarte();
	}

	public void rechargerCaisse()
	{
		Controleur.getInstance().getEtatActuel().rechargerCaisse();
		
	}

	public void rechargerEncreEtPapier()
	{
		Controleur.getInstance().getEtatActuel().rechargerEncreEtPapier();
		
	}

	public void viderEncreEtPapier()
	{
		Controleur.getInstance().getEtatActuel().viderEncreEtPapier();
	}
	
	public void viderCaisse()
	{
		Controleur.getInstance().getEtatActuel().viderCaisse();		
	}

	public boolean codeScanneurDispo()
	{
		return controleur.scanneurPresent();
	}

	public boolean fentePresente()
	{
		return controleur.fentePresente();
	}	
	
	public void paiement()
	{
		Controleur.getInstance().modifEtat(EtatPaiement.getInstance());
	}
}