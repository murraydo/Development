package inDeKrement;

/**
 *
 * @author Murat Vatandas
 */
public class InDeKrement {

    /**
     * In Java sind inkrement und Dekrement für alle numerische Datentypen erlaubt, auch für Fließkommazahlen
     * @param args 
     */
    
    public static void main(String[] args){
    
        /**
         * Präfix-Inkrement und Dekrement
         */
        int i = 10, j = 20;
        System.out.println(++i); // 11
        System.out.println(--j); // 19
        
        System.out.println("----------------------");
        
        /**
         * Postfix-´Inkrement und Dekrement
         */
        int a = 10, b = 20;
        System.out.println(a++);    //10
        System.out.println(b--);    //20
        System.out.println(a);      //11      
        System.out.println(b);      //19
        
        
        /* Kuriosität */
        int d = 1;
        d = d++; // Müsste noch 1 sein
        System.out.println(d); // Müsste jetzt zwei sein , ist jedoch 1;
    }
    
    
    
    
}
