package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

import stockage.ConnexionBDD;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		ConnexionBDD conn = new ConnexionBDD();
		conn.connect();
		ResultSet res = conn.heureTrajet("Tournai", "Bruxelles");
		ConnexionBDD.afficherResultat(res);
		conn.disconnect();
	}	
}
