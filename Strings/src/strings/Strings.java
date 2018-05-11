package strings;

/**
 *
 * @author Murat Vatandas
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit";
        int indexTest = text.indexOf('o');
        System.out.println(indexTest);
        System.out.println(containSpam(text));
    }

    
    public static  boolean containSpam(String text){
        return text.contains("Lorem") || text.contains("bla");
    }
}
