package package1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Murat Vatandas
 */
public class Explosion {

    Timer exp;
    private int temp = 0;

    public Explosion() {

        exp = new Timer();
        exp.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.kollidiert){
                    if(temp<15){
                        Var.expAnimation = temp;
                        temp++;
                    } else if(temp == 15){
                        Var.expAnimation = 15;
                        temp = 0;
                        Var.kollidiert = false;
                    }
                }
            }
        }, 0, 50);

    }
}
