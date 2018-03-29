package stockage.imprimable;

import java.util.Date;

/**
 * Classe Abonnement
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Abonnement extends TitreDeTransport
{
	private String nom;
	private String registreNational;
	private int codeBarre;
	
	/**
	 * 	Constructeur de Abonnement
	 * 	@param codeBarre le code barre (numero) de l'abonnement
	 * 	@param dateValidite la date de debut de validite de l'abonnement
	 * 	@param dateExp la date d'expiration de l'abonnement
	 * 	@param gareDepart la gare source de l'abonnement
	 * 	@param gareArrivee la gare d'arrivee de l'abonnement
	 * 	@param classe la classe de l'abonnement
	 * 	@param reduction la reduction de l'abonnement
	 * 	@param type le type de l'abonnement
	 * 	@param nom le nom auquel sera enregistre l'abonnement
	 * 	@param registreNational le registre national de l'utilisateur
	 */
	public Abonnement(int codeBarre, Date dateValidite, Date dateExp, String gareDepart, String gareArrivee, Classe classe,
			Reduction reduction, TypeTitre type, String nom,String registreNational)
	{
		super(dateValidite, dateExp, gareDepart, gareArrivee, classe, type, reduction);
		this.nom=nom;
		this.registreNational=registreNational;
		this.codeBarre = codeBarre;
	}
	
	/**
	 * 	Permet de recuperer le nom auquel est enregistre l'abonnement
	 * 	@return nom le nom de l'utilisateur
	 */
	public String getNom() 
	{
		return nom;
	}
	
	/**
	 * 	Permet de recuperer le registre national de l'utilisateur
	 * 	@return registreNational le registre national de l'utilisateur
	 */
	public String getRegNat()
	{
		return registreNational;
	}
	
	/**
	 * 	Permet de recuperer la periode de validite de l'abonnement
	 * 	@return validite la validite de l'abonnement
	 */
	public int getValidite()
	{
		int val = dateExp.getMonth() - dateValidite.getMonth();
		if (val == 4)
			val = 3;
		else if (val == 7)
			val = 6;
		else if (val == 2)
			val = 1;
		else if (val == 0)
			val = 12;
		return val;
	}
	
	/**
	 * 	Permet de recuperer le code barre (numero) de l'abonnement
	 * 	@return codeBarre le code barre (numero) de l'abonnement
	 */
	public int getCodeBarre()
	{
		return codeBarre;
	}
}