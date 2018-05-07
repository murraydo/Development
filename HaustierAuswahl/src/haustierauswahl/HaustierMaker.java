/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haustierauswahl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sanne
 */
public class HaustierMaker {
    private List<Haustier> tiere = new ArrayList<Haustier>();
    
    private String[] namen = {"Mauz","Wuff","Charly","King Kong","Schokokuchen","Pieps","Black and White","Lassie","Wolke"};
    private Integer[] jahre ={1,2,3,4,5,6,7,8,9,10};
    private String[] arten ={"Hund","Katze","Pferd","Qualle","Meerschweinchen","Hase"};
    
    public HaustierMaker(int anzahl){
        for(int i=0; i<anzahl;i++){
            tiere.add(new Haustier(
                    namen[new Random().nextInt(namen.length)], 
                    jahre[new Random().nextInt(jahre.length)], 
                    arten[new Random().nextInt(arten.length)], 
                    new Random().nextBoolean())
            );
        }
    }
    public List<Haustier> getTiere(){
        return tiere;
    }
}
