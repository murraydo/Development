/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.gui;

import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;
import java.util.Scanner;

/**
 *
 * @author Sanne
 */
public class Konsole {
    //Attribut
    private BuchungsService bs;
    private Scanner scan;
    private Tisch reserviert;
    
    //Konstuktor
    public Konsole(BuchungsService bs){
        this.bs=bs;
        scan = new Scanner(System.in);
        navigation();
    }
    
    
    //Methoden
    //Rekursive Methode
    private void navigation() {
        System.out.println("********Willkommen, was können wir für Sie tun? *********\n"
                + "***1***: Buchen mit Personenzahl\n"
                + "***2***: Buchen mit Personenzahl und Qualität\n"
                + "***3***: Tisch bewerten\n"
                + "Beenden des Programms mit jeder anderen Zahl");
        int auswahl = scan.nextInt();//Hier eigentlich Sicherung, dass Fehleingaben abgefangen werden
        switch(auswahl){
            case 1:          
                buchenMitPersonen();
                break;
            case 2:
                buchenMitQuali();
                break;
            case 3:
                bewerten();
                break;
            default:
                System.out.println("Vielen Dank, dass Sie über unseren Service gebucht haben.");
                return;
        }
        navigation();
    }
    
    private void bewerten(){
        if(reserviert==null){
            System.out.println("Bitte buchen Sie erst einen Tisch");
        } else{
            System.out.println("Wie gut hat Ihnen der Tisch gefallen, bitte bewerten Sie von 1-5");
            int bewertung = scan.nextInt();
            reserviert.bewerten(bewertung); //der Tisch ist für sein Attribut bewertung zuständig
            System.out.println("Vielen Dank für die Berwertung des Tischs Nr: "+ reserviert.getTischNr()+
                    "Er hat jetzt die Bewertung: "+reserviert.getBewertung());
            reserviert=null;
        }
        
    }
    private void buchenMitQuali(){
        int anzahlPerson, mindestBewertung;
        System.out.println("Wie viele Personen werden kommen?");
        anzahlPerson = scan.nextInt();
        System.out.println("Wie gut soll der Tisch sein? Bitte wählen Sie von 1-5");
        mindestBewertung=scan.nextInt();
        this.reserviert = bs.buchen(anzahlPerson, mindestBewertung);
        if(this.reserviert!=null){
            System.out.println("Vielen Dank, der Tisch Nr: "+this.reserviert.getTischNr()+ "wurde für Sie reserviert");
            System.out.println("Tischinfos: "+this.reserviert);
        }
        else{
            System.out.println("Leider ist derzeit kein Tisch in der gewünschten Größe verfügbar,"
                    + "bitte versuchen Sie es später erneut");
        }
    }
    
    private void buchenMitPersonen(){
        int anzahlPerson=0;
        System.out.println("Wie viele Personen kommen?");
        anzahlPerson = scan.nextInt();
        this.reserviert = bs.buchen(anzahlPerson);
        if(this.reserviert!=null){
            System.out.println("Vielen Dank, der Tisch Nr: "+this.reserviert.getTischNr()+ "wurde für Sie reserviert");
            System.out.println("Tischinfos: "+this.reserviert);
        }
        else{
            System.out.println("Leider ist derzeit kein Tisch in der gewünschten Größe verfügbar,"
                    + "bitte versuchen Sie es später erneut");
        }
    }
}
