package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe BBDBanque (gestion de base de donn�es pour toute les donn�es bancaires)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
public class BDDBanque extends GestionBaseDeDonnees 
{	
	/**
	 * 	Constructeur de BDDBanque
	 */
	public BDDBanque()
    {
        super();
    }
	
	/**
     * 	V�rifie l'existence d'une certaine carte bancaire dans la base de donn�es
     * 	@param numero le numero de carte
     * 	@return carte retourne si la carte est pr�sente dans la base de donn�es
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
     * 	Va chercher dans la base de donn�es les informations d'une carte bancaire � partir de son num�ro de carte (numero)
     * 	Retourne un tableau contenant ces informations
     * 	@param numero un num�ro de carte bancaire
     * 	@return liste une liste d'informations sur la carte dans l'ordre :
     * 	Num�ro, Code, Solde
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
	 * 	Permet de modifier le solde d'une certaine carte bancaire dans la base de donn�es apr�s un paiement
	 * 	@param numero un numero de carte bancaire
	 * 	@param somme le montant � mettre au solde de la carte bancaire
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
