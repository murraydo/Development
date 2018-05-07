/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author Sanne
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lambdas l = new Lambdas();
       l.essenVerboten( d -> {
           if(d.equals("China")){
               System.out.println("Es kommt nur auf die Gewürze an");
           }
           else{
               System.out.println("bähhh");
           }
       } );
       l.bemerken(katze -> {
           if(katze.equals("Kitty"))return -7;
           else return 20;
       });
       l.aufpassen(()->{
           System.out.println("Käse ist lecker");
       });
    }
    public void essenVerboten(Hund h){
        h.schmeckt("Deutschland");
    }
    public void bemerken(Katze k){
        int i = k.nervt("Kater Karlo");
        System.out.println("Nervfaktor der Katze: "+ i);
    }
    public void aufpassen(Maus m){
        m.klaut();
        m.dasKlapptSo();
    }
}
