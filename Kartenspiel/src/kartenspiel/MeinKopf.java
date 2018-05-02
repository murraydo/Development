/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JButton;

/**
 *
 * @author Sanne
 */
public class MeinKopf extends JButton{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        Insets in = this.getInsets();
        int randX = in.left;
        int randY = in.top;
        Dimension d = this.getSize();
        int br=d.width;
        int breite=br-in.left-in.right;
        int hoehe = d.height-in.top -in.bottom;
        
        g.setColor(Color.RED);
        g.fillOval(randX, randY, breite, hoehe);
        //g.drawImage(img, br, br, this)
        
        System.out.println("Paint Methode spricht");
    }
    
}
