package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class BDDBanque extends GestionBaseDeDonnees 
{
	public BDDBanque()
    {
        super();
    }
	
	public boolean verifPaiementPlusPetitQue5(String numero, double montant)
	{
		try
        {
			String requete = "SELECT SOLDE FROM CARTE WHERE (NUMERO = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numero);
			ResultSet res = declar.executeQuery();
			boolean ok = res.next();
			if (ok && res.getDouble(1) >= montant)
			{
        		return true;
			}
			else
			{
				return false;
			}
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
	}
	
	public boolean existenceCarte(String numero)
	{
		try
        {
			String requete = "SELECT SOLDE FROM CARTE WHERE (NUMERO = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numero);
			ResultSet res = declar.executeQuery();
			boolean ok = res.next();
			return ok;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
	}
	
	public String[] infoCarte(String numero)
	{
		String[] res = new String[3];
		try
        {
			if (existenceCarte(numero))
			{	
				String requete = "SELECT numero, code, solde FROM CARTE WHERE (NUMERO = ?)";
	            PreparedStatement declar = this.connexion.prepareStatement(requete);
	            declar.setString(1, numero);
				ResultSet resSQL = declar.executeQuery();
				resSQL.next();
				res[0] = numero;
				res[1] = resSQL.getString("code");
				res[2] = resSQL.getString("solde");
				return res;
			}
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return res;
	}
	
	public boolean verifPaiementPlusGrandQue5(String numero, int PIN, double montant)
	{
		try
        {
			String requete = "SELECT SOLDE FROM CARTE WHERE (NUMERO = ? and CODE = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numero);
			declar.setInt(2, PIN);
			ResultSet res = declar.executeQuery();
			boolean ok = res.next();
			if (ok && res.getDouble(1) >= montant)
			{
        		System.out.println("bli");
				return true;
			}
			else
			{
				return false;
			}
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
	}
	
	public void actualiserSolde(String numero, int somme)
	{
		try
        {
			String requete = "UPDATE carte SET solde = ? WHERE numero = ?";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, Integer.toString(somme));
			declar.setString(2, numero);
			declar.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
	}
	
	public double soldeCarte(String numero)
	{
		try
        {
			String requete = "select solde from carte where numero = ?";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, numero);
			ResultSet res = declar.executeQuery();
			double solde = res.getDouble(1);
			return solde;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
		return -1;
	}
	
}
