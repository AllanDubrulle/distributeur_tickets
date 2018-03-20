package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

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
	private int prix;
	private int introduit;
	private Monnayeur monnayeur;  // a modifier si on modifie panne
	private HashMap<Composant,Boolean> composantEnMarche;
	private Imprimante imprimante;
	
	public CoeurAStockageImpl()
	{
		monnayeur = new Monnayeur();
		imprimante = new Imprimante(this);
		composantEnMarche = new HashMap<Composant,Boolean>();
		for(Composant composant : Composant.values())
		{
			composantEnMarche.put(composant, true);
		}
	}
	
	public int getPrix()
	{
		return prix;
	}

	public void setPrix(int prix) 
	{
		this.prix = prix;
	}

	public void creerCarte(String id) 
	{
		BDDBanque bBanque = new BDDBanque();
		bBanque.connexion();
		String[] infoCarte = bBanque.infoCarte(id);
		bBanque.deconnexion();
		carte = new Carte(id, Integer.parseInt(infoCarte[1]), Double.valueOf(infoCarte[2]));
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
	
	private void setNbrTitre(int nbrTitre)
	{
		this.nbrTitre = nbrTitre;
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
	
	public void creerBillet(Date dateValidite ,int nbrBillet, int classe, String gareDepart,
			String gareArrivee, String typeBillet, String reduction, boolean allerRetour) throws ErreurDEncodage
	{
		Reduction reduc = null;
		TypeTitre type=null;
		Classe classeBillet = null;
		if (classe==1)
		{
			classeBillet = Classe.C1;
		}
		if(classe==2)
		{
			classeBillet = Classe.C2;
		}
		for (int i = 0 ; i< Reduction.values().length;i++)
		{
			if(Reduction.values()[i].toString().equals(reduction))
			{
				reduc = Reduction.values()[i];
			}
		}
		for (int i = 0 ; i< TypeTitre.values().length;i++)
		{
			if(TypeTitre.values()[i].toString().equals(typeBillet))
			{
				type = TypeTitre.values()[i];
			}
		}
		if (reduc==null || type==null || classeBillet ==null )
		{
			throw new ErreurDEncodage ("problème d'encodage");
		}
		setNbrTitre(nbrBillet);
		setAchat(new Billet(dateValidite, gareDepart, gareArrivee,  classeBillet, type,reduc,allerRetour));
		setPrix(calculerPrix(gareDepart,gareArrivee,reduc,type,classeBillet)*nbrBillet);
	}

	public void creerAbonnement(int validite, String gareDepart, String gareArrivee, int classe,
			String reduction, String type, String nom, String registreNational) throws ErreurDEncodage
	{	
		
		LocalDate dateValidite = LocalDate.now();
		LocalDate dateExpiration = dateValidite.plusMonths(validite);
		Date dateExp = java.sql.Date.valueOf(dateExpiration);
		Date dateValid = java.sql.Date.valueOf(dateValidite);
		String annee = String.valueOf(dateExpiration.getYear());
		String mois = String.valueOf(dateExpiration.getMonthValue());
		String jour = String.valueOf(dateExpiration.getDayOfMonth());
		Reduction reduc = null;	
		Classe classeAbo = null;	
		TypeTitre typeAbo = null;		
		if (classe == 1)	
			classeAbo = Classe.C1;	
		if (classe == 2)	
			classeAbo = Classe.C2;	
		for (int i = 0 ; i< Reduction.values().length;i++)	
		{	
			if(Reduction.values()[i].toString().equals(reduction))	
			{	
				reduc = Reduction.values()[i];	
			}	
		}	
		for (int i = 0 ; i< TypeTitre.values().length;i++)	
		{	
			if(TypeTitre.values()[i].toString().equals(type))	
			{	
				typeAbo = TypeTitre.values()[i];	
			}	
		}		
		if (reduc==null || typeAbo == null || classeAbo ==null )	
		{	
			throw new ErreurDEncodage ("problème d'encodage");	
		}	
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		int num = bTitre.numeroAbonnementSuivant();
		bTitre.ajouterAbonnement(num, nom, registreNational, gareDepart, gareArrivee, annee, mois, jour, type, reduction, Integer.toString(classe));
		bTitre.deconnexion();
		setNbrTitre(1);
		setAchat(new Abonnement(num, dateValid, dateExp, gareDepart, gareArrivee,  classeAbo, reduc, typeAbo, nom, registreNational));	
		setPrix(calculerPrix(gareDepart, gareArrivee, reduc, typeAbo, classeAbo, validite));	
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
		Reduction reduc = null;	
		Classe classeAbo = null;	
		TypeTitre typeAbo = null;		
		if (classe == 1)	
			classeAbo = Classe.C1;	
		if (classe == 2)	
			classeAbo = Classe.C2;	
		for (int i = 0 ; i< Reduction.values().length;i++)	
		{	
			if(Reduction.values()[i].toString().equals(reduction))	
			{	
				reduc = Reduction.values()[i];	
			}	
		}	
		for (int i = 0 ; i< TypeTitre.values().length;i++)	
		{	
			if(TypeTitre.values()[i].toString().equals(type))	
			{	
				typeAbo = TypeTitre.values()[i];	
			}	
		}		
		if (reduc==null || typeAbo == null || classeAbo ==null )	
		{	
			throw new ErreurDEncodage ("problème d'encodage");	
		}
		setNbrTitre(1);
		setAchat(new Abonnement(Integer.parseInt(numAbo), dateValid, dateExp, infos[2], infos[3], classeAbo, reduc, typeAbo, infos[0], infos[1]));	
		setPrix(calculerPrix(infos[2], infos[3], reduc, typeAbo, classeAbo, validite));	
	}
	
	public void creerPassIllimite(String nom, int classe, String reduction, String type, int nbrJours, String typePassStr) throws ErreurDEncodage
	{
		Reduction reduc = null;	
		Classe classePass = null;	
		TypeTitre typeTitre = null;	
		TypePass typePass = null;
		if (classe == 1)	
			classePass = Classe.C1;	
		if (classe == 2)	
			classePass = Classe.C2;	
		for (int i = 0 ; i < Reduction.values().length; i++)	
		{	
			if(Reduction.values()[i].toString().equals(reduction))	
			{	
				reduc = Reduction.values()[i];	
			}	
		}	
		for (int i = 0 ; i < TypeTitre.values().length; i++)	
		{	
			if(TypeTitre.values()[i].toString().equals(type))	
			{	
				typeTitre = TypeTitre.values()[i];	
			}	
		}	
		for (int i = 0; i < TypePass.values().length; i++)
		{
			if(TypePass.values()[i].toString().equals(typePassStr))
			{
				typePass = TypePass.values()[i];
			}
		}
		if (reduc==null || typeTitre == null || classePass ==null)	
		{	
			throw new ErreurDEncodage ("problème d'encodage");	
		}
		setNbrTitre(1);
		setAchat(new Pass(nom, nbrJours, classePass, typeTitre, reduc, typePass));
		setPrix(calculerPrix(classePass, reduc, typeTitre, nbrJours));
	}
	
	public boolean verifPaiementCarte(String numero, int codePIN, double montant)
	{
		BDDBanque bBanque = new BDDBanque();
		bBanque.connexion();
		boolean res;
		if (montant >= 5)
		{
			res = bBanque.verifPaiementPlusGrandQue5(numero, codePIN, montant);
		}
		else
		{
			res = bBanque.verifPaiementPlusPetitQue5(numero, montant);
		}
		bBanque.deconnexion();
		return res;
	}
	
	public void modifierSoldeCarte(String numero, double montant)
	{
		BDDBanque bBanque = new BDDBanque();
		bBanque.connexion();
		bBanque.actualiserSolde(numero, montant);
		bBanque.deconnexion();
	}
	
	public void creerPass10Trajets(String nom, int classe, String reduction, String type, String typePassStr) throws ErreurDEncodage
	{
		Reduction reduc = null;	
		Classe classePass = null;	
		TypeTitre typeTitre = null;	
		TypePass typePass = null;
		if (classe == 1)	
			classePass = Classe.C1;	
		if (classe == 2)	
			classePass = Classe.C2;	
		for (int i = 0 ; i < Reduction.values().length; i++)	
		{	
			if(Reduction.values()[i].toString().equals(reduction))	
			{	
				reduc = Reduction.values()[i];	
			}	
		}	
		for (int i = 0 ; i < TypeTitre.values().length; i++)	
		{	
			if(TypeTitre.values()[i].toString().equals(type))	
			{	
				typeTitre = TypeTitre.values()[i];	
			}	
		}	
		for (int i = 0; i < TypePass.values().length; i++)
		{
			if(TypePass.values()[i].toString().equals(typePassStr))
			{
				typePass = TypePass.values()[i];
			}
		}
		if (reduc==null || typeTitre == null || classePass ==null)	
		{	
			throw new ErreurDEncodage ("problème d'encodage");	
		}
		setNbrTitre(1);
		setAchat(new Pass(nom, classePass, typeTitre, reduc, typePass));
		setPrix(calculerPrix(classePass, reduc, typeTitre));
	}
	
	public void creerPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type, String typePassStr) throws ErreurDEncodage
	{
		Reduction reduc = null;	
		Classe classePass = null;	
		TypeTitre typeTitre = null;	
		TypePass typePass = null;
		if (classe == 1)	
			classePass = Classe.C1;	
		if (classe == 2)	
			classePass = Classe.C2;	
		for (int i = 0 ; i < Reduction.values().length; i++)	
		{	
			if(Reduction.values()[i].toString().equals(reduction))	
			{	
				reduc = Reduction.values()[i];	
			}	
		}	
		for (int i = 0 ; i < TypeTitre.values().length; i++)	
		{	
			if(TypeTitre.values()[i].toString().equals(type))	
			{	
				typeTitre = TypeTitre.values()[i];	
			}	
		}	
		for (int i = 0; i < TypePass.values().length; i++)
		{
			if(TypePass.values()[i].toString().equals(typePassStr))
			{
				typePass = TypePass.values()[i];
			}
		}
		if (reduc==null || typeTitre == null || classePass ==null)	
		{	
			throw new ErreurDEncodage ("problème d'encodage");	
		}
		setNbrTitre(1);
		setAchat(new Pass(nom, gareDepart, gareArrivee, classePass, typeTitre, reduc, typePass));
		setPrix(calculerPrix(gareDepart, gareArrivee, classePass, reduc, typeTitre));
	}

	public int calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre type,Classe classe) 	//Billet
	{
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix= bTitre.calculerPrixBillet(gareDepart, gareArrivee);
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduc, type, classe);
		return  res;
	}
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre type, Classe classe, int validite)	//Abonnement
	{	
		BDDTitre bTitre = new BDDTitre();
		bTitre.connexion();
		double calculPrix = bTitre.calculerPrixAbo(gareDepart, gareArrivee);	
		bTitre.deconnexion();
		calculPrix *=100;
		int res = ajusterPrix((int) calculPrix ,reduc, type, classe);
		res *= validite;	
		return  res;	
	}
	
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type, int nbrJours)		//PassIllimite
	{
		return 0;
	}
	
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type)			//Pass10Trajets
	{
		return 0;
	}
	
	public int calculerPrix(String gareDepart, String gareArrivee, Classe classe, Reduction reduction, TypeTitre type)		//Pass10Trajets2Gares
	{
		return 0;
	}
	
	private int ajusterPrix(int prix ,Reduction reduc, TypeTitre type, Classe classe)
	{
		double res= prix;
		res -= res * (double)reduc.valeur()/100;	
		res -= res * (double)type.valeur()/100;	
		res *= (3-classe.valeur());	
		return (int) res;
	}

	private void setAchat(TitreDeTransport billet)
	{
		this.achat = billet;
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
	
	public boolean existenceAbo(String numAbo)
	{
		BDDTitre titre = new BDDTitre();
		titre.connexion();
		boolean res = titre.existenceAbonnement(numAbo);
		titre.deconnexion();
		return res;
	}

	public TitreDeTransport getTitre()
	{
		return achat;
	}

	
	public int getNbrTitre()
	{
		return nbrTitre;
	}

	
	public void ajoutMonnaie(int i) throws ComposantHorsService
	{
		if(!(estEnMarche(Composant.FENTEBILLET)&&estEnMarche(Composant.FENTEPIECE)))
		{
			throw new ComposantHorsService("piece ou billet refuse");
		}
		switch(i)
		{
			case 1:
				monnayeur.stockerPieces(Pieces.P1);
				break;
			case 2:
				monnayeur.stockerPieces(Pieces.P2);
				break;
			case 5:
				monnayeur.stockerPieces(Pieces.P5);
				break;
			case 10:
				monnayeur.stockerPieces(Pieces.P10);
				break;
			case 20:
				monnayeur.stockerPieces(Pieces.P20);
				break;
			case 50:
				monnayeur.stockerPieces(Pieces.P50);
				break;
			case 100:
				monnayeur.stockerPieces(Pieces.P100);
				break;
			case 200:
				monnayeur.stockerPieces(Pieces.P200);
				break;
			case 500:
				monnayeur.stockerBillets(BilletMonnaie.B5);
				break;
			case 1000:
				monnayeur.stockerBillets(BilletMonnaie.B10);
				break;
			case 2000:
				monnayeur.stockerBillets(BilletMonnaie.B20);
				break;
			case 5000:
				monnayeur.stockerBillets(BilletMonnaie.B50);
				break;
		}
		introduit+=i;
		
	}
	
	public String[] rechercherHoraireDepart(String gareDepart, int heure, int minute) throws SQLException
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		ResultSet res = hTrains.calculToutesLesGaresArrivee(gareDepart, heure, minute);
		String[] tab = hTrains.conversionRequeteEnTableau(res);
		return tab;
	}
	
	public String[] rechercherHoraireItineraire(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		ResultSet res = hTrains.calculItineraire(gareDepart, gareArrivee, heure, minute);
		String[] tab = hTrains.conversionRequeteEnTableau(res);
		return tab;
	}
	
	public String[] rechercherHoraireArrivee(String gareArrivee, int heure, int minute) throws SQLException
	{
		HoraireTrains hTrains = new HoraireTrains();
		hTrains.connexion();
		ResultSet res = hTrains.calculToutesLesGaresDepart(gareArrivee, heure, minute);
		String[] tab = hTrains.conversionRequeteEnTableau(res);
		return tab;
	}
	
	public Rendu rendreMonnaie() throws PasAssezDeMonnaie
	{
		return monnayeur.retournerArgent(introduit-prix);
	}

	
	public Rendu rendreIntroduit()
	{
		return monnayeur.rendreMontantEncours();
	}

	/*public int getIntroduit()
	{
		return introduit;
	}*/

	public void reinitialisation()
	{
		setIntroduit(0);
	}

	private void setIntroduit(int introduit)
	{
		this.introduit=introduit;
	}

	public void viderCaisse()
	{
		monnayeur.vider();
	}

	public boolean estEnMarche(Composant composant)
	{
		
		return composantEnMarche.get(composant);
	}

	public void impression() throws ComposantHorsService, PlusDePapier
	{
		imprimante.imprimer();
	}

	
	public void tombeEnPanne(Composant composant)
	{
		composantEnMarche.put(composant, false);
	}

	public void composantRepare(Composant composant)
	{
		composantEnMarche.put(composant, true);
	}

	public boolean depassementPrix()
	{
		return prix<=introduit;
	}

	public double prixAffichable()
	{
		return (double) prix /100;
	}

	public double renduAffichable()
	{
		return Math.abs((double) (introduit-prix) /100);
	}

	public double introduitAffichable()
	{
		return (double) introduit /100;
	}

}