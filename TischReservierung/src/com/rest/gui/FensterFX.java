/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.gui;

import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;
import static com.rest.model.TischDao.alleTische;
import com.rest.model.TischMaker;
import java.awt.Checkbox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
    
    private Label buchungsAnzeige;
    private Button buchen;

    private CheckBox box;

    @Override
    public void start(Stage stage) throws Exception {
        final Spinner<Integer> spinner = new Spinner<Integer>();
        final int initialValue = 1;
        // Value factory.
        SpinnerValueFactory<Integer> valueFactory = //
        new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, initialValue);
        spinner.setValueFactory(valueFactory);
 
        System.out.println("welcher Buchungsservice " + this.bs);
        buchen = new Button("Buchen");
        lblPersonenZahl = new Label("Wieviele Personen kommen?");
        txtPersonenzahl = new TextField();
        lblRestaurantOrt = new Label("Bitte wählen Sie die Stadt aus");
        lblRestaurantArt = new Label("Bitte wählen Sie die Art des Restaurants");
        lblZahlungsArt = new Label("Bitte wählen Sie die Art der Zahlung aus");
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
        
        CheckBox boxCheck = new CheckBox(" Ich bin damit einverstanden, dass Sie mich mit Werbung nerven dürfen.\n Bitte reichen Sie doch auch meine Daten an die NSA weiter. \n"
                + " Falls Sie noch irgendwelche Passwörter oder andere Zugansgdaten brauchen, so geben Sie bitte Bescheid.");
        
        stage.setTitle("Unsere Tische");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(20);

        Insets grenzen = new Insets(30, 22, 40, 20);
        root.setPadding(grenzen);

        root.add(lblPersonenZahl, 0, 0, 2, 1);
        root.add(txtPersonenzahl, 1, 0); // column = 1; row = 0
        root.add(lblRestaurantOrt, 0, 1);
        root.add(comboBoxRestaurantStadt, 1, 1);
        root.add(lblRestaurantArt, 0, 2);
        root.add(comboBoxRestaurantArt, 1, 2);
        root.add(lblZahlungsArt,0,3);
        root.add(comboBoxZahlungsArt,1,3);
//        root.add(box,0,3);
        root.add(buchen, 0, 4, 2, 1);
        root.add(buchungsAnzeige, 0, 5, 2, 1);

        root.setId("ROOT");
        
        
        buchen.setOnAction(this);

        
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
        Tisch tisch = bs.buchen(4, 2, "");
        Tisch tische = bs.buchen(4, 2, comboBoxRestaurantArt.getSelectionModel().getSelectedItem().toString());
        Tisch tischen = bs.buchen(4, 2, comboBoxRestaurantStadt.getSelectionModel().getSelectedItem().toString());
        Tisch zahlungsArt = bs.buchen(4, 2, comboBoxZahlungsArt.getSelectionModel().getSelectedItem().toString());

        
        System.out.println("Tisch " + tische);
        buchungsAnzeige.setText(tische.toString());
    }
    

}
