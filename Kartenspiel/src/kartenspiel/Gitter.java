/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartenspiel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sanne
 */
public class Gitter extends JPanel {

    private int spalten = 3;
    private int zeilen = 10;
    private JComponent[] felder = new JComponent[zeilen * spalten];
    private JLabel mitBild;

    public Gitter() {
        this.setLayout(new GridLayout(zeilen, spalten, 5, 5));
        bauen();
    }

    private void bauen() {
        ImageIcon bild=new ImageIcon("Bilder\\Bild.jpg");
        bild.setImage(bild.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        mitBild = new JLabel(bild);
        for (int i = 0; i < felder.length; i++) {
            if (i % 3 == 0) {
                felder[i] = new JTextField();
            } else {
                felder[i] = new JButton(){
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
        
        //g.setColor(new Color(i*10,1*10,i*10));
        g.fillOval(randX, randY, breite, hoehe);
        //g.drawImage(img, br, br, this)
       
                }};
                ((JButton) felder[i]).setText("Klick");
                if(i==29){
                 felder[i]= new JPanel();
                 felder[i].add(new JButton("ok"));
                 felder[i].add(new JButton("abbrechen"));
                }else{
                    if(i==13){
                        felder[i]=new MeinKopf();
                    }
                    else{
                        if(i==14){
                            felder[i]=mitBild;
                        }
                    }
                
            }
            }
            add(felder[i]);
        }

    }
}
