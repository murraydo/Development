package package1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;
import sun.java2d.loops.FillRect;

public class Label extends JLabel {
    
    private int temp = 0;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
        g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

        for (int i = 0; i <= 4; i++) {
            g.drawImage(Var.iTrophae1, Var.trophaeX1[i], Var.trophaeY1[i], 48, 38, null);
        }
        for (int i = 0; i <= 1; i++) {
            g.drawImage(Var.iTrophae2, Var.trophaeX2[i], Var.trophaeY2[i], 48, 38, null);
        }
        g.drawImage(Var.iTrophae3, Var.trophaeX3, Var.trophaeY3, 48, 38, null);

        for (int i = 0; i <= 4; i++) {
            g.drawImage(Var.igegener1, Var.gegnerX[i], Var.gegnerY[i], 80, 60, null);
        }
        if (Var.flammenanimation == 0) {
            g.drawImage(Var.iflamme1, Var.x, Var.y + 58, 50, 50, null);
        } else if (Var.flammenanimation == 1) {
            g.drawImage(Var.iflamme2, Var.x, Var.y + 58, 50, 50, null);
        }

        g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);

        if (Var.verloren) {
            g.setColor(new Color(0, 230, 115));
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("Traophae: " + Var.trophae, 310, 200);
        } else {
            g.setColor(new Color(0, 230, 115));
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString("Trophae: " + Var.trophae, 50, 50);
        }
        if (Var.kollidiert) {
                for (int i = 0; i <= 15; i++) {
                    if(Var.expAnimation == i){
                    g.drawImage(Var.iExplosion[i], Var.x - 10, Var.y - 10, 73, 100, null);
                    }
                }
                if(Var.expAnimation>1&&Var.expAnimation<=4){
                    g.setColor(new Color(230,0,0,45));
                    g.fillRect(0,0, Var.screenwidth, Var.screenheight);
                } else if(Var.expAnimation>=6&&Var.expAnimation<=9){
                    g.setColor(new Color(230,0,0,45));
                    g.fillRect(0,0,Var.screenwidth, Var.screenheight);
                }
            }
        repaint();
    }
}
