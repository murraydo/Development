package initialiser;

/**
 *
 * @author Murat Vatandas
 */
public class Initialiser {

    public static void main(String[] args) {
        
        double w,y,z;
        w = 4195835.0;
        y = 3145727.0;
        z = w-(w/y)*y;
        System.out.println(z);
        
        
        int x = 20;
        System.out.println(x);
        System.out.println( (x = 40) * x );
        System.out.println(x);
        int age = 0;  // if int age is not initialized, you cannot print the local variable
        boolean adult = false;
        if (age >= 18) {
            adult = true;
            System.out.println(adult);
        }
        System.out.println(age);
    }

}
