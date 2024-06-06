package objects;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;

public class Bullet extends FirePower {

	private static LinkedList<Bullet> bullets = new LinkedList<>();
	
	public Bullet(int x, int y)
	{
		super(x, y, 10, 100);
		bullets.add(this);
		setImage("/sprites/bullet.png");
	}
	
	public static void check(int y)
	{
		ArrayList<Bullet> bList = new ArrayList<>();
		for(Bullet b : bullets) {
			if(b.y < 0 || b.y > y) {
				bList.add(b);
			}
		}
		for(Bullet b : bList)
			bullets.remove(b);
	}
	
	public static void move()
	{
		for(Bullet b : bullets)
			b.y -= b.speed;
	}
	
	public static void drawBullets(Graphics g) {
		// TODO Auto-generated method stub
		for(Bullet b : bullets)
			b.draw(g);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, x - size/2, y - size/2, size, size*2, null);
	}
}
