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
 
    public static Predicate<Tisch> alleFreienTischeNachOrt(String ort){
        return (Tisch t) -> t.getRestaurantOrt().equals(ort)&& !t.isBelegt();
    }
    public static Predicate<Tisch> alleFreienTischeNachArt(String art2){
        return (Tisch t) -> t.getRestaurantArt().equals(art2)&& !t.isBelegt();
    }
    
        public static Predicate<Tisch> alleFreienTischNachArt(String art){
        return (Tisch t) -> t.getRestaurantArt().equals(art)&& !t.isBelegt();
    }
    
    public static Predicate<Tisch> wieGutUndWieviel(int quali, int anzahl){
        return (Tisch t) -> t.getBewertung()>=quali&&t.getPlaetze()>=anzahl;
    }
    public static Predicate<Tisch> alleAnzeigen(String ort, String art, String zahlung){
        return (Tisch t) ->
                t.getRestaurantOrt().equals(ort)&& !t.isBelegt() &&
                t.getRestaurantArt().equals(art)&& !t.isBelegt() &&
                t.getZahlungsArt().equals(zahlung)&& !t.isBelegt();
                        
    }
}
