package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		HoraireTrains gest = new HoraireTrains();
		gest.connexion();
		ResultSet res = gest.resultatRequete("select * from horaire");
		HoraireTrains.afficherResultat(res);
		//System.out.print(res);
		gest.deconnexion();
	}	
}
