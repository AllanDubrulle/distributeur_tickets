package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import coeur.Commande;
import coeur.Controleur;
import stockage.imprimable.Abonnement;
import stockage.imprimable.Billet;
import stockage.imprimable.Classe;
import stockage.imprimable.Pass;
import stockage.imprimable.Reduction;
import stockage.imprimable.TitreDeTransport;
import stockage.imprimable.TypePass;
import stockage.imprimable.TypeTitre;


public class CoeurAStockageImpl implements CoeurAStockage 
{
	private Carte carte;
	private TitreDeTransport achat;
	private int nbrTitre;
	private int montantAPayer;
	private int montantRecu;
	private Monnayeur monnayeur;
	private HashMap<Composant,Boolean> composantEnMarche;
	private Imprimante imprimante;
	private int essai;
	private static CoeurAStockageImpl instance;
	private String[] horaire;
	
	/**
	 * 	Constructeur de CoeurAStockageImpl (qui instancie les composant)
	 */
	private CoeurAStockageImpl()
	{
		monnayeur = new Monnayeur();
		imprimante = new Imprimante(this);
		composantEnMarche = new HashMap<Composant,Boolean>();
		for(Composant composant : Composant.values())
		{
			composantEnMarche.put(composant, true);
		}
	}
	
	/**
	 *	Permet de recupererer l'instance unique de CoeurAStockageImpl (Singleton Design Pattern)
	 *	@return instance l'instance de CoeurAStockageImpl
	 */
	public static CoeurAStockage getInstance() 
	{
		if(instance == null)
			instance = new CoeurAStockageImpl();
		return instance;
	}
	
	public void creerCarte(String id) 
	{
		BDDBanque bBanque = new BDDBanque();
		bBanque.connexion();
		String[] infoCarte = bBanque.infoCarte(id);
		bBanque.deconnexion();
		carte = new Carte(id, Integer.parseInt(infoCarte[1]), Integer.parseInt(infoCarte[2]));
		essai = 0;
	}
	
	public void creerBillet(Date dateValidite ,int nbrBillet, int classe, String gareDepart,
			String gareArrivee, String typeBillet, String reduction, boolean allerRetour) throws ErreurDEncodage
	{
		Reduction reduc = conversionReduction(reduction);
		Classe classeBillet = conversionClasse(classe);
		TypeTitre type = conversionType(typeBillet);
		setNbrTitre(nbrBillet);
		setAchat(new Billet(dateValidite, gareDepart, gareArrivee,  classeBillet, type,reduc,allerRetour));
	}

	public void creerAbonnement(int validite, String gareDepart, String gareArrivee, int classe,
			String reduction, String type, String nom, String registreNational) throws ErreurDEncodage
	{	
		
		LocalDate dateValidite = LocalDate.now();
		LocalDate dateExpiration = dateValidite.plusMonths(validite);
		Date dateExp = java.sql.Date.valueOf(dateExpiration);
		Date dateValid = java.sql.Date.valueOf(dateValidite);
		Reduction reduc = conversionReduction(reduction);
		Classe classeAbo = conversionClasse(classe);
		TypeTitre typeAbo = conversionType(type);
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		int num = bTitre.numeroAbonnementSuivant();
		bTitre.deconnexion();
		setNbrTitre(1);
		setAchat(new Abonnement(num, dateValid, dateExp, gareDepart, gareArrivee,  classeAbo, reduc, typeAbo, nom, registreNational));	
	}

