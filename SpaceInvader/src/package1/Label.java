package package1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel{


	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(Var.ib1 , 0, Var.backgroundY1,800, 600, null);
		g.drawImage(Var.ib2 , 0, Var.backgroundY2,800, 600, null);
		
		
		if(Var.flammenanimation == 0) {
			g.drawImage(Var.iflamme1, Var.x, Var.y+58, 50, 50, null);
		} else if (Var.flammenanimation == 1) {
			g.drawImage(Var.iflamme2, Var.x, Var.y+58, 50, 50, null);
		}
		
		for(int i = 0; i <= 4; i++) {
		g.drawImage(Var.igegener1, Var.gegenerX[i], Var.gegenerY[i], 80	, 60 , null);
		}
		g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
		repaint();
	}
}
