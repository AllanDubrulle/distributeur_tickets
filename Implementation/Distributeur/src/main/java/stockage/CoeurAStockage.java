package stockage;

import java.util.Date;

import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TypeTitre;

public interface CoeurAStockage 
{
	public void creerCarte(String id, int codePIN);
	public void creerBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart, String gareArrivee, String typeBillet, String reduction, boolean allerRetour) throws ErreurDEncodage;
	public void creerAbonnement();
	public void creerPass();
	public double calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre typeBillet,Classe classe);
	public String[] getListeReduction();
	public String[] getListeType();
}