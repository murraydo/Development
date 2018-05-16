/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.gui;

import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;
import com.rest.model.TischMaker;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tischreservierung.TischAuswahl;

/**
 *
 * @author Sanne
 */
public class FensterFX extends Application implements EventHandler<ActionEvent> {

    private static BuchungsService bs;
    private Label lblPersonenZahl;
    private TextField txtPersonenzahl;

    private Label lblRestaurantOrt;
    private ComboBox comboBoxRestaurantStadt;

    private Label lblRestaurantArt;
    private ComboBox comboBoxRestaurantArt;

    private Label lblZahlungsArt;
    private ComboBox comboBoxZahlungsArt;
    
    private Label lblBewertung;
    private ComboBox comboBoxBewertung;
    private ProgressBar progressBar;

    private TextArea textArea;
    
    private Label buchungsAnzeige;
    private Button buchen;
    private Button anzeigen;

    private CheckBox boxCheck;

    @Override
    public void start(Stage stage) throws Exception {
//        final Spinner<Integer> spinner = new Spinner<Integer>();
//        final int initialValue = 1;
//        // Value factory.
//        SpinnerValueFactory<Integer> valueFactory
//                = //
//                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, initialValue);
//        spinner.setValueFactory(valueFactory);

        System.out.println("welcher Buchungsservice " + this.bs);
        buchen = new Button("Buchen");
        anzeigen = new Button("Alle anzeigen");
        lblPersonenZahl = new Label("Wieviele Personen kommen?");
        txtPersonenzahl = new TextField();
        txtPersonenzahl.setPromptText("bitte geben Sie eine Zahl von 1-10 ein");
        lblRestaurantOrt = new Label("Bitte wählen Sie die Stadt aus");
        lblRestaurantArt = new Label("Bitte wählen Sie die Art des Restaurants");
        lblZahlungsArt = new Label("Bitte wählen Sie die Art der Zahlung aus");
        progressBar = new ProgressBar();
        textArea = new TextArea();
        buchungsAnzeige = new Label();
        TischMaker tm = new TischMaker(30);

        comboBoxRestaurantStadt = new ComboBox();
        comboBoxRestaurantStadt.getItems().addAll(tm.getRestaurantOrt());
        comboBoxRestaurantStadt.setPromptText("Wähle deine Stadt oder die Stadt in deiner Nähe");
        

        comboBoxRestaurantArt = new ComboBox();
        comboBoxRestaurantArt.getItems().addAll(tm.getRestaurantArt());
        comboBoxRestaurantArt.setPromptText("z.B Chinesisch, Italienisch oder Burger usw");

        comboBoxZahlungsArt = new ComboBox();
        comboBoxZahlungsArt.getItems().addAll(tm.getZahlungsArt());
        comboBoxZahlungsArt.setPromptText("z.B Mastercard, Visa oder Barzahlung");
        
        comboBoxBewertung = new ComboBox();
        comboBoxBewertung.getItems().addAll(tm.getBewertung());
        comboBoxBewertung.setPromptText("Die Bewertungen liegen zwishcen 1 und 5");

        CheckBox boxCheck = new CheckBox(" Ich bin damit einverstanden, dass Sie mich mit Werbung nerven dürfen.\n Bitte reichen Sie doch auch meine Daten an die NSA weiter. \n"
                + " Falls Sie noch irgendwelche Passwörter oder andere Zugansgdaten brauchen, so geben Sie bitte Bescheid.");
        
        progressBar = new ProgressBar();
        progressBar.progressProperty().add(1);
        
        
        boxCheck.setOnAction(this);

        stage.setTitle("Unsere Tische");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        Insets grenzen = new Insets(10, 22, 10, 20);
        root.setPadding(grenzen);

        root.add(lblPersonenZahl, 0, 0, 2, 1);
        root.add(txtPersonenzahl, 1, 0); // column = 1; row = 0
        root.add(lblRestaurantOrt, 0, 1);
        root.add(comboBoxRestaurantStadt, 1, 1);
        root.add(lblRestaurantArt, 0, 2);
        root.add(comboBoxRestaurantArt, 1, 2);
        root.add(lblZahlungsArt, 0, 3);
        root.add(comboBoxZahlungsArt, 1, 3);
//        root.add(lblBewertung, 0,4);
        root.add(comboBoxBewertung,1,4);
        root.add(boxCheck, 1, 5);
//        root.add(progressBar,0,6);
        root.add(anzeigen,0,7,2,1);
        root.add(buchen, 0, 8, 2, 1);
        root.add(buchungsAnzeige, 0, 9, 2, 1);
        root.add(textArea,0,10,12,12);
        

        root.setId("ROOT");

        buchen.setOnAction(this);
        anzeigen.setOnAction(this);

        Scene szene = new Scene(root, 900, 600);
        System.out.println(getClass().getResource("tischres.css"));
        szene.getStylesheets().add(getClass().getResource("tischres.css").toExternalForm());

        stage.setScene(szene);
        stage.show();
    }

    public void anzeigen(BuchungsService bs) {
        FensterFX.bs = bs;
        launch();
    }

    @Override
    public void handle(ActionEvent t) {
        System.out.println("Event+ " + t);
        System.out.println("Buchungsservice" + bs);

        if (t.getSource() == buchen) {

            Tisch tisch = bs.buchen(4, 2,
                    comboBoxRestaurantArt.getSelectionModel().getSelectedItem().toString(),
                    comboBoxRestaurantStadt.getSelectionModel().getSelectedItem().toString(),
                    comboBoxZahlungsArt.getSelectionModel().getSelectedItem().toString()
            );
            if (tisch == null) {
//        System.out.println("Tisch " + tische);
                buchungsAnzeige.setText("Leider haben wir für Ihre Anfrage zur Zeit keinen Tisch zur Verfügung");
                System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
                List<Tisch> wwi = (List<Tisch>) bs.listeAllerTests(TischAuswahl.alleFreienTischeNachOrt(comboBoxRestaurantStadt.getSelectionModel().getSelectedItem().toString()));
                wwi.forEach(System.out::println);
              
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            } else {
                List<Tisch> wwi = (List<Tisch>) bs.listeAllerTests(TischAuswahl.alleFreienTischeNachOrt(comboBoxRestaurantStadt.getSelectionModel().getSelectedItem().toString()));
               
                buchungsAnzeige.setText(tisch.toString());
            }
            //System.out.println(t.getSource());
        } else{
            System.out.println("Klick mich ");
        }
        if(t.getSource() == anzeigen){
            
            List<Tisch> wwi = (List<Tisch>) bs.listeAllerTests(TischAuswahl.alleAnzeigen(
                    comboBoxRestaurantStadt.getSelectionModel().getSelectedItem().toString(), 
                    comboBoxRestaurantArt.getSelectionModel().getSelectedItem().toString(),
                    comboBoxZahlungsArt.getSelectionModel().getSelectedItem().toString()
            )); 
            
            String textAnzeige = "";
            for (Tisch anzeigenAllleTisch : wwi) {
                textAnzeige+= anzeigenAllleTisch.toString()+ "\n";
            }
            textArea.setText(textAnzeige);
        }
    }

}
