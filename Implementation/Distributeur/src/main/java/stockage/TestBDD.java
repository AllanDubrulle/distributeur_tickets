package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

import stockage.ConnexionBDD;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		ConnexionBDD conn = new ConnexionBDD();
		conn.connexion();
		ResultSet res = conn.prixTrajet("tournai", "bruxelles");
		ConnexionBDD.afficherResultat(res);
		conn.deconnexion();
	}	
}
