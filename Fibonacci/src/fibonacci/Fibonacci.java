package fibonacci;

/**
 *
 * @author Murat Vatandas
 */
public class Fibonacci {

    /**
     * Berechnet Fibonacci-Zahlen und gibt die Folge aus.
     *
     * @param args[0] Limit, bis wohin Fibonacci-Zahlen berechnet werden sollen;
     * default = 1000000.
     * @param args[1] Trenner zur Ausgabe, z. B. ", "; default = <Zeilenumbruch>
     */
    public static void main(final String[] args) {
        long endValue = 1000000000;
        String trenner = System.getProperty("line.separator");
        try {
            endValue = Long.parseLong(args[0]);
            trenner = args[1];
        } catch (Exception ignore) {
        }
        long fib1 = 0;
        long fib2 = 1;
        System.out.print(fib1);
        while (fib2 <= endValue) {
            System.out.print(trenner);
            System.out.print(fib2);
            long newFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = newFib;
        }
        System.out.println();
    }

}
