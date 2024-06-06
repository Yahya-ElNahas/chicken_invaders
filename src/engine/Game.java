package engine;

import java.awt.Graphics;

import objects.Bullet;
import objects.Chicken;
import objects.FighterShip;
import objects.SpaceShip;

public class Game {

	private int height, width;
	private SpaceShip ship;
	private Chicken[] chickens;
	
	public Game(int height, int width)
	{
		this.height = height;
		this.width = width;
		initShip();
		intitChickens(10);
	}
	
	private void intitChickens(int s)
	{
		chickens = new Chicken[s];
		int diff = 10;
		for(int i = 0;i < s;i++) {
			Chicken c = new Chicken();
			diff += c.getSize();
			c.setPos(i*c.getSize() + diff, 50);
			chickens[i] = c;
		}
	}
	
	private void initShip()
	{
		ship = new FighterShip(500, 600, 500, 1000);
	}
	
	public void update(KeyHandler handler)
	{
		ship.move(handler.x, handler.y);
		if(handler.isFiring)
			ship.fire();
		handler.isFiring = false;
		Bullet.move();
		checkBullets();
	}
	
	public void checkBullets()
	{
		Bullet.check(height);
	}
	
	public void drawChickens(Graphics g)
	{
		for(Chicken c : chickens)
			c.draw(g);
	}
	
	public void draw(Graphics g)
	{
		Bullet.drawBullets(g);
		ship.draw(g);
		drawChickens(g);
	}
}
