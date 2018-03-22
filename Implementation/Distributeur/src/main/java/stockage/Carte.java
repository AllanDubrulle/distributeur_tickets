package stockage;

/**
 * Classe Carte
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Carte 
{
	private String id;
	private int codePIN;
	private int solde;
	
	/**
	 * 	Constructeur de Carte qui initialise les variables id, codePIN, solde
	 * 	@param id un num�ro de carte bancaire
	 * 	@param codePIN un code PIN
	 * 	@param solde un solde
	 */
	public Carte(String id, int codePIN, int solde) 
	{
		this.id = id;
		this.codePIN = codePIN;
		this.solde = solde; 
	}
	
	/**
	 * 	V�rifie si le solde de la carte est sup�rieur ou �gal au montant
	 * 	@param montant un montant
	 * 	@return verif vrai si montant <= solde, faux sinon
	 */
	public boolean soldeSuffisant(double montant)
	{
		System.out.println(solde);
		return (this.solde >= montant);
	}
	
	/**
	 * 	V�rifie si le code PIN est correct
	 * 	@param code code PIN � v�rifier
	 * 	@return verif vrai si code = codePIN, faux sinon
	 */
	public boolean verifCodePIN(int code)
	{
		return (this.codePIN == code);
	}
	
	/**
	 * 	Permet de r�cuperer le solde sur la carte
	 * 	@return solde le solde de la carte
	 */
	public int getSolde()
	{
		return solde;
	}
	
	/**
	 * 	Permet d'obtenir le num�ro de carte bancaire en cours d'utilisation
	 * 	@return id le num�ro de la carte bancaire
	 */
	public String getID()
	{
		return id;
	}
}