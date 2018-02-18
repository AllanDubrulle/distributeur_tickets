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
    private static FenetreSimulation instance;
    
    private FenetreSimulation()
    {
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
        MenuItem menuItem = new MenuItem();
        MenuItem menuItem0 = new MenuItem();
        Menu menu1 = new Menu();
        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
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

        setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(39.0);
        pane.setPrefWidth(1300.0);
        
        menuBar.setPrefHeight(32.0);
        menuBar.setPrefWidth(270.0);
        
        afficher(FSimulationAcceuil.getInstance());

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(1300.0);

        menu.setMnemonicParsing(false);
        menu.setText("Pannes");

        checkMenuItem.setMnemonicParsing(false);
        checkMenuItem.setText("Lecteur de cartes");

        checkMenuItem0.setMnemonicParsing(false);
        checkMenuItem0.setText("Fente � billets");

        checkMenuItem1.setMnemonicParsing(false);
        checkMenuItem1.setText("Fente � pi�ces");

        checkMenuItem2.setMnemonicParsing(false);
        checkMenuItem2.setText("Scanneur de codes");

        checkMenuItem3.setMnemonicParsing(false);
        checkMenuItem3.setText("Bloquer la carte");

        checkMenuItem4.setMnemonicParsing(false);
        checkMenuItem4.setText("Imprimante");

        menu0.setMnemonicParsing(false);
        menu0.setText("Caisse");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Recharger caisse");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Vider caisse");

        menu1.setMnemonicParsing(false);
        menu1.setText("Impression");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Recharger encre et papier");

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Vider encre et papier");

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
        checkMenuItem6.setText("Fentes � pi�ces et �billets");
        checkMenuItem6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        checkMenuItem7.setMnemonicParsing(false);
        checkMenuItem7.setText("Fente � pi�ces uniquement");
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
        menu4.setText("Clavier et �cran");
        checkMenuItem9.setMnemonicParsing(false);
        checkMenuItem9.setText("Clavier et �cran tactile");
        checkMenuItem9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
            	mAJComposants();
            }
        });

        checkMenuItem10.setMnemonicParsing(false);
        checkMenuItem10.setText("Clavier et �cran non tactile");
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
        
        menu1.getItems().addAll(menuItem1, menuItem2);
        menu0.getItems().addAll(menuItem, menuItem0);
        menu.getItems().addAll(checkMenuItem, checkMenuItem0, checkMenuItem1, checkMenuItem2, checkMenuItem3, checkMenuItem4, menu0, menu1);
        menu3.getItems().addAll(checkMenuItem6, checkMenuItem7, checkMenuItem8);
        menu4.getItems().addAll(checkMenuItem9, checkMenuItem10, checkMenuItem11);
        menu2.getItems().addAll(checkMenuItem5, menu3, menu4);
        menuBar.getMenus().addAll(menu, menu2);
        pane.getChildren().add(menuBar);
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
        fenetre.setLayoutX(259.0);
        fenetre.setLayoutY(75.0);
		getChildren().setAll(fenetre, claRe, fentes, scanLect, pane);
		Clavier.setFenetre(fen);
	}
    
    public void setParametre()
    {
    	fentes.getChildren().clear();
    	checkMenuItem8.setSelected(true);
        if (FenetreConfiguration.getInstance().deuxFentes())
        {
        	fentes.getChildren().addAll(FenteBillet.getInstance(), FentePiece.getInstance());
        	checkMenuItem6.setSelected(true);
        }
        else if (FenetreConfiguration.getInstance().fentePiece())
        {
        	fentes.getChildren().add(FentePiece.getInstance());
        	checkMenuItem7.setSelected(true);
        }
        
        claRe.getChildren().clear();
        checkMenuItem11.setSelected(true);
        if (FenetreConfiguration.getInstance().ecranEtClavier() || FenetreConfiguration.getInstance().clavierEtNonEcran())
        {
        	claRe.getChildren().addAll(Clavier.getInstance(), Reception.getInstance());
        	checkMenuItem9.setSelected(true);
        }
        else if (FenetreConfiguration.getInstance().ecranEtNonClavier())
        {
        	claRe.getChildren().add(Reception.getInstance());
        	checkMenuItem10.setSelected(true);
        }
        
        scanLect.getChildren().clear();
        if (FenetreConfiguration.getInstance().scanneur())
        {
        	scanLect.getChildren().add(Scanneur.getInstance());
        	checkMenuItem5.setSelected(true);
        }
        scanLect.getChildren().add(LecteurCarte.getInstance());
        
        
        VBox.setMargin(Clavier.getInstance(), new Insets(0.0, 0.0, 20.0, 182.5));
        VBox.setMargin(Reception.getInstance(), new Insets(0.0, 0.0, 20.0, 0.0));
        claRe.setLayoutY(500.0);
        claRe.setLayoutX(145.0);
        
        VBox.setMargin(Scanneur.getInstance(), new Insets(0.0, 0.0, 20.0, 0.0));
        VBox.setMargin(LecteurCarte.getInstance(), new Insets(20.0, 0.0, 20.0, 0.0));
        scanLect.setLayoutY(85.0);
        scanLect.setLayoutX(1080.0);
                
        setMargin(fentes, new Insets(100.0, 0.0, 0.0, 10.0));
        VBox.setMargin(FentePiece.getInstance(), new Insets(50.0, 0.0, 0.0, 0.0));
        fentes.setLayoutX(10.0);
        fentes.setLayoutY(100.0);
        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
    }
    public void mAJComposants()
    {
    	if (checkMenuItem6.isSelected())
    	{
    		fentes.getChildren().clear();
    		fentes.getChildren().addAll(FenteBillet.getInstance(), FentePiece.getInstance());
    	}
    	if (checkMenuItem7.isSelected())
    	{
    		fentes.getChildren().clear();
    		fentes.getChildren().add(FentePiece.getInstance());
    	}
    	if (checkMenuItem8.isSelected())
    		fentes.getChildren().clear();
    	if (checkMenuItem9.isSelected())
    	{
    		claRe.getChildren().clear();
    		claRe.getChildren().addAll(Clavier.getInstance(),Reception.getInstance());
    	}
    	if (checkMenuItem10.isSelected())
    	{
    		claRe.getChildren().clear();
    		claRe.getChildren().addAll(Clavier.getInstance(), Reception.getInstance());
    	}
    	if (checkMenuItem11.isSelected())
    	{
    		claRe.getChildren().clear();
    		claRe.getChildren().add(Reception.getInstance());
    	}
    	if (!checkMenuItem5.isSelected())
    	{
    		scanLect.getChildren().clear();
    		scanLect.getChildren().add(LecteurCarte.getInstance());
    	}
    	if (checkMenuItem5.isSelected())
    	{
    		scanLect.getChildren().clear();
    		scanLect.getChildren().addAll( Scanneur.getInstance(), LecteurCarte.getInstance());
    	}
        getChildren().setAll(pane, claRe, fentes, scanLect, fenetre);
    }
}