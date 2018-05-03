/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.gui;

import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sanne
 */
public class Fenster extends JFrame{
      private BuchungsService bs;
      private Tisch reserviert;
      
      public Fenster(BuchungsService bs){
          this.bs=bs;
          this.setLayout(new GridLayout(3,1));
          bauen();
      }

    private void bauen() {
        JLabel frage = new JLabel("Wieviele Personen?");
        this.add(frage);
        JComboBox auswahl = new JComboBox(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        this.add(auswahl);
        JButton buchen = new JButton("Buchen");
        this.add(buchen);
        buchen.addActionListener(ae->{
            int anzahl = 5;//HIER ToDO
            reserviert=bs.buchen(anzahl);
            JDialog tischAnwort = new JDialog();
            tischAnwort.setTitle(reserviert.toString());
            tischAnwort.setSize(200, 300);
            tischAnwort.setModal(true);
            tischAnwort.setVisible(true);
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
       
    }
}
