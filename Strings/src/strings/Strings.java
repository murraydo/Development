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
        
        System.out.println("#####################");
        String numbers = "012345678"; 
     System.out.println(numbers.substring(1, 4)); 
     System.out.println(numbers.substring(7, 7)); 
      System.out.println(numbers.substring(7));
    }

    
    public static  boolean containSpam(String text){
        return text.contains("Lorem") || text.contains("bla");
    }
}
