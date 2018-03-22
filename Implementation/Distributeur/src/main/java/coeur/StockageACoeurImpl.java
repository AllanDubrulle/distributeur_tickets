package coeur;

import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TypeTitre;

public class StockageACoeurImpl implements StockageACoeur 
{
	public static StockageACoeurImpl instance;
	private StockageACoeurImpl() {}
	public void Impression() 
	{
		
	}
	public int calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre type,Classe classe)
	{
		return Controleur.getInstance().calculerPrix(gareDepart, gareArrivee, reduc, type, classe);
	}
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre type, Classe classe, int validite)
	{
		return Controleur.getInstance().calculerPrix(gareDepart, gareArrivee, reduc, type, classe, validite);
	}
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type, int nbrJours)
	{
		return Controleur.getInstance().calculerPrix(classe, reduction, type, nbrJours);
	}
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type)
	{
		return Controleur.getInstance().calculerPrix(classe, reduction, type);
	}
	public int calculerPrix(String gareDepart, String gareArrivee, Classe classe, Reduction reduction, TypeTitre type)
	{
		return Controleur.getInstance().calculerPrix(gareDepart, gareArrivee, classe, reduction, type);
	}
	
	public static StockageACoeurImpl getInstance() 
	{	
		if(instance == null)
			instance = new StockageACoeurImpl();
		return instance;
	}
}