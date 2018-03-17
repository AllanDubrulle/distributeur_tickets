package stockage;

import java.util.Date;

import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TitreDeTransport;
import stockage.imprimable.TypeTitre;

public interface CoeurAStockage 
{
	public void creerCarte(String id, int codePIN);
	public void creerBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart, String gareArrivee, String typeBillet, String reduction, boolean allerRetour) throws ErreurDEncodage;
	public void creerAbonnement(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, int classe, String reduction, String type, String codeBarre, String nom, String registreNational) throws ErreurDEncodage;
	public void creerPass();
	public double calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre typeBillet,Classe classe);
	public boolean existenceTrajet(String gareDepart,String gareArrivee);
	public String[] getListeReduction();
	public String[] getListeType();
	public TitreDeTransport getTitre();
	public double getPrix();
	public int getNbrTitre();
	public void ajoutMonnaie(int i);
	public Rendu rendreMonnaie(double rendu) throws PasAssezDeMonnaie;
	public Rendu rendreIntroduit();
	public double getIntroduit();
	public void reinitialisation();
	public double getRendu();

}