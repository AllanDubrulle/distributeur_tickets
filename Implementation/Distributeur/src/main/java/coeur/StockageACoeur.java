package coeur;

import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TypeTitre;
/**
 * Interface StockageACoeur (permet au stockage de communiquer avec le coeur)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public interface StockageACoeur //ATTENTION SUREMENT A SUPPRIMER CAR STOCKAKE N A RIEN A DIRE A COEUR !!!! =====>> Plus maintenant :D
{
	public void Impression();
	
	/**
	 * 	Permet de calculer le prix d'un titre de transport � partir d'une gare de d�part, une
	 * 	gare d'arriv�e, d'une r�duction, d'un type de titre et d'une classe (pour un billet)
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param reduc une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@return le prix du titre de transport (en cents)
	 */
	public int calculerPrix(String gareDepart, String gareArrivee,Reduction reduc,TypeTitre type,Classe classe);
	
	/**
	 * 	Permet de calculer le prix d'un titre de transport � partir d'une gare de d�part, une
	 * 	gare d'arriv�e, d'une r�duction, d'un type de titre, d'une classe et d'une validite
	 * 	(pour un abonnement)
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param reduc une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param classe une classe (Classe)
	 * 	@param validite une validite (1, 3, 6 ou 12 mois)
	 * 	@return le prix du titre de transport (en cents)
	 */
	public int calculerPrix(String gareDepart, String gareArrivee, Reduction reduc, TypeTitre type, Classe classe, int validite);
	
	/**
	 * 	Permet de calculer le prix d'un titre de transport � partir d'une r�duction, d'un 
	 * 	type de titre, d'une classe et d'un nombre de jours (pour un pass illimit�)
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@param nbrJours le nombre de jours de la validit� du titre
	 * 	@return le prix du titre de transport
	 */
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type, int nbrJours);
	
	/**
	 * 	Permet de calculer le prix d'un titre de transport � partir d'une r�duction, d'un 
	 * 	type de titre et d'une classe (pour un pass dix trajets)
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@return le prix du titre de transport
	 */
	public int calculerPrix(Classe classe, Reduction reduction, TypeTitre type);
	
	/**
	 * 	Permet de calculer le prix d'un titre de transport � partir d'une gare de d�part, d'une
	 * 	gare d'arriv�e, d'une r�duction, d'un type de titre et d'une classe (pour un pass dix 
	 * 	trajets)
	 * 	@param gareDepart une gare de d�part
	 * 	@param gareArrivee une gare d'arriv�e
	 * 	@param classe une classe (Classe)
	 * 	@param reduction une r�duction (Reduction)
	 * 	@param type un type de titre (TypeTitre)
	 * 	@return le prix du titre de transport
	 */
	public int calculerPrix(String gareDepart, String gareArrivee, Classe classe, Reduction reduction, TypeTitre type);
}