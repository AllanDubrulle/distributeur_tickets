package stockage;

public class Carte 
{
	private String id;
	private int codePIN;
	private int solde;

	public Carte(String id, int codePIN, int solde) 
	{
		this.id = id;
		this.codePIN = codePIN;
		this.solde = solde; 
	}
	private boolean soldeSuffisant(double montant)
	{
		return (this.solde >= montant);
	}
	private boolean verifCodePIN(int code)
	{
		return (this.codePIN == code);
	}
	public boolean verifPaiement(int code, double montant)
	{ 
		return (soldeSuffisant(montant) && verifCodePIN(code));
	}
	
	public int getSolde()
	{
		return solde;
	}
	
	public String getID()
	{
		return id;
	}
}