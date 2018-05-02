package de.versicherung.model;


import de.versicherung.logic.Behandlung;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Murat Vatandas
 */
public class BehandlungDaoImpl implements BehandlungDao{

    private List<Behandlung> behandlung = new ArrayList<>();
    
    @Override
    public List<Behandlung> getAllBehandlung() {
        return behandlung;
    }

    @Override
    public void addBehandlung(Behandlung t) {}

    @Override
    public void updateBehandlung(Behandlung t) {}

    @Override
    public void deleteBehandlung(Behandlung t) {}

}
