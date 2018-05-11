package klasseoptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author Murat Vatandas
 */
public class KlasseOptional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Optional<String> halloWeltOptionalString = Optional.ofNullable("Hallo Welt");
        String halloWelt = halloWeltOptionalString.get();
        System.out.println(halloWelt);
        System.out.println(halloWeltOptionalString);
        
        
        Optional<String> leererOptionalString = Optional.ofNullable(null);
        try{
            leererOptionalString.get();
        } catch(NoSuchElementException ex){
            System.out.println("Es war nichts drinnen im Optional");
        }
        
        boolean istEinStringEnthalten = leererOptionalString.isPresent();
        System.out.println(istEinStringEnthalten);
        System.out.println(halloWeltOptionalString.isPresent());
        
        try{
            leererOptionalString = Optional.of(null);
        }catch(NullPointerException ex){
            System.out.println("man kann mit of kein mit 'of' keinen Optional mit null anlegen");
        }
        
        halloWeltOptionalString = Optional.of("hallo Welt");
        leererOptionalString = Optional.empty();
        
        Consumer<String> stringAusgaben = string->System.out.println(string);
        halloWeltOptionalString.ifPresent(stringAusgaben);
        halloWeltOptionalString.ifPresent(string->System.out.println(string));
        
        String optionalOrElseHallo = leererOptionalString.orElse("Hallo");
        System.out.println(optionalOrElseHallo);
        optionalOrElseHallo = halloWeltOptionalString.orElse("Hallo");
        System.out.println(optionalOrElseHallo);
        
        List<String> wörter = Arrays.asList("eins", "zwei", "drei", "vier");
        Supplier<String> zufallswortSupplier = ()->getZufallsWertAus(wörter);
        String optionalOrElseIrgendeinWort = leererOptionalString.orElseGet(zufallswortSupplier);
        System.out.println(optionalOrElseIrgendeinWort);
        optionalOrElseIrgendeinWort = leererOptionalString.orElseGet(()->getZufallsWertAus(wörter));
       
        getStringMöglicherweise().ifPresent(string->System.out.println(string));
    }

    public static <E> E getZufallsWertAus(List<E> liste){
        int anzahlElemente = liste.size();
        int zufälligePosition = (int)(Math.random()*anzahlElemente);
        return liste.get(zufälligePosition);
    }
    public static Optional<String> getStringMöglicherweise(){
        return Math.random() < 0.5 ? Optional.of("ein String"): Optional.empty();
    }
}
