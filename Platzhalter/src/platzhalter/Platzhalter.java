package platzhalter;
import java.util.Scanner;

/**
 *
 * @author Murat Vatandas
 */
public class Platzhalter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Wie heisst Du denn??");
        String input = javax.swing.JOptionPane.showInputDialog("Eingabe");
        System.out.printf("Hallo %s. Wie alt bist du?%n ", input);
        int age = new Scanner(System.in).nextInt();
        System.out.printf("Aha, %s Jahre, das ist ja die Hälfte von %s und %s.%n", age,age *2, age);
        System.out.println("Sag mal, was ist deine Lieblingszahl");
        Double value = new Scanner(System.in).nextDouble();
        System.out.printf("%s? Aha, meine ist %g .%n ", value, Math.random() * 1000);
    }

}
