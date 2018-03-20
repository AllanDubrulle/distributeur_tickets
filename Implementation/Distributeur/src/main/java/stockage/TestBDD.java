package stockage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		//BDDTitre gest = new BDDTitre();
		GestionBaseDeDonnees gest = new GestionBaseDeDonnees();
		//BDDBanque gest = new BDDBanque();
		gest.connexion();
		//gest.mettreAJour("update carte set solde = '500000' where code = '4567'");
		ResultSet res = gest.resultatRequete("select * from carte");
		//ArrayList<String> res = gest.listeDesAbonnements();
		//String[] res = gest.infoCarte("67030615781202136");
		//double res = gest.calculerPrixPass("10Trajets");
		//boolean res = gest.verifPaiement("0000000000000000000000000", 1234, 500);
		//int res = gest.numeroAbonnementSuivant();
		HoraireTrains.afficherResultat(res);
		//for (int i = 0; i < res.length; i++)
		//{
			//System.out.println(res[i]);
		//}
		gest.deconnexion();
		
	}	
}
