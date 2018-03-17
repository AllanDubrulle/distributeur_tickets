package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

import stockage.GestionBaseDeDonnees;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		HoraireTrains gest = new HoraireTrains();
		gest.connexion();
		ResultSet res = gest.heureTrajet("tournai", "bruxelles",4,50);
		HoraireTrains.afficherHeures(res);
		//System.out.print(res);
		gest.deconnexion();
	}	
}
