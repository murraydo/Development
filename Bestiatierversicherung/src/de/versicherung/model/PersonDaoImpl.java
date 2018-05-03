package de.versicherung.model;

import de.versicherung.logic.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murat Vatandas
 */
public class PersonDaoImpl implements PersonDoa {

    private List<Person> personen = new ArrayList<>();

    public List<Person> getAllPerson() {
        return personen;
    }

    @Override
    public void addPerson(Person t) {

        t.setPersonenId(personen.size() + 1);
        
        
    }
    @Override
    public void updatePerson(Person t){
        
    }
    @Override
    public void deletePerson(Person t){
        
    }

}
