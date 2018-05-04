package package1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
	Timer movement;
	private int temp = 0;

	public GegnerMovement() {
		for(int i=0;i<=4;i++) {
			Var.gegnerX[i]=20+temp;
			Var.gegnerY[i]= -100-temp;
			
			temp +=160;
		}
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {

				for(int i=0;i<=4;i++) {
					Var.gegnerY[i] += Var.gegnerSpeed[i];
					
					if(Var.gegnerY[i]>= Var.screenheight) {
						Var.gegnerY[i] = -100;
					}
				}
				
			}
		}, 0, 9);
		
	}

}
