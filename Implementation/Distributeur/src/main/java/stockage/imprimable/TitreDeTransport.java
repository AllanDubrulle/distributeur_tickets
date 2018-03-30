package stockage.imprimable;

import java.time.LocalDate;

/**
 *  Classe abstraite TitreDeTransport
 *  @author TheoDaix, AllanDubrulle, VictorVerhoye
 *  @version 1.0
 */
public abstract class TitreDeTransport
{
	protected LocalDate dateValidite ;
	protected LocalDate dateExp;
	protected String gareDepart;
	protected String gareArrivee;
	protected Classe classe;
	protected int nbrJours;
	protected TypeTitre type;
	protected Reduction reduction;
	
	/**
	 *  Constructeur de TitreDeTransport (pour l'abonnement)
	 *  @param dateValidite la date de debut de validite du titre
	 *  @param dateExp la date d'expiration du titre
	 *  @param gareDepart une gare de depart du titre
	 *  @param gareArrivee une gare d'arrivee du titre
	 *  @param classe la classe du titre de transport (Classe)
	 *  @param type le type du titre de transport (TypeTitre)
	 *  @param reduction une reduction (Reduction)
	 */
	public TitreDeTransport(LocalDate dateValidite, LocalDate dateExp, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
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
	 *  @param dateValidite la date de depart du titre
	 *  @param gareDepart une gare de depart du titre
	 *  @param gareArrivee une gare d'arrivee du titre
	 *  @param classe la classe du titre de transport (Classe)
	 *  @param type le type du titre de transport (TypeTitre)
	 *  @param reduction une reduction (Reduction)
	 */
	public TitreDeTransport(LocalDate dateValidite, String gareDepart, String gareArrivee, Classe classe, TypeTitre type, Reduction reduction)
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
	 *  @param nbrJours le nombre de jours de la validite
	 *  @param classe la classe du titre de transport (Classe)
	 *  @param type le type du titre de transport (TypeTitre)
	 *  @param reduction une reduction (Reduction)
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
	 *  @param classe la classe du titre de transport (Classe)
	 *  @param type le type du titre de transport (TypeTitre)
	 *  @param reduction une reduction (Reduction)
	 */
	public TitreDeTransport(Classe classe, TypeTitre type, Reduction reduction)
	{
		this.classe = classe;
		this.type = type;
		this.reduction = reduction;
	}
	
	/**
	 *  Constructeur de TitreDeTransport (pour le pass dix trajets deux gares)
	 *  @param gareDepart une gare de depart du titre
	 *  @param gareArrivee une gare d'arrivee du titre
	 *  @param classe la classe du titre de transport (Classe)
	 *  @param type le type du titre de transport (TypeTitre)
	 *  @param reduction une reduction (Reduction)
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
	public LocalDate getDateValidite()
	{
		return dateValidite;
	}
	
	/**
	 *  Permet de recuperer la date d'expiration d'un titre de transport 
	 *  @return dateExp la date d'expiration d'un titre de transport
	 */
	public LocalDate getDateExp()
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
	 *  @return nbrJours le nombre de jours de la validite
	 */
	public int getNbrJours() 
	{
		return nbrJours;
	}
}