package interfaceGraphique;

import javafx.animation.PauseTransition;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.util.Duration;

/**
 * Classe FAfficherMessage (permet d'afficher un message)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class FAfficherMessage extends Ecran 
{
	private boolean lecteur; 
	
    public FAfficherMessage(String message, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text texte = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0*hauteur);
        setPrefWidth(800.0*largeur);

        rectangle.setArcHeight(5.0*hauteur);
        rectangle.setArcWidth(5.0*largeur);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#d3d3d3"));
        rectangle.setHeight(400.0*hauteur);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(800.0*largeur);

        texte.setLayoutX(284.0*largeur);
        texte.setLayoutY(193.0*hauteur);
        texte.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte.setStrokeWidth(0.0);
        texte.setText(message);
        texte.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        texte.setWrappingWidth(232.0*largeur);
        texte.setFont(new Font("System Italic", 18.0*hauteur));

        getChildren().addAll(rectangle, texte);
        
        if (message.equals("Plus de papier en reserve") ||message.equals("Impression ...") || message.equals("Probleme technique. Veuillez prendre contact avec un technicien pour tout remboursement.") || message.equals("Probleme d'imprimante"))
        {
        	lecteur = false;
        	PauseTransition delais = new PauseTransition(Duration.seconds(5));
    		delais.setOnFinished( event -> apres5secOk());
    		delais.play();
        }
        else if (message.equals("Carte bloquee"))
        {
        	lecteur = false;
        	PauseTransition delais = new PauseTransition(Duration.seconds(5));
    		delais.setOnFinished( event -> carteBloquee());
    		delais.play();
     	}
        if (!message.equals("Code PIN incorrect. Veuillez reessayer.") && !message.equals("Veuillez entrer votre code PIN.") && !message.equals("Paiement effectue avec succes. Veuillez recuperer votre carte."))
        {
        	lecteur = false;
        	PauseTransition delais = new PauseTransition(Duration.seconds(5));
    		delais.setOnFinished( event -> apres5sec());
    		delais.play();
        }
        
        else
        {
        	lecteur = true;
        	FenetreSimulation.getInstance().getLecteur().getMDP().clear();
        }
    }
    
    /**
     * 	Action a effectuer si le message correspond a "Carte bloquee"
     */
    private void carteBloquee()
    {
    	graphAC.paiement();
    }
    
    /**
     * 	Action a effectuer apres 5 secondes
     */
    private void apres5sec() 
    {
		graphAC.apres5secondes();
	}
    
    /**
     * 	Action a effectuer apres 5 secondes
     */
    private void apres5secOk() 
    {
		graphAC.apres5secondesOk();
	}
    
    /**
     * 	Permet de remplir la zone de mot de passe du lecteur de carte
     */
    public void actionLecteur(int a) 
	{
    	if(lecteur)
    		if(FenetreSimulation.getInstance().getLecteur().getMDP().getText().length() < 4)
    			FenetreSimulation.getInstance().getLecteur().getMDP().setText(FenetreSimulation.getInstance().getLecteur().getMDP().getText() + a);
	}
	
    /**
     * 	Permet d'effacer les caractere dans la zone de mot de passe du lecteur de carte
     */
	public void actionLecteurEff() 
	{
		if(lecteur)
			if(FenetreSimulation.getInstance().getLecteur().getMDP().getText().length() > 0)
				FenetreSimulation.getInstance().getLecteur().getMDP().setText(FenetreSimulation.getInstance().getLecteur().getMDP().getText().substring(0, FenetreSimulation.getInstance().getLecteur().getMDP().getText().length()-1));
	}
}