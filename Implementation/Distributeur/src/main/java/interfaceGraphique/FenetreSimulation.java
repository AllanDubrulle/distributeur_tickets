package interfaceGraphique;

import coeur.GraphiqueACoeurImpl;
import interfaceGraphique.Clavier;
import interfaceGraphique.FenteBillet;
import interfaceGraphique.FentePiece;
import interfaceGraphique.LecteurCarte;
import interfaceGraphique.Reception;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import stockage.Composant;
import javafx.event.EventHandler;

class FenetreSimulation extends BorderPane 
{
    private Pane panneau;
    private VBox claRe = new VBox();
    private VBox fentes = new VBox();
    private VBox scanLect = new VBox();
    private Ecran fenetre;
    private CheckMenuItem menuACocher, menuACocher0, menuACocher1, menuACocher2, menuACocher3, menuACocher4, menuACocher5; 
    private RadioMenuItem menuACocher6, menuACocher7, menuACocher8, menuACocher9, menuACocher10, menuACocher11;
    private MenuItem elementACocher, elementACocher0, elementACocher1, elementACocher2;
    
    private static FenetreSimulation instance;
    
    private Clavier clavier ;
    private Reception reception;
    private LecteurCarte lecteur;
    private FenteBillet fenteBillet;
    private FentePiece fentePiece;
    private Scanneur scanneur;
    
    private double tVoulueHauteur = FenetreConfiguration.getInstance().getHauteur();
    private double tVoulueLargeur = FenetreConfiguration.getInstance().getLargeur();
    private double rapportHauteur = tVoulueHauteur/850;
    private double rapportLargeur = tVoulueLargeur/1350;
    
