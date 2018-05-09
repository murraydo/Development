/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.model;

import com.rest.logic.Tisch;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mvatandas
 */
public class TischMaker {

    private List<Tisch> tische = new ArrayList<Tisch>();
    private Integer[] bewertung = {1, 2, 3, 4, 5};
    private Integer[] stuhlAnzahl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String restaurantArt[] = {"Chinesich", "Koreanisch", "Indisch", "Marrokanisch", "Burger", "Japanisch(Sushi)", "Afrikanisch"};
    private String restaurantOrt[] = {"Hamburg", "Berlin", "München", "Hannover", "Köln", "Freiburg"};

    /**
     *
     * @param tischeAnzahl
     */
    public TischMaker(int anzahl) {

        for (int i = 0; i < anzahl; i++) {
            tische.add(new Tisch(
                    restaurantArt[new Random().nextInt(restaurantArt.length)],
                    restaurantOrt[new Random().nextInt(restaurantOrt.length)],
                    bewertung[new Random().nextInt(bewertung.length)],
                    stuhlAnzahl[new Random().nextInt(stuhlAnzahl.length)]
            ));
        }
    }

    public List<Tisch> getAllTische() {
        return tische;
    }
}
