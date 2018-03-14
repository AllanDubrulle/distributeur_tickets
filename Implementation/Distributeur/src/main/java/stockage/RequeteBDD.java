package stockage;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RequeteBDD {
	private Connection connexion() {
		String chemin = "jdbc:sqlite:C://sqlite//database/BDDDistributeur.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(chemin);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	public void heureDepartArrivee(String depart, String arrivee) {
		String requete = "select heure from HORAIRE where DEPART = ? and ARRIVEE = ?";
		try (Connection conn =  this.connexion();
				PreparedStatement declar = conn.prepareStatement(requete))
		{
				declar.setString(1, depart);
				declar.setString(2, arrivee);
				ResultSet res = declar.executeQuery();
				afficherResultat(res);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
	public static void afficherResultat(ResultSet res) throws SQLException {
		ResultSetMetaData res2 = res.getMetaData();
		int nbrColonnes = res2.getColumnCount();
		while (res.next()) {
		    for (int i = 1; i <= nbrColonnes; i++) {
		        if (i > 1) System.out.print(",  ");
		        String valeurColonne = res.getString(i);
		        System.out.print(valeurColonne + " " + res2.getColumnName(i));
		    }
		    System.out.println("");
		}
	}
	public static void main(String[] args) {
			RequeteBDD req =  new RequeteBDD();
			req.heureDepartArrivee("TOURNAI", "MONS");
		}
}
