package operators;

/**
 * @author Murat Vatandas
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b;
        a = 10;
        b = ( a==1) ? 20:30;
        System.out.println("Der Wert von b ist jetzt: " + b);
        
        b = (a==10) ? 20:30;
        System.out.println("Der Wert von b  ist jetzt: " +b);
        
        String name = "Murat";
        Operators o = new Operators();
        boolean resultOfString = o instanceof Operators;
        System.out.println(resultOfString);
        boolean result = name instanceof String;
        System.out.println(result);
    }

}
