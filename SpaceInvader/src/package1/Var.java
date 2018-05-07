package package1;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y = 400;
	// Bewegung in alle Richtungen
	static int speedUp = 3, speedDown = 2, speedLeft = 2, speedRight = 2;
	// Flammen
	static int flamme = 1, flammenanimation;
        static int trophae = 0, leben = 2, maxLeben = 2;
        
        static JButton btnResume, btnShop, btnOptions, btnExit;
        static JButton btnMute;
        
        
	// Objekte auf dem Feld
	static int gegnerX[] = new int[5], gegnerY[] = new int[5];
	static int gegnerSpeed[] = new int[5], trophaenSpeed[] = new int[5];
	static int trophaeX1[] = new int[5], trophaeY1[] = new int[5];
	static int trophaeX2[] = new int[5], trophaeY2[] = new int[5];
	static int trophaeX3 ,trophaeY3 ;
	static int trophaenSpeed1[] = new int[5], trophaenSpeed2[] = new int[2], trophaenSpeed3;
        static int expAnimation;

	static boolean moveUp = false, moveDown = false, moveLeft = false, moveRight = false;
        static boolean kollidiert = false, verloren = false;
	static Label lbl1;

	// BackgroundImage
	static BufferedImage ib1, ib2;
	// Rocket
	static BufferedImage irakete;
	// Image des Feuers
	static BufferedImage iflamme1, iflamme2;
	// Image des Asterooiden
	static BufferedImage igegener1;
        static BufferedImage iTrophae1, iTrophae2, iTrophae3;
        static BufferedImage iExplosion[] = new BufferedImage[16];

	public Var() {
		
		try{
			// Background img 
			ib1 = ImageIO.read(new File("rsc/bg.jpg"));
			ib2 = ImageIO.read(new File("rsc/bg.jpg"));
			irakete = ImageIO.read(new File("rsc/rakete.png"));
			iflamme1 = ImageIO.read(new File("rsc/flamme1.png"));
			iflamme2 = ImageIO.read(new File("rsc/flamme2.png"));
			igegener1 = ImageIO.read(new File("rsc/asteroid.png"));
                        iTrophae1 = ImageIO.read(new File("rsc/ball1.png"));
                        iTrophae2 = ImageIO.read(new File("rsc/ball2.png"));
                        iTrophae3 = ImageIO.read(new File("rsc/ball3.png"));
                        for(int i = 0; i<=15;i++){
                        iExplosion[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".png"));
                        }
                        
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bild konnte nicht geladen werden");
		}
		gegnerSpeed[0] = 3;
		gegnerSpeed[1] = 5;
		gegnerSpeed[2] = 4;
		gegnerSpeed[3] = 4;
		gegnerSpeed[4] = 3;
		
		trophaenSpeed1[0] = 2;
		trophaenSpeed1[1] = 3;
		trophaenSpeed1[2] = 5;
		trophaenSpeed1[3] = 3;
		trophaenSpeed1[4] = 3;
		trophaenSpeed2[0] = 4;
		trophaenSpeed2[1] = 5;
                
		trophaenSpeed3 = 6;
		
	}

}
