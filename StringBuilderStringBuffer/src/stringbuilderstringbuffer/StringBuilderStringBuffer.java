package stringbuilderstringbuffer;

/**
 *
 * @author Murat Vatandas
 */
public class StringBuilderStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String girl = new String("Monika");
        char [] name = new char[]{'P','a','u','l'};
        String boy = new String(name); // Ist möglcih, weil ein String aus einem Array aus Chars besteht
//      System.out.println(boy);
        
        /**
         * You can use StringBuffer and StringBuilder to create object of Strings
         */
        System.out.println("############################################");
        StringBuilder sbuilder = new StringBuilder("String Builder");
        System.out.println(sbuilder.getClass().getName());
        String string = new String(sbuilder);
        System.out.println(string.getClass().getName());
        
        System.out.println("#############################################");
        StringBuffer sBuffer = new StringBuffer("String Buffer");
        System.out.println(sBuffer.getClass().getName());
        String stringB = new String(sBuffer);
        System.out.println(stringB.getClass().getName());
        
        /**
         * Default Value of String = null
         */
        System.out.println("##############################################");
        System.out.println("Default Value of String");
        String emptyString = null; 
        System.out.println(emptyString);
    }

}
