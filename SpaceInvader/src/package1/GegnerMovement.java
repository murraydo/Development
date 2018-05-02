package package1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
	Timer movement;
	private int temp = 0;

	public GegnerMovement() {
		
		for(int i=0;i<=4;i++) {
			Var.gegenerX[i]=20+temp;
			Var.gegenerY[i]= -100-temp;
			
			temp +=160;
		}
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {

				for(int i=0;i<=4;i++) {
					Var.gegenerY[i] += Var.gegnerSpeed[i];
					
					if(Var.gegenerY[i]>= Var.screenheight) {
						Var.gegenerY[i] = -100;
					}
				}
				
			}
		}, 0, 9);
		
	}

}
