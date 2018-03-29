package stockage;

/**
 * Classe Carte
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class Carte 
{
	private String identifiant;
	private int codePIN;
	private int solde;
	
	/**
	 * 	Constructeur de Carte qui initialise les variables id, codePIN, solde
	 * 	@param id un numero de carte bancaire
	 * 	@param codePIN un code PIN
	 * 	@param solde un solde
	 */
	public Carte(String id, int codePIN, int solde) 
	{
		this.identifiant = id;
		this.codePIN = codePIN;
		this.solde = solde; 
	}
	
	/**
	 * 	Verifie si le solde de la carte est superieur ou egal au montant
	 * 	@param montant un montant
	 * 	@return verif vrai si montant <= solde, faux sinon
	 */
	public boolean soldeSuffisant(double montant)
	{
		return (this.solde >= montant);
	}
	
	/**
	 * 	Verifie si le code PIN est correct
	 * 	@param code code PIN a verifier
	 * 	@return verif vrai si code = codePIN, faux sinon
	 */
	public boolean verifCodePIN(int code)
	{
		return (this.codePIN == code);
	}
	
	/**
	 * 	Permet de recuperer le solde sur la carte
	 * 	@return solde le solde de la carte
	 */
	public int getSolde()
	{
		return solde;
	}
	
	/**
	 * 	Permet d'obtenir le numero de carte bancaire en cours d'utilisation
	 * 	@return id le numero de la carte bancaire
	 */
	public String getID()
	{
		return identifiant;
	}
	public int getCode()
	{
		return codePIN;
	}
}