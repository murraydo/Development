package exceptions;

import java.io.FileReader;

/**
 * @author Murat Vatandas
 * Unchecked Exception sind solche Exceptions, die nicht gecheckt werden. 
 * Unchecked Exeption: RuntimeException 
 * 
 * Unchecked Exception: Alle Exceptions, die von Exception erben und nicht 
 * Kinder von Runtime sind sind unchecked Exceptions
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            FileReader fileReader = new FileReader("existiert.nicht");
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Ende des Programms");
        
        String s = null;
        System.out.println(s);
    }
}
