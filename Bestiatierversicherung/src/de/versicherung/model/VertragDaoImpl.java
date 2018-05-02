package de.versicherung.model;

import de.versicherung.logic.Vertrag;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murat Vatandas
 */
public class VertragDaoImpl implements VertragDao {

    private List<Vertrag> vertraege = new ArrayList<>();

    public List<Vertrag> getAlleVertreage() {
        return vertraege;
    }

    @Override
    public void addVertrag(Vertrag t) {

    }

    @Override
    public void updateVertrag(Vertrag t) {

    }

    @Override
    public void deleteVertrag(Vertrag t) {

    }

    @Override
    public List<Vertrag> getAlleVertraege() {
        return vertraege;
    }

}
