package variablen;

/**
 * @author Murat Vatandas
 * Thema: Variablen
 * --- locale Variablen ---
 *      Are declared in methods, constructors or blocks
 *      The variable was destroyed if exti method, construktor or block
 *      Modifiers cannot be used
 *      nicht vorInitialisiert
 *      
 * --- Instanz Variablen
 *      Declared in classes, outside a method, constructors or bocks
 *      It was created when an Object is created with the keyword new
 *      It was destroyed when the object is destroyed
 *      default values:numbers->0;booleans->false;objects->null;
 *      
 * -- Class/Static Variablen
 *      Class Variable ar static variablen, declared wit the keyword static in a class, not in methods, constructors or blocks
 *      static variables are stored in in static memory, starts und destroyed when program stops or starts
 *      Accessing with calling classname-> className.VariableName 
 */
public class Variablen {
    private static double tax;
    public static final String MEHRWERTSTEUER = "Mehrwertsteuer";

    public void localVariable(){
        int age = 0;
        age = age +7;
        System.out.println("Dss ist eine locale Variable, die in der Methode localVariable aufgerufen wird und Scope ist begrenzt auf diese Methode: " + age);
    }
    // Instance variable is visible for any child class
    public String name;
    private double salary;
    
    // Constructor
    public Variablen(String emptyName){
        name = emptyName;
    }
    // The salary is assigned a value
    public void setSalary(double emptySalary){
        salary = emptySalary;
    }
    // This method prints details
    public void printEmptyValues(){
        System.out.println("Die Methode printEmtyValues mit dem Atribute name: " + name);
        System.out.println("Die Methode printEmtyValues mit dem Atribute salary: " + salary);
    }
    
   double a = 3.14;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double i = 2.02;
        Variablen variablen = new Variablen("Murat");
            variablen.localVariable();
            variablen.setSalary(1000);
            variablen.printEmptyValues();
            tax = 0.19;
            System.out.println("Die " + MEHRWERTSTEUER + " in Deutschland beträgt: " + tax + "%");

        }
    
}
