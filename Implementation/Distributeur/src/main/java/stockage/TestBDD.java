package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		HoraireTrains gest = new HoraireTrains();
		gest.connexion();
		ResultSet res = gest.calculToutesLesGaresDepart("bruxelles", 4, 50);
		HoraireTrains.afficherResultat(res);
		//System.out.print(res);
		gest.deconnexion();
	}	
}
