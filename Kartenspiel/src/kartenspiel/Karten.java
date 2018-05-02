/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Sanne
 */
public class Karten extends JTabbedPane{
    private JPanel rot = new Fluss();//new JPanel();
    private JPanel blau = new Gitter();//new JPanel();
    private JPanel pink = new Grenzen();//new JPanel();
    private JPanel gelb; //= new Messung(menuFenster);//new JPanel();
    private JPanel orange = new Mixed();
    //wegen Slider
    private TopFenster menuFenster;
    
    public Karten(TopFenster f){
        //für Slider:
        menuFenster=f;
        gelb = new Messung(menuFenster);
        
        zusammenstellen();
    }

    private void zusammenstellen() {
        rot.setBackground(Color.RED);
        blau.setBackground(Color.BLUE);
        pink.setBackground(Color.PINK);
        gelb.setBackground(Color.YELLOW);
        orange.setBackground(Color.ORANGE);
        
        this.add("Fluss",rot);
        this.add("Blau", blau);
        this.add("Pink", pink);
        this.add("Gelb", gelb);
        this.add("Mixed",orange);
       
        
    }
}
