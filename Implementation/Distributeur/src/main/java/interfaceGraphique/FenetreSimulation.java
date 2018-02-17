package interfaceGraphique;

import interfaceGraphique.Clavier;
import interfaceGraphique.FenteBillet;
import interfaceGraphique.FentePiece;
import interfaceGraphique.LecteurCarte;
import interfaceGraphique.Reception;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

class FenetreSimulation extends BorderPane 
{
    private MenuBar menuBar;
	private Clavier clavier = Clavier.getInstance();
    private LecteurCarte scanneur = LecteurCarte.getInstance();
    private Reception reception = Reception.getInstance();
    private FenteBillet fenteB = FenteBillet.getInstance();
    private FentePiece fenteP = FentePiece.getInstance();
    private VBox claRe = new VBox();
    private VBox fentes = new VBox();
    
    private Ecran fenetre = FSimulationAcceuil.getInstance();
    private static FenetreSimulation instance;
    
    private FenetreSimulation()
    {
        Pane pane = new Pane();
        menuBar = new MenuBar();
        Menu menu = new Menu();
        CheckMenuItem checkMenuItem = new CheckMenuItem();
        CheckMenuItem checkMenuItem0 = new CheckMenuItem();
        CheckMenuItem checkMenuItem1 = new CheckMenuItem();
        CheckMenuItem checkMenuItem2 = new CheckMenuItem();
        CheckMenuItem checkMenuItem3 = new CheckMenuItem();
        CheckMenuItem checkMenuItem4 = new CheckMenuItem();
        Menu menu0 = new Menu();
        MenuItem menuItem = new MenuItem();
        MenuItem menuItem0 = new MenuItem();
        Menu menu1 = new Menu();
        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
        Menu menu2 = new Menu();
        CheckMenuItem checkMenuItem5 = new CheckMenuItem();
        Menu menu3 = new Menu();
        CheckMenuItem checkMenuItem6 = new CheckMenuItem();
        CheckMenuItem checkMenuItem7 = new CheckMenuItem();
        CheckMenuItem checkMenuItem8 = new CheckMenuItem();
        Menu menu4 = new Menu();
        CheckMenuItem checkMenuItem9 = new CheckMenuItem();
        CheckMenuItem checkMenuItem10 = new CheckMenuItem();
        CheckMenuItem checkMenuItem11 = new CheckMenuItem();
        
        BorderPane.setAlignment(fenetre, Pos.CENTER);
        BorderPane.setMargin(fenetre, new Insets(0.0, 0.0, 0.0, 0.0));
        setCenter(fenetre);
        
        if (FenetreConfiguration.deuxFentes())
        	fentes.getChildren().addAll(fenteB, fenteP);
        else if (FenetreConfiguration.fentePiece())
        	fentes.getChildren().add(fenteP);
        
        if (FenetreConfiguration.ecranEtClavier() || FenetreConfiguration.clavierEtNonEcran())
        	claRe.getChildren().addAll(clavier, reception);
        else if (FenetreConfiguration.ecranEtNonClavier())
        	claRe.getChildren().add(reception);
        
        BorderPane.setMargin(claRe, new Insets(0.0, 0.0, 0.0, 145.0));
        VBox.setMargin(clavier, new Insets(0.0, 0.0, 20.0, 182.5));
        VBox.setMargin(reception, new Insets(0.0, 0.0, 20.0, 0.0));
        setBottom(claRe);
        
        BorderPane.setMargin(scanneur, new Insets(100.0, 25.0, 0.0, 0.0));
        setRight(scanneur);
        
        
        BorderPane.setMargin(fentes, new Insets(100.0, 0.0, 0.0, 10.0));
        //VBox.setMargin(fenteP, new Insets(50.0, 0.0, 0.0, 0.0));
        setLeft(fentes);

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(1300.0);

        BorderPane.setAlignment(pane, javafx.geometry.Pos.CENTER);
        pane.setPrefHeight(39.0);
        pane.setPrefWidth(1300.0);

        menuBar.setPrefHeight(32.0);
        menuBar.setPrefWidth(270.0);

        menu.setMnemonicParsing(false);
        menu.setText("Pannes");

        checkMenuItem.setMnemonicParsing(false);
        checkMenuItem.setText("Lecteur de cartes");

        checkMenuItem0.setMnemonicParsing(false);
        checkMenuItem0.setText("Fente à  billets");

        checkMenuItem1.setMnemonicParsing(false);
        checkMenuItem1.setText("Fente à  pièces");

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

        menu3.setMnemonicParsing(false);
        menu3.setText("Fentes");

        checkMenuItem6.setMnemonicParsing(false);
        checkMenuItem6.setText("Fentes à pièces et à billets");

        checkMenuItem7.setMnemonicParsing(false);
        checkMenuItem7.setText("Fente à pièces uniquement");

        checkMenuItem8.setMnemonicParsing(false);
        checkMenuItem8.setText("Aucune fente");

        menu4.setMnemonicParsing(false);
        menu4.setText("Clavier");

        checkMenuItem9.setMnemonicParsing(false);
        checkMenuItem9.setText("Clavier et écran tactile");

        checkMenuItem10.setMnemonicParsing(false);
        checkMenuItem10.setText("Clavier et écran non tactile");

        checkMenuItem11.setMnemonicParsing(false);
        checkMenuItem11.setText("Ecran tacile sans clavier");
        setTop(pane);

        menu1.getItems().addAll(menuItem1, menuItem2);
        menu.getItems().addAll(checkMenuItem, checkMenuItem0, checkMenuItem1, checkMenuItem2, checkMenuItem3, checkMenuItem4, menu0, menu1);
        menu4.getItems().addAll(checkMenuItem9, checkMenuItem10, checkMenuItem11);
        menu2.getItems().addAll(checkMenuItem5, checkMenuItem6, checkMenuItem7, checkMenuItem8, menu3, menu4);
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
		getChildren().setAll(fenetre, claRe, fentes, scanneur, menuBar);
		Clavier.setFenetre(fen);
	}
}