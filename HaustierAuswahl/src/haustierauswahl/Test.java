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
 * @author Sanne
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HaustierMaker hm = new HaustierMaker(30);
        List<Haustier> alleTiere = hm.getTiere();
        List<Haustier> auswahl = new ArrayList<>();
//        for(Haustier pet : alleTiere){
//            System.out.println(pet);
//        }
//        alleTiere.forEach(pet -> System.out.println(pet));
        System.out.println("**********alle************");
        alleTiere.forEach(System.out::println);
        System.out.println("***********alle Pferde************");
        auswahl=listeVonPferd(alleTiere);
        auswahl.forEach(System.out::println);//nur um schnell eine Anzeige zu ermöglichen
        System.out.println("***********wieder die Pferde*******");
        auswahl=auswahlListe(alleTiere, HaustierAuswahl.istPferd);
        auswahl.forEach(System.out::println);
        System.out.println("***********alte Tiere***********");
        auswahl=auswahlListe(alleTiere, HaustierAuswahl.istAlt);
        auswahl.forEach(System.out::println);
        System.out.println("*****Alle Schokokuchen**********");
        auswahl=auswahlListe(alleTiere,HaustierAuswahl.heisstSchokokuchen);
        auswahl.forEach(System.out::println); 
         System.out.println("*****Alle Charlys**********");
        auswahl=auswahlListe(alleTiere, pet->pet.getName().equals("Charly"));
        auswahl.forEach(System.out::println); 
        System.out.println("***********alle Pferde, die älter sind als 3");
        auswahl=auswahlListe(alleTiere, pet->pet.getArt().equals("Pferd") && pet.getAlter()>3);
        auswahl.forEach(System.out::println); 
        System.out.println("********Tier a jünger als x");
        int jung = 4;
        String name = "Schokokuchen";
        auswahl=auswahlListe(alleTiere, pet->pet.getName().equals(name) && pet.getAlter()<9);
        auswahl.forEach(System.out::println); 
    }
    public static List<Haustier> listeVonPferd(List<Haustier> alle){
        List<Haustier> pferde=new ArrayList<>();
        for(Haustier pet : alle){
            if(pet.getArt().equals("Pferd")){
                pferde.add(pet);
            }
        }
        return pferde;
    }
    public static List<Haustier> auswahlListe(List<Haustier> alle, Predicate<Haustier> hp){
        //List Haustier -> Listung aller erstellten Haustiere
        // Predicate Haustier hp -> nur für den Test zuständig
          List<Haustier> auswahl=new ArrayList<>();
          for(Haustier pet : alle){
              if(hp.test(pet)){
                  auswahl.add(pet);
              }
          }
          return auswahl;
    }
}
/**
 * Tischreservierung:
 * 1) TischDaoListImpl: Tischerstellung in TischMaker auslagern
 * 2) Tischkonstruktor anpassen, so dass Tische zu Beginn schon ein Bewertung zwische 0 und 5 haben
 * 3) TischMaker: Tische estellen mit zufälliger Personenzahl, Qualität
 * 4) Auswahlklasse: statische Methoden zur Auswahl von "geeigneten" Tischen
 * 5) Buchungsservice anpassen, so dass nach Listen mit vorgegebenen Kriterien gesucht werden kann
 * 6) Mindestens eine GUI Klasse anpssen umd den neuen Buchungsservice zu testen
 * 7) Erweitern der Tisch-Klasse um einen Restaurant-Typ zB Italiener, Chinese, ...
 */