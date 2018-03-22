package stockage;

import java.sql.SQLException;
import java.util.Date;

import coeur.Commande;
import stockage.imprimable.Classe;
import stockage.imprimable.Reduction;
import stockage.imprimable.TitreDeTransport;
import stockage.imprimable.TypePass;
import stockage.imprimable.TypeTitre;

public interface CoeurAStockage 
{
	public void creerCarte(String id);
	public void creerBillet(Date dateValidite, int nbrBillet, int classe, String gareDepart, String gareArrivee, String typeBillet, String reduction, boolean allerRetour) throws ErreurDEncodage;
	public void creerAbonnement(int validite, String gareDepart, String gareArrivee, int classe, String reduction, String type, String nom, String registreNational) throws ErreurDEncodage;
	public void modifierAbo(int validite, String numAbo) throws ErreurDEncodage;
	public void creerPassIllimite(String nom, int classe, String reduction, String type, int nbrJours, String typePass) throws ErreurDEncodage;
	public void creerPass10Trajets(String nom, int classe, String reduction, String type, String typePass) throws ErreurDEncodage;
	public void creerPass10Trajets2Gares(String nom, String gareDepart, String gareArrivee, int classe, String reduction, String type, String typePass) throws ErreurDEncodage;
	public double rechercherPrix(Commande commande ,String gareDepart,String gareArrivee);
	public double rechercherPrix(TypePass typePass);
	public TypeTitre conversionType(String type ) throws ErreurDEncodage;
	public Classe conversionClasse(int classe) throws ErreurDEncodage;
	public Reduction conversionReduction(String reduction ) throws ErreurDEncodage;
	
	
	public boolean existenceTrajet(String gareDepart,String gareArrivee);
	public boolean existenceGare(String gare);
	public boolean existenceAbo(String numAbo);
	
	public String[] rechercherHoraireDepart(String gareDepart, int heure, int minute) throws SQLException;
	public String[] getListeReduction();
	public String[] getListeType();
	public String[] rechercherHoraireItineraire(String gareDepart, String gareArrivee, int heure, int minute) throws SQLException;
	public String[] rechercherHoraireArrivee(String gareArrivee, int heure, int minute) throws SQLException;
	
	public TitreDeTransport getTitre();
	public int getNbrTitre();
	public void setPrix(int prix);
	
	public boolean depassementPrix();
	public int getPrix();
	public double prixAffichable();
	public double renduAffichable();
	public double introduitAffichable();
	public void ajoutMonnaie(int i) throws ComposantHorsService;
	public Rendu rendreMonnaie() throws PasAssezDeMonnaie;
	public Rendu rendreIntroduit();
	public void reinitialisation();
	public void viderCaisse();
	
	public boolean estEnMarche(Composant composant);
	public void impression() throws ComposantHorsService, PlusDePapier;
	public void tombeEnPanne(Composant composant);
	public void composantRepare(Composant composant);
	


	public boolean verifPaiementCarte(String numero, int codePIN, double montant);
	public boolean existenceCarte(String numero);
	public Carte getCarte();
	public boolean verifCode(int codePIN);
	public boolean verifSolde();
	public void mauvaisPing();
	public boolean tropDErreur();
	public void actualiserSolde();
}