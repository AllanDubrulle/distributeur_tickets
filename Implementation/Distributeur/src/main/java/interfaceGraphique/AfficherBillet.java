package interfaceGraphique;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;

/**
 * Classe AfficherBillet (permet d'afficher le billet achete)
 * @author TheoDaix, AllanDubrulle, VictorVerhoye
 * @version 1.0
 */
class AfficherBillet extends Pane 
{
	/**
	 * 	Constructeur de AfficherBillet
	 * 	@param gareDepart la gare de depart du billet
	 * 	@param gareArrivee la gare d'arrivee du billet
	 * 	@param allerRetour un booleen vrai s'il s'agit d'un aller-retour, faux sinon
	 * 	@param classe une classe
	 * 	@param type le type du billet
	 * 	@param reduc la reduction du billet
	 * 	@param date la date de depart
	 * 	@param prix le prix
	 */
    public AfficherBillet(String gareDepart, String gareArrivee, boolean allerRetour, int classe, String type, String reduc, LocalDate date, double prix) 
    {
        VBox boxVer = new VBox();
        HBox boxHor1 = new HBox();
        HBox boxHor2 = new HBox();
        HBox boxHor3 = new HBox();
        HBox boxHor4 = new HBox();
        HBox boxHor5 = new HBox();
        HBox boxHor6 = new HBox();
        HBox boxHor7 = new HBox();
        Text texte1 = new Text();
        Text texte2 = new Text();
        Text texte3 = new Text();
        Text texte4 = new Text();
        Text texte5 = new Text();
        Text texte6 = new Text();
        Text texte7 = new Text();
        Text texte8 = new Text();
        Text texte9 = new Text();
        Text texte10 = new Text();
        Text texte11 = new Text();
        Text texte12 = new Text();
        Text texte13 = new Text();
        Text texte14 = new Text();
        Rectangle rectangle = new Rectangle();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(250.0);
        setPrefWidth(580.0);

        boxVer.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        boxVer.setPrefHeight(300.0);
        boxVer.setPrefWidth(580.0);

        boxHor1.setPrefHeight(0.0);
        boxHor1.setPrefWidth(580.0);

        texte1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte1.setStrokeWidth(0.0);
        texte1.setText("BILLET " + type.toUpperCase());
        texte1.setWrappingWidth(200.0);
        texte1.setFont(new Font("System Bold Italic", 18.0));

        LocalDateTime date2 = LocalDateTime.now();
        
        texte2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte2.setStrokeWidth(0.0);
        texte2.setText(date2.getDayOfMonth() + "/" + date2.getMonthValue() + "/" + date2.getYear() + "     "  + date2.getHour() + ":" + date2.getMinute());
        texte2.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte2.setWrappingWidth(150.0);
        HBox.setMargin(texte2, new Insets(0.0, 0.0, 0.0, 180.0));
        boxHor1.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor1, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor2.setPrefHeight(0.0);
        boxHor2.setPrefWidth(580.0);

        texte3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte3.setStrokeWidth(0.0);
        if (allerRetour)
        {
        	texte3.setText("ALLER-RETOUR");	
        }
        else
        {
        	texte3.setText("ALLER SIMPLE");
        }
        texte3.setWrappingWidth(200.0);
        texte3.setFont(new Font("System Bold Italic", 18.0));

        texte4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte4.setStrokeWidth(0.0);
        texte4.setText("Gare de MONS");
        texte4.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte4.setWrappingWidth(150.0);
        HBox.setMargin(texte4, new Insets(0.0, 0.0, 0.0, 180.0));
        boxHor2.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor2, new Insets(0.0, 20.0, 0.0, 20.0));

        boxHor3.setPrefHeight(0.0);
        boxHor3.setPrefWidth(580.0);

