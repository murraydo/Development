/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.JButton;

/**
 *
 * @author Sanne
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Lambdas l = new Lambdas();
//       l.essenVerboten( d -> {
//           if(d.equals("China")){
//               System.out.println("Es kommt nur auf die Gewürze an");
//           }
//           else{
//               System.out.println("bähhh");
//           }
//       } );
//       l.bemerken(katze -> {
//           if(katze.equals("Kitty"))return -7;
//           else return 20;
//       });
//       l.aufpassen(()->{
//           System.out.println("Käse ist lecker");
//       });
//    }
//    public void essenVerboten(Hund h){
//        h.schmeckt("Deutschland");
//    }
//    public void bemerken(Katze k){
//        int i = k.nervt("Kater Karlo");
//        System.out.println("Nervfaktor der Katze: "+ i);
//    }
//    public void aufpassen(Maus m){
//        m.klaut();
//        m.dasKlapptSo();

//        Comparator<String> comparatorAnonymeKlasse = new Comparator<String>(){
//            public int compare(String s1, String s2){
//                return s1.length() - s2.length();
//            }
//        };
//        
//        Comparator<String> comparatorLamda = (String s1, String s2) -> { return s1.length()-s2.length();};
//        
//        comparatorLamda = (s1,s2) ->{return s1.length()-s2.length();};
//        comparatorLamda = (s1,s2)->s1.length()-s2.length();
//        
//        List<String> wörter = Arrays.asList("AA", "A", "AAAA", "AAA");
//        System.out.println(wörter);
//        Collections.sort(wörter,comparatorAnonymeKlasse);
//        System.out.println(wörter);
//        wörter = Arrays.asList("AA", "A", "AAAA", "AAA");
//        Collections.sort(wörter, comparatorLamda);
//        System.out.println(wörter);
//        
//        Predicate<String> wortLängerAlsFünfBuchstaben = (String s) -> s.length()>5;
//        wortLängerAlsFünfBuchstaben = (s)->s.length()>5;
//        wortLängerAlsFünfBuchstaben = s ->s.length()>5;
//        System.out.println(wortLängerAlsFünfBuchstaben.test("HalloWelt"));
//        
//        Runnable runnable = ()->System.out.println("Hallo Welt!");
//        runnable.run();
            
            Mathe addieren = (int a, int b)-> a+b;
            Mathe multiplizieren = (int a, int b)->a*b;
            
            System.out.println(multiplizieren.funktion(5, 5));

        }
    
        interface Mathe{
        int funktion(int a, int b);
        
    }
}

