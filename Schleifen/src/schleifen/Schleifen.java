/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schleifen;

/**
 *
 * @author Sanne
 */
public class Schleifen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
//        int[][] vieleZahlen={{1,2,2,3},{3,2,17,5},{5,2,6,17,7}};
//        siebzehn:
//        for(int i= 0; i<vieleZahlen.length;i++){
//            inner:
//            for (int j= 0; j<vieleZahlen[i].length;j++){
//                if(vieleZahlen[i][j]==17){ 
//                    System.out.println("Das ist nicht erlaubt");
//                    break inner;
//                }
//                System.out.print(vieleZahlen[i][j] +" - ");
//            }
//            System.out.println("");
//        }
//        System.out.println("Vielen Dank, dass Sie heute unser Programm genuzt haben");
//        System.out.println("Schritt 1: Noch gar nichts mit Blöcken");
//        Bloecke b; 
//        System.out.println("Schritt2: Ein Block wurde deklariert");
//        b=new Bloecke();
//        System.out.println("Schritt 3: Ein Block wurde instanziert");
//        b=new Bloecke();
//        System.out.println("SChritt 4: Ein weiterer Block wurde instanziert");
//          SpezialBloecke sb=null;//= new SpezialBloecke();
//          System.out.println(sb);
//          SpezialBloecke k = new SpezialBloecke();
//          k = new SpezialBloecke();
//          k = new SpezialBloecke();
//            System.out.println(SpezialBloecke.sechzehn);

        /*Wenn wir alle natürlichen Zahlen unter 10 auflisten, die Vielfache von 3 oder 5 sind, 
* so erhalten wir 3, 5, 6 und 9. Die Summe dieser Vielfachen ist 23.
* Finden Sie die Summe aller Vielfachen von 3 oder 5 unter 1000.
         */
//        int ergebnis = 0;
//        for (int i = 0; i < 1000; i++) {
//            if (i % 3 == 0 | i % 5 == 0) {
//                ergebnis += i;
//                System.out.println(ergebnis);
//            }
//        }
// i = 2; b(i - vorherigen Wert) = aktuelle FibuZahl

/**
 * Für die Fibonacci-Reihe gilt das fogende Bildungsgesetz: 
* fib(n)= fib(n-1)+fib(n-2) mit fib(1)=fib(2)=1   n-> elemnt der natürlichen Zahlen
* 
* if(a==1 || a==2) return 1;
*/
    /**
     * Increment und Dekrement Operatoren
     */

        int i = 0;
        System.out.println("Der Initialwert i: " + i);
        System.out.println("Der momentanet Wert von i++: " + i++); // 1 
        System.out.println("Der momentanet Wert von i nach Post-Increment: " + i);
        System.out.println("Der momentanet Wert von ++i: " + ++i);
        System.out.println("Der momentanet Wert von i nach dem Pre-Increment: " + i);
   
//     int fibonacci = 12;
//     int ergebnis;
//     int fib1, fib2;
//     fib1 = 0;
//     fib2 = 1;
//     for (int i = 0; i < fibonacci +1 ; i++) {
//       ergebnis = fib1 + fib2;
//       fib1 = fib2;
//       fib2 = ergebnis;
//       if(ergebnis % 2 == 0 && ergebnis <= 4_000_000)
//       System.out.println(ergebnis);
//       
//     
//   }
    

    
//    }
    /**
     * Aufgabe: Beispiele für break, continue Mit und ohne Label
     *
     * Fibonacci-Zahlen, Abbruchkriterium: Summe aller bisher gefunden > 1000
     * Ausgeben werden soll, wieviele Zahlen bisdahin erstellt wurden
     *
     *
     * Wunzel von Quadratzahlen:
     *
     * Ziel zb 25 Additon der ungeraden Zahlen bis Ziel erreicht, Anzahl der
     * Summanden ist Wurzel aus der Zielzahl 1: 1 2: 1+3 = 4 3: 1+3+5 = 9
     * 4:1+3+5+7=16 5:1+3+5+7+9=25 -> 5 ist Wurzel aus 25
     *
     * Zeichenketten untersuchen auf ander Zeichenketten: Welche Wörter enhält
     * ein Satz
     */

    }
}
