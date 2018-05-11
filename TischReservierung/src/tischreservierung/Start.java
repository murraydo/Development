/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tischreservierung;

import com.rest.gui.Fenster;
import com.rest.gui.FensterFX;

import com.rest.gui.Konsole;
import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;

import com.rest.model.TischDao;
import com.rest.model.TischDaoListImpl;
import com.rest.model.TischMaker;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import tischreservierung.TischAuswahl.*;


/**
 *
 * @author Sanne
 */
public class Start {

    public static int k;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        k = 0; 
        TischDao tischDao = new TischDaoListImpl();
        System.out.println("--- Beginn des BuchungsServices ---");
        BuchungsService bs = new BuchungsService(tischDao);
        System.out.println("--- Ende des BuchungsServices ------");
        
        TischMaker tm = new TischMaker(30);
        List<Tisch> alleTische = tm.getAllTische();
        List<Tisch> meineTests = new ArrayList<>();
        System.out.println("################################################\n");
        System.out.println("# Ausgabe aller Restaurants in Hamburg \n");
        System.out.println("################################################\n");
        meineTests = bs.listeAllerTests(alleTische, TischAuswahl.istHamburg);
        meineTests.forEach(System.out::println);
        System.out.println("################################################\n");
        System.out.println("# Ausgabe aller Restaurants deren Bewertung größer oder gleich 4 ist \n");
        System.out.println("################################################\n");
        meineTests = bs.listeAllerTests(alleTische, TischAuswahl.bewertungGrößerOderGleich4);
//      System.out.println(meineTests);
        meineTests.forEach(System.out::println);
         System.out.println("################################################\n");
        System.out.println("# Ausgabe aller Restaurants in denen man Burger essen kann \n");
        System.out.println("################################################\n");
        meineTests = bs.listeAllerTests(alleTische, TischAuswahl.listeBurgerEssenGehen);
        meineTests.forEach(System.out::println);
     
//      Konsole gui = new Konsole(bs);
//      Fenster gui = new Fenster(bs);
//      gui.setVisible(true);

      new FensterFX().anzeigen(bs); 
    }
}
