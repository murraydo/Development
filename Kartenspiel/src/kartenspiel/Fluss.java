/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sanne
 */
public class Fluss extends JPanel{
    JComponent[] enten = new JComponent[5];
    JLabel ueberschrift = new JLabel("Wochentage");
    JLabel ausgabe = new JLabel("Ihre Auswahl");
    public Fluss(){
        //Standard-Layout des JPanels
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));//Java Doc?
        bauen();
    }

    private void bauen() {
        ueberschrift.setFont(new Font("Helvetica",Font.BOLD,35));
        ueberschrift.setForeground(Color.WHITE);
        this.add(ausgabe);
        this.add(ueberschrift);
        for(int i=0;i<enten.length;i++){   
            enten[i]=new JButton(LocalDate.now().plusDays(i).toString());
        }
        for(JComponent knopf : enten){
            ((JButton)knopf).addActionListener(ae->{
                System.out.println("Ausgewählt: "+ae.getActionCommand());
                //JLabel anzeige= new JLabel(ae.getActionCommand());
                //this.add(anzeige);
               ausgabe.setText(ae.getActionCommand());
                       
            });
            this.add(knopf);
        }
    }
}
