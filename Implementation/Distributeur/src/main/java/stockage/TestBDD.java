package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		BDDTitre gest = new BDDTitre();
		//BDDBanque gest = new BDDBanque();
		gest.connexion();
		//ResultSet res = gest.calculItineraire("tournai", "mons", 23,00);
		gest.mettreAJour("insert into PrixPassSpeciaux values ('SansRestriction', 18)");
		//boolean res = gest.verifPaiement("0000000000000000000000000", 1234, 500);
		int res = gest.numeroAbonnementSuivant();
		//HoraireTrains.afficherHeures(res);
		System.out.print(res);
		gest.deconnexion();
	}	
}
