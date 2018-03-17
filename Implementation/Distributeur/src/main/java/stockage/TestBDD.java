package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

import stockage.ConnexionBDD;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		ConnexionBDD conn = new ConnexionBDD();
		conn.connexion();
		//boolean res = conn.existenceTrajet("victor", "tournai");
		ResultSet res = conn.heureTrajet("tournai", "bruxelles", 4, 50);
		ConnexionBDD.afficherHeures(res);
		//System.out.print(res);
		conn.deconnexion();
	}	
}
