package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

import engine.Game;
import engine.GameThread;
import engine.KeyHandler;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	public static final int HEIGHT = 700, WIDTH = 1000;
	private Star[] stars;
	private GameThread thread;
	public KeyHandler keyHandler;
	public Game Game;

	public GamePanel()
	{
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.BLACK);
		keyHandler = new KeyHandler();
		addKeyListener(keyHandler);
		setFocusable(true);
		Game = new Game(HEIGHT, WIDTH);
		initStars();
		startThread();
	}

	private void startThread()
	{
		thread = new GameThread(this, 60);
		thread.start();
	}
	
	public void decrStars()
	{
		for(Star s : stars) {
			s.decr();
			if(s.y > HEIGHT)
				s.y = -Star.diameter;
		}
	}
	
	private void initStars()
	{
		stars = new Star[20];
		for(int i = 0;i < stars.length;i++) {
			int x = (new Random()).nextInt(Star.diameter, WIDTH - Star.diameter);
			int y = (new Random()).nextInt(Star.diameter, HEIGHT - Star.diameter);
			stars[i] = new Star(x, y);
		}
	}
	
	private void drawStars(Graphics g)
	{
		for(Star s : stars)
			s.draw(g);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawStars(g);
		Game.draw(g);
		g.dispose();
	}
}





