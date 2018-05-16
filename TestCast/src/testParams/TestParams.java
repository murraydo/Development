package testParams;

/**
 *
 * @author Murat Vatandas
 */
public class TestParams {

    // construktor ohne parameter 
    TestParams() {
        System.out.println("1 ");   // Keine Parameterübergabe, daher wird das Object in der main nicht angesprochen werden können
    }

    // constructor mit params int
    TestParams(int num) {
        System.out.println("2 ");  // constructor kann aufgerufen werden, wenn ein neues Object mit params erzeugt wird (TestCase(1)).
    }

    // constructor mit einem object als params, verwandelt das neu erzeugte Object TestCase(1L) in einen 
    TestParams(Integer num) {
        System.out.println("3 ");
    }

    // 
    TestParams(Object num) {
        System.out.println("4 ");
    }

    // Schrott??
    TestParams(int... nums) {
        System.out.println("5");
    }

    public static void main(String[] args) {
        new TestParams(1);    //  1 is an int , its match int construktor 
        new TestParams(1L);   //  1L is a long, its cannot be converted in a smaller type, it is autoboxing in a Long
        //  and then the constructor for Object is called.
    }
}
