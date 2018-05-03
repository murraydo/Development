
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murat Vatandas
 * Daten werden serialisiert, Daten können in Pakete zerlegt und wieder zusammengesetzt werden
 */
public class Datenbank implements Serializable{
    
    private String name;
    private int alter;
    private List<String> tiere;
    
    public Datenbank(String name, int alter){
        this.name = name;
        this.alter = alter;
        //tiere = new ArrayList<String>();
        
        //tiere.add("Katze");
        //tiere.add("Hund");
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    /*public List<String> getTiere() {
        return tiere;
    }*/

}
