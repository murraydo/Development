/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

/**
 *
 * @author Sanne
 */
public class TopFenster extends JFrame{
    //Menuleiste
   private JMenuBar leiste = new JMenuBar();
   
    //Einträge in Menuleister: JMenu
   private JMenu layout = new JMenu("Layout");
   private JMenu andererKram = new JMenu("anderer Kram");
   
   private JMenuItem grid = new JMenuItem("Grid");
   private JMenuItem flow = new JMenuItem("Flow");
   private JMenuItem border = new JMenuItem("Border");
   
   //Menueinträge für die Sliderauswahl
   private JMenuItem[] slider = new JMenuItem[10];
   
   private JTabbedPane karten;// = new Karten(this); 
   
    public TopFenster(){
        this.setLayout(new BorderLayout(10,10));
        
        menuErstellen(); 
        bauen();
    }

    private void menuErstellen() {
        layout.add(grid);
        layout.add(flow);
        layout.add(border); 
        grid.addActionListener(ae->{ System.out.println("Grid wurde gewählt");});
        //MenuItems instanzieren
        for(int i = 0;i<slider.length; i++){
            slider[i]= new JMenuItem("-"+i+"-");
            andererKram.add(slider[i]);
        }
        //MenuItems weiter leiten
        karten= new Karten(this); 
        
        leiste.add(layout);
        leiste.add(andererKram);
        
        
        this.setJMenuBar(leiste);
    }

    private void bauen() {
        grid.addActionListener(ae->karten.setSelectedIndex(1));
        flow.addActionListener(ae->karten.setSelectedIndex(0));
        border.addActionListener(ae->karten.setSelectedIndex(2));
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(karten);
        
        
      
    }

    public JMenuItem[] getSlider() {
        
                return slider;
    }
    
    
}
