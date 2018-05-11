/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.logic;

import com.rest.model.TischDao;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Sanne
 */
public class BuchungsService {
    private List<Tisch> alleTische;
    private TischDao td;;
    
    /**
     * 
     * Hier wird die Datenquelle übergeben
     */
    public BuchungsService( TischDao td){
        alleTische = td.getAllTisch();
//        alleTische.forEach(System.out::println);
        this.td = td;
    }
    /**
     * Tisch buchen für eine Anzahl von Personen
     * Liefert den ersten gefunden Tisch zurück, auch wenn dieser viel größer ist
     * Liefert null zurück, wenn kein passender Tisch gefunden wurde
     * @param person gibt die Mindestanzahl an Plaetzen am Tisch an
     */
    public Tisch buchen(int person){
        for(Tisch tisch : alleTische){
            if(!tisch.isBelegt() && tisch.getPlaetze()>=person){
                //ggf noch nach einem Tisch suchen, der so klein wie möglich ist
                tisch.setBelegt(true);
                return tisch;
            }
        }
        return null;
    }
    /**
     * Tisch buchen mit einer Mindestqualität
     * @param person  Mindestanzahl an Plaetzen am Tisch
     * @param quali Mindestqualität
     */
    public Tisch buchen(int person, double quali){
        for(Tisch tisch : alleTische){
            if(!tisch.isBelegt() && tisch.getPlaetze()>=person && tisch.getBewertung()>=quali){
                //ggf noch nach einem Tisch suchen, der so klein wie möglich ist
                tisch.setBelegt(true);
                return tisch;
            }
        }
        return null;
    }
    public Tisch buchen(int person, double quali, String restaurantArt){
        for(Tisch tisch : alleTische){
            if(!tisch.isBelegt() && tisch.getPlaetze()>=person && tisch.getBewertung()>=quali && tisch.getRestaurantArt().equals(restaurantArt)){
                //ggf noch nach einem Tisch suchen, der so klein wie möglich ist
                tisch.setBelegt(true);
                return tisch;
            }
        }
        return null;
    }
    public Tisch buchen(int person, double quali, String restaurantArt, String restaurantOrt){
        System.out.println("--------------------!!!!!!!!!!!!!!!!___________________");
        System.out.println(restaurantOrt);
        for(Tisch tisch : alleTische){
            if(!tisch.isBelegt() && tisch.getPlaetze()>=person && tisch.getBewertung()>=quali && tisch.getRestaurantArt().equals(restaurantArt) && tisch.getRestaurantOrt().equals(restaurantOrt)){
                //ggf noch nach einem Tisch suchen, der so klein wie möglich ist
                tisch.setBelegt(true);
                return tisch;
            }
        }
        return null;
    }
    
    
     public List<Tisch> listeAllerTests (List<Tisch> alleTische, Predicate<Tisch> alleAbfragen){
        List<Tisch> alleMeineAbfragen = new ArrayList<>();
        for(Tisch tisch : alleTische){
            if(alleAbfragen.test(tisch)){
                alleMeineAbfragen.add(tisch);
            }
        }
        return alleMeineAbfragen;
    }
 
}
