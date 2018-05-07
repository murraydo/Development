/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haustierauswahl;

import java.util.function.Predicate;

/**
 *
 * @author mvatandas
 */
public class HaustierAuswahl {
    public static Predicate<Haustier> istPferd = new Predicate<Haustier>(){
        @Override
        public boolean test(Haustier t) {
            return t.getArt().equals("Pferd");
        }
        
    };
    public static Predicate<Haustier> istAlt  = new Predicate<Haustier>(){
        @Override
        public boolean test(Haustier t) {
           return t.getAlter()>7;
        }
        
    };
    
    public static Predicate<Haustier> heisstSchokokuchen = t->t.getName().equals("Schokokuchen");
    public static Predicate<Haustier> magTomaten = t->t.isMagTomaten();
}
