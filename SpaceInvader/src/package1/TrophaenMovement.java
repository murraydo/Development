package package1;

import java.util.Timer;

public class TrophaenMovement {

	Timer movement;
	private int temp = 0;
	
	public TrophaenMovement() {
		for(int i=0; i<=4;i++) {
			Var.trophaeX1[i] = 20+temp; 
			Var.trophaeY1[i] = 200-temp;
			
			temp += 160;
		}
		Var.trophaeX2[0] = 375;
		Var.trophaeX2[1] = 532;
		Var.trophaeY2[0] = -1000;
		Var.trophaeY2[1] = -1500;
		
		
	}

}
