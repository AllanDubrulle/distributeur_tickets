package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		//BDDTitre gest = new BDDTitre();
		GestionBaseDeDonnees gest = new GestionBaseDeDonnees();
		//BDDBanque gest = new BDDBanque();
		gest.connexion();
		//gest.mettreAJour("insert into abosexistants values(3, 'ALLAN DUBRULLE', '98061925641', 'ATH', 'MONS', '2018', '11', '25', 'Velo', 'Famille nombreuse', '2')");
		//ResultSet res = gest.calculItineraire("tournai", "mons", 23,00);
		//String[] b = gest.infoAbonnement("1");
		//boolean res = gest.verifPaiement("0000000000000000000000000", 1234, 500);
		//int res = gest.numeroAbonnementSuivant();
		//HoraireTrains.afficherHeures(res);
		//System.out.print(b);
		gest.deconnexion();
		
	}	
}
