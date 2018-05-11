package tischreservierung;

import com.rest.logic.Tisch;
import java.util.function.Predicate;

/**
 *
 * @author Murat Vatandas
 */
public abstract class TischAuswahl {
    
    public static Predicate<Tisch> istHamburg = t->t.getRestaurantOrt().equals("Hamburg");
    public static Predicate<Tisch> bewertungGrößerOderGleich4  = t->t.getBewertung() >= 4;

    public static Predicate<Tisch> listeBurgerEssenGehen = new Predicate<Tisch>() {
        @Override
        public boolean test(Tisch t) {
           return t.getRestaurantArt().equals("Burger");
        }
    };
 
    public static Predicate<Tisch> wieGutUndWieviel(int quali, int anzahl){
        return (Tisch t) -> t.getBewertung()>=quali&&t.getPlaetze()>=anzahl;
    }
}