        texte5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte5.setStrokeWidth(0.0);
        texte5.setText(Integer.toString(classe) +"e classe");
        texte5.setWrappingWidth(200.0);
        texte5.setFont(new Font("System Bold", 18.0));
        boxHor3.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor3, new Insets(0.0, 0.0, 20.0, 20.0));

        boxHor4.setPrefHeight(0.0);
        boxHor4.setPrefWidth(580.0);

        texte6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte6.setStrokeWidth(0.0);
        texte6.setText("De :");
        texte6.setWrappingWidth(35.0);

        texte7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte7.setStrokeWidth(0.0);
        texte7.setText(gareDepart.toUpperCase());
        texte7.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(texte7, new Insets(0.0, 0.0, 0.0, 50.0));
        boxHor4.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor4, new Insets(0.0, 20.0, 5.0, 20.0));

        boxHor5.setPrefHeight(0.0);
        boxHor5.setPrefWidth(580.0);

        texte8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte8.setStrokeWidth(0.0);
        texte8.setText("A :");
        texte8.setWrappingWidth(35.0);

        texte9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte9.setStrokeWidth(0.0);
        texte9.setText(gareArrivee.toUpperCase());
        texte9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(texte9, new Insets(0.0, 0.0, 0.0, 50.0));
        boxHor5.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor5, new Insets(0.0, 20.0, 5.0, 20.0));

        boxHor6.setPrefHeight(0.0);
        boxHor6.setPrefWidth(580.0);

        texte10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte10.setStrokeWidth(0.0);
        texte10.setText("Le :");
        texte10.setWrappingWidth(35.0);
        HBox.setMargin(texte10, new Insets(0.0));

        texte11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte11.setStrokeWidth(0.0);
        if(date.getMonthValue() == 10 || date.getMonthValue() == 11 || date.getMonthValue() == 12)
        	texte11.setText(date.getDayOfMonth() + "/" + String.valueOf(date.getMonthValue()) + "/" + String.valueOf(date.getYear()));
        else
        	texte11.setText(date.getDayOfMonth() + "/0" + String.valueOf(date.getMonthValue()) + "/" + String.valueOf(date.getYear()));
        texte11.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        HBox.setMargin(texte11, new Insets(0.0, 0.0, 0.0, 50.0));
        boxHor6.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor6, new Insets(0.0, 20.0, 20.0, 20.0));

        boxHor7.setPrefHeight(0.0);
        boxHor7.setPrefWidth(580.0);

        texte12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte12.setStrokeWidth(0.0);
        texte12.setText("REDUCTION :");
        texte12.setFont(new Font("System Bold", 15.0));

        texte13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte13.setStrokeWidth(0.0);
        texte13.setText(reduc);
        texte13.setWrappingWidth(200.0);
        HBox.setMargin(texte13, new Insets(0.0, 0.0, 0.0, 19.0));

        texte14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        texte14.setStrokeWidth(0.0);
        texte14.setText(prix + "   EUR");
        texte14.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        texte14.setWrappingWidth(100.0);
        HBox.setMargin(texte14, new Insets(0.0, 0.0, 0.0, 110.0));
        texte14.setFont(new Font("System Bold", 16.0));
        boxHor7.setOpaqueInsets(new Insets(0.0));
        VBox.setMargin(boxHor7, new Insets(10.0, 20.0, 0.0, 20.0));
        
        boxVer.setPadding(new Insets(20.0, 0.0, 0.0, 0.0));

        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#ffffff00"));
        rectangle.setHeight(240.0);
        rectangle.setLayoutX(10.0);
        rectangle.setLayoutY(10.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(560.0);

        boxHor1.getChildren().addAll(texte1, texte2);
        boxHor2.getChildren().addAll(texte3, texte4);
        boxHor3.getChildren().add(texte5);
        boxHor4.getChildren().addAll(texte6, texte7);
        boxHor5.getChildren().addAll(texte8, texte9);
        boxHor6.getChildren().addAll(texte10, texte11);
        boxHor7.getChildren().addAll(texte12, texte13, texte14);
        boxVer.getChildren().addAll(boxHor1, boxHor2, boxHor3, boxHor4, boxHor5, boxHor6, boxHor7);
        getChildren().addAll(boxVer, rectangle);
    }
}
