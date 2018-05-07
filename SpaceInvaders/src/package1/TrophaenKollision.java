package package1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Murat Vatandas
 */
public class TrophaenKollision {

    Timer kollision;

    public TrophaenKollision() {
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Bronze
                for (int i = 0; i <= 4; i++) {
                    if (Var.x >= Var.trophaeX1[i] - 50 && Var.x <= Var.trophaeX1[i] + 70
                            && Var.y >= Var.trophaeY1[i] - 50 && Var.y <= Var.trophaeY1[i] + 50) {

                        Var.trophae += 1;
                        Var.trophaeY1[i] = -200;
                    }
                }
                // Silber
                for (int i = 0; i <= 1; i++) {
                    if (Var.x >= Var.trophaeX2[i] - 50 && Var.x <= Var.trophaeX2[i] + 70
                            && Var.y >= Var.trophaeY2[i] - 50 && Var.y <= Var.trophaeY2[i] + 50) {

                        Var.trophae += 1;
                        Var.trophaeY2[i] = -1500;
                    }
                }
                // Gold
                if (Var.x >= Var.trophaeX3 - 50 && Var.x <= Var.trophaeX3 + 70
                        && Var.y >= Var.trophaeY3 - 50 && Var.y <= Var.trophaeY3 + 50) {

                    Var.trophae += 1;
                    Var.trophaeY3 = -4000;
                }
            }
        }, 0, 15);
    }

}
