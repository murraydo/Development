package result;

/**
 * Bedarf der Class MyValue;
 * @author Murat Vatandas
 */

public class Main {

    public static void main(String[] args) {
        System.out.print(MyValue2.result + " ");
        System.out.println("---------------");
        System.out.print(MyValue2.result + " ");
        System.out.println("++++++++++++++++++");
  
        new MyValue2();
        new MyValue2();
        System.out.print(MyValue2.result + "  +");
    }
}
class MyValue2 {

    static String result = "";

    {
        System.out.println("Zeile 27");
        result += "CCC-1-\n";
    }

    static {
        result += "UUU-2-\n";
    }

    {
        System.out.println("Zeile 36");
        result += "RRR-3-\n";
    }
}



