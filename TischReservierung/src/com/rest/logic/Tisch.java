/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.logic;

import java.util.Random;

/**
 * Diese Tische sollen reserviert werden, dabei muss die Anzahl der Gäste
 * ko0ntrolliert werden. Reservierte Tische können bewertet werden
 *
 * @author Sanne
 */
public class Tisch {

    private int plaetze;
    /**
     * Anfänglich ist die Bewertung auf 0. Wenn ein Gast zufrieden ist kann er
     * bis zu 5 Punkte vergeben. Die Bewertung stellt den Durchschnitt aller
     * bisherigen Bewertungen dar.
     */
    private double bewertung;
    /**
     * Dient der Berechnung des Durchschnitts
     */
    private int anzahlBewertungen;
    /**
     * Diese Tischnummer kann später von der Datenbank erzeugt werden...
     */
    private int tischNr;
    /**
     * Ein reservierter Tisch wird ab der Abgabe der Bewertung frei gegeben
     */
    private boolean belegt = false;
    
    private String restaurantArt;
    
    private String restaurantOrt;
    
    public Tisch(String restaurantArt, String restaurantOrt, double bewertung, int plaetze){
       this.restaurantArt = restaurantArt;
       this.restaurantOrt = restaurantOrt;
       this.bewertung = bewertung;
       this.plaetze = plaetze;
   }

    public String getRestaurantArt() {
        return restaurantArt;
    }

    public void setRestaurantArt(String restaurantArt) {
        this.restaurantArt = restaurantArt;
    }

    public String getRestaurantOrt() {
        return restaurantOrt;
    }

    public void setRestaurantOrt(String restaurantOrt) {
        this.restaurantOrt = restaurantOrt;
    }
    /**
     * Hier wird die Anzahl der Plätze am Tisch festgelegt.
     *
     * @param stuehle ist Anzahl der Plätze dieses Tischs
     */
    public Tisch(int stuehle ) {
        this.plaetze = stuehle;
    }
    public Tisch(){
        
    }

   

    //Methoden
    public int getPlaetze() {
        return plaetze;
    }

    public double getBewertung() {
        return bewertung;
    }

    public int getTischNr() {
        return tischNr;
    }

    public void setTischNr(int tischNr) {
        this.tischNr = tischNr;
    }

    public int getAnzahlBewertungen() {
        return anzahlBewertungen;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public void bewerten(double bewertung) {
        double temp = this.bewertung * anzahlBewertungen;
        temp += bewertung;
        this.anzahlBewertungen++;
        this.bewertung = temp / anzahlBewertungen;
        //Tisch soll nach Bewertung frei gegeben werden
        this.belegt = false;
    }

    @Override
    public String toString() {
        return " Tisch [Plätze:  " + this.plaetze + " ->  Bewertung: " + this.bewertung + " ->  Tischnummer: " + this.tischNr + 
                " -> Ort des Restaurants: " +this.restaurantOrt + " -> Art des Restaurants: " + this.restaurantArt +  " ->  Durchschnittliche Bewertung: " + this.bewertung + " ]";
    }
/*
    @Override
    public void finalize() throws Throwable {
            System.out.println("Das wars mit Tisch:");
    }
*/
}
