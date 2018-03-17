package stockage;

import java.util.Date;

import stockage.imprimable.Abonnement;
import stockage.imprimable.Billet;
import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TitreDeTransport;
import stockage.imprimable.TypeTitre;


public class CoeurAStockageImpl implements CoeurAStockage 
{
	private Carte carte;
	private TitreDeTransport achat;
	private int nbrTitre;
	private double prix;
	private Monnayeur monnayeur = new Monnayeur(); // a modifier si on modifie panne
	
	private void setNbrTitre(int nbrTitre)
	{
		this.nbrTitre=nbrTitre;
		
	}
	
	public double getPrix()
	{
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void creerCarte(String id, int codePIN) 
	{
		carte = new Carte(id, codePIN);
	}
	
	public Carte getCarte()
	{
		return carte;
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
		if (classe==0)
		{
			classeBillet = Classe.C1;
		}
		if(classe==1)
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
		setAchat(new Billet(dateValidite,new Date(), gareDepart, gareArrivee,  classeBillet, type,reduc,allerRetour));
		setPrix(calculerPrix(gareDepart,gareArrivee,reduc,type,classeBillet)*nbrBillet);
	}
	public void creerAbonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, int classe,
			String reduction, String type, String codeBarre, String nom, String registreNational) throws ErreurDEncodage
	{
		Reduction reduc = null;
		Classe classeAbo = null;
		TypeTitre typeAbo = null;
		int validite = dateExp.getMonth()-dateValidite.getMonth();
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
		if (validite == 0)
			validite = 12;
		if (validite == 2)
			validite = 1;
		if (validite == 4)
			validite = 3;
		if (validite == 7)
			validite = 6;
		if (reduc==null || typeAbo == null || classeAbo ==null )
		{
			throw new ErreurDEncodage ("problème d'encodage");
		}
		setAchat(new Abonnement(dateValidite, dateExp, gareDepart, gareArrivee,  classeAbo, reduc, typeAbo, codeBarre, nom, registreNational));
		setPrix(calculerPrixAbo(gareDepart, gareArrivee, reduc, typeAbo, classeAbo, validite));
	}
	public void creerPass() 
	{
		
	}

	public double calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre typeBillet, Classe classe)
	{
		double calculPrix=100;
		calculPrix -=  calculPrix*  ((double)reduc.valeur()/100);
		calculPrix =  calculPrix- calculPrix*((double)typeBillet.valeur()/100);
		calculPrix =  calculPrix*((double)3-classe.valeur());
		return  calculPrix;
	}
	public double calculerPrixAbo(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre type, Classe classe, int validite)
	{
		double calculPrix=100;
		calculPrix -= calculPrix*  ((double)reduc.valeur()/100);
		calculPrix =  calculPrix- calculPrix*((double)type.valeur()/100);
		calculPrix = calculPrix*((double)3-classe.valeur());
		calculPrix = calculPrix*validite;
		return  calculPrix;
	}

	private void setAchat(TitreDeTransport billet)
	{
		System.out.println(billet == null);
		this.achat = billet;
	}

	
	public boolean existenceTrajet(String gareDepart, String gareArrivee)
	{
		return true;// a faire avec la bdd 
	}

	public TitreDeTransport getTitre()
	{
		return achat;
	}

	
	public int getNbrTitre()
	{
		return nbrTitre;
	}
	
	public void ajoutMonnaie(int i)
	{
		switch(i)
		{
			case 1:
				monnayeur.stockerPieces(Pieces.P1);
			case 2:
				monnayeur.stockerPieces(Pieces.P2);
			case 5:
				monnayeur.stockerPieces(Pieces.P5);
			case 10:
				monnayeur.stockerPieces(Pieces.P10);
			case 20:
				monnayeur.stockerPieces(Pieces.P20);
			case 50:
				monnayeur.stockerPieces(Pieces.P50);
			case 100:
				monnayeur.stockerPieces(Pieces.P100);
			case 200:
				monnayeur.stockerPieces(Pieces.P200);
			case 500:
				monnayeur.stockerBillets(BilletMonnaie.B5);
			case 1000:
				monnayeur.stockerBillets(BilletMonnaie.B10);
			case 2000:
				monnayeur.stockerBillets(BilletMonnaie.B20);
			case 5000:
				monnayeur.stockerBillets(BilletMonnaie.B50);
				// cas général exception ??
			
		}
		
	}
	
	
}