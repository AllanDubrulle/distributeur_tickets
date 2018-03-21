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
	public boolean soldeSuffisant(double montant)
	{
		System.out.println(solde);
		return (this.solde >= montant);
	}
	public boolean verifCodePIN(int code)
	{
		return (this.codePIN == code);
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