package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		BDDTitre gest = new BDDTitre();
		//GestionBaseDeDonnees gest = new GestionBaseDeDonnees();
		//BDDBanque gest = new BDDBanque();
		gest.connexion();
		//gest.mettreAJour("insert into abosexistants values(3, 'ALLAN DUBRULLE', '98061925641', 'ATH', 'MONS', '2018', '11', '25', 'Velo', 'Famille nombreuse', '2')");
		ResultSet res = gest.resultatRequete("select * from carte");
		//ArrayList<String> res = gest.listeDesAbonnements();
		//String[] res = gest.infoAbonnement("1");
		//double res = gest.calculerPrixPass("10Trajets");
		//boolean res = gest.verifPaiement("0000000000000000000000000", 1234, 500);
		//int res = gest.numeroAbonnementSuivant();
		HoraireTrains.afficherResultat(res);
		//System.out.print(res);
		gest.deconnexion();
		
	}	
}
