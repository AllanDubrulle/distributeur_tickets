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
	
	public boolean verifPaiement(String numero, int PIN, double montant)
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
	
	public void actualiserSolde(String numero, double montant)
	{
		try
        {
			Double solde = soldeCarte(numero);
			String requete = "UPDATE carte SET solde = ? WHERE numero = ?";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setDouble(1, solde - montant);
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
