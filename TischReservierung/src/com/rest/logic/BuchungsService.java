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
    private TischDao td;
    private Predicate<Tisch> pT;
    
    /**
     * 
     * Hier wird die Datenquelle übergeben
     */
    public BuchungsService( TischDao td){
        alleTische = td.getAllTisch();
        alleTische.forEach(System.out::println);
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
    
    
     public static List<Tisch> listeVonRestaurantOrte (List<Tisch> alleTische, Predicate<Tisch> rOrte){
        List<Tisch> restaurantOrte = new ArrayList<>();
        for(Tisch tisch : alleTische){
            if(rOrte.test(tisch)){
                restaurantOrte.add(tisch);
            }
        }
        return restaurantOrte;
    }
        public static List<Tisch> listeVonRestaurantArten (List<Tisch> alleTische,  Predicate<Tisch> rArten){
        List<Tisch> restaurantArten = new ArrayList<>();
        for(Tisch tisch : alleTische){
            if(rArten.test(tisch)){
                restaurantArten.add(tisch);
            }
        }
        return restaurantArten;
    }
        
 
}