	public void modifierAbo(int validite, String numAbo) throws ErreurDEncodage
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		String[] infos = bTitre.infoAbonnement(numAbo);
		bTitre.deconnexion();
		LocalDate dateValidite = LocalDate.now();
		LocalDate dateExpiration = dateValidite.plusMonths(validite);
		Date dateExp = java.sql.Date.valueOf(dateExpiration);
		Date dateValid = java.sql.Date.valueOf(dateValidite);
		int classe = Integer.parseInt(infos[9]);
		String reduction = infos[8];
		String type = infos[7];
		Reduction reduc = conversionReduction(reduction);
		Classe classeAbo = conversionClasse(classe);
		TypeTitre typeAbo = conversionType(type);
		setNbrTitre(1);
		setAchat(new Abonnement(Integer.parseInt(numAbo), dateValid, dateExp, infos[2], infos[3], classeAbo, reduc, typeAbo, infos[0], infos[1]));		
	}
	
	public boolean existenceAbo(String numAbo)
	{
		BDDTitre titre = new BDDTitre();
		titre.connexion();
		boolean res = titre.existenceAbonnement(numAbo);
		titre.deconnexion();
		return res;
	}
	
	public void creerPassIllimite(String nom, int classe, String reduction, String type, int nbrJours, 
			String typePassStr) throws ErreurDEncodage
	{
		Reduction reduc = conversionReduction(reduction);
		Classe classePass = conversionClasse(classe);
		TypeTitre typeTitre = conversionType(type);
		TypePass typePass = conversionTypePass(typePassStr);
		setNbrTitre(1);
		setAchat(new Pass(nom, nbrJours, classePass, typeTitre, reduc, typePass));
	}
	
	public void creerPass10Trajets(String nom, int classe, String reduction, String type, String typePassStr) 
			throws ErreurDEncodage
	{
		Reduction reduc = conversionReduction(reduction);
		Classe classePass = conversionClasse(classe);
		TypeTitre typeTitre = conversionType(type);
		TypePass typePass = conversionTypePass(typePassStr);
		setNbrTitre(1);
		setAchat(new Pass(nom, classePass, typeTitre, reduc, typePass));
	}
	
	public void creerPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, 
			String reduction, String type, String typePassStr) throws ErreurDEncodage
	{
		Reduction reduc = conversionReduction(reduction);
		Classe classePass = conversionClasse(classe);
		TypeTitre typeTitre = conversionType(type);
		TypePass typePass = conversionTypePass(typePassStr);
		setNbrTitre(1);
		setAchat(new Pass(nom, gareDepart, gareArrivee, classePass, typeTitre, reduc, typePass));
	}
	
	public double rechercherPrix(Commande commande ,String gareDepart, String gareArrivee)
	{
		BDDTitre db = new BDDTitre();
		db.connexion();
		double res;
		switch(commande)
		{
		case BILLET:
			res = db.calculerPrixBillet(gareDepart, gareArrivee);
			break;
		case PASS10TRAJETS2GARES:
			res = db.calculerPrixBillet(gareDepart, gareArrivee)*8;
			break;
		default:
			res = db.calculerPrixAbo(gareDepart, gareArrivee);
			break;
		
		}
		db.deconnexion();
		return res;
	}

	public double rechercherPrix(TypePass typePass)
	{
		BDDTitre db = new BDDTitre();
		db.connexion();
		double res;
		switch(typePass)
		{
		case PASSILLIMITE:
			res = db.calculerPrixPass("SansRestriction");
			break;
		default:
			res = db.calculerPrixPass("10Trajets");
			break;
		}
		db.deconnexion();
		return res;
	}
	
	public TypePass conversionTypePass(String typePassStr) throws ErreurDEncodage
	{
		for (int i = 0; i < TypePass.values().length; i++)
		{
			if(TypePass.values()[i].toString().equals(typePassStr))
			{
				return TypePass.values()[i];
			}
		}
		throw new ErreurDEncodage("Type de pass inexistant");
	}
	
	public TypeTitre conversionType(String type ) throws ErreurDEncodage
	{
		for (int i = 0 ; i < TypeTitre.values().length; i++)	
		{	
			if(TypeTitre.values()[i].toString().equals(type))	
			{	
				return TypeTitre.values()[i];	
			}	
		}
		throw new ErreurDEncodage("Type inexistant");
	}
	
	public Classe conversionClasse(int classe) throws ErreurDEncodage
	{
		if (classe == 1)	
			return Classe.C1;	
		if (classe == 2)	
			return Classe.C2;
		throw new ErreurDEncodage("Classe inexistante");
		
	}
	
	public Reduction conversionReduction(String reduction ) throws ErreurDEncodage
	{
		for (int i = 0 ; i < Reduction.values().length; i++)	
		{	
			if(Reduction.values()[i].toString().equals(reduction))	
			{	
				return Reduction.values()[i];	
			}
		}
		throw new ErreurDEncodage("Reduction inexistante");
	}
	
	public String[] getListeReduction()
	{
		Reduction[] reducs = Reduction.values();
		String[] res = new String[reducs.length];
		for (int i =0; i <reducs.length;i++) 
		{
			res[i] = reducs[i].toString();
		}
		return res;
	}
	
	public String[] getListeType()
	{
		TypeTitre[] types = TypeTitre.values();
		String[] res = new String[types.length];
		for (int i =0; i <types.length;i++) 
		{
			res[i] = types[i].toString();
		}
		return res;
	}

	public boolean existenceTrajet(String gareDepart, String gareArrivee)
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		boolean res = hTrains.existenceTrajet(gareDepart, gareArrivee);
		hTrains.deconnexion();
		return res;
	}
	
	public boolean existenceGare(String gare)
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		boolean res = hTrains.existenceGare(gare);
		hTrains.deconnexion();
		return res;
	}
	
	public String[] rechercherHoraireDepart(String gareDepart, int heure, int minute) throws SQLException
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		ResultSet res = hTrains.calculToutesLesGaresArrivee(gareDepart, heure, minute);
		String[] tab = hTrains.conversionRequeteEnTableau(res);
		this.horaire = tab;
		return tab;
	}
	
	public String[] rechercherHoraireItineraire(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		ResultSet res = hTrains.calculItineraire(gareDepart, gareArrivee, heure, minute);
		String[] tab = hTrains.conversionRequeteEnTableau(res);
		this.horaire = tab;
		return tab;
	}
	
	public String[] rechercherHoraireArrivee(String gareArrivee, int heure, int minute) throws SQLException
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		ResultSet res = hTrains.calculToutesLesGaresDepart(gareArrivee, heure, minute);
		String[] tab = hTrains.conversionRequeteEnTableauArriv(res);
		this.horaire = tab;
		return tab;
	}
	
	public String[] getHoraire()
	{
		return horaire;
	}
	
	public TitreDeTransport getTitre()
	{
		return achat;
	}
	
	private void setAchat(TitreDeTransport titre)
	{
		this.achat = titre;
	}
	
	public int getNbrTitre()
	{
		return nbrTitre;
	}
	
	private void setNbrTitre(int nbrTitre)
	{
		this.nbrTitre = nbrTitre;
	}
	
	public int getPrix()
	{
		return montantAPayer;
	}

	public void setPrix(int montantAPayer) 
	{
		this.montantAPayer = montantAPayer;
	}
	
	public void ajoutMonnaie(int i) throws ComposantHorsService
	{
		if (!Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEBILLET) || !Controleur.getInstance().getCoeurAStockage().estEnMarche(Composant.FENTEPIECE))
			throw new ComposantHorsService("Fente a piece ou a billet hors service");
		else
		{
			switch(i)
			{
				case 1:
					monnayeur.stockerPiece(Piece.P1);
					break;
				case 2:
					monnayeur.stockerPiece(Piece.P2);
					break;
				case 5:
					monnayeur.stockerPiece(Piece.P5);
					break;
				case 10:
					monnayeur.stockerPiece(Piece.P10);
					break;
				case 20:
					monnayeur.stockerPiece(Piece.P20);
					break;
				case 50:
					monnayeur.stockerPiece(Piece.P50);
					break;
				case 100:
					monnayeur.stockerPiece(Piece.P100);
					break;
				case 200:
					monnayeur.stockerPiece(Piece.P200);
					break;
				case 500:
					monnayeur.stockerBillet(BilletMonnaie.B5);
					break;
				case 1000:
					monnayeur.stockerBillet(BilletMonnaie.B10);
					break;
				case 2000:
					monnayeur.stockerBillet(BilletMonnaie.B20);
					break;
				case 5000:
					monnayeur.stockerBillet(BilletMonnaie.B50);
					break;
			}
			montantRecu+=i;
		}
	}
	
	public Rendu rendreMonnaie() throws PasAssezDeMonnaie
	{
		return monnayeur.calculerRenduArgent(montantRecu-montantAPayer);
	}
	
	private void setMontantRecu(int montantRecu)
	{
		this.montantRecu = montantRecu;
	}
	
	public Rendu rendreMontantRecu()
	{
		return monnayeur.rendreMontantEncours();
	}

	public void reinitialisation()
	{
		setMontantRecu(0);
	}

	public ArrayList<String> getListeAbonnement()
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		ArrayList<String> res = bTitre.listeDesAbonnements();
		return res;
	}
	
	public void miseAJourValiditeAbonnement()
	{
		Abonnement abo = (Abonnement) achat;
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		bTitre.actualiserDateAbo(Integer.toString(abo.getCodeBarre()), abo.getValidite());
		bTitre.deconnexion();
	}
	
	public void insertionAbonnement()
	{	
		Abonnement abo = (Abonnement) achat;
		String annee = Integer.toString(abo.getDateExp().getYear());
		String mois = Integer.toString(abo.getDateExp().getMonth());
		String jour = Integer.toString(abo.getDateExp().getDay());
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		bTitre.ajouterAbonnement(abo.getCodeBarre(), abo.getNom(), abo.getRegNat(), abo.getGareDepart(), abo.getGareArrivee(), annee, mois, jour,abo.getType().toString(), abo.getReduction().toString(), Integer.toString(abo.getClasse().valeur()));
		bTitre.deconnexion();
	}
	
	public boolean depassementMontantAPayer()
	{
		return montantAPayer<=montantRecu;
	}

	public double montantAPayerAffichable()
	{
		return (double) montantAPayer /100;
	}
	
	public double prixTicketAffichable()
	{
		return (double)montantAPayer / (nbrTitre*100);
	}

	public double renduAffichable()
	{
		return Math.abs((double) (montantRecu-montantAPayer) /100);
	}

	public double montantRecuAffichable()
	{
		return (double) montantRecu /100;
	}	

	public boolean existenceCarte(String numero)
	{
		BDDBanque bBanque = new BDDBanque();
		bBanque.connexion();
		boolean res = bBanque.existenceCarte(numero);
		bBanque.deconnexion();
		return res;
	}
	
	public Carte getCarte()
	{
		return carte;
	}
	
	public boolean verifSolde() 
	{
		return carte.soldeSuffisant(montantAPayer);
	}
	
	public boolean verifCode(int codePIN)
	{
		return carte.verifCodePIN(codePIN);
	}

	public void mauvaisPin()
	{
		essai++;
		
	}

	public boolean tropDErreur()
	{
		return essai>2;
	}

	public void actualiserSolde()
	{
		String numero = carte.getID();
		int somme = carte.getSolde() - montantAPayer;
		BDDBanque bBanque = new BDDBanque();
		bBanque.connexion();
		bBanque.actualiserSolde(numero, somme);
		bBanque.deconnexion();
		montantRecu = montantAPayer;
	}
	
	public boolean estEnMarche(Composant composant)
	{
		return composantEnMarche.get(composant);
	}

	public void actualiserPanne(Composant composant)
	{
		composantEnMarche.put(composant,!composantEnMarche.get(composant));
	}
	
	public void viderCaisse()
	{
		monnayeur.vider();
	}

	public void rechargerCaisse()
	{
		monnayeur.rechargerCaisse();
		
	}

	public void rechargerEncreEtPapier()
	{
		imprimante.setNbrImpressions(50);
		
	}

	public void viderEncreEtPapier()
	{
		imprimante.setNbrImpressions(0);
		
	}

	public void carteEnlevee()
	{
		carte = null;
	}

	public boolean carteInseree()
	{
		return carte != null;
	}
	
	public void impression() throws ComposantHorsService, PlusDePapier
	{
		imprimante.imprimer();
	}
	
	public void scanne() throws ComposantHorsService
	{
		if (!estEnMarche(Composant.SCANNEUR))
			throw new ComposantHorsService("Scanneur de code hors service");
	}
	
	public void lireCarte() throws ComposantHorsService
	{
		if (!estEnMarche(Composant.LECTEURCARTE))
			throw new ComposantHorsService("Lecteur de carte hors service");
	}	
}