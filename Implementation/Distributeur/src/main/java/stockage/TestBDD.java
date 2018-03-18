package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		GestionBaseDeDonnees gest = new GestionBaseDeDonnees();
		//BDDBanque gest = new BDDBanque();
		gest.connexion();
		ResultSet res = gest.resultatRequete("select * from prixpassspeciaux");
		//gest.mettreAJour("insert into PrixPassSpeciaux values ('SansRestriction', 18)");
		//boolean res = gest.verifPaiement("0000000000000000000000000", 1234, 500);
		HoraireTrains.afficherResultat(res);
		//System.out.print(res);
		gest.deconnexion();
	}	
}
