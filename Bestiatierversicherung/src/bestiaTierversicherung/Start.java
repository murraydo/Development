package bestiaTierversicherung;

import de.versicherung.logic.Vertrag;
import de.versicherung.logic.Tier;
import de.versicherung.logic.VertragsService;
import de.versicherung.gui.Konsole;

/**
 *
 * @author Murat Vatandas
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Vertrag vertrag = new Vertrag();
         VertragsService vs = new VertragsService();
         Konsole gui = new Konsole(vs);
         
    }

}
