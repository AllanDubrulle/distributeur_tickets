package stockage.imprimable;

import java.util.Date;

/**
 *  Classe abstraite TitreDeTransport
 *  @author TheoDaix, AllanDubrulle, VictorVerhoye
 *  @version 1.0
 */
public abstract class TitreDeTransport
{
	protected Date dateValidite ;
	protected Date dateExp;
	protected String gareDepart;
	protected String gareArrivee;
	protected Classe classe;
	protected int nbrJours;
	protected TypeTitre type;
	protected Reduction reduction;
	
	/**
	 *  Constructeur de TitreDeTransport (pour l'abonnement)
	 *  @param dateValidite
	 *  @param dateExp
	 *  @param gareDepart
	 *  @param gareArrivee
	 *  @param classe
	 *  @param type
	 *  @param reduction
	 */
	public TitreDeTransport(Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.dateValidite = dateValidite;
		this.dateExp = dateExp;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	
	/**
	 *  Constructeur de TitreDeTransport (pour le billet)
	 *  @param dateValidite
	 *  @param gareDepart
	 *  @param gareArrivee
	 *  @param classe
	 *  @param type
	 *  @param reduction
	 */
	public TitreDeTransport(Date dateValidite, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.dateValidite = dateValidite;
		this.gareDepart = gareDepart;
		this.gareArrivee = gareArrivee;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	
	/**
	 *  Constructeur de TitreDeTransport (pour le pass illimite)
	 *  @param nbrJours
	 *  @param classe
	 *  @param type
	 *  @param reduction
	 */
	public TitreDeTransport(int nbrJours, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.nbrJours = nbrJours;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	
	/**
	 *  Constructeur de TitreDeTransport (pour le pass dix trajets)
	 *  @param classe
	 *  @param type
	 *  @param reduction
	 */
	public TitreDeTransport(Classe classe, TypeTitre type, Reduction reduction)
	{
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	
	/**
	 *  Constructeur de TitreDeTransport (pour le pass dix trajets deux gares)
	 *  @param gareDepart
	 *  @param gareArrivee
	 *  @param classe
	 *  @param type
	 *  @param reduction
	 */
	public TitreDeTransport(String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
	{
		this.gareArrivee = gareArrivee;
		this.gareDepart = gareDepart;
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	
	/**
	 *  Permet de recuperer la date de validite d'un titre de transport
	 *  @return dateValidite la date de validite d'un titre de transport
	 */
	public Date getDateValidite()
	{
		return dateValidite;
	}
	
	/**
	 *  Permet de recuperer la date d'expiration d'un titre de transport 
	 *  @return dateExp la date d'expiration d'un titre de transport
	 */
	public Date getDateExp()
	{
		return dateExp;
	}
	
	/**
	 *  Permet de recuperer la gare de depart d'un titre de transport
	 *  @return gareDepart la gare de depart d'un titre de transport
	 */
	public String getGareDepart()
	{
		return gareDepart;
	}
	
	/**
	 *  Permet de recuperer la gare d'arrivee d'un titre de transport
	 *  @return gareArrivee la gare d'arrivee d'un titre de transport
	 */
	public String getGareArrivee()
	{
		return gareArrivee;
	}
	
	/**
	 *  Permet de recuperer la classe d'un titre de transport
	 *  @return classe la classe d'un titre de transport
	 */
	public Classe getClasse()
	{
		return classe;
	}
	
	/**
	 *  Permet de recuperer le type d'un titre de transport
	 *  @return type le type d'un titre de transport
	 */
	public TypeTitre getType()
	{
		return type;
	}
	
	/**
	 *  Permet de recuperer la reduction d'un titre de transport
	 *  @return reduction la reduction d'un titre de transport
	 */
	public Reduction getReduction()
	{
		return reduction;
	}
	
	/**
	 *  Permet de recuperer le nombre de jours de validite d'un titre de transport 
	 *  (ne concerne que le pass illimite)
	 *  @return
	 */
	public int getNbrJours() 
	{
		return nbrJours;
	}
}