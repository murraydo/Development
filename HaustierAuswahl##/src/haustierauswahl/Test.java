/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haustierauswahl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author mvatandas
 */
public class Test {

    public static void main(String[] args) {
        HaustierMaker hm = new HaustierMaker(30);
        List<Haustier> alleTiere = hm.getTiere();
        List<Haustier> auswahl = hm.getTiere();
//        for (Haustier pet : alleTiere) {
//            System.out.println(pet);
//        }
//        alleTiere.forEach(pet -> System.out.println(pet));
        System.out.println("****************alle*******************");
        alleTiere.forEach(System.out::println);
        System.out.println("*****************alle Pferde***********");
        auswahl = listeVonPferd(alleTiere);
        auswahl.forEach(System.out::println); // nur um schnell ene Anzeige zu ermöglichen
        System.out.println("***********wieder alle Pferde*************");
        ausw
    }

    public static List<Haustier> listeVonPferd(List<Haustier> alle) {

        List<Haustier> pferde = new ArrayList<>();
        for (Haustier pet : alle) {
            if (pet.getArt().equals("Pferd")) {
                pferde.add(pet);
            }
        }
        return pferde;
    }
    public static List<Haustier> auswahl(List<Haustier> alle, Predicate<Haustier> hp){
        List<Haustier> auswahl = new ArrayList<>();
        for(Haustier pet : alle){
            if(hp.test(pet)){
                auswahl.add(pet);
            }
        }
        return auswahl;
    }
}
