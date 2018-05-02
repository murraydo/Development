package de.versicherung.model;

import de.versicherung.logic.Vertrag;
import java.util.List;

/**
 *
 * @author Murat Vatandas
 */
public interface VertragDao {
    /**
     *
     * @return
     */
    public List<Vertrag> getAlleVertraege();

    /**
     *
     * @param t
     */
    public void addVertrag(Vertrag t);

    public void updateVertrag(Vertrag t);

    public void deleteVertrag(Vertrag t);
}
