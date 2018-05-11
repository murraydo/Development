package lambdas;

/**
 *
 * @author Murat Vatandas
 */
@FunctionalInterface
public interface Interface {
    public void abstrakteMethode();
        
        public default void defaultMethode(){
            System.out.println("eine default-Methode");
        }
        public static void statischeMethode(){
            System.out.println("Eine Statische Methode");
        }
    }

