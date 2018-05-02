/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.versicherung.model;

import de.versicherung.logic.Behandlung;
import java.util.List;

/**
 *
 * @author CC-Student
 */
public interface BehandlungDao {
    
      public List<Behandlung> getAllBehandlung();

    /**
     * Erstmal nicht verwendet, soll später kommen;
     * @param t
     */
    public void addBehandlung(Behandlung t);
    public void updateBehandlung(Behandlung t);
    public void deleteBehandlung(Behandlung t);
    
}
