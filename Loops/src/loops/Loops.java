package loops;

/**
 *
 * @author Murat Vatandas
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        
        double[] myList = {1.1,2.2,3.3,4.4,5.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + "");
        }
    }

}
