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
        int nr=1;
        int tischeAnzahl = (int)(Math.random()*30+1);
        for(int i=0; i<tischeAnzahl;i++){
            int stuhlZahl=(int)(Math.random()*10+1);
            Tisch t = new Tisch(stuhlZahl);
            t.setTischNr(nr);
            nr++;
            tische.add(t); 
            //System.out.println("T: "+t);
        }
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
