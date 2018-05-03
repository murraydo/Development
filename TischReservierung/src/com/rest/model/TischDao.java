/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.model;

import com.rest.logic.Tisch;
import java.util.List;

/**
 *
 * @author Sanne
 */
public interface TischDao {
    public List<Tisch>getAllTisch();
    /**
     * erstmal nicht verwendet, soll später aktiviert werden
     */
    public void addTisch(Tisch t);
    public void updateTisch(Tisch t);
    public void deleteTisch(Tisch t);
}
