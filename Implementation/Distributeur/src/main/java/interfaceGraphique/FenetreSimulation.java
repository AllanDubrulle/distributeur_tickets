package interfaceGraphique;

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
    private Pane pane;
    private VBox claRe = new VBox();
    private VBox fentes = new VBox();
    private VBox scanLect = new VBox();
    private Ecran fenetre;
    private CheckMenuItem checkMenuItem, checkMenuItem0, checkMenuItem1, checkMenuItem2, checkMenuItem3, checkMenuItem4, checkMenuItem5; 
    private RadioMenuItem checkMenuItem6, checkMenuItem7, checkMenuItem8, checkMenuItem9, checkMenuItem10, checkMenuItem11;
    private MenuItem menuItem, menuItem0, menuItem1, menuItem2;
    
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
    	
    	pane = new Pane();
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu();
        checkMenuItem = new CheckMenuItem();
        checkMenuItem0 = new CheckMenuItem();
        checkMenuItem1 = new CheckMenuItem();
        checkMenuItem2 = new CheckMenuItem();
        checkMenuItem3 = new CheckMenuItem();
        checkMenuItem4 = new CheckMenuItem();
        Menu menu0 = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        Menu menu1 = new Menu();
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        Menu menu2 = new Menu();
        checkMenuItem5 = new CheckMenuItem();
        Menu menu3 = new Menu();
        checkMenuItem6 = new RadioMenuItem();
        checkMenuItem7 = new RadioMenuItem();
        checkMenuItem8 = new RadioMenuItem();
        Menu menu4 = new Menu();
        checkMenuItem9 = new RadioMenuItem();
        checkMenuItem10 = new RadioMenuItem();
        checkMenuItem11 = new RadioMenuItem();
        EcranContour contour = EcranContour.getInstance();

        setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(39.0*rapportHauteur);
        pane.setPrefWidth(1350.0*rapportLargeur);
        
        menuBar.setMaxHeight(32.0*rapportHauteur);
        menuBar.setMaxWidth(350.0*rapportLargeur);;
        
        afficher(new FSimulationAcceuil(rapportHauteur, rapportLargeur));

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(850.0*rapportHauteur);
        setPrefWidth(1350.0*rapportLargeur);

        menu.setMnemonicParsing(false);
        menu.setText("Pannes");

        checkMenuItem.setMnemonicParsing(false);
        checkMenuItem.setText("Lecteur de cartes");
        checkMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.LECTEURCARTE);
            }
        });

        checkMenuItem0.setMnemonicParsing(false);
        checkMenuItem0.setText("Fente à  billets");
        checkMenuItem0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	
            	fenetre.graphAC.actualiserPanne(Composant.FENTEBILLET);
            }
        });

        checkMenuItem1.setMnemonicParsing(false);
        checkMenuItem1.setText("Fente à  pièces");
        checkMenuItem1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.FENTEPIECE);
            }
        });

        checkMenuItem2.setMnemonicParsing(false);
        checkMenuItem2.setText("Scanneur de codes");
        checkMenuItem2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.SCANNEUR);
            }
        });

        checkMenuItem3.setMnemonicParsing(false);
        checkMenuItem3.setText("Bloquer la carte");
        checkMenuItem3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.bloquerCarte();
            }
        });

        checkMenuItem4.setMnemonicParsing(false);
        checkMenuItem4.setText("Imprimante");
        checkMenuItem4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.actualiserPanne(Composant.IMPRIMANTE);
            }
        });

        menu0.setMnemonicParsing(false);
        menu0.setText("Caisse");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Recharger caisse");
        menuItem.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.rechargerCaisse();
            }
        });

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Vider caisse");
        menuItem0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.viderCaisse();
            }
        });


        menu1.setMnemonicParsing(false);
        menu1.setText("Impression");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Recharger encre et papier");
        menuItem1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.rechargerEncreEtPapier();
            }
        });
       

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Vider encre et papier");
        menuItem2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	fenetre.graphAC.viderEncreEtPapier();
            }
        });

        menu2.setMnemonicParsing(false);
        menu2.setText("Composants optionnels");

        checkMenuItem5.setMnemonicParsing(false);
        checkMenuItem5.setText("Scanneur de codes");
        checkMenuItem5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        menu3.setMnemonicParsing(false);
        menu3.setText("Fentes");

        checkMenuItem6.setMnemonicParsing(false);
        checkMenuItem6.setText("Fentes à pièces et à billets");
        checkMenuItem6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        checkMenuItem7.setMnemonicParsing(false);
        checkMenuItem7.setText("Fente à pièces uniquement");
        checkMenuItem7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        checkMenuItem8.setMnemonicParsing(false);
        checkMenuItem8.setText("Aucune fente");
        checkMenuItem8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });
        
        ToggleGroup t1 = new ToggleGroup();
        checkMenuItem6.setToggleGroup(t1);
        checkMenuItem7.setToggleGroup(t1);
        checkMenuItem8.setToggleGroup(t1);

        menu4.setMnemonicParsing(false);
        menu4.setText("Clavier et écran");
        checkMenuItem9.setMnemonicParsing(false);
        checkMenuItem9.setText("Clavier et écran tactile");
        checkMenuItem9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        checkMenuItem10.setMnemonicParsing(false);
        checkMenuItem10.setText("Clavier et écran non tactile");
        checkMenuItem10.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        checkMenuItem11.setMnemonicParsing(false);
        checkMenuItem11.setText("Ecran tacile sans clavier");
        checkMenuItem11.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });
        
        menuBar.setLayoutX(0.0);
        menuBar.setLayoutY(0.0);
        
        ToggleGroup t = new ToggleGroup();
        checkMenuItem9.setToggleGroup(t);
        checkMenuItem10.setToggleGroup(t);
        checkMenuItem11.setToggleGroup(t);
        
        contour.setLayoutX(259.0*rapportLargeur);
        contour.setLayoutY(75.0*rapportHauteur);
        
        menu1.getItems().addAll(menuItem1, menuItem2);
        menu0.getItems().addAll(menuItem, menuItem0);
        menu.getItems().addAll(checkMenuItem, checkMenuItem0, checkMenuItem1, checkMenuItem2, checkMenuItem3, checkMenuItem4, menu0, menu1);
        menu3.getItems().addAll(checkMenuItem6, checkMenuItem7, checkMenuItem8);
        menu4.getItems().addAll(checkMenuItem9, checkMenuItem10, checkMenuItem11);
        menu2.getItems().addAll(checkMenuItem5, menu3, menu4);
        menuBar.getMenus().addAll(menu, menu2);
        pane.getChildren().addAll(menuBar, contour);
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
		getChildren().setAll(pane, fenetre, claRe, fentes, scanLect);
		clavier.setFenetre(fen);
		lecteur.setFenetre(fen);
	}
    
    public void setParametre()
    {
    	checkMenuItem8.setSelected(true);
        if (FenetreConfiguration.getInstance().deuxFentes())
        {
        	checkMenuItem6.setSelected(true);
        }
        else if (FenetreConfiguration.getInstance().fentePiece())
        {
        	checkMenuItem7.setSelected(true);
        }
        
        if (FenetreConfiguration.getInstance().ecranEtClavier() ||  FenetreConfiguration.getInstance().clavierEtNonEcran())
        {
        	if (FenetreConfiguration.getInstance().clavierEtNonEcran())
        		checkMenuItem10.setSelected(true);
        	else 
        		checkMenuItem9.setSelected(true);
        }
        else if (FenetreConfiguration.getInstance().ecranEtNonClavier())
        {
        	checkMenuItem11.setSelected(true);
        }
        
        if (FenetreConfiguration.getInstance().scanneur())
        {
        	checkMenuItem5.setSelected(true);
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
		
    	if(checkMenuItem6.isSelected())
    		fentes.getChildren().addAll(fenteBillet, fentePiece);
    	
    	if(checkMenuItem7.isSelected())
    	{
    		Text text = new Text();
            text.setFont(new Font(15.0*rapportHauteur));
            VBox.setMargin(text, new Insets(40.0*rapportHauteur, 0.0, 0.0, 0.0));
    		fentes.getChildren().addAll(text, fentePiece);
    	}
    	
    	if(checkMenuItem9.isSelected())
    		claRe.getChildren().addAll(clavier,reception);
    	
    	if(checkMenuItem10.isSelected())
    		claRe.getChildren().addAll(clavier, reception);
    	
    	if(checkMenuItem11.isSelected())
    	{
    		Text text = new Text();
            text.setFont(new Font(15.0*rapportHauteur));
            VBox.setMargin(text, new Insets(110.0*rapportHauteur, 0.0, 100.0*rapportHauteur, 182.5*rapportLargeur));
    		claRe.getChildren().addAll(text, reception);
    	}
    	if(!checkMenuItem5.isSelected())
    	{
    		Text text = new Text();
            text.setFont(new Font(15.0*rapportHauteur));
            VBox.setMargin(text, new Insets(80.0*rapportHauteur, 0.0, 0.0, 0.0));
    		scanLect.getChildren().addAll(text, lecteur);
    	}
    	if(checkMenuItem5.isSelected())
    		scanLect.getChildren().addAll( scanneur, lecteur);
        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre); 		
    }
    
    
    public void mAJScanneur()
    {
    	if(checkMenuItem2.isSelected())
    		mettreEnPanneScanneur();
    	
    	if(!checkMenuItem2.isDisable())
    		remiseEnServiceScanneur();
    }
    
    
    public void mAJCarte()
    {
    	if(checkMenuItem3.isSelected())
    		bloquerCarte();
    	
    	if(!checkMenuItem3.isSelected())
    		debloquerCarte();	
    }
    
    public void mAJImprimante()
    {
    	if(checkMenuItem4.isSelected())
    		mettreEnPanneImprimante();
    	
    	if(!checkMenuItem4.isSelected())
    		remiseEnServiceImprimante();
    }
    
    

    
    
    public void bloquerCarte()
    {
    	//Ici, je suppose griser le bouton 'retirer carte' ?
    	lecteur.getBouton(12).setDisable(true);
        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
    }
    
    public void debloquerCarte()
    {
    	//Ici, je suppose dégriser le bouton 'retirer carte' ?
    	lecteur.getBouton(12).setDisable(false);
        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
    }
    
    
    public void mettreEnPanneScanneur()				//je ne pense pas qu'il les faille ici mais
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
    }
    
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

    public void actualiserFenteBillet(boolean enMarche)
    {

    	if(enMarche)
    	{
        	for (int i = 0; i < 4; i++)
    			fenteBillet.getButton(i).setDisable(false);
        	getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
    	}
    	else
    	{
        	for (int i = 0; i < 4; i++)
    			fenteBillet.getButton(i).setDisable(true);
        	getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
    	}
    }
    
	public void actualiserFentePiece(boolean enMarche)
	{
		if(enMarche)
	    {
	    	for (int i = 0; i < 8; i++)
	    		fentePiece.getButton(i).setDisable(false);
	    	getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
	    }
	    
	   else
	    {
	    	for (int i = 0; i < 8; i++)
	    		fentePiece.getButton(i).setDisable(true);
	    	getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
	    }
		
	}

	public void actualiserLecteurCarte(boolean enMarche)
	{
		if(enMarche)
	    {
	    	for (int i = 0; i < 13; i++)
				lecteur.getBouton(i).setDisable(false);
			lecteur.getMDP().setDisable(false);
	        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
	        carteNonBloquee();
	    }
	    
		else
	    {
	    	for (int i = 0; i < 13; i++)
				lecteur.getBouton(i).setDisable(true);
			lecteur.getMDP().setDisable(true);
	        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
	    }
		
	}

	public void carteNonBloquee()
	{
		checkMenuItem3.setSelected(false);
	}

	public void carteBloquee() 
	{
		checkMenuItem3.setSelected(true);
	}

}