package generics;


import java.util.ArrayList;
import java.util.List;
import java.lang.Number;

/**
 * @author Murat Vatandas
 * Generics verwandeln Runtimeexception zu Compilerfehlern
 */
public class Generics {
    
    public static <A> void ausgabeArray(A[] eingabeArray){
        for( A elementAusArray : eingabeArray){
            System.out.printf("%s ", elementAusArray);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'a','b','c', 'd'};
        
        System.out.println("Ausgabe des intArrays");
        ausgabeArray(intArray);
        System.out.println("\nAusgabe des doubleArrays");
        ausgabeArray(doubleArray);
        System.out.println("\nAusgabe des charArrays");
        ausgabeArray(charArray);
        System.out.println("################################");
        List<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Murat");
        stringArrayList.add("Vatandas");
        stringArrayList.add("Schokokuchen");
//        System.out.println("######Zugriff auf Index des Arrays########");
//        System.out.println(stringArrayList.get(0));
//        System.out.println("##########################################");
        for (int i = 0; i < stringArrayList.size(); i++) {
//            System.out.println(stringArrayList + " ohne get");
//            System.out.println("##################################");
            System.out.print(stringArrayList.get(i) + " ");
        }
        System.out.println("\n");
        int[] zahlenReihe = new int[]{1,2,3,4,5,6};
        for (int i = 0; i < zahlenReihe.length; i++) {
            System.out.println(zahlenReihe[i]);
                    
        }
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add( new Integer(20));
        arrayList.add( new Double(3.14));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ,");
        }
       
    }
}
