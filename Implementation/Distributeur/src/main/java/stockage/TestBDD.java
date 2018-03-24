package stockage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBDD {
	public static void main (String args[]) throws SQLException {
		//BDDTitre gest = new BDDTitre();
		//HoraireTrains gest = new HoraireTrains();
		//GestionBaseDeDonnees gest = new GestionBaseDeDonnees();
		BDDBanque gest = new BDDBanque();
		gest.connexion();
		//gest.actualiserSolde("67030615781202136", 1000000);
		//System.out.println(gest.soldeCarte("67030615781202136"));
		ResultSet res = gest.resultatRequete("select * from prixpassspeciaux");
		//ArrayList<String> res = gest.listeDesAbonnements();
		//String[] res1 = gest.conversionRequeteEnTableau(res);
		//double res = gest.calculerPrixPass("10Trajets");
		//gest.mettreAJour("update horaire set heurearrivee = 0 where heurearrivee = 24");
		//boolean res = gest.verifPaiement("0000000000000000000000000", 1234, 500);
		//int res = gest.numeroAbonnementSuivant();
		HoraireTrains.afficherResultat(res);
		//for (int i = 0; i < res1.length; i++)
		//{
			//System.out.println(res1[i]);
		//}
		gest.deconnexion();
		
	}	
}
