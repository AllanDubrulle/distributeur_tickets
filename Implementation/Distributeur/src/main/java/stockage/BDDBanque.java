package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class BDDBanque extends GestionBaseDeDonnees 
{
	
	/**
     * 
     * @author TheoDaix, AllanDubrulle, VictorVerhoye
     * 
     */
	
	public BDDBanque()
    {
        super();
    }
	
	/**
     *
     * V�rification du paiement si le prix � payer est inf�rieur � 5
     * V�rifie dans la base de donn�es si le solde sur une certaine carte bancaire (numero) est sup�rieure au prix de sa commande 
     * dans le distributeur 
     * Si la carte n'existe pas, la m�thode retourne faux
     * 
     */
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
	
	/**
     * 
     * V�rifie l'existence d'une certaine carte bancaire dans la base de donn�es
     * 
     */
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
	
	/**
     * 
     * Va chercher dans la base de donn�es les informations d'une carte bancaire � partir de son num�ro de carte (numero)
     * Retourne un tableau contenant ces informations
     * 
     */
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
	
	/**
    *
    * V�rification du paiement si le prix � payer est sup�rieur � 5
    * V�rifie dans la base de donn�es si le solde sur une certaine carte bancaire (numero) est sup�rieure au prix de sa commande 
    * dans le distributeur et si le code PIN ins�r� est correct
    * Si la carte n'existe pas, la m�thode retourne faux
    * 
    */
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
	
	/**
    *
    * Permet de modifier le solde d'une certaine carte bancaire dans la base de donn�es apr�s un paiement
    * 
    */
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
}
