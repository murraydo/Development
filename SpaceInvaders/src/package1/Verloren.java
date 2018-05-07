package package1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Murat Vatandas
 */
public class Verloren {

    Timer loose;
    private int temp = 0, temp1 = 0, temp2 = 0;

    public Verloren() {

        loose = new Timer();
        loose.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.verloren) {
                    if (temp >= 0 && temp <= 55) {
                        temp++;
                    } else if (temp == 56) {
                        System.out.println("Leider verloren");
                        // Trophaenplatzierung
                        for (int i = 0; i <= 4; i++) {
                            Var.trophaeX1[i] = 20 + temp1;
                            Var.trophaeY1[i] = -200 - temp1;

                            temp += 160;
                        }
                        Var.trophaeX2[0] = 266;
                        Var.trophaeX2[1] = 532;
                        Var.trophaeY2[0] = -1000;
                        Var.trophaeY2[1] = -1500;

                        Var.trophaeX3 = 375;
                        Var.trophaeY3 = -4000;
                        // Gegnerplpatzierung
                        for(int i = 0; i<4; i++){
                            Var.gegnerY[i] = -100 - temp2;
                            temp2 += 160;
                        }
                        temp = 0;
                        
                        if(Var.trophae>= -50){
                            Var.trophae -= 50;
                        } else {
                            Var.trophae = 0;
                        }
                        Var.leben = Var.maxLeben;
                        Var.verloren = false; 
                    }
                }
            }
        }, 0, 15);
    }
}
