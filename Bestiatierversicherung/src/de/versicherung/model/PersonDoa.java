package de.versicherung.model;

import de.versicherung.logic.Person;
import java.util.List;
/**
 *
 * @author Murat Vatandas
 */
public interface PersonDoa {

    public List<Person> getAllPerson();

    /**
     * Erstmal nicht verwendet, soll später kommen;
     *
     * @param t
     */
    public void addPerson(Person t);

    public void updatePerson(Person t);

    public void deletePerson(Person t);
}
