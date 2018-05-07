package datatypes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvatandas
 */
public class DataTypes {
    
    
    /**
     * char         = 'a';
     * byte         = 8  bits   -> -128 - 127 inclusive
     * short        = 16 bits   -> -32,768 - 32,767, inclusive
     * int          = 32 bits   -> -2,147,483,648 - 2,147,483,647 inclusive
     * long         = 64 bits   -> -9,223,372,036,854,775,808 -9,223,372,036,854,775,807 inclusive
     * float
     * double 
     * 
     * Primitive Datentypen werden in folgende Kategorien unterteilt: 
     * Numerische und Boolsche
     * Die boolsche Kategorie hat nur den Datentyp boolean. Dieser Datentyp hat nur die Ausprägungen: Der boolische Literal kann die folgenden Zustände haben: true oder false.  
     * Die numersichen Datentypen werden in Signed und Unsigned wiederum uterteilt
     * Der primitive numerische Unsigned Datentyp hat nur die Kategorie Character mit dem Datentyp char
     * 
     * 
     * 
     * Invalid examples:
     * int intLiteral   = _110; cant start with underscore 
     * int intLiteral12 = 100_999_; cant end with underscore
     * int longLiteral = 100_L; cant place underscore prior to suffix L
     */

    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        
        float average = 20.125F;
        System.out.println(average);
        float orbit = 1765.65f;
        System.out.println(orbit);
        double declination = 120.1762;
        System.out.println(declination);
        
          int x = 100;
          int a = ++x;
          int b = x++;
        // TODO code application logic here
        System.out.println(" Ausgabe X: " + x +  " \n " + "" +  a + " " + b);
        
       
       
    }
    
}
