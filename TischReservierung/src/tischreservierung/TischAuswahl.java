package tischreservierung;

import com.rest.logic.Tisch;
import java.util.function.Predicate;

/**
 *
 * @author Murat Vatandas
 */
public abstract class TischAuswahl {

    public static Predicate<Tisch> istRestaurantOrt = new Predicate<Tisch>() {
        @Override
        public boolean test(Tisch t) {
           return t.getRestaurantOrt().equals("Hamburg");
        }
    };
    public static Predicate<Tisch> istRestaurantArt = new Predicate<Tisch>() {
        @Override
        public boolean test(Tisch t) {
            return t.getRestaurantArt().equals("Chinesich");
        }
    };
}
