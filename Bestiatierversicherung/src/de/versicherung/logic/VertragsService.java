package de.versicherung.logic;

import de.versicherung.model.VertragDao;
import de.versicherung.model.PersonDoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murat Vatandas
 */
public class VertragsService {
    
    private List<Person> versichertePerson = new ArrayList<>();
    private List<Vertrag> alleVertraege = new ArrayList<>();
//    private List<Schaden> alleSchaeden = new ArrayList<>();
    
    /**
     * Default Constructor
     */
    public VertragsService() {}
    
    /**
     * 
     * @param vd
     * @param pd
     */
    public VertragsService(VertragDao vd, PersonDoa pd ) {
        alleVertraege = vd.getAlleVertraege();
        versichertePerson = pd.getAllPerson();
    }
    /**
     * Vertrag anlegen oder Abgleich der Personendaten mit einem bestehenden Vertrag 
     * 1. Prüfen, ist Vertrag existent (abgleich mit bestehenden Versicherungsnummern bzw abgleich mit einem Haswert)
     * 2. vertrag neu anlegen
     * @param person
     * @param vertrag
     */
    
    public void anlegen(Person person, Vertrag vertrag, Tier tier){
        alleVertraege.add(vertrag);
        int xi = alleVertraege.size() + 1;
        vertrag.setVertragsId(xi);
        vertrag.setPersonDaten(person);
        vertrag.setVersichertesTier(tier);
        int i  = versichertePerson.size() + 1;
        person.setPersonId(i);
        versichertePerson.add(person);
        
    }
      /**
     * 
     * @return 
     */
    public List<Person> getVersichertePerson() {
        return versichertePerson;
    }
    /**
     * 
     * @return 
     */
    public List<Vertrag> getAlleVertraege() {
        return alleVertraege;
    }

    /**
     *
     * @param alleVertraege
     */
    public void setAlleVertraege(List<Vertrag> alleVertraege) {
        this.alleVertraege = alleVertraege;
    }
}
