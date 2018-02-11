import interfaceGraphique.Clavier;
import interfaceGraphique.FenteBillet;
import interfaceGraphique.FentePiece;
import interfaceGraphique.LecteurCarte;
import interfaceGraphique.Reception;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Base extends BorderPane {

    public Pane pane;
    public MenuBar menuBar;
    public Menu menu;
    public CheckMenuItem checkMenuItem;
    public CheckMenuItem checkMenuItem0;
    public CheckMenuItem checkMenuItem1;
    public CheckMenuItem checkMenuItem2;
    public CheckMenuItem checkMenuItem3;
    public CheckMenuItem checkMenuItem4;
    public Menu menu0;
    public MenuItem menuItem;
    public MenuItem menuItem0;
    public Menu menu1;
    public MenuItem menuItem1;
    public MenuItem menuItem2;
    public Menu menu2;
    public CheckMenuItem checkMenuItem5;
    public Menu menu3;
    public CheckMenuItem checkMenuItem6;
    public CheckMenuItem checkMenuItem7;
    public CheckMenuItem checkMenuItem8;
    public Menu menu4;
    public CheckMenuItem checkMenuItem9;
    public CheckMenuItem checkMenuItem10;
    public CheckMenuItem checkMenuItem11;
    public Clavier clavier = new Clavier();
    public LecteurCarte scanneur = new LecteurCarte();
    public Reception reception = new Reception();
    public FenteBillet fenteB = new FenteBillet();
    public FentePiece fenteP = new FentePiece();
    public VBox claRe = new VBox();
    public VBox fentes = new VBox();
    public Fenetre fenetre;

    public Base() {

        pane = new Pane();
        menuBar = new MenuBar();
        menu = new Menu();
        checkMenuItem = new CheckMenuItem();
        checkMenuItem0 = new CheckMenuItem();
        checkMenuItem1 = new CheckMenuItem();
        checkMenuItem2 = new CheckMenuItem();
        checkMenuItem3 = new CheckMenuItem();
        checkMenuItem4 = new CheckMenuItem();
        menu0 = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu1 = new Menu();
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        menu2 = new Menu();
        checkMenuItem5 = new CheckMenuItem();
        menu3 = new Menu();
        checkMenuItem6 = new CheckMenuItem();
        checkMenuItem7 = new CheckMenuItem();
        checkMenuItem8 = new CheckMenuItem();
        menu4 = new Menu();
        checkMenuItem9 = new CheckMenuItem();
        checkMenuItem10 = new CheckMenuItem();
        checkMenuItem11 = new CheckMenuItem();
        fenetre = new FSimulationAcceuil();
        
        BorderPane.setAlignment(fenetre, Pos.CENTER);
        BorderPane.setMargin(fenetre, new Insets(0.0, 0.0, 0.0, 0.0));
        setCenter(fenetre);
        
        claRe.getChildren().addAll(clavier, reception);
        BorderPane.setMargin(claRe, new Insets(0.0, 0.0, 0.0, 145.0));
        VBox.setMargin(clavier, new Insets(0.0, 0.0, 20.0, 182.5));
        VBox.setMargin(reception, new Insets(0.0, 0.0, 20.0, 0.0));
        setBottom(claRe);
        
        BorderPane.setMargin(scanneur, new Insets(100.0, 25.0, 0.0, 0.0));
        setRight(scanneur);
        
        fentes.getChildren().addAll(fenteB, fenteP);
        BorderPane.setMargin(fentes, new Insets(100.0, 0.0, 0.0, 10.0));
        VBox.setMargin(fenteP, new Insets(50.0, 0.0, 0.0, 0.0));
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
        checkMenuItem0.setText("Fente à billets");

        checkMenuItem1.setMnemonicParsing(false);
        checkMenuItem1.setText("Fente à pièces");

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
        checkMenuItem6.setText("Fentes à pièces et à billets");

        checkMenuItem7.setMnemonicParsing(false);
        checkMenuItem7.setText("Fente à pièces uniquement");

        checkMenuItem8.setMnemonicParsing(false);
        checkMenuItem8.setText("Aucune fente");

        menu4.setMnemonicParsing(false);
        menu4.setText("Clavier");

        checkMenuItem9.setMnemonicParsing(false);
        checkMenuItem9.setText("Clavier et écran tacitile");

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
}
