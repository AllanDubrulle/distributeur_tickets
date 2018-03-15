package stockage;

import java.util.Date;

import stockage.imprimable.Billet;
import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TitreDeTransport;
import stockage.imprimable.TypeTitre;


public class CoeurAStockageImpl implements CoeurAStockage 
{
	private Carte carte;
	private TitreDeTransport achat;
	private int nbrCommande;
	private double prix;
	
	public double getPrix() {
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
	
	public void creerBillet() 
	{
		
	}

	public void creerAbonnement() 
	{
		
	}

	public void creerPass() 
	{
		
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
		System.out.println(reduc==null || type==null || classeBillet ==null);
		System.out.println(reduc==null);
		System.out.println(type==null);
		System.out.println(classeBillet ==null);
		if (reduc==null || type==null || classeBillet ==null )
		{
			throw new ErreurDEncodage ("problème d'encodage");
		}
		
		setAchat(new Billet(dateValidite,new Date(), gareDepart, gareArrivee,  classeBillet, type,reduc,allerRetour));
		setPrix(calculerPrix(gareDepart,gareArrivee,reduc,type,classeBillet)*nbrBillet);
	}

	public double calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre typeBillet,Classe classe)
	{
		double prix=100;
		prix = prix-prix*(reduc.valeur()/100);
		prix = prix-prix*(typeBillet.valeur()/100);
		prix = prix-prix*(classe.valeur()/100);
		return prix;
	}

	private void setAchat(TitreDeTransport billet)
	{
		this.achat = billet;
	}
}