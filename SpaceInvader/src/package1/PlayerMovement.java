package package1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	Timer movement;

	public PlayerMovement() {

		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.moveUp == true) {
					if (Var.y > 0) {
						Var.y -= Var.speedUp;
					}
				} else if (Var.moveDown == true) {
					if (Var.y <= 490) {
						Var.y += Var.speedDown;
					}
				}
				if (Var.moveLeft == true) {
					if (Var.x > 0) {
						Var.x -= Var.speedLeft;
					}
				} else if (Var.moveRight == true) {
					if (Var.x <= 730) {
						Var.x += Var.speedRight;
					}
				}
			}
		}, 0, 10);
	}

}
