package interfaceGraphique;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.util.Duration;

class FAfficherMessage extends Ecran 
{
	private boolean lecteur; 
	
    public FAfficherMessage(String message, double hauteur, double largeur) 
    {
        Rectangle rectangle = new Rectangle();
        Text text = new Text();

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

        text.setLayoutX(284.0*largeur);
        text.setLayoutY(193.0*hauteur);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText(message);
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(232.0*largeur);
        text.setFont(new Font("System Italic", 18.0*hauteur));

        getChildren().addAll(rectangle, text);
        
        if (message.equals("Impression ...") || message.equals("Problème technique. Veuillez prendre contact avec un technicien pour tout rembouserment.") || message.equals("Problème d'imprimante"))
        {
        	lecteur = false;
        	PauseTransition delais = new PauseTransition(Duration.seconds(5));
    		delais.setOnFinished( event -> apres5secOk());
    		delais.play();
        }
        
        if (!message.equals("Code PIN incorrect. Veuillez rééssayer.") && !message.equals("Veuillez entrer votre code PIN.") && !message.equals("Paiement effectué avec succès. Veuillez récuperer votre carte."))
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
    
    private void apres5sec() 
    {
		graphAC.apres5secondes();
	}
    private void apres5secOk() 
    {
		graphAC.apres5secondesOk();
	}

    public void actionLecteur(int a) 
	{
    	if(lecteur)
    		if(FenetreSimulation.getInstance().getLecteur().getMDP().getText().length() < 4)
    			FenetreSimulation.getInstance().getLecteur().getMDP().setText(FenetreSimulation.getInstance().getLecteur().getMDP().getText() + a);
	}
	
	public void actionLecteurEff() 
	{
		if(lecteur)
			if(FenetreSimulation.getInstance().getLecteur().getMDP().getText().length() > 0)
				FenetreSimulation.getInstance().getLecteur().getMDP().setText(FenetreSimulation.getInstance().getLecteur().getMDP().getText().substring(0, FenetreSimulation.getInstance().getLecteur().getMDP().getText().length()-1));
	}
}