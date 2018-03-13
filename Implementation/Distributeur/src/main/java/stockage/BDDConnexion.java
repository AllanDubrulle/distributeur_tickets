package stockage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class BDDConnexion {
	private String chemin = "jdbc:sqlite:Distributeur/librairie/BDDDistributeur.db"; //aucune idee de comment ecrire le chemin
    private Connection connection = null;
    private Statement statement = null;
 
    public BDDConnexion(String chemin) {
        this.chemin = chemin;
    }
 
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + chemin);
            statement = connection.createStatement();
            System.out.println("Connexion a " + chemin + " avec succès");
        } catch (ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();
            System.out.println("Erreur de connexion");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Erreur de connexion");
        }
    }
 
    public void close() {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet requete(String requete) {
        ResultSet resultat = null;
        try {
            resultat = statement.executeQuery(requete);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur dans la requet : " + requete);
        }
        return resultat;
  
    }
}

