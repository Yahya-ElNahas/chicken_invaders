package engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	
	public int x, y;
	public boolean isFiring;
	
	public KeyHandler()
	{
		x = y = 0;
		isFiring = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W: y = -1; break;
		case KeyEvent.VK_S: y = 1; break;
		case KeyEvent.VK_A: x = -1; break;
		case KeyEvent.VK_D: x = 1; break;
		case KeyEvent.VK_SPACE: isFiring = true; break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W: 
		case KeyEvent.VK_S: y = 0; break;
		case KeyEvent.VK_A:
		case KeyEvent.VK_D: x = 0; break;
		case KeyEvent.VK_SPACE: isFiring = false; break;
		}
	}

}