    private FenetreSimulation()
    {
    	clavier = new Clavier(rapportHauteur, rapportLargeur);
    	reception = new Reception(rapportHauteur, rapportLargeur);
    	lecteur = new LecteurCarte(rapportHauteur, rapportLargeur);
    	fenteBillet = new FenteBillet(rapportHauteur, rapportLargeur);
    	fentePiece = new FentePiece(rapportHauteur, rapportLargeur);
    	scanneur = new Scanneur(rapportHauteur, rapportLargeur);
    	
    	panneau = new Pane();
        MenuBar barreMenu = new MenuBar();
        Menu menu = new Menu();
        menuACocher = new CheckMenuItem();
        menuACocher0 = new CheckMenuItem();
        menuACocher1 = new CheckMenuItem();
        menuACocher2 = new CheckMenuItem();
        menuACocher3 = new CheckMenuItem();
        menuACocher4 = new CheckMenuItem();
        Menu menu0 = new Menu();
        elementACocher = new MenuItem();
        elementACocher0 = new MenuItem();
        Menu menu1 = new Menu();
        elementACocher1 = new MenuItem();
        elementACocher2 = new MenuItem();
        Menu menu2 = new Menu();
        menuACocher5 = new CheckMenuItem();
        Menu menu3 = new Menu();
        menuACocher6 = new RadioMenuItem();
        menuACocher7 = new RadioMenuItem();
        menuACocher8 = new RadioMenuItem();
        Menu menu4 = new Menu();
        menuACocher9 = new RadioMenuItem();
        menuACocher10 = new RadioMenuItem();
        menuACocher11 = new RadioMenuItem();
        EcranContour contour = EcranContour.getInstance();

        setAlignment(panneau, javafx.geometry.Pos.CENTER);
        panneau.setPrefHeight(39.0*rapportHauteur);
        panneau.setPrefWidth(1350.0*rapportLargeur);
        
        barreMenu.setMaxHeight(32.0*rapportHauteur);
        barreMenu.setMaxWidth(350.0*rapportLargeur);;
        
        afficher(new FSimulationAcceuil(rapportHauteur, rapportLargeur));

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(850.0*rapportHauteur);
        setPrefWidth(1350.0*rapportLargeur);

        menu.setMnemonicParsing(false);
        menu.setText("Pannes");

        menuACocher.setMnemonicParsing(false);
        menuACocher.setText("Lecteur de cartes");
        menuACocher.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.LECTEURCARTE);
            }
        });

        menuACocher0.setMnemonicParsing(false);
        menuACocher0.setText("Fente a billets");
        menuACocher0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	
            	fenetre.graphAC.actualiserPanne(Composant.FENTEBILLET);
            }
        });

        menuACocher1.setMnemonicParsing(false);
        menuACocher1.setText("Fente a  pieces");
        menuACocher1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.FENTEPIECE);
            }
        });

        menuACocher2.setMnemonicParsing(false);
        menuACocher2.setText("Scanneur de codes");
        menuACocher2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.SCANNEUR);
            }
        });

        menuACocher3.setMnemonicParsing(false);
        menuACocher3.setText("Bloquer la carte");
        menuACocher3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.bloquerCarte();
            }
        });

        menuACocher4.setMnemonicParsing(false);
        menuACocher4.setText("Imprimante");
        menuACocher4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.IMPRIMANTE);
            }
        });

        menu0.setMnemonicParsing(false);
        menu0.setText("Caisse");

        elementACocher.setMnemonicParsing(false);
        elementACocher.setText("Recharger caisse");
        elementACocher.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.rechargerCaisse();
            }
        });

        elementACocher0.setMnemonicParsing(false);
        elementACocher0.setText("Vider caisse");
        elementACocher0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.viderCaisse();
            }
        });


        menu1.setMnemonicParsing(false);
        menu1.setText("Impression");

        elementACocher1.setMnemonicParsing(false);
        elementACocher1.setText("Recharger encre et papier");
        elementACocher1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.rechargerEncreEtPapier();
            }
        });
       

        elementACocher2.setMnemonicParsing(false);
        elementACocher2.setText("Vider encre et papier");
        elementACocher2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.viderEncreEtPapier();
            }
        });

        menu2.setMnemonicParsing(false);
        menu2.setText("Composants optionnels");

        menuACocher5.setMnemonicParsing(false);
        menuACocher5.setText("Scanneur de codes");
        menuACocher5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        menu3.setMnemonicParsing(false);
        menu3.setText("Fentes");

        menuACocher6.setMnemonicParsing(false);
        menuACocher6.setText("Fentes a pieces et a billets");
        menuACocher6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        menuACocher7.setMnemonicParsing(false);
        menuACocher7.setText("Fente a pieces uniquement");
        menuACocher7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        menuACocher8.setMnemonicParsing(false);
        menuACocher8.setText("Aucune fente");
        menuACocher8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });
        
        ToggleGroup t1 = new ToggleGroup();
        menuACocher6.setToggleGroup(t1);
        menuACocher7.setToggleGroup(t1);
        menuACocher8.setToggleGroup(t1);

        menu4.setMnemonicParsing(false);
        menu4.setText("Clavier et ecran");
        menuACocher9.setMnemonicParsing(false);
        menuACocher9.setText("Clavier et ecran tactile");
        menuACocher9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            	fenetre.mettreToutAJour();
            }
        });

        menuACocher10.setMnemonicParsing(false);
        menuACocher10.setText("Clavier et ecran non tactile");
        menuACocher10.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            	fenetre.mettreToutAJour();
            }
        });

        menuACocher11.setMnemonicParsing(false);
        menuACocher11.setText("Ecran tactile sans clavier");
        menuACocher11.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            	fenetre.mettreToutAJour();
            }
        });
        
        barreMenu.setLayoutX(0.0);
        barreMenu.setLayoutY(0.0);
        
        ToggleGroup t = new ToggleGroup();
        menuACocher9.setToggleGroup(t);
        menuACocher10.setToggleGroup(t);
        menuACocher11.setToggleGroup(t);
        
        contour.setLayoutX(259.0*rapportLargeur);
        contour.setLayoutY(75.0*rapportHauteur);
        
        menu1.getItems().addAll(elementACocher1, elementACocher2);
        menu0.getItems().addAll(elementACocher, elementACocher0);
        menu.getItems().addAll(menuACocher, menuACocher0, menuACocher1, menuACocher2, menuACocher3, menuACocher4, menu0, menu1);
        menu3.getItems().addAll(menuACocher6, menuACocher7, menuACocher8);
        menu4.getItems().addAll(menuACocher9, menuACocher10, menuACocher11);
        menu2.getItems().addAll(menuACocher5, menu3, menu4);
        barreMenu.getMenus().addAll(menu, menu2);
        panneau.getChildren().addAll(barreMenu, contour);
    }
	
    public static FenetreSimulation getInstance() 
    {
    	if (instance == null)
    		instance = new FenetreSimulation();
    	return instance;
    }
    
    public void afficher(Ecran fen) 
    {
		this.fenetre = fen; 
        fenetre.setLayoutX(284.0*rapportLargeur);
        fenetre.setLayoutY(100.0*rapportHauteur);
		getChildren().setAll(panneau, fenetre, claRe, fentes, scanLect);
		clavier.setFenetre(fen);
		lecteur.setFenetre(fen);
	}
    
    public void setParametre()
    {
    	menuACocher8.setSelected(true);
        if (FenetreConfiguration.getInstance().deuxFentes())
        {
        	menuACocher6.setSelected(true);
        }
        else if (FenetreConfiguration.getInstance().fentePiece())
        {
        	menuACocher7.setSelected(true);
        }
        
        if (FenetreConfiguration.getInstance().ecranEtClavier() ||  FenetreConfiguration.getInstance().clavierEtNonEcran())
        {
        	if (FenetreConfiguration.getInstance().clavierEtNonEcran())
        		menuACocher10.setSelected(true);
        	else 
        		menuACocher9.setSelected(true);
        }
        else if (FenetreConfiguration.getInstance().ecranEtNonClavier())
        {
        	menuACocher11.setSelected(true);
        }
        
        if (FenetreConfiguration.getInstance().scanneur())
        {
        	menuACocher5.setSelected(true);
        }      
        
        VBox.setMargin(clavier, new Insets(0.0, 0.0, 20.0*rapportHauteur, 182.5*rapportLargeur));
        VBox.setMargin(reception, new Insets(0.0, 0.0, 20.0*rapportHauteur, 0.0));
        claRe.setLayoutY(550.0*rapportHauteur);
        claRe.setLayoutX(195.0*rapportLargeur);
        
        VBox.setMargin(scanneur, new Insets(0.0, 0.0, 20.0*rapportHauteur, 0.0));
        VBox.setMargin(lecteur, new Insets(20.0*rapportHauteur, 0.0, 20.0*rapportHauteur, 0.0));
        scanLect.setLayoutY(85.0*rapportHauteur);
        scanLect.setLayoutX(1130.0*rapportLargeur);
                
        setMargin(fentes, new Insets(100.0*rapportHauteur, 0.0, 0.0, 10.0*rapportLargeur));
        VBox.setMargin(fentePiece, new Insets(50.0*rapportHauteur, 0.0, 0.0, 0.0));
        fentes.setLayoutX(10.0*rapportLargeur);
        fentes.setLayoutY(100.0*rapportHauteur);
        mAJComposants();
    }
    
    public void mAJComposants()
    {
		fentes.getChildren().clear();
		claRe.getChildren().clear();
		scanLect.getChildren().clear();
		GraphiqueACoeurImpl.getInstance().setScanneur(false);
		GraphiqueACoeurImpl.getInstance().setFentes(false, false);
		
    	if(menuACocher6.isSelected())
    	{
    		fentes.getChildren().addAll(fenteBillet, fentePiece);
    		GraphiqueACoeurImpl.getInstance().setFentes(true, true);
    	}
    	
    	if(menuACocher7.isSelected())
    	{
    		Text text = new Text();
            text.setFont(new Font(15.0*rapportHauteur));
            VBox.setMargin(text, new Insets(40.0*rapportHauteur, 0.0, 0.0, 0.0));
    		fentes.getChildren().addAll(text, fentePiece);
    		GraphiqueACoeurImpl.getInstance().setFentes(false, true);
    	}
    	if (menuACocher8.isSelected())
    	{
    		GraphiqueACoeurImpl.getInstance().choixRetirerFentes();
    	}
    	
    	
    	if(menuACocher9.isSelected())
    	{
    		claRe.getChildren().addAll(clavier,reception);
    		GraphiqueACoeurImpl.getInstance().mettreTactile(true);
    	}
    	if(menuACocher10.isSelected())
    	{
    		claRe.getChildren().addAll(clavier, reception);
    		GraphiqueACoeurImpl.getInstance().mettreTactile(false);
    	}
    		
    	if(menuACocher11.isSelected())
    	{
    		Text text = new Text();
            text.setFont(new Font(15.0*rapportHauteur));
            VBox.setMargin(text, new Insets(110.0*rapportHauteur, 0.0, 100.0*rapportHauteur, 182.5*rapportLargeur));
    		claRe.getChildren().addAll(text, reception);
    		GraphiqueACoeurImpl.getInstance().mettreTactile(true);
    	}
    	if(!menuACocher5.isSelected())
    	{
    		Text text = new Text();
            text.setFont(new Font(15.0*rapportHauteur));
            VBox.setMargin(text, new Insets(80.0*rapportHauteur, 0.0, 0.0, 0.0));
    		scanLect.getChildren().addAll(text, lecteur);
    	}
    	if(menuACocher5.isSelected())
    	{
    		scanLect.getChildren().addAll( scanneur, lecteur);
    		GraphiqueACoeurImpl.getInstance().setScanneur(true);
    	}
    	getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre); 		
    }
    
    
    /*public void mAJScanneur()
    {
    	if(menuACocher2.isSelected())
    		mettreEnPanneScanneur();
    	
    	if(!menuACocher2.isDisable())
    		remiseEnServiceScanneur();
    }*/
    
    
    public void mAJCarte()
    {
    	if(menuACocher3.isSelected())
    		bloquerCarte();
    	
    	if(!menuACocher3.isSelected())
    		debloquerCarte();	
    }
    
    /*public void mAJImprimante()
    {
    	if(menuACocher4.isSelected())
    		mettreEnPanneImprimante();
    	
    	if(!menuACocher4.isSelected())
    		remiseEnServiceImprimante();
    }*/
    
    

    
    
    public void bloquerCarte()
    {
    	//Ici, je suppose griser le bouton 'retirer carte' ?
    	lecteur.getBouton(12).setDisable(true);
        getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
    }
    
    public void debloquerCarte()
    {
    	//Ici, je suppose dégriser le bouton 'retirer carte' ?
    	lecteur.getBouton(12).setDisable(false);
        getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
    }
    
    
    /*public void mettreEnPanneScanneur()				//je ne pense pas qu'il les faille ici mais
    {														//sans savoir, je les ai mises
    	//mise en panne scanneur
    }
    
    public void remiseEnServiceScanneur()
    {
    	//remise en service scanneur
    }
    
    public void mettreEnPanneImprimante()
    {
    	//mise en panne imprimante
    }
    
    public void remiseEnServiceImprimante()
    {
    	//remise en service imprimante
    }*/
    
    public Ecran getEcran()
    {
    	return fenetre;
    }
    
    public double getRapportHaut()
    {
    	return rapportHauteur;
    }
    public double getRapportLarg()
    {
    	return rapportLargeur;
    }
    
    public LecteurCarte getLecteur()
    {
    	return lecteur;
    }

    /*public void actualiserFenteBillet(boolean enMarche)
    {

    	if(enMarche)
    	{
        	for (int i = 0; i < 4; i++)
    			fenteBillet.getButton(i).setDisable(false);
        	getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
    	}
    	else
    	{
        	for (int i = 0; i < 4; i++)
    			fenteBillet.getButton(i).setDisable(true);
        	getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
    	}
    }
    
	public void actualiserFentePiece(boolean enMarche)
	{
		if(enMarche)
	    {
	    	for (int i = 0; i < 8; i++)
	    		fentePiece.getButton(i).setDisable(false);
	    	getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
	    }
	    
	   else
	    {
	    	for (int i = 0; i < 8; i++)
	    		fentePiece.getButton(i).setDisable(true);
	    	getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
	    }
	}

	public void actualiserLecteurCarte(boolean enMarche)
	{
		if(enMarche)
	    {
	    	for (int i = 0; i < 13; i++)
				lecteur.getBouton(i).setDisable(false);
			lecteur.getMDP().setDisable(false);
	        getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
	        carteNonBloquee();
	    }
	    
		else
	    {
	    	for (int i = 0; i < 13; i++)
				lecteur.getBouton(i).setDisable(true);
			lecteur.getMDP().setDisable(true);
	        getChildren().setAll(panneau, claRe, fentes, scanLect, fenetre);
	    }
		
	}*/

	public void carteNonBloquee()
	{
		menuACocher3.setSelected(false);
	}

	public void carteBloquee() 
	{
		menuACocher3.setSelected(true);
	}

}