package coeur;

import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TypeTitre;

public interface StockageACoeur //ATTENTION SUREMENT A SUPPRIMER CAR STOCKAKE N A RIEN A DIRE A COEUR !!!! =====>> Plus maintenant :D
{
	public void Impression();
	public int calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre type,Classe classe);
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre type, Classe classe, int validite);
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type, int nbrJours);
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type);
	public int calculerPrix(String gareDepart, String gareArrivee, Classe classe, Reduction reduction, TypeTitre type);
}