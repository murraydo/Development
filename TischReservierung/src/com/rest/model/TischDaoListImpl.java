/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.model;

import com.rest.logic.Tisch;
import java.util.ArrayList;
import java.util.List;

/**
 *Testdaten für den Buchungsservice. Daten sind nicht persistent
 * 
 * @author Sanne
 */
public class TischDaoListImpl implements TischDao{
    private List<Tisch> tische = new ArrayList<>();
    
    public TischDaoListImpl(){
        TischMaker tischmaker = new TischMaker(100);
        tische = tischmaker.getAllTische();
    }

    @Override
    public List<Tisch> getAllTisch() {
        return tische;
    }

    @Override
    public void addTisch(Tisch t) {
    }

    @Override
    public void updateTisch(Tisch t) {
    }

    @Override
    public void deleteTisch(Tisch t) {
    }
    
    
    
}
