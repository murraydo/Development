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
import static tischreservierung.TischAuswahl.istRestaurantArt;
import static tischreservierung.TischAuswahl.istRestaurantOrt;

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
        BuchungsService bs = new BuchungsService(tischDao);
        
        
        List<Tisch> listeVonTischAuswahlArten = BuchungsService.listeVonRestaurantArten(new TischMaker(30).getAllTische(), istRestaurantArt);
        System.out.println("############################### \n");
        for (Tisch tisch : listeVonTischAuswahlArten) {
            System.out.println(tisch);
        }
        List<Tisch> listeVonTischAuswahlOrte = BuchungsService.listeVonRestaurantOrte(new TischMaker(30).getAllTische(), istRestaurantOrt);
         System.out.println("############################### \n");
        for (Tisch tische : listeVonTischAuswahlOrte) {
            System.out.println(tische);
        }
//      Konsole gui = new Konsole(bs);
//      Fenster gui = new Fenster(bs);
//      gui.setVisible(true);

        new FensterFX().anzeigen(bs); 
    }

}
