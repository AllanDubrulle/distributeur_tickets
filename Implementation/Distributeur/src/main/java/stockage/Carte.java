package stockage;

public class Carte 
{
	private String id;
	private int codePIN;
	private double solde;

	public Carte(String id, int codePIN, double solde) 
	{
		this.id = id;
		this.codePIN = codePIN;
		this.solde = solde;
	}
	public boolean soldeSuffisant(double montant)
	{
		return (this.solde >= montant);
	}
	public boolean verifCodePIN(int code)
	{
		return (this.codePIN == code);
	}
	public boolean verifPaiement(int code, double montant)
	{
		return (soldeSuffisant(montant) && verifCodePIN(code));
	}
	public double getSolde() 
	{
		return this.solde;
	}
}