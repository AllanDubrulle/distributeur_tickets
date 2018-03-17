package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class BDDTitre extends GestionBaseDeDonnees 
{
	public BDDTitre()
    {
        super();
    }
	
	public double calculerPrix(String gare1, String gare2) //operationnel
    {
        String gare1Maj = gare1.toUpperCase();
        String gare2Maj = gare2.toUpperCase();
    	try
        {
            String requete = "SELECT Prix FROM PRIX WHERE (GARE1 = ? and GARE2 = ?) or (GARE2 = ? and GARE1 = ?)";
            PreparedStatement declar = this.connexion.prepareStatement(requete);
            declar.setString(1, gare1Maj);
			declar.setString(2, gare2Maj);
			declar.setString(3, gare1Maj);
			declar.setString(4, gare2Maj);
			ResultSet res = declar.executeQuery();
			double prix = res.getDouble(1);
        	return prix;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
