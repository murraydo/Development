/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.gui;

import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;
import com.rest.model.TischMaker;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Sanne
 */
public class FensterFX extends Application implements EventHandler<ActionEvent>{

    private static BuchungsService bs;
    private Label lblPersonenZahl;
    private Button buchen; 
    private Label lblRestaurantOrt;
    private TextField txtRestaurantOrt;
    private Label lblRestaurantArt;
    private ChoiceBox txtRestaurantArt;
    private TextField txtPersonenzahl;
    private Label buchungsAnzeige;
    private ComboBox comboBox;

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("welcher Buchungsservice " + this.bs);
        buchen = new Button("Buchen");
        lblRestaurantOrt = new Label("Bitte wählen Sie die Stadt aus");
        txtRestaurantOrt = new TextField();
        lblRestaurantArt = new Label("Bitte wählen Sie die Art des Restaurants");
        txtRestaurantArt = new ChoiceBox();
        txtPersonenzahl = new TextField();
        lblPersonenZahl = new Label("Wieviele Personen kommen?");
        buchungsAnzeige = new Label();
        TischMaker tm = new TischMaker(30);
        comboBox = new ComboBox();
        comboBox.getItems().addAll(tm.getRestaurantArt());
        comboBox.setPromptText("Bitte wählen Sie die Art des Restaurants");
        
        stage.setTitle("Unsere Tische");
        
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(20);
        
        Insets grenzen = new Insets(30,22,40,20);
        root.setPadding(grenzen);
        
        root.add(lblPersonenZahl,0,0,2,1);
        root.add(txtPersonenzahl,1,0); // column = 1; row = 0
        root.add(lblRestaurantOrt,0,1);
        root.add(txtRestaurantOrt,1, 1);
        root.add(comboBox, 1,2);
//        root.add(lblRestaurantArt,2,1);
//        root.add(txtRestaurantArt,2,2);
        root.add(buchen, 0, 3, 2, 1);
        root.add(buchungsAnzeige, 0,4,2,1);
      
        root.setId("ROOT");
        
        buchen.setOnAction(this); 
        
        Scene szene = new Scene(root,500,200);
        System.out.println(getClass().getResource("tischres.css"));
        szene.getStylesheets().add(getClass().getResource("tischres.css").toExternalForm());
        
        stage.setScene(szene);
        stage.show();
    }
    public void anzeigen(BuchungsService bs){
        FensterFX.bs = bs;
        launch();
    }

    @Override
    public void handle(ActionEvent t) {
        System.out.println("Event+ "+t);
        System.out.println("Buchungsservice"+bs);
        Tisch tisch = bs.buchen(4, 2, "");
        Tisch tische = bs.buchen(4, 2, comboBox.getSelectionModel().getSelectedItem().toString());
        
        System.out.println("Tisch "+tische);
        buchungsAnzeige.setText(tische.toString());
    }

}
