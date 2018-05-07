package package1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveUp=true;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.moveDown=true;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveLeft=true;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveRight=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveUp=false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.moveDown=false;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveLeft=false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveRight=false;
		}
	}
}
