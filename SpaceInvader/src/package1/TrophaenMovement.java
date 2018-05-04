package package1;

import java.util.Timer;
import java.util.TimerTask;

public class TrophaenMovement {

	Timer movement;
	private int temp = 0;
	
	public TrophaenMovement() {
		for(int i=0; i<=4;i++) {
			Var.trophaeX1[i] = 20+temp; 
			Var.trophaeY1[i] = 200-temp;
			
			temp += 160;
		}
		Var.trophaeX2[0] = 266;
		Var.trophaeX2[1] = 532;
		Var.trophaeY2[0] = -1000;
		Var.trophaeY2[1] = -1500;
		
                
                Var.trophaeX3 = 375;
                Var.trophaeY3 = -4000;
	
                movement = new Timer();
                movement.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        for(int i = 0; i <= 4; i++){
                            Var.trophaeY1[i]+= Var.trophaenSpeed1[i];
                            
                            if(Var.trophaeY1[i] >= Var.screenheight){
                                Var.trophaeX1[i] = -350;
                            }
                        }
                        for(int i=0; i<=1;i++){
                            Var.trophaeY2[i]+=Var.trophaenSpeed2[i];
                            
                            if(Var.trophaeY2[i]>= Var.screenheight){
                                Var.trophaeY2[i] = -1500;
                            }
                        }
                        Var.trophaeY3+= Var.trophaenSpeed3;
                        if(Var.trophaeY3 >= Var.screenheight){
                            Var.trophaeY3 = -4000;
                        }
                    }
                }, 0, 9);
	}

}
