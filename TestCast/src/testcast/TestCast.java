package testcast;

/**
 *
 * @author Murat Vatandas
 */
public class TestCast {
    
    String value = "AAA";
    {
        value += "BBB"; 
    }
    {
        value += "CCC";
    }
    public TestCast(){
        value += "XXX";
    }
    public TestCast(String s){
        value += s;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TestCast m = new TestCast("QQQ"); // Object wird erzeugt aber net aufgerufen
        m = new TestCast(); // Abfolge: Object TestCast ohne params wird neu referenziert mit m->m.value->
        System.out.println(m.value);  //AAABBBCCCXXX
        
    }

}
