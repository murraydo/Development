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
        //Konsole gui = new Konsole(bs);
//      Fenster gui = new Fenster(bs);
//     gui.setVisible(true);

        new FensterFX().anzeigen(bs);
// 
    }

    public static List<Tisch> auswahl(List<Tisch> alle, Predicate<Tisch> tp) {
        List<Tisch> auswahl = new ArrayList<>();
        for (Tisch tisch : alle) {
            if (tp.test(tisch)) {
                auswahl.add(tisch);
            }
        }
        return auswahl;
    }

}
