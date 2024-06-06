package engine;

import gui.GamePanel;

public class GameThread extends Thread {
	
	private int FPS;
	private GamePanel panel;
	
	public GameThread(GamePanel panel, int fps)
	{
		this.panel = panel;
		this.FPS = fps;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		double delta = 0;
		double interval = 1000000000 / FPS;
		long currentTime, prevTime = System.nanoTime();
		int timer = 0;
		while(this != null) {
			currentTime = System.nanoTime();
			delta += (currentTime - prevTime) / interval;
			prevTime = currentTime;
			if(delta >= 1) {
				panel.Game.update(panel.keyHandler);
				panel.repaint();
				delta--;
				timer++;
				if(timer >= 3) {
					panel.decrStars();
					timer = 0;
				}
			}
		}
	}
}
