package stockage.imprimable;

import stockage.imprimable.TitreDeTransport;

/**
 *  Classe Pass
 *  @author TheoDaix, AllanDubrulle, VictorVerhoye
 *  @version 1.0
 */
public class Pass extends TitreDeTransport
{
	private TypePass typePass;
	private String nom;
	
	/**
	 * 	Contructeur de Pass (dix trajets entre deux gares)
	 * 	@param nom le nom auquel est enregistre le pass
	 * 	@param gareDepart la gare de depart du pass
	 * 	@param gareArrivee la gare d'arrivee du pass
	 * 	@param classe la classe du pass
	 * 	@param type le type de titre du pass
	 * 	@param reduction la reduction du pass
	 * 	@param typePass le type de pass
	 */
	public Pass(String nom, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction, TypePass typePass)	//10Trajets2Gares
	{
		super(gareDepart, gareArrivee, classe, type, reduction);
		this.nom = nom;
		this.typePass = typePass;
	}
	
	/**
	 *  Contructeur de Pass (illimite)
	 *  @param nom le nom auquel est enregistre le pass
	 *  @param nbrJours le nombre de jours de validite du passs
	 *  @param classe la classe du pass
	 *  @param type le type de titre du pass
	 *  @param reduction la reduction du pass
	 *  @param typePass le type de pass
	 */
	public Pass(String nom, int nbrJours, Classe classe, TypeTitre type, Reduction reduction, TypePass typePass)		//Illimite
	{
		super(nbrJours, classe, type, reduction);
		this.nom = nom;
		this.typePass = typePass;
	}
	
	/**
	 *  Contructeur de Pass (dix trajets)
	 *  @param nom le nom auquel est enregistre le pass
	 *  @param classe la classe du pass
	 *  @param type le type de titre du pass
	 *  @param reduction la reduction du pass
	 *  @param typePass le type de pass
	 */
	public Pass(String nom, Classe classe, TypeTitre type, Reduction reduction, TypePass typePass)		//10Trajets
	{
		super(classe, type, reduction);
		this.nom = nom;
		this.typePass = typePass;
	}
	
	/**
	 *  Permet de recuperer le type de pass
	 *  @return typePass le type de pass
	 */
	public TypePass getTypePass()
	{
		return typePass;
	}
	
	/**
	 *  Permet de recuperer le nom auquel est enregistre le pass
	 *  @return nom le nom auquel est enregistre le pass
	 */
	public String getNom() 
	{
		return nom;
	}
}